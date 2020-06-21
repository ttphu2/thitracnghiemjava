/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SingletonBusUtil;
import Constant.Constant;
import DAO.SingletonDaoUtil;
import DTO.CauHoiDTO;
import DTO.ChuongMonHocDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import DTO.VaiTroDTO;
import Table.SinhVienTable;
import Util.SessionUser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author hocgioinhatlop
 */
public class FormCauHoi extends javax.swing.JDialog {

List<MonHocDTO> listSubjectName= new ArrayList<MonHocDTO>();
List <ChuongMonHocDTO> listCMH= new ArrayList<ChuongMonHocDTO>();
private String tenFileAnh=null;
private String tenFileNghe=null;
    public FormCauHoi(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //txtNoiDung.setBorder(null);
        setCbMonHoc();
         btnChonHinhAnh.setVisible(false);
         btnChonFileNghe.setVisible(false);
      
         
        
        
    }
    public void setCbMonHoc(){
        listSubjectName=SingletonBusUtil.getMonHocBUSInstance().findAll();
       
        for(int i=0; i< listSubjectName.size(); i++){
            cbMonHoc.addItem(listSubjectName.get(i).getTenMonHoc());
            
        }
        
    }
    public void setCbChuongMH(int id){
        cbChuongMonHoc.removeAllItems();
        Object value=id;
        listCMH=SingletonBusUtil.getChuongMonHocBUSInstance().findByMonHoc(value);
       
        for(int i=0; i< listCMH.size(); i++){
            cbChuongMonHoc.addItem(listCMH.get(i).getTenChuong());
            
        }
        
    }
public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel9 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        saveButton = new keeptoo.KButton();
        jLabel6 = new javax.swing.JLabel();
        cbMonHoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbChuongMonHoc = new javax.swing.JComboBox<>();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        tfDapAn2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        tfDapAn3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        tfDapAn4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        tfDapAn1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfCauHoi = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        cbDoKho = new javax.swing.JComboBox<>();
        cbDapAnDung = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnChonFileNghe = new keeptoo.KButton();
        btnChonHinhAnh = new keeptoo.KButton();
        jcbNghe = new javax.swing.JCheckBox();
        jcbHinhAnh = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkFillBackground(false);
        kGradientPanel9.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 68, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(90, 68, 193));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Điền thông tin câu hỏi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 40));

        jButton1.setBackground(new java.awt.Color(213, 83, 83));
        jButton1.setToolTipText("Close");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 40));

        kGradientPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Chú thích : Độ khó 1 - Dễ ; Độ khó 2 - Trung bình ; Độ khó 3 - Khó ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 440, -1));

        saveButton.setText("Thêm mới");
        saveButton.setkAllowTab(false);
        saveButton.setkEndColor(new java.awt.Color(118, 195, 118));
        saveButton.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        saveButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        saveButton.setkHoverStartColor(new java.awt.Color(80, 142, 80));
        saveButton.setkPressedColor(new java.awt.Color(28, 72, 28));
        saveButton.setkStartColor(new java.awt.Color(87, 167, 87));
        saveButton.setOpaque(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 400, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Môn học");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        cbMonHoc.setBackground(new java.awt.Color(250, 250, 250));
        cbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonHocActionPerformed(evt);
            }
        });
        jPanel4.add(cbMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Chương môn học");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 20));

        cbChuongMonHoc.setBackground(new java.awt.Color(250, 250, 250));
        cbChuongMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbChuongMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChuongMonHocActionPerformed(evt);
            }
        });
        jPanel4.add(cbChuongMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 100, -1));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn2.setBorder(null);
        tfDapAn2.setOpaque(false);
        kGradientPanel1.add(tfDapAn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 20));

        jPanel4.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 290, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(170, 170, 170));
        jLabel3.setText("Đáp án 2:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(170, 170, 170));
        jLabel5.setText("Đáp án 3:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn3.setBorder(null);
        tfDapAn3.setOpaque(false);
        kGradientPanel3.add(tfDapAn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 20));

        jPanel4.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 290, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(170, 170, 170));
        jLabel8.setText("Đáp án đúng:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel4.setkFillBackground(false);
        kGradientPanel4.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn4.setBorder(null);
        tfDapAn4.setOpaque(false);
        kGradientPanel4.add(tfDapAn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 20));

        jPanel4.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 290, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(170, 170, 170));
        jLabel9.setText("Nội dung câu hỏi:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDapAn1.setBorder(null);
        tfDapAn1.setOpaque(false);
        kGradientPanel6.add(tfDapAn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 20));

        jPanel4.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 290, 20));

        tfCauHoi.setColumns(20);
        tfCauHoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCauHoi.setLineWrap(true);
        tfCauHoi.setRows(2);
        jScrollPane2.setViewportView(tfCauHoi);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 360, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Độ khó");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        cbDoKho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cbDoKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDoKhoActionPerformed(evt);
            }
        });
        jPanel4.add(cbDoKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, 20));

        cbDapAnDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cbDapAnDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDapAnDungActionPerformed(evt);
            }
        });
        jPanel4.add(cbDapAnDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(170, 170, 170));
        jLabel13.setText("Đáp án 4:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(170, 170, 170));
        jLabel14.setText("Đáp án 1:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        btnChonFileNghe.setText("Chọn file nghe");
        btnChonFileNghe.setFocusPainted(false);
        btnChonFileNghe.setkAllowGradient(false);
        btnChonFileNghe.setkAllowTab(false);
        btnChonFileNghe.setkBackGroundColor(new java.awt.Color(90, 82, 255));
        btnChonFileNghe.setkHoverColor(new java.awt.Color(73, 66, 203));
        btnChonFileNghe.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnChonFileNghe.setkPressedColor(new java.awt.Color(55, 51, 133));
        btnChonFileNghe.setOpaque(false);
        btnChonFileNghe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonFileNgheActionPerformed(evt);
            }
        });
        jPanel4.add(btnChonFileNghe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 110, 20));
        btnChonHinhAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnChonHinhAnh.setText("Chọn hình ảnh");
        btnChonHinhAnh.setFocusPainted(false);
        btnChonHinhAnh.setkAllowGradient(false);
        btnChonHinhAnh.setkAllowTab(false);
        btnChonHinhAnh.setkBackGroundColor(new java.awt.Color(90, 82, 255));
        btnChonHinhAnh.setkHoverColor(new java.awt.Color(73, 66, 203));
        btnChonHinhAnh.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnChonHinhAnh.setkPressedColor(new java.awt.Color(55, 51, 133));
        btnChonHinhAnh.setOpaque(false);
        btnChonHinhAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonHinhAnhActionPerformed(evt);
            }
        });
        jPanel4.add(btnChonHinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 20));
        btnChonHinhAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jcbNghe.setBackground(new java.awt.Color(255, 255, 255));
        jcbNghe.setText("Có file nghe");
        jcbNghe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNgheActionPerformed(evt);
            }
        });
        jPanel4.add(jcbNghe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jcbHinhAnh.setBackground(new java.awt.Color(255, 255, 255));
        jcbHinhAnh.setText("Có hình ảnh");
        jcbHinhAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHinhAnhActionPerformed(evt);
            }
        });
        jPanel4.add(jcbHinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        kGradientPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 550, 420));

        getContentPane().add(kGradientPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 470));

        setSize(new java.awt.Dimension(574, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbChuongMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChuongMonHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChuongMonHocActionPerformed

    private void cbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonHocActionPerformed
                Object selected = cbMonHoc.getSelectedItem();
                String subjectname = selected.toString();
        
                int id=0;
                for(MonHocDTO s : listSubjectName){
                        if (s.getTenMonHoc().equals(subjectname))
                        id = s.getMaMonHoc();
                    }
              //  subjectID  = id;  // lay duoc id cua mon hoc -> hien thi ra cac chu  de tuong ung
                setCbChuongMH(id); // sau khi them  chon mon hoc thi moi chon duoc chu de
    }//GEN-LAST:event_cbMonHocActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if(tfCauHoi.getText().equals("")||tfDapAn1.getText().equals("")
            ||tfDapAn2.getText().equals("")||tfDapAn3.getText().equals("")
            ||tfDapAn4.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra và không bỏ trống thông tin");
        return;
    }
        // set gia tri cho CauHoiDTO-->
        CauHoiDTO dto= new CauHoiDTO();
        dto.setCauHoi(tfCauHoi.getText()); 
        dto.setDapAn1(tfDapAn1.getText());
        dto.setDapAn2(tfDapAn2.getText());
        dto.setDapAn3(tfDapAn3.getText());
        dto.setDapAn4(tfDapAn4.getText());
        ChuongMonHocDTO chuongMH=new ChuongMonHocDTO();
        MonHocDTO monHoc=new MonHocDTO();
        Integer idCMH=null;
        for(ChuongMonHocDTO item:listCMH){
            if(item.getTenChuong().equals(cbChuongMonHoc.getSelectedItem().toString())){
                idCMH=item.getMaChuong();
            }
        }
        chuongMH.setMaChuong(idCMH);
        chuongMH.setMonHocDTO(monHoc);
        dto.setChuongMonHocDTO(chuongMH);
