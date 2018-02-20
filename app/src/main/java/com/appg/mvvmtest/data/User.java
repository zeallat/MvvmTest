package com.appg.mvvmtest.data;

/**
 * Created by HoJunLee on 2018-02-20.
 */

public class User {
    private String name;
    private int age;
    private String phoneNumber;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
