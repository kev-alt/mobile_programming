package com.example.data_sharing_between_two_activities;

import java.io.Serializable;

public class MyDataCarier implements Serializable {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