//        dto.setLoaiCauHoi(cbLoaiCauHoi.getSelectedItem().toString());
        dto.setDoKho(Integer.parseInt(cbDoKho.getSelectedItem().toString()));
        if("1".equals(cbDapAnDung.getSelectedItem().toString()))
        dto.setDapAnDung(tfDapAn1.getText());
        else if ("2".equals(cbDapAnDung.getSelectedItem().toString())){
          dto.setDapAnDung(tfDapAn2.getText());  
        }else if ("3".equals(cbDapAnDung.getSelectedItem().toString())){
            dto.setDapAnDung(tfDapAn3.getText());  
        }else if ("4".equals(cbDapAnDung.getSelectedItem().toString())){
            dto.setDapAnDung(tfDapAn4.getText());  
        }
        //kiem tra loai cau hoi neu la HINHANH or NGHE thi add file vao
        
                
            dto.setNghe(tenFileAnh);
       
             dto.setHinhAnh(tenFileNghe);
        
          // ket thuc them file  
          
          // gan cung user sau nay se lay id tu session de them tac gia
        NguoiDungDTO nguoiDung=SingletonBusUtil.getNguoiDungBUSInstance().findById(Integer.parseInt(SessionUser.getMaNguoiDung()));
        dto.setNguoiDungDTO(nguoiDung);
        // ket thuc them tac gia
        
        //ket thuc set gia tri cho cau hoi
        //save cau hoi xuong database
        Integer saveCauHoi = SingletonBusUtil.getCauHoiBUSInstance().saveCauHoi(dto);
        dispose();// add cau hoi xong xai dipose de tat' form đi

    }//GEN-LAST:event_saveButtonActionPerformed

    private void cbDoKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDoKhoActionPerformed
