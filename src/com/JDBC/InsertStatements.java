package com.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatements {
    public static void main(String[] args) throws SQLException {
        //insertRecord("AnhPhamPhuFromJava2");
        //updateRecord(3, "AnhPhamPhuFromJava1");
        deleteRecord(3);
        deleteRecord(4);
    }
    public static void insertRecord(String name) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st = conn.createStatement();

        String sql = "INSERT INTO users(user_name) VALUES ('"+ name +"')";

        int rs = st.executeUpdate(sql);
        System.out.println(rs);
    }
    public static void updateRecord(int id, String newName) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st = conn.createStatement();

        String sql = " UPDATE users SET user_name = '" + newName + "' WHERE id = " + id ;

        int rs = st.executeUpdate(sql);
        System.out.println(rs);
    }
    public static void deleteRecord(int id) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st = conn.createStatement();

        String sql = " DELETE FROM users WHERE id = " + id ;

        int rs = st.executeUpdate(sql);
        System.out.println(rs);
    }

}
