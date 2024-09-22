package com.bilibili.pt06.studentsystem;

public class User {
    private String username;
    private String password;
    private String personID;
    private String phoneNumber;

    public User() {
    }

    public User(String username, String password, String idnumber, String phone) {
        this.username = username;
        this.password = password;
        this.personID = idnumber;
        this.phoneNumber = phone;
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

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
