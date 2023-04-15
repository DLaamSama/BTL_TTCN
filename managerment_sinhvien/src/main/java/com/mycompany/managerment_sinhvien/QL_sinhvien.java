/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.managerment_sinhvien;

import com.mycompany.managerment_sinhvien.model.sinhvien;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QL_sinhvien extends javax.swing.JFrame {

    private List<sinhvien> list = new ArrayList<>();
    //   su  dung   quan  lidu lieu  tron g Jtable
    private DefaultTableModel tblModel;

    /*Đầu tiên, khai báo và khởi tạo một instance của lớp DefaultTableModel bằng cách sử dụng từ khóa "new" và gán nó cho biến instance "tblModel".
    Sau đó, khởi tạo một mảng String "columns" chứa các tên cột của bảng.
    Tiếp theo, sử dụng phương thức setColumnIdentifiers() của lớp DefaultTableModel để đặt các tên cột cho bảng.
    Cuối cùng, sử dụng phương thức setModel() của đối tượng JTable để gán mô hình bảng cho JTable.*/
    private void initTable() {
        tblModel = new DefaultTableModel();
        String[] colums = new String[]{"Ho Ten", "Diem", "Nganh", "Hoc Luc", "Thuong"};
        tblModel.setColumnIdentifiers(colums);
        tbl_qlSinhVien.setModel(tblModel);
    }

    /*Sử dụng một vòng lặp while để xóa tất cả các hàng trên bảng. Cụ thể, điều kiện kiểm tra là số lượng hàng của bảng lớn hơn 0
    , và mỗi lần lặp lại vòng lặp sẽ xóa hàng đầu tiên của bảng bằng cách sử dụng phương thức "removeRow()" của lớp DefaultTableModel.
    Sau đó, sử dụng một vòng lặp for để thêm các giá trị mới vào bảng. Vòng lặp này duyệt qua danh sách "list" chứa các đối tượng "user" và thêm các giá trị tương ứng vào bảng bằng cách sử dụng phương thức "addRow()" của lớp DefaultTableModel.
    Cuối cùng, phương thức gọi phương thức "fireTableDataChanged()" của lớp DefaultTableModel để thông báo cho bảng rằng dữ liệu đã thay đổi và bảng cần được cập nhật lại. */
    private void fillTable() {
        while (tblModel.getRowCount() > 0) {
            tblModel.removeRow(0);
        }
        for (sinhvien item : list) {
            tblModel.addRow(new Object[]{item.getHoten(), item.getDiem(), item.getNghanh(), item.getHocluc(), item.getThuong()});
        }
        tblModel.fireTableDataChanged();
    }

    private void initData() {
        list.add(new sinhvien("A Van Nguyen", 9.0, "HTTT"));
        list.add(new sinhvien("Phan Van Nguyen", 3.0, "HTTT"));
        list.add(new sinhvien("C Van Nguyen", 9.0, "HTTT"));
        list.add(new sinhvien("Phan Van Nguyen", 8.0, "HTTT"));
        list.add(new sinhvien("F Van Nguyen", 6.0, "HTTT"));
    }

    public QL_sinhvien() {
        initComponents();
        initTable();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        txt_diem = new javax.swing.JTextField();
        txt_hocluc = new javax.swing.JTextField();
        cbb_nghanh = new javax.swing.JComboBox<>();
        check_thuong = new javax.swing.JCheckBox();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        Btn_capnhap = new javax.swing.JButton();
        btn_nhapmoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_qlSinhVien = new javax.swing.JTable();
        btn_sapxeptheodiem = new javax.swing.JButton();
        btn_sapxeptheoten = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quan Li Sinh Vien");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 110));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ho Va Ten");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nganh");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Diem");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hoc Luc");

        cbb_nghanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "KTPM", "HTTT", "KHMT" }));

        check_thuong.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        check_thuong.setForeground(new java.awt.Color(255, 255, 255));
        check_thuong.setText("Co Phan Thuong ?");

        btn_them.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_xoa.setText("Xoa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        Btn_capnhap.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Btn_capnhap.setText("Cap Nhap");
        Btn_capnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_capnhapActionPerformed(evt);
            }
        });

        btn_nhapmoi.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_nhapmoi.setText("Nhap  Moi");
        btn_nhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nhapmoiActionPerformed(evt);
            }
        });

        tbl_qlSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_qlSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_qlSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_qlSinhVien);

        btn_sapxeptheodiem.setBackground(new java.awt.Color(0, 102, 102));
        btn_sapxeptheodiem.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_sapxeptheodiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_sapxeptheodiem.setText("SX theo Diem");
        btn_sapxeptheodiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sapxeptheodiemActionPerformed(evt);
            }
        });

        btn_sapxeptheoten.setBackground(new java.awt.Color(0, 102, 102));
        btn_sapxeptheoten.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_sapxeptheoten.setForeground(new java.awt.Color(255, 255, 255));
        btn_sapxeptheoten.setText("SX theo Ten");
        btn_sapxeptheoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sapxeptheotenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_them)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_xoa)
                            .addGap(18, 18, 18)
                            .addComponent(Btn_capnhap)
                            .addGap(18, 18, 18)
                            .addComponent(btn_nhapmoi))
                        .addComponent(txt_diem, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_ten, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_hocluc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbb_nghanh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(check_thuong))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_sapxeptheoten, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btn_sapxeptheodiem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_nghanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(check_thuong)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_nhapmoi)
                    .addComponent(Btn_capnhap)
                    .addComponent(btn_xoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sapxeptheodiem)
                    .addComponent(btn_sapxeptheoten))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 620, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fillTable();
    }//GEN-LAST:event_formWindowOpened

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        kiemtradulieuvao();
        sinhvien sv = new sinhvien();
        sv.setHoten(txt_ten.getText());
        sv.setNghanh(cbb_nghanh.getSelectedItem().toString());
        sv.setDiem(Float.parseFloat(txt_diem.getText()));
        list.add(sv);
        fillTable();
        JOptionPane.showMessageDialog(this, "Them thanh cong !");
        btn_nhapmoiActionPerformed(evt);
    }//GEN-LAST:event_btn_themActionPerformed

    private void kiemtradulieuvao() throws HeadlessException {
        StringBuffer sb = new StringBuffer();
        if (txt_ten.getText().equals("")) {
            sb.append("Ten khong duoc trong !\n");
        }
        if (txt_diem.getText().equals("")) {
            sb.append("Diem khong trong!\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return;
    }

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        kiemtradulieuvao();
        for (sinhvien item : list) {
            if (item.getHoten().equals(txt_ten.getText())) {
                int choice = JOptionPane.showConfirmDialog(this, "Ban  co muon xoa khoi danh sach  khong ?", "Thong Bao", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    list.remove(item);
                    JOptionPane.showMessageDialog(this, "Xoa Thanh  Cong!");
                    fillTable();
                    btn_nhapmoiActionPerformed(evt);
                }
            }
            
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void Btn_capnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_capnhapActionPerformed
        kiemtradulieuvao();
        for (sinhvien item : list) {
            if (item.getHoten().equals(txt_ten.getText())) {
                item.setDiem(Float.parseFloat(txt_diem.getText()));
                item.getNghanh(cbb_nghanh.getSelectedItem());
                break;

            }
        }
        fillTable();
        JOptionPane.showMessageDialog(this, "Cap nhap thanh cong!");

    }//GEN-LAST:event_Btn_capnhapActionPerformed

    private void btn_nhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nhapmoiActionPerformed
        txt_ten.setText("");
        txt_diem.setText("");
        txt_hocluc.setText("");
        cbb_nghanh.setSelectedItem("CNTT");


    }//GEN-LAST:event_btn_nhapmoiActionPerformed

    private void tbl_qlSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_qlSinhVienMouseClicked
        int selectedRow = tbl_qlSinhVien.getSelectedRow();
        if (selectedRow >= 0) {
            String ten = (String) tbl_qlSinhVien.getValueAt(selectedRow, 0);
            for (sinhvien item : list) {
                if (ten.equals(item.getHoten())) {
                    txt_ten.setText(ten);
                    txt_diem.setText("" + item.getDiem());
                    txt_hocluc.setText(item.getHocluc());
                    cbb_nghanh.setSelectedItem(item.getNghanh());
                    return;

                }
            }
    }//GEN-LAST:event_tbl_qlSinhVienMouseClicked
    }
    private void btn_sapxeptheotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sapxeptheotenActionPerformed

        Collections.sort(list, (a, b) -> a.getHoten().compareTo(b.getHoten()));
        fillTable();
    }//GEN-LAST:event_btn_sapxeptheotenActionPerformed

    private void btn_sapxeptheodiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sapxeptheodiemActionPerformed
        Collections.sort(list, (a, b) -> (int) (a.getDiem() - b.getDiem()));
        fillTable();
    }//GEN-LAST:event_btn_sapxeptheodiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_sinhvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_capnhap;
    private javax.swing.JButton btn_nhapmoi;
    private javax.swing.JButton btn_sapxeptheodiem;
    private javax.swing.JButton btn_sapxeptheoten;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_nghanh;
    private javax.swing.JCheckBox check_thuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_qlSinhVien;
    private javax.swing.JTextField txt_diem;
    private javax.swing.JTextField txt_hocluc;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
