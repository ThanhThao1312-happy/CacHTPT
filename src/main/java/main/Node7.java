/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.swing.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.node;
import model.server;

/**
 *
 * @author Admin
 */
public class Node7 extends javax.swing.JFrame {

    private server sv;
    //form lịch sử
    private boolean formHistory = false;
    JFrame historyTransactFrame = null;

    public Node7() {
        this.setTitle("Node7");
        initComponents();
        this.cbReceiveMoneyId.removeAllItems();
        this.tpChatbox.setContentType("text/html");
        this.tpChatbox.setDragEnabled(true);
        //Chinh sua form
        this.cbReceiveMoneyId.setEnabled(false);
        this.tfMoneyValue.setEditable(false);
        this.tfMoneyMessage.setEditable(false);
        this.btnSendMoney.setEnabled(false);
        this.btnOpenHistoryTransact.setEnabled(false);
        //Chinh sua form
        JFrame tmp = this;
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(tmp,
                        "Bạn chắc chắn muốn thoát?", "Thoát chương trình?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.out.println("thoat");
                    try {
                        //---co the ghi lai log tai day
                        sv.WriteLog("FirstNode.txt");
                    } catch (IOException ex) {
                        System.out.println("chua ket noi den port");
                    }
                    System.exit(0);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPort = new javax.swing.JTextField();
        lbPort = new javax.swing.JLabel();
        btnConnect = new javax.swing.JButton();
        lbServerStatus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpLog = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpChatbox = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbReceiveMoneyId = new javax.swing.JComboBox<>();
        tfMoneyValue = new javax.swing.JTextField();
        btnSendMoney = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMoneyMessage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbWarningCb = new javax.swing.JLabel();
        lbWarningMoney = new javax.swing.JLabel();
        lbWarningMsg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfAccountMoney = new javax.swing.JTextField();
        btnOpenHistoryTransact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfPort.setEditable(false);
        tfPort.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfPort.setText("3007");

        lbPort.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPort.setText("Port");

        btnConnect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConnect.setText("Open server");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        lbServerStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tpLog.setEditable(false);
        tpLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(tpLog);

        tpChatbox.setEditable(false);
        tpChatbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(tpChatbox);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HISTORY LOG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Thông báo");

        cbReceiveMoneyId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1","Item 2", "Item 3","Item 4", "Item 5", "Item 6", "Item 7","Item 8" }));

        tfMoneyValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMoneyValueActionPerformed(evt);
            }
        });

        btnSendMoney.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSendMoney.setText("Chuyển tiền");
        btnSendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMoneyActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("CHUYỂN TIỀN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Số tiền cần chuyển");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tài khoản nhận tiền");

        tfMoneyMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMoneyMessageActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Lời nhắn");

        lbWarningCb.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbWarningCb.setForeground(new java.awt.Color(255, 0, 0));

        lbWarningMoney.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbWarningMoney.setForeground(new java.awt.Color(255, 0, 0));
        lbWarningMoney.setPreferredSize(null);

        lbWarningMsg.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbWarningMsg.setForeground(new java.awt.Color(255, 0, 0));
        lbWarningMsg.setPreferredSize(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Tài khoản");

        tfAccountMoney.setEditable(false);
        tfAccountMoney.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfAccountMoney.setForeground(new java.awt.Color(255, 102, 51));

        btnOpenHistoryTransact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOpenHistoryTransact.setText("Mở lịch sử giao dịch");
        btnOpenHistoryTransact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenHistoryTransactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPort, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbServerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbReceiveMoneyId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMoneyValue)
                    .addComponent(tfMoneyMessage)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbWarningCb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbWarningMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAccountMoney))
                    .addComponent(lbWarningMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSendMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpenHistoryTransact, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbServerStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbPort, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAccountMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbReceiveMoneyId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lbWarningCb, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tfMoneyValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbWarningMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMoneyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lbWarningMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSendMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnOpenHistoryTransact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        if (this.tfPort.equals("")) {
            JOptionPane.showMessageDialog(this, "please type number of server port", "warning", JOptionPane.WARNING_MESSAGE);
        } else {
            //#sua
            this.sv = new server(this, 3007, 7, this.tpLog, this.tpChatbox, this.tfAccountMoney, this.btnSendMoney);
            for (int i = 0; i < 8; i++) {
                if (i != this.sv.getId()) {
                    this.cbReceiveMoneyId.addItem(String.valueOf(i));
                }
            }

            this.sv.execute();
            this.lbServerStatus.setText("server is running on port " + tfPort.getText());
            this.btnConnect.setEnabled(false);
            node n = this.sv.getCoordinator();
            if (n == null) {
                for (node item : sv.getListNode()) {

                }
                sv.bully(3);
            } else if (n.getId() == this.sv.getId()) {
                System.out.println("Day chinh la dieu phoi vien");
            } else {
                JOptionPane.showMessageDialog(this, "Coordinator có id: " + n.getId(), "Thông báo", JOptionPane.DEFAULT_OPTION);
                //#sua
            }
            this.tfAccountMoney.setText(String.valueOf(sv.connectService.getAccountMoney(sv.getId())));
            this.cbReceiveMoneyId.setEnabled(true);
            this.tfMoneyValue.setEditable(true);
            this.tfMoneyMessage.setEditable(true);
            this.btnSendMoney.setEnabled(true);
            this.btnOpenHistoryTransact.setEnabled(true);
        }


    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnSendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMoneyActionPerformed
        node n = this.sv.getCoordinator();
        //#sua
        if (this.tfMoneyValue.getText().equals("")) {
            System.out.println("input is empty");
            return;
        }
        if (n == null) {
            sv.bully(3);
            System.out.println("Coordinator is null");
            return;
        } else {
            int revId, money;
            String msg;
            try {
                revId = Integer.valueOf(this.cbReceiveMoneyId.getSelectedItem().toString());
            } catch (Exception e) {
                lbWarningCb.setText("Bạn chưa chọn Id người nhận");
                return;
            }
            try {
                money = Integer.valueOf(this.tfMoneyValue.getText().trim());
                int cash = this.sv.connectService.getAccountMoney(sv.getId());
                if (money < 0) {
                    lbWarningMoney.setText("Số tiền muốn gửi phải lớn hơn 0");
                    return;
                }
                if (money > cash) {
                    lbWarningMoney.setText("Số tiền muốn gửi lớn hơn tài khoản hiện có");
                    return;
                }
            } catch (Exception e) {
                lbWarningMoney.setText("Số tiền muốn gửi không đúng định dạng");
                return;
            }
            if(tfMoneyMessage.getText().trim().equals("")){
                lbWarningMsg.setText("Lời nhắn không được để trống");
                return;
            }
            msg = tfMoneyMessage.getText().trim();
            //#sendMoney because you are coordinator now
            if (n.getId() == sv.getId()) {
                //tu chuyen tien
                sv.connectService.sendMoney(sv.getId(), revId, money, msg);
                sv.tpSettext(tpLog, String.format(sv.getCurrentTime() + ":" + n.getId() + ": Đã chuyển %d đến %d", money, revId));
                sv.tpSetMessage(tpChatbox, sv.getCurrentTime() + ": Chuyển tiền thành công!", 0);
                JOptionPane.showMessageDialog(this, "Chuyển tiền thành công!");
                cbReceiveMoneyId.setSelectedIndex(0);
                tfMoneyMessage.setText("");
                tfMoneyValue.setText("");
                lbWarningCb.setText("");
                lbWarningMoney.setText("");
                lbWarningMsg.setText("");
                this.tfAccountMoney.setText(String.valueOf(sv.connectService.getAccountMoney(sv.getId())));
                try {
                    for (node i : sv.getListNode()) {
                        if (i.getId() == revId) {
                            Socket socket = new Socket(i.getHost(), i.getPort());
                            DataOutputStream writer = new DataOutputStream(socket.getOutputStream());
                            writer.writeUTF(String.format("receivemoney-%d-%d", sv.getId(), money));
                            writer.close();
                            socket.close();
                        }
                    }
                } catch (Exception e) {
                }
                return;
            }
            //#sendrequesttocoordinator
            String reqMsg = String.format("transfers-%d-%d-%d-%s", sv.getId(), revId, money, msg);
            sv.sendMoneyRequestToCoordinator(reqMsg);
            //gui yeu cau chuyen tien
            cbReceiveMoneyId.setSelectedIndex(0);
            tfMoneyMessage.setText("");
            tfMoneyValue.setText("");
            lbWarningCb.setText("");
            lbWarningMoney.setText("");
            lbWarningMsg.setText("");
            sv.tpSettext(tpLog, String.format(sv.getCurrentTime() + ":" + n.getId() + "Da gui yeu cau chuyen %d den %d", money, revId));
            sv.tpSetMessage(tpChatbox, sv.getCurrentTime() + ": Đã gửi yêu cầu chuyển tiền!", 0);
            //JOptionPane.showMessageDialog(this, "Đã gửi yêu cầu chuyển tiền", "Thông báo",JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnSendMoneyActionPerformed

    private void tfMoneyValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMoneyValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMoneyValueActionPerformed

    private void tfMoneyMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMoneyMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMoneyMessageActionPerformed

    private void btnOpenHistoryTransactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenHistoryTransactActionPerformed
        if (!formHistory) {
            historyTransactFrame = new HistoryTransaction(sv.getId());
            historyTransactFrame.setVisible(true);
            historyTransactFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            historyTransactFrame.setFocusable(true);
        }
    }//GEN-LAST:event_btnOpenHistoryTransactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Node7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Node7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Node7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Node7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Node7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnOpenHistoryTransact;
    private javax.swing.JButton btnSendMoney;
    private javax.swing.JComboBox<String> cbReceiveMoneyId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbPort;
    private javax.swing.JLabel lbServerStatus;
    private javax.swing.JLabel lbWarningCb;
    private javax.swing.JLabel lbWarningMoney;
    private javax.swing.JLabel lbWarningMsg;
    private javax.swing.JTextField tfAccountMoney;
    private javax.swing.JTextField tfMoneyMessage;
    private javax.swing.JTextField tfMoneyValue;
    private javax.swing.JTextField tfPort;
    private javax.swing.JTextPane tpChatbox;
    private javax.swing.JTextPane tpLog;
    // End of variables declaration//GEN-END:variables
}
