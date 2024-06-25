/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//  www .  ja  va 2s  .  c o  m

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SendMoney;

public class testSocket {
    synchronized  void t1() throws InterruptedException{
        System.out.println("hello");
        wait();
    }
    synchronized  void t2() throws InterruptedException{
        notify();
        System.out.println("notify");
    }
    public void t(){
        Thread th = new Thread(){
            public void run(){
                Thread th = this;
                while(true){
                    try {
                        t1();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(testSocket.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        th.start();
    }
    public void t1(int k){
        Thread th = new Thread(){
            public void run(){
                try {
                    t2();
                } catch (InterruptedException ex) {
                    Logger.getLogger(testSocket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        th.start();
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        
//        FileWriter bwr = new FileWriter("C:\\Users\\Admin\\OneDrive\\Documents\\java_netbeans\\MulticartSocket\\src\\main\\java\\log\\FirstNode.txt",true);
//        PrintWriter pw = new PrintWriter(bwr);
//        pw.println("add more text");
//        pw.flush();
//        pw.close();
        testSocket t = new testSocket();
        t.t();
        Scanner  sc = new Scanner(System.in);
        while(true){
            int k = sc.nextInt();
            System.out.println(String.format("k bang: %d", k));
            t.t1(k);
        }
    }
}