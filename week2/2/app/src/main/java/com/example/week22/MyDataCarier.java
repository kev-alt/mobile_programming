package com.example.week22;

import java.io.Serializable;
import java.security.PrivateKey;

public class MyDataCarier implements Serializable {
    private String Ad;
    private String Soyad;
    private String email;

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}