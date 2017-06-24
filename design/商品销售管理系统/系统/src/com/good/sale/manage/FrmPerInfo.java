package com.good.sale.manage;
import com.good.DBcon.MyDBCon;
import java.util.*;
import javax.swing.*;//JOptionPane的导包
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 随缘
 */
public class FrmPerInfo extends javax.swing.JFrame {
    Vector data;//声明集合变量data,声明变量上面导入java所在包import java.util.*;
    
    int row =0;//下标
    
    public FrmPerInfo() {
        initComponents();
         radNull.setVisible(false);//让radNull按钮不可见，
         btnReset.setVisible(false);//重置按钮仅用于修改,所以一开始是不可见的，仅按了修改按钮才可见
        
         data=MyDBCon.queryVectorData1("Select * from Manager");
       
                 //调用二维vector获得数据的方法
         getTextData(row);
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     public void getTextData(int index){
         Vector line=(Vector)data.get(index);//因为获得的是一个个vector对象，所以用(vector)强制性转换
         txtEno.setText(line.get(0).toString());//line.get(0)就是BookID，get(0)是line的第一个字段
         txtEname.setText(line.get(1).toString());
         txtDuty.setText(line.get(2).toString());
         txtAdress.setText(line.get(6).toString());
         txtPhone.setText(line.get(5).toString());
         txtEmail.setText(line.get(4).toString());
         txtaMeno.setText(line.get(8).toString());
         if(line.get(3).toString().equals("男"))
             {
             radMan.setSelected(true);//借出则借出按钮为true按钮
         }
         else if(line.get(5).toString().equals("女")){
             radWoman.setSelected(true);
         }
         else {
             radElse.setSelected(true);
         }
         //文本框一显示数据则加锁,表示显示数据时不容许修改
         lock();//但是下面操作按钮不锁
     }
   
    //加锁的方法，用于查询，添加，保存，时有些按钮或文本不允许操作
    public void lock(){
        txtEno.setEnabled(false);//该文本框设置为是否可用
        txtEname.setEnabled(false);
        txtDuty.setEnabled(false);
        txtAdress.setEnabled(false);
        txtPhone.setEnabled(false);
        txtEmail.setEnabled(false);
        radMan.setEnabled(false);
        radWoman.setEnabled(false);
        radElse.setEnabled(false);
        txtaMeno.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);//保存，取消为关闭状态
        btnCancle.setEnabled(false);
    }
    //解锁的方法，按下添加按钮，修改按钮等时需要解锁
    public void unlock(){
        txtEno.setEnabled(true);//该文本框设置为是否可用
        txtEname.setEnabled(true);
        txtDuty.setEnabled(true);
        txtAdress.setEnabled(true);
        txtPhone.setEnabled(true);
        txtEmail.setEnabled(true);
        radMan.setEnabled(true);
        radWoman.setEnabled(true);
        radElse.setEnabled(true);
        txtaMeno.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);//保存，取消为关闭状态
        btnCancle.setEnabled(true);
    }
    //清空文本框的方法
    public void clearText(){
        txtEno.setText("");
        txtEname.setText("");
        txtDuty.setText("");
        txtAdress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtaMeno.setText("");
        radNull.setSelected(true);//让单选按钮选到不显示的空按钮
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtEno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radMan = new javax.swing.JRadioButton();
        radWoman = new javax.swing.JRadioButton();
        radElse = new javax.swing.JRadioButton();
        radNull = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDuty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMeno = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("个人信息");
        getContentPane().setLayout(null);

        jLabel1.setText("编号");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 48, 21);
        getContentPane().add(txtEno);
        txtEno.setBounds(76, 10, 96, 21);

        jLabel2.setText("姓名");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 37, 48, 21);

        txtEname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtEname);
        txtEname.setBounds(76, 37, 96, 21);

        jLabel3.setText("地址");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 91, 48, 21);
        getContentPane().add(txtAdress);
        txtAdress.setBounds(76, 91, 96, 21);

        jLabel4.setText("电话");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 118, 48, 21);

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhone);
        txtPhone.setBounds(76, 118, 96, 21);

        jLabel5.setText("电子邮箱");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 145, 48, 18);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(76, 145, 96, 21);

        jLabel6.setText("性别");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 170, 48, 15);

        buttonGroup1.add(radMan);
        radMan.setText("男");
        getContentPane().add(radMan);
        radMan.setBounds(76, 166, 37, 23);

        buttonGroup1.add(radWoman);
        radWoman.setText("女");
        getContentPane().add(radWoman);
        radWoman.setBounds(76, 191, 37, 23);

        buttonGroup1.add(radElse);
        radElse.setText("其他");
        getContentPane().add(radElse);
        radElse.setBounds(76, 216, 49, 23);

        radNull.setText("隐形");
        getContentPane().add(radNull);
        radNull.setBounds(125, 216, 49, 23);

        btnUpdate.setText("修改");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(10, 249, 57, 23);

        btnSave.setText("保存");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(77, 249, 57, 23);

        btnCancle.setText("取消");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancle);
        btnCancle.setBounds(144, 249, 57, 23);

        btnReturn.setText("返回");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(219, 249, 57, 23);

        jLabel7.setText("职务");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 64, 48, 21);

        txtDuty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDutyActionPerformed(evt);
            }
        });
        getContentPane().add(txtDuty);
        txtDuty.setBounds(76, 64, 96, 21);

        jLabel8.setText("备注");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 13, 24, 15);

        txtaMeno.setColumns(20);
        txtaMeno.setRows(5);
        jScrollPane1.setViewportView(txtaMeno);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(218, 10, 184, 229);

        btnReset.setText("重置");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(286, 249, 57, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/good/sale/manage/4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtDutyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDutyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDutyActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        unlock();//先解锁，使得只有数据可改，可保存，取消按钮可操作
        txtEno.setEnabled(false);//但是员工的编号不可改,同我们学号一样，可改不可删
        
        btnReset.setVisible(true);//添加时重置按钮可见，修改完，取消或保存后又恢复不可见
    }//GEN-LAST:event_btnUpdateActionPerformed
