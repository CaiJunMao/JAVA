/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.good.g_import;

import com.good.employee.Manager_set_get;
import com.good.DBcon.MyDBCon;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author za204
 */
public class Manager_import {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private CallableStatement cs = null;
    private ResultSet rs = null;
    private MyDBCon db = new MyDBCon();
    
    public Manager_set_get findByid(String tid){
        Manager_set_get manager = null;
        String sql = "select * from Manager where eNO=?";
        try {
            conn = db.JDBCon();
            ps = conn.prepareStatement(sql);
            ps.setString(1,tid);
            rs = ps.executeQuery();
            if(rs.next()){
                //取出数据
                manager = new Manager_set_get();
                manager.seteNO(rs.getString("eNO"));
                manager.setCode(rs.getString("code"));
                manager.seteName(rs.getString("eName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager_import.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(rs!=null)rs.close();
                if(ps!=null)ps.close();
                if(conn!=null)conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Manager_import.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return manager;
    }
}
