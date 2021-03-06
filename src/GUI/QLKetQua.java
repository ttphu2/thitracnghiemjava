
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SingletonBusUtil;
import Constant.Constant;
import DTO.CauHoiDTO;
import DTO.ChuongMonHocDTO;
import DTO.KetQuaDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import Table.CauHoiTable;
import Table.KetQuaTable;
import Util.ExcelPoiUtil;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.hibernate.ObjectNotFoundException;

/**
 *
 * @author hocgioinhatlop
 */
public class QLKetQua extends javax.swing.JDialog {

    KetQuaTable cod = new KetQuaTable();
    ArrayList<KetQuaDTO> ketQuaDTOS = new ArrayList<KetQuaDTO>();
    List<MonHocDTO> listSubjectName= new ArrayList<MonHocDTO>();
    private int subjectID, topicID, level=1;
    public QLKetQua(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        paint_table();
        Object[] objects = SingletonBusUtil.getKetQuaBUSInstance().findByProperty(null, null, Constant.SORT_ASC, null, null, "");
        ketQuaDTOS = (ArrayList<KetQuaDTO>) objects[1];
        cod.showTable(ketQuaDTOS, table);
        setCbMonHoc();
    }
public void setCbMonHoc(){
        listSubjectName=SingletonBusUtil.getMonHocBUSInstance().findAll();
       
        for(int i=0; i< listSubjectName.size(); i++){
            cbMonHoc.addItem(listSubjectName.get(i).getTenMonHoc());
            
        }
        
    }
    public void setCbChuongMH(int id){
        cbChuongMonHoc.removeAllItems();
        cbChuongMonHoc.addItem("None");
        Object value=id;
        List <ChuongMonHocDTO> listCMH=SingletonBusUtil.getChuongMonHocBUSInstance().findByMonHoc(value);
       
        for(int i=0; i< listCMH.size(); i++){
            cbChuongMonHoc.addItem(listCMH.get(i).getTenChuong());
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbMonHoc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbChieuSapXep = new javax.swing.JComboBox<>();
        buttonXoa1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfMSSV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbChuongMonHoc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tfMaDe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfFrDiem = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfToDiem = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(602, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(93, 200, 119));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm kiếm");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 30));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm nâng cao"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Môn học");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 20));

        cbMonHoc.setBackground(new java.awt.Color(250, 250, 250));
        cbMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonHocActionPerformed(evt);
            }
        });
        jPanel2.add(cbMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, -1));

        jLabel8.setText("Sắp xếp theo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, 20));

        cbSapXep.setBackground(new java.awt.Color(250, 250, 250));
        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Mã KQ", "MSSV", "Đề thi", "Ngày Tạo", "Điểm thi" }));
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });
        jPanel2.add(cbSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel9.setText("Chiều sắp xếp");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 70, 20));

        cbChieuSapXep.setBackground(new java.awt.Color(250, 250, 250));
        cbChieuSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Tăng dần", "Giảm dần" }));
        cbChieuSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChieuSapXepActionPerformed(evt);
            }
        });
        jPanel2.add(cbChieuSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        buttonXoa1.setBackground(new java.awt.Color(93, 200, 119));
        buttonXoa1.setForeground(new java.awt.Color(255, 255, 255));
        buttonXoa1.setText("Xóa");
        buttonXoa1.setContentAreaFilled(false);
        buttonXoa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonXoa1.setOpaque(true);
        buttonXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoa1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonXoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 139, 31));

        jButton3.setText("Mặc định");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jLabel10.setText("Tìm theo MSSV");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 20));

        tfMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMSSVActionPerformed(evt);
            }
        });
        jPanel2.add(tfMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, 20));

        jLabel6.setText("Chương môn học");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 20));

        cbChuongMonHoc.setBackground(new java.awt.Color(250, 250, 250));
        cbChuongMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbChuongMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChuongMonHocActionPerformed(evt);
            }
        });
        jPanel2.add(cbChuongMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, -1));

        jLabel11.setText("Tìm theo mã đề");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 20));

        tfMaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaDeActionPerformed(evt);
            }
        });
        jPanel2.add(tfMaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 170, 20));

        jLabel13.setText("Tìm theo điểm số:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 20));

        tfFrDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFrDiemActionPerformed(evt);
            }
        });
        jPanel2.add(tfFrDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("to");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, 20));

        tfToDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfToDiemActionPerformed(evt);
            }
        });
        jPanel2.add(tfToDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 770, 140));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(100, 100, 100));
        jLabel12.setText("Danh sách kết quả");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setFillsViewportHeight(true);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableFocusGained(evt);
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 790, 250));

        jButton2.setBackground(new java.awt.Color(93, 200, 119));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Xem bai thi");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 1, 830, 570));

        setSize(new java.awt.Dimension(846, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Map<String, Object> property = new HashMap<String, Object>();        
        String whereClause = "";
        
        
        if (!"".equals(tfMSSV.getText())) {
           whereClause+="AND nguoiDung.maNguoiDung="+tfMSSV.getText()+" ";

        }
        
        if (!"".equals(tfMaDe.getText())) {
              whereClause+="AND deThi.maDeThi="+tfMaDe.getText()+" ";

        }
         if (!"".equals(tfFrDiem.getText())) {
              whereClause+="AND diemBaiThi >= "+tfFrDiem.getText()+" ";             
        }
         if (!"".equals(tfToDiem.getText())) {
              whereClause+="AND diemBaiThi <= "+tfToDiem.getText()+" ";             
        }
        String sapXepTheo = null;
        if (!"None".equals(cbSapXep.getSelectedItem().toString())) {
//            None
//maKetQua
//MSSV
//Đề thi
            int temp = cbSapXep.getSelectedIndex();
            switch (temp) {
                case 1:
                sapXepTheo = "maKetQua";
                break;
                case 2:
                sapXepTheo = "nguoiDung.maNguoiDung";
                break;
                case 3:
                sapXepTheo = "deThi.maDeThi";
                case 4:
                sapXepTheo = "ngayTao";
                case 5:
                sapXepTheo = "diemBaiThi";
                break;              
                default:
                sapXepTheo = null;
                break;
            }

        }

        if (!"None".equals(cbMonHoc.getSelectedItem().toString())) {
            
         
             whereClause=whereClause+"AND deThi.monHocEntity.tenMonHoc='"+cbMonHoc.getSelectedItem().toString()+"' ";
        
        }
        
        String chieuSapXep = "1";
        if (!"None".equals(cbChieuSapXep.getSelectedItem().toString())) {
            chieuSapXep = Integer.toString(cbChieuSapXep.getSelectedIndex());
        }
        Object[] objects = SingletonBusUtil.getKetQuaBUSInstance().findByProperty(property, sapXepTheo, chieuSapXep, null, null, whereClause);
        ketQuaDTOS = (ArrayList<KetQuaDTO>) objects[1];
       
        cod.showTable(ketQuaDTOS, table);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased

    }//GEN-LAST:event_tableMouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableFocusGained

    }//GEN-LAST:event_tableFocusGained
        JFileChooser fileDialog= new JFileChooser();
    private void cbChuongMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChuongMonHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChuongMonHocActionPerformed

    private void tfMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMSSVActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        tfMaCauHoi.setText("");
