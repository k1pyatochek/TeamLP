package com.web.laba2;

import java.sql.*;

public class TestDatabase {

    public static void main(String[] argv) {

        try {
            JDBC.connect();
            Tasks.task1();

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            return;
        }

        JDBC.close();
    }
}