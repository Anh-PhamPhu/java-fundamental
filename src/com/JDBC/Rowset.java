package com.JDBC;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class Rowset {
    final static String url = "jdbc:mysql://localhost:3306/ForJavaDB";
    final static String user = "root";
    final static String password = "1404";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(user);
        jdbcRowSet.setPassword(password);

        String sql = "SELECT * FROM users";

        jdbcRowSet.setCommand(sql);
        jdbcRowSet.execute();

        while (jdbcRowSet.next()){
            System.out.println(jdbcRowSet.getInt("id"));
        }
    }
}