//        tfNdCauHoi.setText("");
//        cbChieuSapXep.setSelectedIndex(0);
//        cbMonHoc.setSelectedIndex(0);
//        cbSapXep.setSelectedIndex(0);
//        cbLoaiCauHoi.setSelectedIndex(0);
//        tfMaTacGia.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttonXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonXoa1ActionPerformed

    private void cbChieuSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChieuSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChieuSapXepActionPerformed

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSapXepActionPerformed

    private void cbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonHocActionPerformed
        Object selected = cbMonHoc.getSelectedItem();
        String subjectname = selected.toString();

        int id=0;
        for(MonHocDTO s : listSubjectName){
            if (s.getTenMonHoc().equals(subjectname))
            id = s.getMaMonHoc();
        }
        subjectID  = id;  // lay duoc id cua mon hoc -> hien thi ra cac chu  de tuong ung
        setCbChuongMH(id); // sau khi them  chon mon hoc thi moi chon duoc chu de
    }//GEN-LAST:event_cbMonHocActionPerformed

    private void tfMaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaDeActionPerformed

    private void tfFrDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFrDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFrDiemActionPerformed

    private void tfToDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfToDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfToDiemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   int row=table.getSelectedRow();
   Object maKQ=table.getValueAt(row, 0);
   Object maSV=table.getValueAt(row, 1);
       new XemBaiThi(this,true,(Integer) maSV,(Integer) maKQ).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKetQua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLKetQua dialog = new QLKetQua(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonXoa1;
    private javax.swing.JComboBox<String> cbChieuSapXep;
    private javax.swing.JComboBox<String> cbChuongMonHoc;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfFrDiem;
    private javax.swing.JTextField tfMSSV;
    private javax.swing.JTextField tfMaDe;
    private javax.swing.JTextField tfToDiem;
    // End of variables declaration//GEN-END:variables
private void paint_table() {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(60, 127, 177));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(30);
        table.setShowGrid(true); // de the hien duong vien mac dich
        //table.setShowHorizontalLines(true);// de the hien duong vien ngang
        //table.setShowVerticalLines(true);// de the hien duong vien doc

    }
}
