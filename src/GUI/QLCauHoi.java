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
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import Table.CauHoiTable;
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
public class QLCauHoi extends javax.swing.JDialog {

    CauHoiTable cod = new CauHoiTable();
    ArrayList<CauHoiDTO> cauHoiDTOS = new ArrayList<CauHoiDTO>();
    List<MonHocDTO> listSubjectName= new ArrayList<MonHocDTO>();
    private int subjectID, topicID, level=1;
    public QLCauHoi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        paint_table();
        Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, null, Constant.SORT_ASC, null, null, "");
        cauHoiDTOS = (ArrayList<CauHoiDTO>) objects[1];
        cod.showTable(cauHoiDTOS, table);
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
        btnTinhSoCauHoi = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfMaTacGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNdCauHoi = new javax.swing.JTextField();
        cbMonHoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbChieuSapXep = new javax.swing.JComboBox<>();
        buttonXoa1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfMaCauHoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbChuongMonHoc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbLoaiCauHoi = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonXoa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(602, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTinhSoCauHoi.setBackground(new java.awt.Color(93, 200, 119));
        btnTinhSoCauHoi.setForeground(new java.awt.Color(255, 255, 255));
        btnTinhSoCauHoi.setText("Số lượng câu hỏi");
        btnTinhSoCauHoi.setContentAreaFilled(false);
        btnTinhSoCauHoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTinhSoCauHoi.setOpaque(true);
        btnTinhSoCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhSoCauHoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTinhSoCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 139, 31));

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
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        tfMaTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaTacGiaActionPerformed(evt);
            }
        });
        jPanel2.add(tfMaTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 170, 20));

        jLabel5.setText("Tìm theo nội dung");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 20));
        jPanel2.add(tfNdCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 170, 20));

        cbMonHoc.setBackground(new java.awt.Color(250, 250, 250));
        cbMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonHocActionPerformed(evt);
            }
        });
        jPanel2.add(cbMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, -1));

        jLabel7.setText("Tìm theo mã tác giả");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, 20));

        jLabel8.setText("Sắp xếp theo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 20));

        cbSapXep.setBackground(new java.awt.Color(250, 250, 250));
        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Mã câu hỏi", "Độ khó", "Loại câu hỏi" }));
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });
        jPanel2.add(cbSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel9.setText("Chiều sắp xếp");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 70, 20));

        cbChieuSapXep.setBackground(new java.awt.Color(250, 250, 250));
        cbChieuSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Tăng dần", "Giảm dần" }));
        cbChieuSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChieuSapXepActionPerformed(evt);
            }
        });
        jPanel2.add(cbChieuSapXep, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

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

        jLabel10.setText("Tìm theo mã câu hỏi");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 20));

        tfMaCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaCauHoiActionPerformed(evt);
            }
        });
        jPanel2.add(tfMaCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, 20));

        jLabel6.setText("Chương môn học");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 20));

        cbChuongMonHoc.setBackground(new java.awt.Color(250, 250, 250));
        cbChuongMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbChuongMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChuongMonHocActionPerformed(evt);
            }
        });
        jPanel2.add(cbChuongMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, -1));

        jLabel11.setText("Loại câu hỏi");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, 20));

        cbLoaiCauHoi.setBackground(new java.awt.Color(250, 250, 250));
        cbLoaiCauHoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "TRACNGHIEM", "NGHE", "HINHANH" }));
        cbLoaiCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiCauHoiActionPerformed(evt);
            }
        });
        jPanel2.add(cbLoaiCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 770, 140));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(100, 100, 100));
        jLabel12.setText("Danh sách câu hỏi");
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

        buttonXoa.setBackground(new java.awt.Color(93, 200, 119));
        buttonXoa.setForeground(new java.awt.Color(255, 255, 255));
        buttonXoa.setText("Xóa");
        buttonXoa.setContentAreaFilled(false);
        buttonXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonXoa.setOpaque(true);
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 139, 31));

        jButton2.setBackground(new java.awt.Color(93, 200, 119));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thêm câu hỏi");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 140, 30));

        jButton4.setText("Import");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 1, 830, 570));

        setSize(new java.awt.Dimension(846, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhSoCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhSoCauHoiActionPerformed
      int de=0,kho=0,tb=0;
        for(CauHoiDTO item:cauHoiDTOS){
           if(item.getDoKho()==1){
               de++;
           }else if(item.getDoKho()==2){
               tb++;
           }else{
               kho++;
           }
        }
        JOptionPane.showMessageDialog(null,"Số lượng câu hỏi dễ là: "+de+"\n Số lượng câu hỏi trung bình là:"+tb+"\n Số lượng câu hỏi khó là:"+kho);

    }//GEN-LAST:event_btnTinhSoCauHoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Map<String, Object> property = new HashMap<String, Object>();        
        String whereClause = "";
        
        if (!"".equals(tfMaCauHoi.getText())) {
            try {
                CauHoiDTO temp = SingletonBusUtil.getCauHoiBUSInstance().findById(Integer.parseInt(tfMaCauHoi.getText()));
                cauHoiDTOS = new ArrayList<CauHoiDTO>();
                if (temp != null) {
                    cauHoiDTOS.add(temp);
                }
                cod.showTable(cauHoiDTOS, table);
            } catch (ObjectNotFoundException e) {
                cauHoiDTOS = new ArrayList<CauHoiDTO>();
                cod.showTable(cauHoiDTOS, table);
            }

            return;
        }
        if (!"".equals(tfMaTacGia.getText())) {
           whereClause="AND nguoiDungEntity.maNguoiDung="+tfMaTacGia.getText()+" ";

        }
        
        if (!"".equals(tfNdCauHoi.getText())) {
            property.put("cauHoi", tfNdCauHoi.getText());

        }
        String sapXepTheo = null;
        if (!"None".equals(cbSapXep.getSelectedItem().toString())) {
//            None
//Mã câu hỏi
//Độ khó
//Loại câu hỏi
            int temp = cbSapXep.getSelectedIndex();
            switch (temp) {
                case 1:
                sapXepTheo = "maCauHoi";
                break;
                case 2:
                sapXepTheo = "doKho";
                break;
                case 3:
                sapXepTheo = "loaiCauHoi";
                break;              
                default:
                sapXepTheo = null;
                break;
            }

        }

        if (!"None".equals(cbMonHoc.getSelectedItem().toString())) {
            
         if(!"None".equals(cbChuongMonHoc.getSelectedItem().toString()))
         {
            whereClause=whereClause+"AND chuongMonHocEntity.tenChuong='"+cbChuongMonHoc.getSelectedItem().toString()+"' "; 
         }else{
             whereClause=whereClause+"AND chuongMonHocEntity.monHocEntity.tenMonHoc='"+cbMonHoc.getSelectedItem().toString()+"' ";
         }
        }
        if(!"None".equals(cbLoaiCauHoi.getSelectedItem().toString())){
            property.put("loaiCauHoi", cbLoaiCauHoi.getSelectedItem().toString());
        }
        String chieuSapXep = "1";
        if (!"None".equals(cbChieuSapXep.getSelectedItem().toString())) {
            chieuSapXep = Integer.toString(cbChieuSapXep.getSelectedIndex());
        }
        Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(property, sapXepTheo, chieuSapXep, null, null, whereClause);
        cauHoiDTOS = (ArrayList<CauHoiDTO>) objects[1];
       
        cod.showTable(cauHoiDTOS, table);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfMaTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaTacGiaActionPerformed

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

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSapXepActionPerformed

    private void cbChieuSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChieuSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChieuSapXepActionPerformed

    private void buttonXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonXoa1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tfMaCauHoi.setText("");
        tfNdCauHoi.setText("");
        cbChieuSapXep.setSelectedIndex(0);
        cbMonHoc.setSelectedIndex(0);
        cbSapXep.setSelectedIndex(0);
        cbLoaiCauHoi.setSelectedIndex(0);
        tfMaTacGia.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfMaCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaCauHoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaCauHoiActionPerformed

    private void cbChuongMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChuongMonHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChuongMonHocActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased

    }//GEN-LAST:event_tableMouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableFocusGained

    }//GEN-LAST:event_tableFocusGained

    private void cbLoaiCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiCauHoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiCauHoiActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
        Object[] options = {"Xóa  ", "Thôi không xóa "};
        int n = JOptionPane.showOptionDialog(rootPane,
                "Chắc chắn muốn xóa ? ",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (n == JOptionPane.YES_OPTION) {
            int[] cacLuaChon = table.getSelectedRows();
            List<Integer> ids = new ArrayList<Integer>();
            for (int i = 0; i < cacLuaChon.length; i++) {
                ids.add(cauHoiDTOS.get(cacLuaChon[i]).getMaCauHoi());

            }
            Integer checkDelete = SingletonBusUtil.getCauHoiBUSInstance().deleteCauHois(ids);
            if (checkDelete == ids.size()) {
                Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, null, Constant.SORT_ASC, null, null, "");
                cauHoiDTOS = (ArrayList<CauHoiDTO>) objects[1];
                cod.showTable(cauHoiDTOS, table);
                JOptionPane.showMessageDialog(rootPane, "Xoá thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xoá thất bại");
            }

            //
        } else if (n == JOptionPane.NO_OPTION) {
            return;
        } else {
        }


        
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new FormCauHoi(this,true).setVisible(true);
       Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, null, Constant.SORT_ASC, null, null, "");
       cauHoiDTOS = (ArrayList<CauHoiDTO>) objects[1];
       cod.showTable(cauHoiDTOS, table);
    }//GEN-LAST:event_jButton2ActionPerformed
        JFileChooser fileDialog= new JFileChooser();
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        int result = fileDialog.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File f = fileDialog.getSelectedFile();
            String fileLocation = f.getAbsolutePath();
            String fileName = f.getName();

            List<CauHoiDTO> excelValues= new ArrayList<CauHoiDTO>();
            Workbook workbook;
            try {
                workbook = ExcelPoiUtil.getWorkBook(fileName, fileLocation);
                Sheet sheet = workbook.getSheetAt(0);
                
                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                 //   CauHoiDTO cauHoiDTO = readDataFromExcel(row);
                    CauHoiDTO cauHoiDTO = new CauHoiDTO();
                    cauHoiDTO.setHinhAnh(ExcelPoiUtil.getCellValue(row.getCell(0)));
                    cauHoiDTO.setNghe(ExcelPoiUtil.getCellValue(row.getCell(1)));
                    cauHoiDTO.setCauHoi(ExcelPoiUtil.getCellValue(row.getCell(2)));
                    cauHoiDTO.setDoanVan(ExcelPoiUtil.getCellValue(row.getCell(3)));
                    cauHoiDTO.setDapAn1(ExcelPoiUtil.getCellValue(row.getCell(4)));
                    cauHoiDTO.setDapAn2(ExcelPoiUtil.getCellValue(row.getCell(5)));
                    cauHoiDTO.setDapAn3(ExcelPoiUtil.getCellValue(row.getCell(6)));
                    cauHoiDTO.setDapAn4(ExcelPoiUtil.getCellValue(row.getCell(7)));
                    cauHoiDTO.setDapAnDung(ExcelPoiUtil.getCellValue(row.getCell(8)));
                    cauHoiDTO.setDoKho(Integer.parseInt(ExcelPoiUtil.getCellValue(row.getCell(9))));
                    cauHoiDTO.setLoaiCauHoi(ExcelPoiUtil.getCellValue(row.getCell(10)));
                    MonHocDTO monHoc=new MonHocDTO();               
                    ChuongMonHocDTO temp=new ChuongMonHocDTO();
                    temp.setMonHocDTO(monHoc);
                    temp.setMaChuong(Integer.parseInt(ExcelPoiUtil.getCellValue(row.getCell(12))));
                    cauHoiDTO.setChuongMonHocDTO(temp);     
                    int idtacgia=Integer.parseInt(ExcelPoiUtil.getCellValue(row.getCell(11)));
                    NguoiDungDTO nguoiDung=SingletonBusUtil.getNguoiDungBUSInstance().findById(idtacgia);
                    cauHoiDTO.setNguoiDungDTO(nguoiDung);
                    excelValues.add(cauHoiDTO);
                }
            } catch (IOException ex) {
                Logger.getLogger(QLCauHoi.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(excelValues.size()>0)
            SingletonBusUtil.getCauHoiBUSInstance().saveCauHoiImport(excelValues);
            System.out.println(fileName);
            System.out.println(fileLocation);
            System.out.println(excelValues.get(0).getCauHoi());
          
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QLCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLCauHoi dialog = new QLCauHoi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnTinhSoCauHoi;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JButton buttonXoa1;
    private javax.swing.JComboBox<String> cbChieuSapXep;
    private javax.swing.JComboBox<String> cbChuongMonHoc;
    private javax.swing.JComboBox<String> cbLoaiCauHoi;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfMaCauHoi;
    private javax.swing.JTextField tfMaTacGia;
    private javax.swing.JTextField tfNdCauHoi;
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
