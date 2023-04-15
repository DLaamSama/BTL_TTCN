/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli;

/**
 *
 * @author ASUS
 */
public class phuongtien {

    private String tenchuxe;
    private String loaixe;
    private int dungtich;
    private int giatri;
    private int thuephaidong;

    public String getTenchuxe() {
        return tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public int getGiatri() {
        return giatri;
    }

    public void setGiatri(int giatri) {
        this.giatri = giatri;
    }

    public int getThuephaidong() {
        return thuephaidong;
    }

    public phuongtien(String tenchuxe, String loaixe, int dungtich, int giatri) {
        this.tenchuxe = tenchuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.giatri = giatri;
        this.thuephaidong = tinhthue();
    }

    public phuongtien() {
    }

    private int tinhthue() {
        int thue = 0;
        if (dungtich < 100) {
            thue = giatri * 1 / 100;
        } else if (dungtich > 100 && dungtich < 200) {
            thue = giatri * 3 / 100;
        } else if (dungtich > 200) {
            thue = giatri * 5 / 100;
        }
        return thue;
    }

}
