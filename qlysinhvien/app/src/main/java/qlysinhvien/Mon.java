/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlysinhvien;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mon {
    private String tenMon,hocKy;
    private int soHocSinh;

    public Mon() {
        this.tenMon =tenMon;
        this.hocKy = hocKy;
        this.soHocSinh = 0;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public int getSoHocSinh() {
        return soHocSinh;
    }

    public void setSoHocSinh(int soHocSinh) {
        this.soHocSinh = soHocSinh;
    }
    public void nhap(){
        Scanner b=new Scanner(System.in);
        System.out.println("Nhap ten mon hoc: ");
        tenMon=b.nextLine();
        System.out.println("Nhap so hoc sinh: ");
        soHocSinh=b.nextInt();
        System.out.println("Nhap hoc ky: ");
        hocKy=b.nextLine();
    }
    public void xuat(){
        System.out.println(tenMon + soHocSinh + hocKy);
    }
}
