package com.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatements {
    public static void main(String[] args) throws SQLException {
        //createTable();
        destroyTable();
    }

    public static void createTable() throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st = conn.createStatement();

        String sql = "CREATE TABLE user_infomations(id INT)";
        int rs = st.executeUpdate(sql);
        System.out.println(rs);
    }
    public static void destroyTable() throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st = conn.createStatement();

        String sql = "DROP TABLE user_infomations";
        int rs = st.executeUpdate(sql);
        System.out.println(rs);
    }
}
