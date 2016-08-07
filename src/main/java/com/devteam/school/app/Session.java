package com.devteam.school.app;

public class Session {
    private static Session ourInstance = new Session();

    private long userid;
    private String username;
    private String userFullName;

    private Session() {
        this.username = null;
        this.userFullName = null;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public void invalidate(){
        this.username = null;
    }


    public static Session getSession() {
        return ourInstance;
    }

}
