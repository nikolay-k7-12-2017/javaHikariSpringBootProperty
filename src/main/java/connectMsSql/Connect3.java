package connectMsSql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import personTable.PersonTableVievColumn;

import java.util.ArrayList;
import java.util.List;


@Component
public class Connect3 {
    @Autowired
    private  ApplicationContext context;


    List<PersonTableVievColumn> list =new ArrayList<>();

 /*   public List<PersonTableVievColumn> getBaseDats() throws SQLException, ClassNotFoundException {
       System.out.println( System.getProperty("spring.datasource.url1"));

        Class.forName("org.postgresql.Driver");

    //    Connection connection = DriverManager.getConnection( url1 );

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM client"
        );

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " "
                    + resultSet.getInt("id_user_data") + " "
                    + resultSet.getBoolean("vip")
            );
        }
        connection.close();
        return list;
    }*/

    public static void main(String[] args) {
     //   ConnectMSsQl connectMSsQl = new ConnectMSsQl(context.getBean("dataSour"));
        Connect3 connect3= new Connect3();
        System.out.println(connect3.context.getBean("dataSour"));

    }


}
