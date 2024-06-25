/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.HistoryTransactionModel;

/**
 *
 * @author Admin
 */
public class connection {
    private String connectUrl = "jdbc:sqlserver://127.0.0.1:1433;database=CACHETHONGPHANTAN;username=sa;password=123";
    private Connection conn;
    public connection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.conn = DriverManager.getConnection(connectUrl);
        } catch (Exception e) {
            System.out.println("khong the tao ket noi den server");
            this.conn=null;
        }
    }
    public Connection getConnection(){
        
        return this.conn;
    }
    //-------------kiem tra tien trong tai khoan---------
    //-------------neu khong co tra ve -1----------------
    public int getAccountMoney(int id){
        try {
            int money=0;
            Statement stmt = this.conn.createStatement();
            String updateQuery = String.format("select AccountMoney from account where AccountId=%d", id);
            System.out.println(updateQuery);
            ResultSet rel = stmt.executeQuery(updateQuery);
            while(rel.next()){
                money = rel.getInt("AccountMoney");
            }
            stmt.close();
            return money;
        } catch (Exception e) {
            return 0;
        }
        
    }
    //-------------chuyen tien giua hai tai khoan---------
    public boolean sendMoney(int send,int receive,int money,String msg) {
        try {
            int sM=0,rM=0;
            Statement stmt = this.conn.createStatement();
            String updateQuery = String.format("exec proc_sendmoney %d,%d,%d,'%s'", send,receive,money,msg);
            System.out.println(updateQuery);
            stmt.executeUpdate(updateQuery);
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Co loi khi chuyen tien");
            return false;
        }
    }
    public List<HistoryTransactionModel> getHistoryTransact(int id){
        List<HistoryTransactionModel> allTransacts = new ArrayList<HistoryTransactionModel>();
        try {
            Statement stmt = this.conn.createStatement();
            String updateQuery = String.format("exec proc_get_history_transaction %d",id);
            System.out.println(updateQuery);
            ResultSet rel = stmt.executeQuery(updateQuery);
            SimpleDateFormat Dateformat = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
            HistoryTransactionModel tmp;
            while(rel.next()){
                int transId = rel.getInt("Id");
    
                int sendid = rel.getInt("SendId");
                System.out.println(sendid+123);
                int receiveid = rel.getInt("RecId");
                int money = rel.getInt("Moneys");
                Date date = rel.getTimestamp("TransDate");
                String msg = rel.getString("Msg");
                tmp = new HistoryTransactionModel(transId,sendid,receiveid,money,date,msg);
                allTransacts.add(tmp);
            }
            stmt.close();
            return allTransacts;
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println("Co loi khi tim kiem lich su giao dich");
            return null;
          
        }
    }
    public static void main(String[] args) {
        connection co = new connection();
        System.out.println("tai khoan: "+co.getAccountMoney(1));;
    }
}
