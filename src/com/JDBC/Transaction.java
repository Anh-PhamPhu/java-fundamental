package com.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st1 = conn.createStatement();
        Statement st2 = conn.createStatement();

        conn.setAutoCommit(false);
        String sql1 = "INSERT INTO users(id,user_name) VALUES(1,'AnhPhamPhu3')";
        String sql2 = "DELETE FROM users WHERE id = 2";
        st1.executeUpdate(sql1);
        st2.executeUpdate(sql2);

        conn.commit();

    }
}
