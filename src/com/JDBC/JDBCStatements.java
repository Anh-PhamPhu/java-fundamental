package com.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatements {
    public static void main(String[] args) throws SQLException {
        Statement st = JDBCConnections.getJDBCConnection().createStatement();

        String sql = "SELECT * FROM users";

        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("user_name");
            System.out.println(id + " " + name);
        }
    }
}
