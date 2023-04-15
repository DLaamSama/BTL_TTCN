/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoobjoutputstream;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

/**
 *
 * @author ASUS
 */
public class demoObjInputStream {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("D:/demo/filedemo/product.dat");
                ObjectInputStream dis = new ObjectInputStream(fis);
                ) {
            product pro =(product) dis.readObject();
            System.out.println("product id : "+ pro.getId());
            System.out.println("product name : "+ pro.getName());
            
        } catch (Exception e) {
            System.out.println("error"+ e.getMessage());
            e.getStackTrace();
        }
    }
}
