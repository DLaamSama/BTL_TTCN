/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlithuebao;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class thuebaotheodungluong extends thebao implements nhapxuat {

    private int dungluong;

    public thuebaotheodungluong(String mathuebao, String chuthuebao, String diachi, int dungluong) {
        super(mathuebao, chuthuebao, diachi);
        this.dungluong = dungluong;
    }

    public thuebaotheodungluong() {
    }

    public int getDungluong() {
        return dungluong;
    }

    public void setDungluong(int dungluong) {
        this.dungluong = dungluong;
    }

    public int tinhcuoc() {
        int cuocthuebao = tienTBhangthang;
        int cuocdungluong = muctran * 40;
        int tongcuoc = cuocdungluong + cuocthuebao;
        if (tongcuoc > muctran) {
            return muctran;
        }
        return tongcuoc;
    }

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap dung luong:");
        dungluong = sc.nextInt();

    }

    public void xuat() {
        super.xuat();
        System.out.printf("%20d MB ",dungluong);
    }

    Object getMaThueBao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void xuatThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
