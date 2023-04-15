/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managerment_nhanvien.models;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class nhanvien implements Serializable{
    private String manv,hoten,email;
    private int tuoi,luong;

    public nhanvien(String manv, String hoten, String email, int tuoi, int luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.email = email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public nhanvien() {
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
}
