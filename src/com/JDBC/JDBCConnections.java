package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnections {
    final static String url = "jdbc:mysql://localhost:3306/ForJavaDB";
    final static String user = "root";
    final static String password = "1404";

    public static Connection getJDBCConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        }catch(ClassCastException | SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection connect = getJDBCConnection();

        if(connect != null){
            System.out.println("Connected to Mysql!!!");
        }else{
            System.out.println("Connect failure!!!");
        }
    }
}
