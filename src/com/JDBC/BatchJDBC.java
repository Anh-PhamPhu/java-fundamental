package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJDBC {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCConnections.getJDBCConnection();

        String sql1 = "INSERT INTO users(name) VALUES('AnhPhamPhu3')";
        String sql2 = "INSERT INTO users(name) VALUES('AnhPhamPhu4')";
        String sql3 = "INSERT INTO users(name) VALUES('AnhPhamPhu5')";

        Statement st = conn.createStatement();

        st.addBatch(sql1);
        st.addBatch(sql2);
        st.addBatch(sql3);

        st.executeBatch();

        String sql4 = "INSERT INTO users(name) VALUES(?)";

        PreparedStatement pst = conn.prepareStatement(sql4);

        pst.setString(1, "AnhPhamPhuPST");
        pst.addBatch();
        pst.executeBatch();
    }
}
