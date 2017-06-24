/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.good.employee;


public class Salesman_set_get {
    
    private String eNO;  //编号
    private String eName; //姓名
    private String duty; //职务
    private String sex; //性别
    private String mainbox; //电子邮箱
    private int phone; //电话
    private String address;  //地址
    private String code; //密码
    private String meno; //备注
    private String Code;
    
    public String geteNO() {
        return eNO;
    }
    public void seteNO(String eNO) {
        this.eNO = eNO;
    }

    
    
    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }

 
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    
    
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
    
    
    public String getMainbox() {
        return mainbox;
    }
    public void setMainbox(String mainbox) {
        this.mainbox = mainbox;
    }
    
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
   
    
    
    public String getMeno() {
        return meno;
    }
    public void setMeno(String meno) {
        this.meno = meno;
    }
    
}
