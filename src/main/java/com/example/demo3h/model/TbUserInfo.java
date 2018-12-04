package com.example.demo3h.model;


import java.io.Serializable;
import java.util.Date;
//@Entity
public class TbUserInfo implements Serializable {
//    @Id
//    @GeneratedValue
    private int userid;
    private String userAccount;
    private String password;
    private String email;
    private int deptId;
    private int delFlag;
    private Date createDate;
    private String image;

    public  TbUserInfo(){

    }

    public TbUserInfo(int userid, String userAccount, String password, String email, int deptId, int delFlag, Date createDate, String image) {
        this.userid = userid;
        this.userAccount = userAccount;
        this.password = password;
        this.email = email;
        this.deptId = deptId;
        this.delFlag = delFlag;
        this.createDate = createDate;
        this.image = image;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
