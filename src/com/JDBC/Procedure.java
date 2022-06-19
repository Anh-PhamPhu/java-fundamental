package com.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();

        CallableStatement cst = conn.prepareCall("{CALL findUsers(?)}");
        cst.setString(1, "AnhPhamPhu1");

        ResultSet rs = cst.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString("user_name"));
        }
    }
}
