package savotingsystem.savotingsystem.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnector {

    public static Connection getConnection() {
        // Database connection details
        String url = "jdbc:postgresql://127.0.0.1:5432/mydatabase"; // Replace with your DB details
        String user = "myuser"; // Replace with your username
        String password = "mypassword"; // Replace with your password
        Connection conn = null;
        // Attempting to connect to the database
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL database!!");
        } catch (SQLException e) {
            System.out.println("Connection failed11: " + e.getMessage());
        }

        return conn;
    }

}
