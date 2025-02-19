package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String dbUsername = "root";
    private String dbPassword = "nisa1618";
    private String dbUrl = "jdbc:mysql://localhost:3306/guesthouse";

    public void showErrorMessage(Exception exception) {
        System.out.println(exception.getMessage());
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}