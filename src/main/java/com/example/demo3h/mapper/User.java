package com.example.demo3h.mapper;

import java.io.Serializable;

public class User  implements Serializable {
    private static final long serialVersionUID = -4914585368925337032L;
    private String username;
    private String password;
    private String userRoles;

    public User() {

    }

    public User(String username, String password, String userRoles) {
        super();
        this.username = username;
        this.password = password;
        this.userRoles = userRoles;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("username:" + username);
        sb.append("password:" + password);
        sb.append("userRoles:" + userRoles);
        return sb.toString();
    }
}
