package com.JDBC;

import java.sql.*;

class PrepareStament {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();
//        Statement st = conn.createStatement();

        String sql = "SELECT * FROM users";
        //String sql2 = "SELECT * FROM users WHERE id = ? AND name = ?";



        PreparedStatement pst = conn.prepareStatement(sql);
        //pst.setInt(1, 1);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("id"));
        }
    }
}
