/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.good.sale.manage;

import com.good.DBcon.MyDBCon;
import java.util.Vector;


public class FrmManager extends javax.swing.JFrame {
     Vector data;
     Vector title;
     int row=0;
    public FrmManager() {
        initComponents();
        data=MyDBCon.queryVectorData1("Select * from Manager");
        showTextData2(row);
        lock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnSales_manage = new javax.swing.JButton();
        lblMan_name = new javax.swing.JLabel();
        txtMan_name = new javax.swing.JTextField();
        btnGood_manage = new javax.swing.JButton();
        btnPer_info = new javax.swing.JButton();
        lblNO = new javax.swing.JLabel();
        txtNO = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("手机");

        jButton4.setText("jButton4");

        btnSales_manage.setFont(new java.awt.Font("华文行楷", 0, 18)); // NOI18N
        btnSales_manage.setLabel("销售员管理");
        btnSales_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSales_manageActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("经理销售管理");
        getContentPane().setLayout(null);

        lblMan_name.setFont(new java.awt.Font("华文行楷", 0, 24)); // NOI18N
        lblMan_name.setText("姓名");
        getContentPane().add(lblMan_name);
        lblMan_name.setBounds(78, 67, 48, 27);
        getContentPane().add(txtMan_name);
        txtMan_name.setBounds(166, 69, 165, 27);

        btnGood_manage.setFont(new java.awt.Font("华文行楷", 0, 24)); // NOI18N
        btnGood_manage.setLabel("商品管理");
        btnGood_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGood_manageActionPerformed(evt);
            }
        });
        getContentPane().add(btnGood_manage);
        btnGood_manage.setBounds(18, 217, 129, 35);

        btnPer_info.setFont(new java.awt.Font("华文行楷", 0, 24)); // NOI18N
        btnPer_info.setText("个人信息");
        btnPer_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPer_infoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPer_info);
        btnPer_info.setBounds(292, 217, 129, 35);

        lblNO.setFont(new java.awt.Font("华文行楷", 0, 24)); // NOI18N
        lblNO.setText("编号");
        getContentPane().add(lblNO);
        lblNO.setBounds(78, 142, 48, 27);

        txtNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOActionPerformed(evt);
            }
        });
        getContentPane().add(txtNO);
        txtNO.setBounds(166, 144, 165, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/good/sale/manage/2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOActionPerformed

    private void btnPer_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPer_infoActionPerformed
         FrmPerInfo frame=new FrmPerInfo();
         frame.setSize(429,310);
         frame.setVisible(true);
         this.dispose();
         //关闭当前窗体
    }//GEN-LAST:event_btnPer_infoActionPerformed

    private void btnGood_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGood_manageActionPerformed
         FrmGoodManage frame=new FrmGoodManage();
         frame.setSize(520,555);
         
         frame.setVisible(true);
         this.dispose();
         //关闭当前窗体
    }//GEN-LAST:event_btnGood_manageActionPerformed

    private void btnSales_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSales_manageActionPerformed
 ;
    }//GEN-LAST:event_btnSales_manageActionPerformed

    public void showTextData2(int index){
        Vector line=(Vector)data.get(index);
        txtNO.setText(line.get(0).toString());
        txtMan_name.setText(line.get(1).toString());
    }
     //加锁
    public void lock(){
        txtNO.setEnabled(false);
        txtMan_name.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGood_manage;
    private javax.swing.JButton btnPer_info;
    private javax.swing.JButton btnSales_manage;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMan_name;
    private javax.swing.JLabel lblNO;
    private javax.swing.JTextField txtMan_name;
    private javax.swing.JTextField txtNO;
    // End of variables declaration//GEN-END:variables
}
