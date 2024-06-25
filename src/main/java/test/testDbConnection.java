/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class testDbConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectUrl = "jdbc:sqlserver://localhost;database=QLVT;username=sa;password=123";
            Connection conn = DriverManager.getConnection(connectUrl);
            System.out.println("connect success");
            conn.close();
        } catch (Exception e) {
            System.out.println("connect that bai");
        }
    }
}
