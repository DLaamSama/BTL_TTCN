/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quanlisim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Quanlisim {

    public static void main(String[] args) {
        ArrayList<simtheodungluong> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("----------------------------------");
            System.out.println("Menu");
            System.out.println("1.nhap thong tin:");
            System.out.println("2.Xuat thong tin:");
            System.out.println("3.Sap xep sim theo ma :");
            System.out.println("4.Tim va hien thi thong tin ");
            System.out.println("5.Thoat");
            System.out.println("Moi ban nhap chuc nang");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao so sim:");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin sim thu  " + (i + 1));
                        simtheodungluong sim = new simtheodungluong();
                        sim.nhap();
                        list.add(sim);

                    }
                case 2:
                    System.out.println("=======================");
                    System.out.println("Xuat thong tin cac sim :");
                    System.out.printf("%20s %20s %20s %20d %20d \n ", "ma sim", "Chu sim ", "dia chi ", "dung luong ", "tong cuoc");
                    for (simtheodungluong item : list) {
                        item.xuat();
                    }
                    break;
                case 3:
                    Collections.sort(list);
                    System.out.println("=======================");
                    System.out.println("Xuat thong tin sau khi sap xep ");
                    System.out.printf("%20s %20s %20s %20d %20d \n ", "ma sim", "Chu sim ", "dia chi ", "dung luong ", "tong cuoc");
                    for (simtheodungluong item : list) {
                        item.xuat();
                    }
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;

            }

        } while (choice != 3 );
    }
}
