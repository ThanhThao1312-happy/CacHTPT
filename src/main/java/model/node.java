/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class node {
    private int Port;
    private String Host;
    private int Id;
    private boolean IsAdmin;
    private boolean Timeoout = false;

    public node(int Port, String Host, int Id,boolean Admin) {
        this.Port = Port;
        this.Host = Host;
        this.Id = Id;
        this.IsAdmin = Admin;
    }

    public int getPort() {
        return Port;
    }

    public String getHost() {
        return Host;
    }

    public int getId() {
        return Id;
    }

    public boolean isIsAdmin() {
        return IsAdmin;
    }

    public void setPort(int Port) {
        this.Port = Port;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setIsAdmin(boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public boolean isTimeoout() {
        return Timeoout;
    }

    public void setTimeoout(boolean Timeoout) {
        this.Timeoout = Timeoout;
    }
    
    
}
