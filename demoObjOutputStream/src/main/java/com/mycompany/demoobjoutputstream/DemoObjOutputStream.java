/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demoobjoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ASUS
 */
public class DemoObjOutputStream {

    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("D:/demo/filedemo/product.dat"); 
                ObjectOutputStream objos = new ObjectOutputStream(fos);
                ){
            product pro = new product("s01", "phan van nguyen");
            objos.writeObject(pro);
            System.out.println("luu file thanhh cong");

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
            e.printStackTrace();
        }
    }
}
