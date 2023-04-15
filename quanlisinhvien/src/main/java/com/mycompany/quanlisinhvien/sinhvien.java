/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlisinhvien;

/**
 *
 * @author ASUS
 */
public class sinhvien {
    private String hodem;
    private String ten;
    private String ngaysinh;
    private String ngayvaolam;

    public String getHodem() {
        return hodem;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNgayvaolam() {
        return ngayvaolam;
    }

    public void setNgayvaolam(String ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public sinhvien(String hodem, String ten, String ngaysinh, String ngayvaolam) {
        this.hodem = hodem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.ngayvaolam = ngayvaolam;
    }

    public sinhvien() {
    }
    
}
