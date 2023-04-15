/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanli;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class testmain {

    public static void main(String[] args) {
        ArrayList<phuongtien> list = new ArrayList<phuongtien>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. nhap thong tin va tao danh sach cac xe ");
            System.out.println("2. xuat bang");
            System.out.println("3. Thoát");
            System.out.print("lua chon cua cua ban ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống sau khi đọc số nguyên
            switch (choice) {
                case 1:
                    System.out.println("nhap so luong xe muon dk :");
                    int soluongxe = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < soluongxe; i++) {
                        System.out.printf("nhap thong tin xe thu %d :\n", i + 1);
                        System.out.println("nhap ten chu xe: ");
                        String tenchu = sc.nextLine();
                        System.out.println("Nhap loai xe :");
                        String lXe = sc.nextLine();
                        System.out.println("nhap dung tich xe ");
                        int dTich = sc.nextInt();
                        System.out.println("nhap vao gia tri xe : ");
                        int gtri = sc.nextInt();
                        sc.nextLine();
                        phuongtien xe = new phuongtien(tenchu, lXe, dTich, gtri);
                        list.add(xe);
                        
                    }
                    break;

                case 2:
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Tên chủ xe", "Loai xe", "Dung tích xy lanh", "Gia tri", "Thuế phải đóng");
                    for (phuongtien item : list) {
                        System.out.printf("%20s %20s %20d %20d %20d \n", item.getTenchuxe(), item.getLoaixe(), item.getDungtich(), item.getGiatri(), item.getThuephaidong());
                    }
                    break;

                case 3:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

        } while (choice != 3);

    }
}
