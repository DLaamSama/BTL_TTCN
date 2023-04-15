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
interface nhapxuat {
    int tienTBhangthang = 3000;
    int muctran = 400000;
}
public class thebao implements nhapxuat{
    private String mathuebao,chuthuebao,diachi;

    public String getMathuebao() {
        return mathuebao;
    }

    public void setMathuebao(String mathuebao) {
        this.mathuebao = mathuebao;
    }

    public String getChuthuebao() {
        return chuthuebao;
    }

    public void setChuthuebao(String chuthuebao) {
        this.chuthuebao = chuthuebao;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public thebao(String mathuebao, String chuthuebao, String diachi) {
        this.mathuebao = mathuebao;
        this.chuthuebao = chuthuebao;
        this.diachi = diachi;
    }

    public thebao() {
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma thue bao;");
        mathuebao = sc.nextLine();
        System.out.println("Nhap vao chu thue bao:");
        chuthuebao = sc.nextLine();
        System.out.println("Nhap vao dia chi:");
        diachi = sc.nextLine();
        
    }
    public void xuat(){
        System.out.printf("%20s %20s %20s ",mathuebao,chuthuebao,diachi);
       
    }
}