//        Object selected = cbLevel.getSelectedItem();    // lay level cua cau hoi
//        String levelname = selected.toString();
//        if (levelname.equals("1")) this.level = 1;
//        if (levelname.equals("2")) this.level = 2;
//        if (levelname.equals("3")) this.level = 3;
    }//GEN-LAST:event_cbDoKhoActionPerformed

    private void cbDapAnDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDapAnDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDapAnDungActionPerformed
 JFileChooser fileDialog1= new JFileChooser(); 
    private void btnChonFileNgheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonFileNgheActionPerformed
      
          checkAndCreateFolder("Fileuploads");
          int result=fileDialog.showOpenDialog(null);
       if(result == JFileChooser.APPROVE_OPTION){
            File f= fileDialog.getSelectedFile();
            String nameFile=f.getName();
           if(nameFile.endsWith(".mp3")){
           File f2= new File(Constant.FILEADDRESS+File.separator+nameFile);          
          try {
             Files.copy(f.toPath(), f2.toPath());
             tenFileNghe=nameFile;
             btnChonFileNghe.setText(nameFile);
          } catch (IOException ex) {
              Logger.getLogger(FormCauHoi.class.getName()).log(Level.SEVERE, null, ex);
          }
          }else{
               JOptionPane.showMessageDialog(null,"Chỉ chấp nhận file nghe mp3");
               return;
           } 
       }
    }//GEN-LAST:event_btnChonFileNgheActionPerformed
    JFileChooser fileDialog= new JFileChooser();   // JFileChooser fileDialog= new JFileChooser();
     
    private void btnChonHinhAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonHinhAnhActionPerformed
     
          checkAndCreateFolder("Fileuploads");
        
       // System.out.println(Constant.FILEADDRESS);
        int result=fileDialog.showOpenDialog(null);
       if(result == JFileChooser.APPROVE_OPTION){
           File f= fileDialog.getSelectedFile();
            String nameFile=f.getName();
           
           if(nameFile.endsWith(".jpg")||nameFile.endsWith(".png")){
           File f2= new File(Constant.FILEADDRESS+File.separator+nameFile);          
          try {
             Files.copy(f.toPath(), f2.toPath());
              tenFileAnh=nameFile;
             btnChonFileNghe.setText(nameFile);
          } catch (IOException ex) {
              Logger.getLogger(FormCauHoi.class.getName()).log(Level.SEVERE, null, ex);
          }
          }else{
               JOptionPane.showMessageDialog(null,"Chỉ chấp nhận file ảnh PNG và JPG");
               return;
           }
        
       }
    }//GEN-LAST:event_btnChonHinhAnhActionPerformed

    private void jcbNgheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNgheActionPerformed
        if(jcbNghe.isSelected())
        btnChonFileNghe.setVisible(true);
        else
        btnChonFileNghe.setVisible(false);
    
        
    }//GEN-LAST:event_jcbNgheActionPerformed

    private void jcbHinhAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHinhAnhActionPerformed
     if(jcbHinhAnh.isSelected())
        btnChonHinhAnh.setVisible(true);
        else
        btnChonHinhAnh.setVisible(false);
    }//GEN-LAST:event_jcbHinhAnhActionPerformed

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
            java.util.logging.Logger.getLogger(FormCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCauHoi dialog = new FormCauHoi(new javax.swing.JDialog(), true);
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
    private keeptoo.KButton btnChonFileNghe;
    private keeptoo.KButton btnChonHinhAnh;
    private javax.swing.JComboBox<String> cbChuongMonHoc;
    private javax.swing.JComboBox<String> cbDapAnDung;
    private javax.swing.JComboBox<String> cbDoKho;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcbHinhAnh;
    private javax.swing.JCheckBox jcbNghe;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel9;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextArea tfCauHoi;
    private javax.swing.JTextField tfDapAn1;
    private javax.swing.JTextField tfDapAn2;
    private javax.swing.JTextField tfDapAn3;
    private javax.swing.JTextField tfDapAn4;
    // End of variables declaration//GEN-END:variables
private void checkAndCreateFolder(String address) {
        File folderRoot = new File(address);
        if (!folderRoot.exists()) {
            folderRoot.mkdirs();
        }
       
    }

}
