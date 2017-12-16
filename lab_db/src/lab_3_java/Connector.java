package lab_3_java;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection connection;

    public static void main(String[] args) {
        Connector.connector();
    }
    public static void connector() {
        String url = "jdbc:postgresql://217.23.154.1:5432/labdb";
        String userName = "rompel";
        String password = "romanpeltzer62";

           try {
               Class.forName("org.postgresql.Driver");
               connection = DriverManager.getConnection(url, userName, password);
               System.out.println("DB connected");
           } catch (SQLException ex) {
               ex.printStackTrace();
               System.out.println(" Error : SQL exception ");
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
    }

    public static void disconnect() {
        try {
            connection.close();
            System.out.println(" DB is disconected ");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(" DB isn't disconected ");
        }
    }
}
