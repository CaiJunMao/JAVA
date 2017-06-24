/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.good.DBcon;
import java.sql.*;
import java.util.*;
public class MyDBCon {
    //创建数据库连接的方法(JDBC)
    public static Connection JDBCon(){
        try{
            //--2 加载驱动程序
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // --3 创建连接
              String url="jdbc:sqlserver://localhost:1433; databaseName=DBGood";//localhost本机，如果不是则其他电脑的ip
              Connection conn=DriverManager.getConnection(url,"sa","294519506");//sa是登录名 294519506是密码//但是这种方法使密码外泄，有没有其他方法
              System.out.println("数据库连接成功");
              return conn;
        }catch(ClassNotFoundException ex){
            System.out.println("数据库驱动程序找不到");//写错或架包没进来
            return null;
        }catch(SQLException ex){
            System.out.println("数据库连接失败");//tcp/ip未启动
            ex.printStackTrace();
            return null;
        }
    }
    
    
     //--对Worker表查询数据的方法（生成二维的vector）
    public static Vector queryVectorData1(String sql){//调用i数据库的方法来创建连接
        Connection conn=JDBCon();
        try{
            //创建会话对象
            Statement stmt=conn.createStatement();//通过连接对象创建了会话对象
            ResultSet rs=stmt.executeQuery(sql);//execute执行Query查询，查询结果放到结果集ResultSet
            Vector data=new Vector();
            while(rs.next()){//结果集中有6条数据，这一句判断是否还有下一条
                Vector line= new Vector();//把Book的四个值放到另外的vector中，所以又实例化一个line vector,lin只存一行数据
                line.add(rs.getObject(1).toString());//添加这一行第一个字段
                line.add(rs.getObject(2).toString());
                line.add(rs.getObject(3).toString());
                line.add(rs.getObject(4).toString());
                line.add(rs.getObject(5).toString());
                line.add(rs.getObject(6).toString());
                line.add(rs.getObject(7).toString());
                line.add(rs.getObject(8).toString());
                line.add(rs.getObject(9).toString());
                data.add(line);//再加到data里面，这样就变成每个data里面每一个元素又是一行line,这就构成了二维
            }
            
            //关闭
            rs.close();//结果集关闭
            stmt.close();//会话对象关闭
            conn.close();//连接对象也要关闭
            return data;//最终返回一个vetor对象data,写完调用方法后在图形界面调用，转去StuInfManJFramez中
        }catch(SQLException ex){
            System.out.println("数据库访问失败");
            ex.printStackTrace();
            return null;
        }
    }
     //--对sell表查询数据的方法（生成二维的vector）
    public static Vector queryVectorData2(String sql){//调用i数据库的方法来创建连接
        Connection conn=JDBCon();
        try{
            //创建会话对象
            Statement stmt=conn.createStatement();//通过连接对象创建了会话对象
            ResultSet rs=stmt.executeQuery(sql);//execute执行Query查询，查询结果放到结果集ResultSet
            Vector data=new Vector();
            while(rs.next()){//结果集中有6条数据，这一句判断是否还有下一条
                Vector line= new Vector();
                line.add(rs.getObject(1).toString());//添加这一行第一个字段
                line.add(rs.getObject(2).toString());
                line.add(rs.getObject(3).toString());
                line.add(rs.getObject(4).toString());
                line.add(rs.getObject(5).toString());
                line.add(rs.getObject(6).toString());
                line.add(rs.getObject(7).toString());
                line.add(rs.getObject(8).toString());
                line.add(rs.getObject(9).toString());
                line.add(rs.getObject(10).toString());
                line.add(rs.getObject(11).toString());
                data.add(line);//再加到data里面，这样就变成每个data里面每一个元素又是一行line,这就构成了二维
            }
            
            //关闭
            rs.close();//结果集关闭
            stmt.close();//会话对象关闭
            conn.close();//连接对象也要关闭
            return data;//最终返回一个vetor对象data,写完调用方法后在图形界面调用，转去StuInfManJFramez中
        }catch(SQLException ex){
            System.out.println("数据库访问失败");
            ex.printStackTrace();
            return null;
        }
    }
    //--对good表查询数据的方法（生成二维的vector）
    public static Vector queryVectorData3(String sql){//调用i数据库的方法来创建连接
        Connection conn=JDBCon();
        try{
            //创建会话对象
            Statement stmt=conn.createStatement();//通过连接对象创建了会话对象
            ResultSet rs=stmt.executeQuery(sql);//execute执行Query查询，查询结果放到结果集ResultSet
            Vector data=new Vector();
            while(rs.next()){//结果集中有10条数据，这一句判断是否还有下一条
                Vector line= new Vector();
                line.add(rs.getObject(1).toString());//添加这一行第一个字段
                line.add(rs.getObject(2).toString());
                line.add(rs.getObject(3).toString());
                line.add(rs.getObject(4).toString());
                line.add(rs.getObject(5).toString());
                line.add(rs.getObject(6).toString());
                line.add(rs.getObject(7).toString());
                line.add(rs.getObject(8).toString());
                line.add(rs.getObject(9).toString());
                line.add(rs.getObject(10).toString());
                data.add(line);//再加到data里面，这样就变成每个data里面每一个元素又是一行line,这就构成了二维
            }
            
            //关闭
            rs.close();//结果集关闭
            stmt.close();//会话对象关闭
            conn.close();//连接对象也要关闭
            return data;//最终返回一个vetor对象data,写完调用方法后在图形界面调用，转去StuInfManJFramez中
        }catch(SQLException ex){
            System.out.println("数据库访问失败");
            ex.printStackTrace();
            return null;
        }
    }
    //--更新数据的方法（插入，修改，删除，都用它）
    public static boolean updateData(String sql){
        Connection conn=JDBCon();
        try{
            //创建会话对象
            Statement stmt=conn.createStatement();
            //执行更新的SQL语句，返回受影响的行数
            int r=stmt.executeUpdate(sql);//执行更新语句
            stmt.close();//把会话关了
            conn.close();//数据库的连接也关掉
            if(r>0){//受影响的行数小于零，没更新
                return true;//更新成功
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println("数据库更新失败");
            return false;
        }
    }
}
