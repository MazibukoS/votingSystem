package savotingsystem.savotingsystem.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import savotingsystem.savotingsystem.config.PostgresConnector;
import savotingsystem.savotingsystem.model.User;

public class UserRepository {

    // Method to insert a user into the users table
    public static void registerUser(User user) {
        String sql = "INSERT INTO users(firstname, surname, emailaddress, phonenumber, idnumber, password) VALUES (?, ?, ?, ?, ?, ?)";

        System.out.println(user);
        try (Connection connection = PostgresConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set the parameters for the prepared statement
            preparedStatement.setString(1, user.getFirstname());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getEmailAddress());
            preparedStatement.setString(4, user.getPhoneNumber());
            preparedStatement.setString(5, user.getIdNumber());
            preparedStatement.setString(6, user.getPassword());

            // Execute the insert statement
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User getUserById(int userID) {
        String sql = "SELECT * FROM users WHERE userid = ?";
        User user = null;

        try (Connection connection = PostgresConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, userID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User(
                        resultSet.getInt("userid"),
                        resultSet.getString("firstname"),
                        resultSet.getString("surname"),
                        resultSet.getString("password"),
                        resultSet.getString("phonenumber"),
                        resultSet.getString("emailaddress"),
                        resultSet.getString("idnumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static User getUserForLogin(String emailaddress, String password) {
        String sql = "SELECT * FROM users WHERE emailaddress = ? AND password = ?";
        User user = null;

        try (Connection connection = PostgresConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, emailaddress);
            preparedStatement.setString(1, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User(
                        resultSet.getInt("userid"),
                        resultSet.getString("firstname"),
                        resultSet.getString("surname"),
                        resultSet.getString("password"),
                        resultSet.getString("phonenumber"),
                        resultSet.getString("emailaddress"),
                        resultSet.getString("idnumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static void updateUser(User user) {
        String sql = "UPDATE users SET firstname = ?, surname = ?, password = ?, phonenumber = ?, emailaddress = ? ,idnumber = ?  WHERE userid = ?";

        try (Connection connection = PostgresConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set the parameters for the prepared statement

            preparedStatement.setString(1, user.getFirstname());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getEmailAddress());
            preparedStatement.setString(5, user.getPhoneNumber());
            preparedStatement.setString(6, user.getIdNumber());
            preparedStatement.setInt(7, user.getUserID());

            // Execute the update statement
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows updated: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
