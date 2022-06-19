package com.JDBC;

import java.sql.*;

public class MetaData {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
        Statement st = conn.createStatement();

        String sql = "SELECT * FROM users";

        ResultSet rs = st.executeQuery(sql);

        ResultSetMetaData rsmt = rs.getMetaData();

        System.out.println(rsmt.getColumnCount());
        System.out.println(rsmt.getColumnName(1));
        System.out.println(rsmt.getColumnName(2));

        DatabaseMetaData dbmt = conn.getMetaData();

        System.out.println(dbmt.getDatabaseProductName());
    }
}
