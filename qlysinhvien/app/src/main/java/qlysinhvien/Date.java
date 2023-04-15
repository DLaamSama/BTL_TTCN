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
public class Date {
    private int day,month,year;

    public Date() {
        this.day =0;
        this.month =0;
        this.year =0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void nhap(){
        Scanner a=new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        day=a.nextInt();
        System.out.println("Nhap thang: ");
        month=a.nextInt();
        System.out.println("Nhap nam: ");
        year=a.nextInt();
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }
}
