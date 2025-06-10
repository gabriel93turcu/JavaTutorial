package database;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTest {

    public Connection connection;

    // 1. Facem o metodă care se conectează la un DB în funcție de user și parolă
    // 2. Facem o metodă care pe baza conexiunii execută un query

    @Test
    public void testMethod() {
        createConnection();
        insertData("Gabriel","T");
        printAllPersons();
    }

    public void createConnection() {
        String connectionURL = "jdbc:mysql://localhost:3306/JavaTutorial";
        try {
            connection = DriverManager.getConnection(connectionURL, "root", "root123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertData(String firstName, String lastName) {
        try {
            Statement statement = connection.createStatement();
            String query = "insert into Person(firstName,lastName) values('"+firstName+"','"+lastName+"');";
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void printAllPersons() {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Person;";
            var resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("idPerson");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");

                System.out.println(id + " | " + firstName + " | " + lastName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
