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
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private Mon monHoc;
    private float diemThi;

    public SinhVien(String hoTen, Date ngaySinh, Mon monHoc, float diemThi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.monHoc = monHoc;
        this.diemThi = diemThi;
    }
    public SinhVien(){
        
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Mon getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(Mon monHoc) {
        this.monHoc = monHoc;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    public void nhap(){
        Scanner c=new Scanner(System.in);
        System.out.println("Nhap ho ten sv: ");
        hoTen=c.nextLine();
        ngaySinh.nhap();
        monHoc.nhap();
        System.out.println("Nhap diem thi: ");
        diemThi=c.nextFloat();
    }
    public void inTieuDe(){
        System.out.printf("  %s  %s  %s  %s  %s  %s   %n","Ho ten","Ngay sinh","Ten mon","So hoc sinh","Hoc ky","Diem thi");
    }
    public void xuat(){
        System.out.printf("%s     %s      %s      %d      %s     %f     %n",hoTen,ngaySinh.toString(),monHoc.getTenMon(),monHoc.getHocKy(),monHoc.getSoHocSinh(),diemThi);
    }
}
