package connectMsSql;

import org.springframework.stereotype.Component;

import java.sql.*;
@Component
public class Connect2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/loans",
                "postgres",
                "123"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM client WHERE vip = ? AND id = ?"
        );
        preparedStatement.setBoolean(1, true);
        preparedStatement.setInt(2,2);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " "
                    + resultSet.getInt("id_user_data") + " "
                    + resultSet.getBoolean("vip")
            );
            System.out.println("read result ");
        }
        System.out.println("read result 2");
        connection.close();
    }

}
