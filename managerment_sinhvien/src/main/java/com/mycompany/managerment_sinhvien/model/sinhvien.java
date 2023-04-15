/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managerment_sinhvien.model;

/**
 *
 * @author ASUS
 */
public class sinhvien {

    private String hoten, nghanh, hocluc, thuong;
    private double diem;

    public sinhvien(String hoten, Double diem, String nghanh) {
        this.hoten = hoten;
        this.nghanh = nghanh;
        this.diem = diem;
    }

    public sinhvien(double diem) {
        this.diem = diem;
    }

    public sinhvien() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNghanh() {
        return nghanh;
    }

    public void setNghanh(String nghanh) {
        this.nghanh = nghanh;
    }

    public String getHocluc() {
        if(diem>0&&diem<5){
            return  "Yeu";
        }
        else if(diem<7){
            return  "Trung Binh Kha";
        }
        else if(diem<9){
            return "Kha";
        }
        return "Gioi";
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public String getThuong() {
        if (diem >= 9) {
            return "Xuat Sac";
        }
        else if(diem>8){
        return "Gioi";
        }
        return  "Khong co thuong";
    }

    public void setThuong(String thuong) {
        this.thuong = thuong;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void getNghanh(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getdiem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


}
