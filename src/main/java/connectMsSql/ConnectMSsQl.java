package connectMsSql;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;




@Component
public class ConnectMSsQl {

    private JdbcTemplate jdbcTemplate;


  /*  public ConnectMSsQl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate( dataSource);
    }
*/

 /*   @Bean("dataSour")
    public DataSource msSqlDataSource(){
        ResourceBundle rb = ResourceBundle.getBundle("myresourse"); // application.properties
      //  System.out.println("key: "+rb.getString("spring.datasource.driverClassName"));
        System.out.println("мой вин");
        return (DataSource) DataSourceBuilder
                .create(ClassLoader.getSystemClassLoader())
                .driverClassName(rb.getString("spring.datasource.name"))
                .url(rb.getString("spring.datasource.url"))
                .username(rb.getString("spring.datasource.username"))
                .password(rb.getString("spring.datasource.password"))
                .build();

    }*/

    public String getTableDaoAll(){
        return jdbcTemplate.queryForObject("SELECT * FROM client",String.class);
    }

  /*  @Bean
    public  void getEntityMyManager() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityMy");
             emf.createEntityManager();

        }*/

    public static void main(String[] args)  {
      // ConnectMSsQl connectMSsQl = new ConnectMSsQl();
     //   System.out.println(connectMSsQl.getTableDaoAll());
        System.out.println("jajajaj");


      /*  try(Connection getConnection = getBeans().getConnection() ) {
            ResultSet resultSet=getConnection.createStatement().addBatch("SELECT * FROM client");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/


    /*    Configuration configuration =new Configuration().configure();
       SessionFactory factory =  configuration
                .buildSessionFactory(
                        new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .applySetting(Environment.DATASOURCE,dataSource)
                        .build()
                );*/

    /*    Configuration configuration =new Configuration();
        SessionFactory factory =configuration
                .setProperty("hibernate.connection.datasource"
                        ,"java:comp/env/jdbc/yourDataSource")
                .buildSessionFactory();

        Session session =null;
        try{
            session = factory.getCurrentSession();
        } finally {
            factory.close();
            session.close();
        }
*/

    }


}
