package connectMsSql;
import formJavaFx.ControllerFx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;


@Component
//@Profile("spring")
public class Connect1  {
        @Autowired
      private static ControllerFx controllerFx;


    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        //получение данных из файла application.properties
        ResourceBundle rb = ResourceBundle.getBundle("myresourse"); // application.properties
        System.out.println("key: "+rb.getString("myznach"));


        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/loans",
                "postgres",
                "123"
        );

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM client"
        );

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " "
                    + resultSet.getInt("id_user_data") + " "
                    + resultSet.getBoolean("vip")
            );
            String f =""+resultSet.getInt("id_user_data");
            String f2 =""+resultSet.getBoolean("vip");
           // controllerFx.writeDatesTable(f, f2);
        }

        connection.close();

    }


}