//保存
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //获得输入的新数据
        String eNo=txtEno.getText();
        String eName=txtEname.getText();
        String duty=txtDuty.getText();
        String mailbox=txtEmail.getText();
        String phone=txtPhone.getText();
        String address=txtAdress.getText();
        String meno=txtaMeno.getText();
        String sex="";//如果最终的sql语句是insert into worker values('','','','','',''),在数据库中它会默认把''里的看成一个空格，不为空，所以即使什么东西都没有它也会插入成功，这是不合理的，什么内容都没有干嘛往里面插，所以如果主键文本框啥都没有，要在形成最终sql语句时用NUL替掉主键的''.
        if(radMan.isSelected()){//如果选中
            sex="男";
        }
        else if(radWoman.isSelected()){
            sex="女";
        }
        else if(radElse.isSelected()){
            sex="其他";
        }
        String sql="";
        
            
            //修改    
            //eNo不可修改，所以修改后不用像添加按钮一样判断
        sql="update Manager set eName='"+eName+"',duty='"+duty+"',sex='"+sex+"',mailbox='"+mailbox+"',phone='"+phone+"',address='"+address+"',meno='"+meno+"' where eNO='"+eNo+"'";//书号还是原来的数据
        
        System.out.println(sql);//看看输入的sql格式是否正确
        //保存到表中
        if(MyDBCon.updateData(sql)){//跟数据库打交道，要到MyDBCon中去写//更新成功就返回true
            
            //成功的话弹出对话框告诉用户成功
            JOptionPane.showMessageDialog(null,"保存数据成功","系统提示",JOptionPane.INFORMATION_MESSAGE);//提示对话框
        }else{
            JOptionPane.showMessageDialog(null,"保存数据失败","系统提示",JOptionPane.ERROR_MESSAGE);//错误对话框
        }
        lock();//重新锁上
        btnReset.setVisible(false);//
    }//GEN-LAST:event_btnSaveActionPerformed
//重置
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtEname.setText("");
        txtDuty.setText("");
        txtAdress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtaMeno.setText("");
        radNull.setSelected(true);
    }//GEN-LAST:event_btnResetActionPerformed
//取消
    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        getTextData(row);//当点了修改按钮后取消，即重新显示数据即可
       
        btnReset.setVisible(false);
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
         FrmManager frame=new FrmManager();
         frame.setSize(444,300);
         frame.setVisible(true);
         frame.setLocationRelativeTo(null);//窗口在屏幕中间显示 
         this.dispose();
         //关闭当前窗体
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radElse;
    private javax.swing.JRadioButton radMan;
    private javax.swing.JRadioButton radNull;
    private javax.swing.JRadioButton radWoman;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtDuty;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEname;
    private javax.swing.JTextField txtEno;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtaMeno;
    // End of variables declaration//GEN-END:variables
}
