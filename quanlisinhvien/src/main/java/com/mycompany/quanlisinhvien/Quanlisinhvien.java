/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.quanlisinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Quanlisinhvien {

    public static void main(String[] args) {
        ArrayList<sinhvien> list = new ArrayList<sinhvien>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1.nhap danh sach sinh vien:");
            System.out.println("2.hien thi danh sach sinh vien ");
            System.out.println("3.sap xep theo a -> b");
            System.out.println("tim va xoa");
            System.out.println("thoat!");
            System.out.println("Nhap lua chon cua ban ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("nhap so sinh vien : ");
                    int sosv = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < sosv; i++) {
                        System.out.printf("nhap thong tin sinh vien thu %d:", i + 1);
                        System.out.println("nhap vao ho dem :");
                        String ho = sc.nextLine();
                        System.out.println("Nhap vao ten :");
                        String tensv = sc.nextLine();
                        System.out.println("nhap vao ngay sinh:");
                        String datesinh = sc.nextLine();
                        System.out.println("Nhap vao ngay vao lam");
                        String datevl = sc.nextLine();
                        sinhvien sv = new sinhvien(ho, tensv, datesinh, datevl);
                        list.add(sv);
                    }
                    break;
                case 2:
                    System.out.printf("%20s-%20s-%20s-%20s \n", "hodem", "ten", "ngay sinh", "ngay vao lam");
                    for (sinhvien item : list) {
                        System.out.printf("%20s-%20s-%20s-%20s \n", item.getHodem(), item.getTen(), item.getNgaysinh(), item.getNgayvaolam());
                    }
                    break;
            }
        }while (choice != 2);
    }
}
