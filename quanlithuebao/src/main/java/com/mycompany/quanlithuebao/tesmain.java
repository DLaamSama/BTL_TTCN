/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlithuebao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tesmain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<thuebaotheodungluong> list = new ArrayList<>();
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Xuat thong tin");
            System.out.println("3.Sap xep danh sach theo ma ");
            System.out.println("4.Nhap ma can tim va tim kiem ");
            System.out.println("5.thoat");
            System.out.println("Cam on ban da dung chuong trinh ");
            System.out.println("_______________________________________________");
            System.out.println("Nhap vao lua chon cua ban");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong thue bao: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin thue bao thu  " + (i + 1) + ":");
                        thuebaotheodungluong thuebao = new thuebaotheodungluong();
                        thuebao.nhapthongtin();
                        list.add(thuebao);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sau khi nhap : \n");
                    System.out.printf("%20s %20s %20s %20s \n ","mathuebao","chuthueba","diachi","dungLuong");
                    for (thuebaotheodungluong item : list) {
                        item.xuat();
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    Collections.sort(list);
                    System.out.println("danh sach thu bao sau khi sap xep");
                    for (thuebaotheodungluong item : list) {
                        item.xuat();
                    }
                    break;
                case 4:
                    System.out.print("\nNhập mã thuê bao cần tìm kiếm: ");
                    String maThueBao = sc.nextLine();
                    boolean timThay = false;

                    for (thuebaotheodungluong item : list) {
                        if (item.getMaThueBao().equals(maThueBao)) {
                            item.xuatThongTin();
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Không tìm thấy thuê bao có mã " + maThueBao);
                    }
                    break;
                    

            }
        } while (choice != 3);

    }
}
