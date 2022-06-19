package com.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatements {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCConnections.getJDBCConnection();
        Statement st = con.createStatement();

        final String sql = "SELECT * FROM users WHERE id = 2";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            String name = rs.getString("user_name");
            System.out.println(name);
        }
    }
}
