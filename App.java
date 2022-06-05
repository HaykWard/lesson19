package org.example;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class App
{
    public static void main( String[] args )
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:lesson19.db");

            String createTable = "CREATE TABLE car (ID INTEGER PRIMARY KEY AUTOINCREMENT ,brand TEXT NOT NULL, model TEXT NOT NULL, color TEXT NOT NULL)";
            String insertInto = "INSERT INTO car (brand, model, color) VALUES ('TOYOTA', 'Altezza','Black')";

            Statement statement = co.createStatement();
            statement.executeUpdate(createTable);
            statement.executeUpdate(insertInto);


        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
