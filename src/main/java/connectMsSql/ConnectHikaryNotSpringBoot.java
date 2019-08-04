package connectMsSql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


@SpringBootApplication
@ComponentScan(value={"connectMsSql","formJavaFx","personTable","daoConnectData"} )
public class ConnectHikaryNotSpringBoot  {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
      //  @Autowired
 //   static DataSource dataSource;

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(ConnectHikaryNotSpringBoot.class, args);
        DataSource datasource =ctx.getBean(DataSource.class);

        System.out.println("start");

        System.out.println(datasource);
        if (!(datasource instanceof HikariDataSource)) {
            System.err.println("Wrong datasource type: " + datasource.getClass().getCanonicalName());
            System.out.println("n11");
            System.exit(-1);
        }

        try {
            System.out.println("n22");
            Connection connection = datasource.getConnection();
            System.out.println("Start connection");
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM client");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " "
                        + rs.getInt("id_user_data") + " "
                        + rs.getBoolean("vip")
                );
            }
          //  ResultSet rs = connection.createStatement().executeQuery("SELECT 1");

            connection.close();
            System.exit(0);
        } catch (SQLException e) {
            System.err.println("FAILED!");
            e.printStackTrace();
            System.exit(-2);
        }
    }



}
