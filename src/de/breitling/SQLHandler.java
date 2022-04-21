package de.breitling;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLHandler {
    private String url;
    private String user;
    private String password;

    private static SQLHandler instance;

    private SQLHandler(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    public static SQLHandler getInstance(String url, String user, String password) {
        if (instance == null) {
            instance = new SQLHandler(url, user, password);
        }
        return instance;
    }
    private Connection openConnection() throws SQLException {
        String jdbcConnectionString = "jdbc:mariadb://" + url + "/arbeitszeiten";
        return (Connection) DriverManager.getConnection(jdbcConnectionString, user,password);
    }
}
