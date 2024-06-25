/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HistoryTransactionModel {
    private int Id;
    private int SendId;
    private int ReceiveId;
    private int Money;
    private Date Date;
    private String Msg;

    public HistoryTransactionModel(int Id,int SendId, int ReceiveId, int Money, Date Date, String Msg) {
        this.Id = Id;
        this.SendId = SendId;
        this.ReceiveId = ReceiveId;
        this.Money = Money;
        this.Date = Date;
        this.Msg = Msg;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getSendId() {
        return SendId;
    }

    public void setSendId(int SendId) {
        this.SendId = SendId;
    }

    public int getReceiveId() {
        return ReceiveId;
    }

    public void setReceiveId(int ReceiveId) {
        this.ReceiveId = ReceiveId;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int Money) {
        this.Money = Money;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }
    
}
