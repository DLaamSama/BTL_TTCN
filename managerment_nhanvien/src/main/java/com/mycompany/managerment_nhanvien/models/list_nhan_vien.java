/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managerment_nhanvien.models;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class list_nhan_vien {

    private ArrayList<nhanvien> list = new ArrayList<>();
    private int currenIndex = 0;

    public void first() {
        if (currenIndex > 0) {
            currenIndex = 0;
        }
    }

    public void previous() {
        if (currenIndex > 0) {
            currenIndex--;
        }
    }

    public void next() {
        if (currenIndex < list.size()) {
            currenIndex++;
        }
    }

    public void last() {
        currenIndex = list.size() - 1;
    }

    public int getCurrenIndex() {
        return currenIndex;
    }

    public nhanvien getCurren() {
        if (list.size() == 0) {
            return null;
        }
        return list.get(currenIndex);
    }

    public void add(nhanvien nv) {
        list.add(nv);
    }
//update thong tin cua nhan vien theo ma 
    public boolean update(nhanvien nv) {
        // tim ma 
        nhanvien existed_nv = findbyma(nv.getManv());
        boolean flag = false;
        if (existed_nv != null) {
            existed_nv.setHoten(nv.getHoten());
            existed_nv.setTuoi(nv.getTuoi());
            existed_nv.setEmail(nv.getEmail());
            existed_nv.setLuong(nv.getLuong());
            flag = true;
        }
        return flag;
    }
//hien thi du lieu len table 
    public void rederToTable(DefaultTableModel tblModel) {
        //xoa trang
        tblModel.setRowCount(0);
        for (nhanvien nhanvien : list) {
            Object[] row = new Object[]{
                nhanvien.getManv(), nhanvien.getHoten(),
                nhanvien.getEmail(), nhanvien.getTuoi(),
                nhanvien.getLuong()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
}

public nhanvien findbyma(String Manv) {
        for (nhanvien nhanvien : list) {
            if (nhanvien.getManv().equals(nhanvien.getManv())) {
                return nhanvien;
            }
        }
        return null;
    }

    public boolean deletebyma(String Manv) {
        for (nhanvien nhanvien : list) {
            if (nhanvien.getManv().equals(nhanvien.getManv())) {
                list.remove(nhanvien);
                return true;
            }
        }
        return false;
    }

}
