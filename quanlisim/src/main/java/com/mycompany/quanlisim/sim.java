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
public class sim implements nhapxuat {

    private String masim, chusim, diachi;

    public String getMasim() {
        return masim;
    }

    public void setMasim(String masim) {
        this.masim = masim;
    }

    public String getChusim() {
        return chusim;
    }

    public void setChusim(String chusim) {
        this.chusim = chusim;
    }

    public String getDichi() {
        return diachi;
    }

    public void setDichi(String dichi) {
        this.diachi = dichi;
    }

    public sim(String masim, String chusim, String dichi) {
        this.masim = masim;
        this.chusim = chusim;
        this.diachi = dichi;
    }

    public sim() {
    }

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ma sim: ");
        masim = sc.nextLine();
        System.out.println("nhap vao chu sim:");
        chusim = sc.nextLine();
        System.out.println("nhap vao dia chi:");
        diachi = sc.nextLine();
    }

    public void xuatthongtin() {
        System.out.printf("%20s %20s %20s ", masim, chusim, diachi);
    }

}
