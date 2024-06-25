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
public class SendMoney {
    public int SendId;
    public int ReceiveId;
    public int MoneyValue;
    public String Msg;
    public SendMoney(int _send,int _rev,int _val,String _msg){
        this.SendId=_send;
        this.ReceiveId = _rev;
        this.MoneyValue=_val;
        this.Msg = _msg;
    }
    public void Show(){
        System.out.println(String.format("%d-%d-%d", SendId,ReceiveId,MoneyValue));
    }
}
