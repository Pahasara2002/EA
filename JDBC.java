/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbc;
import java.sql.*;
/**
 *
 * @author rashm
 */
public class JDBC {

    public static void main(String[] args) {
                     try {
                         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "")) {
                             Statement stmt = con.createStatement();
                             ResultSet rs = stmt.executeQuery("SELECT * FROM users");
                             while(rs.next()) {
                                 System.out.println(rs.getString("name"));
                             }            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
