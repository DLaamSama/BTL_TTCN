/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlisim;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class simtheodungluong extends sim implements nhapxuat{
    private int dungluong;

    public int getDungluong() {
        return dungluong;
    }

    public void setDungluong(int dungluong) {
        this.dungluong = dungluong;
    }

    public simtheodungluong(String masim, String chusim, String dichi,int dungluong) {
        super(masim, chusim, dichi);
        this.dungluong = dungluong;
    }

    public simtheodungluong() {
    }
    
    public int cuocphhi(){
        int tiencuocthang = tiensimhangthang;
        int cuocdungluong = muctran *40;
        int cuocsim = tiencuocthang+muctran;
        if (cuocsim>muctran){
            return muctran;
        }
        return cuocsim;
        
    }
    public void nhap(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao dung luong: ");
        dungluong = sc.nextInt();
        
    }
    public void xuat(){
        super.xuatthongtin();
        System.out.printf("%20d  %20d",dungluong,cuocphhi());
    }

    @Override
    public void nhapthongtin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xuatthongtin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
