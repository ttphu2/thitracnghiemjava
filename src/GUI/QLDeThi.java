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
import DTO.DeThiDTO;
import DTO.KyThiDTO;
import DTO.MonHocDTO;
import DTO.NguoiDungDTO;
import Report.JasperRp;
import Report.UtilConnect;
import java.sql.Connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DuongSon
 */
public class QLDeThi extends javax.swing.JDialog {

    private List<MonHocDTO> listSubjectName;
    private List<KyThiDTO> listKyThiName;
    private int subjectID, topicID;
    DefaultTableModel model;
    private List<DeThiDTO> listTest;

    /**
     * Creates new form TestManagerment
     */
    public QLDeThi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBounds(50, 50, 800, 500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setCbMonHoc();
        setCbKyThi();
        showTable();
    }

    public void showTable() {
        listTest = SingletonBusUtil.getDeThiBUSInstance().findAll();
        model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã đề", "Số câu hỏi", "Môn học", "Điểm tối đa","Thời gian"
        });

        for (DeThiDTO t : listTest) {
            model.addRow(new Object[]{
                t.getMaDeThi(), t.getSlCauHoi(), t.getMonHocDTO().getTenMonHoc(),
                t.getDiemToiDa(),t.getThoiGian()
            });
        }

    }

    public void setCbMonHoc() {
        listSubjectName = SingletonBusUtil.getMonHocBUSInstance().findAll();

        for (int i = 0; i < listSubjectName.size(); i++) {
            cbMonHoc.addItem(listSubjectName.get(i).getTenMonHoc());

        }
    }
    public void setCbKyThi() {
        listKyThiName = SingletonBusUtil.getKyThiBUSImplInstance().findAll();

        for (int i = 0; i < listKyThiName.size(); i++) {
            cbKyThi.addItem(listKyThiName.get(i).getTenKyThi());

        }
    }

    public Integer getIdMonHoc() {
        Integer idMonHoc = null;
        for (int i = 0; i < listSubjectName.size(); i++) {
            if (listSubjectName.get(i).getTenMonHoc() == cbMonHoc.getSelectedItem().toString()) {
                idMonHoc = listSubjectName.get(i).getMaMonHoc();
                break;
            }

        }
        return idMonHoc;
    }
    public Integer getIdKyThi() {
        Integer idKyThi = null;
        for (int i = 0; i < listKyThiName.size(); i++) {
            if (listKyThiName.get(i).getTenKyThi()== cbKyThi.getSelectedItem().toString()) {
                idKyThi = listKyThiName.get(i).getMaKyThi();
                break;
            }

        }
        return idKyThi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNumQuestion = new javax.swing.JTextField();
        tfTestTime = new javax.swing.JTextField();
        tfLevel1 = new javax.swing.JTextField();
        tfLevel2 = new javax.swing.JTextField();
        tfLevel3 = new javax.swing.JTextField();
        cbMonHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addTestButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfMaxPoint = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTenDeThi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbKyThi = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Số câu hỏi :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 46, 118, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Môn học :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 84, 118, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Thời gian (phút ) :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 115, 118, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Số câu dễ :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 153, 118, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Số câu trung bình :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 191, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Số câu khó :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 231, 118, -1));

        tfNumQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(tfNumQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 45, 111, -1));
        getContentPane().add(tfTestTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 114, 111, -1));
        getContentPane().add(tfLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 152, 111, -1));
        getContentPane().add(tfLevel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 190, 111, -1));
        getContentPane().add(tfLevel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 228, 111, -1));

        cbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonHocActionPerformed(evt);
            }
        });
        getContentPane().add(cbMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 83, 111, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đề ", "Số câu hỏi", "Môn học ", "Chủ đề"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 43, -1, 340));

        addTestButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addTestButton.setText("Thêm ");
        addTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addTestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 333, 84, -1));

        delButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delButton.setText("Xóa");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        getContentPane().add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 333, 111, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tổng điểm");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 266, 121, 27));
        getContentPane().add(tfMaxPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 266, 111, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên đề thi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 15, -1, -1));
        getContentPane().add(tfTenDeThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 12, 111, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Kỳ thi:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 303, 129, -1));

        cbKyThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKyThiActionPerformed(evt);
            }
        });
        getContentPane().add(cbKyThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 302, 111, -1));

        jButton1.setText("Xuất đề thi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        setSize(new java.awt.Dimension(840, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestButtonActionPerformed
        // TODO add your handling code here:
        DeThiDTO t = new DeThiDTO();

        //  t.setTopicID(topicID);
        t.setTenDeThi(tfTenDeThi.getText());
        t.setSlCauHoi(Integer.parseInt(tfNumQuestion.getText()));
        t.setDiemToiDa(Integer.parseInt(tfMaxPoint.getText()));
        t.setThoiGian(Integer.parseInt(tfTestTime.getText()));
        t.setSlCauHoiDe(Integer.parseInt(tfLevel1.getText()));
        t.setSlCauHoiTb(Integer.parseInt(tfLevel2.getText()));
        t.setSlCauHoiKho(Integer.parseInt(tfLevel3.getText()));
        List<CauHoiDTO> cauHoiDTOS = SingletonBusUtil.getCauHoiBUSInstance().findEqualUnique("chuongMonHocEntity.monHocEntity.tenMonHoc", cbMonHoc.getSelectedItem().toString());
        int de = 0, kho = 0, tb = 0;
        for (CauHoiDTO item : cauHoiDTOS) {
            if (item.getDoKho() == 1) {
                de++;
            } else if (item.getDoKho() == 2) {
                tb++;
            } else {
                kho++;
            }
        }
        System.out.println(de);
        System.out.println(tb);
        System.out.println(kho);

        if (((t.getSlCauHoiDe() + t.getSlCauHoiTb() + t.getSlCauHoiKho()) != t.getSlCauHoi()) || (t.getSlCauHoi() == 0)) {
            JOptionPane.showMessageDialog(null, "Mời nhập lại số câu hỏi !");
        } else if ((Integer.parseInt(tfLevel1.getText())) > de
                || (Integer.parseInt(tfLevel2.getText())) > tb
                || (Integer.parseInt(tfLevel3.getText())) > kho) {
            JOptionPane.showMessageDialog(rootPane, "Ngân hàng đề không đủ số câu hỏi");
        } else {
          
                NguoiDungDTO tacgia= SingletonBusUtil.getNguoiDungBUSInstance().findById(1);
                KyThiDTO kythi=SingletonBusUtil.getKyThiBUSImplInstance().findById(getIdKyThi());
               Integer idMonHoc=getIdMonHoc();
                MonHocDTO temp4= new MonHocDTO();
               temp4.setMaMonHoc(idMonHoc);              
                t.setKyThiDTO(kythi);
                t.setMonHocDTO(temp4);
                t.setNguoiDungDTO(tacgia);
              Integer maBaiThi= SingletonBusUtil.getDeThiBUSInstance().saveDeThi(t);

            List<ChuongMonHocDTO> cmhDTOS = SingletonBusUtil.getChuongMonHocBUSInstance().findByMonHoc(idMonHoc);
            //   trr 3 vui ve 2 toan he` 4 30 cau thi chuong 1 co :1/3 2/9 4/9
            //  10 6,6 cau 13,33 cau =de
            // tinh toan giai thuat dua vao so tiet
            //tinh tong so tiet
            Integer tongSoTiet = 0;
            for (int i = 0; i < cmhDTOS.size(); i++) {
                tongSoTiet = tongSoTiet + cmhDTOS.get(i).getSoTiet();
            }
            //     3 4 3
            //tinh ti le chon cau hoi
            Integer tiLe;
            for (int i = 0; i < cmhDTOS.size(); i++) {
                cmhDTOS.get(i).setTiLeChon((cmhDTOS.get(i).getSoTiet() * 1.0) / tongSoTiet);

            }
            // tinh so cau hoi o moi level va chuong
            int tong1 = 0, tong2 = 0, tong3 = 0;
            for (int i = 0; i < cmhDTOS.size(); i++) {
                cmhDTOS.get(i).setSoCauDe((int) Math.floor(t.getSlCauHoiDe() * cmhDTOS.get(i).getTiLeChon()));
                cmhDTOS.get(i).setSoCauTB((int) Math.floor(t.getSlCauHoiTb() * cmhDTOS.get(i).getTiLeChon()));
                cmhDTOS.get(i).setSoCauKho((int) Math.floor(t.getSlCauHoiKho() * cmhDTOS.get(i).getTiLeChon()));
                tong1 = tong1 + cmhDTOS.get(i).getSoCauDe();
                tong2 = tong2 + cmhDTOS.get(i).getSoCauTB();
                tong3 = tong3 + cmhDTOS.get(i).getSoCauKho();
            }

            //get cau hoi tu database len
            Set<CauHoiDTO> setCauHoi = new HashSet<CauHoiDTO>();
            for (int i = 0; i < cmhDTOS.size(); i++) {
                String whereClause = " AND chuongMonHocEntity.maChuong=" + cmhDTOS.get(i).getMaChuong() + " AND doKho=1 ";
                Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, "RAND()", Constant.SORT_ASC, null, cmhDTOS.get(i).getSoCauDe(), whereClause);
                List<CauHoiDTO> doKho1 = (List<CauHoiDTO>) objects[1];

                String whereClause2 = " AND chuongMonHocEntity.maChuong=" + cmhDTOS.get(i).getMaChuong() + " AND doKho=2 ";
                Object[] objects1 = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, "RAND()", Constant.SORT_ASC, null, cmhDTOS.get(i).getSoCauTB(), whereClause2);
                List<CauHoiDTO> doKho2 = (List<CauHoiDTO>) objects1[1];

                String whereClause3 = " AND chuongMonHocEntity.maChuong=" + cmhDTOS.get(i).getMaChuong() + " AND doKho=3 ";
                Object[] objects2 = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, "RAND()", Constant.SORT_ASC, null, cmhDTOS.get(i).getSoCauKho(), whereClause3);
                List<CauHoiDTO> doKho3 = (List<CauHoiDTO>) objects2[1];

                setCauHoi.addAll(doKho1);
                setCauHoi.addAll(doKho2);
                setCauHoi.addAll(doKho3);
            }
            // tiep tuc lay nhung cau hoi con` thieu do lam` xuong xuong'
            //check xem cau hoi co ton` tai trong de` roi hay chua
                // check xong add cau hoi vao de`
            if (t.getSlCauHoiDe() > tong1) {
                 
                List<CauHoiDTO> temp = new ArrayList<CauHoiDTO>();
                while(t.getSlCauHoiDe()>tong1){         //6-4
                String test = " AND chuongMonHocEntity.monHocEntity.maMonHoc=" + idMonHoc + " AND doKho=1 ";
                Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, "RAND()", Constant.SORT_ASC, null, t.getSlCauHoiDe() - tong1, test);
                temp = (List<CauHoiDTO>) objects[1];
                for (int i = 0; i < temp.size(); i++) {
                        boolean check=true;
                    for(CauHoiDTO item:setCauHoi){
                    if(item.getMaCauHoi()== temp.get(i).getMaCauHoi()){
                            check=false;              
                    }                                      
                    }
                    if(check==true && tong1<t.getSlCauHoiDe()){
                     setCauHoi.add(temp.get(i));  
                     tong1++;
                    }
                }
                }

            }
            if (t.getSlCauHoiTb() > tong2) {
                
                List<CauHoiDTO> temp = new ArrayList<CauHoiDTO>();
                while(t.getSlCauHoiTb()>tong2){         //6-4
                String whereClause = " AND chuongMonHocEntity.monHocEntity.maMonHoc=" + idMonHoc + " AND doKho=2 ";
                Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, "rand()", Constant.SORT_ASC, null, t.getSlCauHoiTb() - tong2, whereClause);
                temp = (List<CauHoiDTO>) objects[1];
                
                    for (int i = 0; i < temp.size(); i++) {
                        boolean check=true;
                    for(CauHoiDTO item:setCauHoi){
                    if(item.getMaCauHoi()== temp.get(i).getMaCauHoi()){
                            check=false;              
                    }                                        
                    }
                    if(check==true && tong2<t.getSlCauHoiTb()){
                     setCauHoi.add(temp.get(i));  
                     tong2++;
                    }
                }
                }
                
            }
            if (t.getSlCauHoiKho() > tong3) {
                 
                List<CauHoiDTO> temp = new ArrayList<CauHoiDTO>();
                while(t.getSlCauHoiKho()>tong3){         //6-4
                String whereClause = " AND chuongMonHocEntity.monHocEntity.maMonHoc=" + idMonHoc + " AND doKho=3 ";
                Object[] objects = SingletonBusUtil.getCauHoiBUSInstance().findByProperty(null, "rand()", Constant.SORT_ASC, null, t.getSlCauHoiKho() - tong3, whereClause);
                temp = (List<CauHoiDTO>) objects[1];
                
                
                 for (int i = 0; i < temp.size(); i++) {
                    boolean check=true;
                    for(CauHoiDTO item:setCauHoi){
                    if(item.getMaCauHoi()== temp.get(i).getMaCauHoi()){
                            check=false;              
                    }                                      
                    }
                    if(check==true && tong3<t.getSlCauHoiKho()){
                     setCauHoi.add(temp.get(i));  
                     tong3++;
                    }
                }
                }
            }
            // ket thuc giai thuat ta co dc 1 set cac cau hoi khac nhau dap ung 
            // yeu cau theo so tiet va so luong cau hoi kho de tb
           for(CauHoiDTO test:setCauHoi){
               System.out.println(test.getMaCauHoi());
           }
           //add set cau hoi vao de thi roi update noi dung cho de thi
           //maBaiThi
         //  t.setListCauHoi(setCauHoi);
           SingletonBusUtil.getDeThiBUSInstance().saveNoiDungDeThi(setCauHoi,maBaiThi);
        }


    }//GEN-LAST:event_addTestButtonActionPerformed

//     public void addTable(){
//        Test t = listTest.get(listTest.size()-1);
//        model.addRow(new Object[]{
//             t.getTestID(),t.getAmountQuestion() ,new GetDB().findNameSubFrTop(t.getTopicID()),
//                new GetDB().findNameTopFrId(t.getTopicID())
//        });
//    }
    private void cbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonHocActionPerformed

//       String st = cbMonHoc.getSelectedItem().toString();
//       int id=0;
//       for(Subject s : listSj){
//            if (s.getSubjectName().equals(st))
//            id = s.getSubjectID();
//        }
//        subjectID  =id;        
//        setCbTopic(id); 

    }//GEN-LAST:event_cbMonHocActionPerformed

    private void tfNumQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumQuestionActionPerformed
    int index; //chỉ số hàng được chọn trong bảng
    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
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
                       //                            
                        TableModel mdl = jTable1.getModel();
                        String ID = model.getValueAt(index, 0).toString();
                       SingletonBusUtil.getDeThiBUSInstance().deleteDeThi(Integer.parseInt(ID));
                        model = (DefaultTableModel) jTable1.getModel();
                        model.removeRow(index);
                        JOptionPane.showMessageDialog(rootPane,"Xoá thành công");
                       //
                    } else if (n == JOptionPane.NO_OPTION) {                        
                       return;
                    } else {                       
                    }                           
    }//GEN-LAST:event_delButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index = jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void cbKyThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKyThiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKyThiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TableModel mdl = jTable1.getModel();
        String ID = model.getValueAt(index, 0).toString();
        String tenMonThi = model.getValueAt(index, 2).toString();
        String thoiGian = model.getValueAt(index, 4).toString();
        System.out.print(ID);
        Connection conn;
        conn = UtilConnect.getConnection();
        try {
           HashMap a = new HashMap();
           a.put("test",ID );
           a.put("thoigian",thoiGian );
           a.put("tenmonthi",tenMonThi );
            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\hocgioinhatlop\\OneDrive\\Documents\\NetBeansProjects\\Thitracnghiem\\src\\Report\\dethi.jrxml");
           
            JasperReport jsreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jsreport, a, conn);
            JasperViewer jv= new JasperViewer(jprint,false);
           JDialog dialog = new JDialog(this);//the owner
            dialog.setContentPane(jv.getContentPane());
            dialog.setSize(jv.getSize());
            dialog.setTitle("Danh sách");

            dialog.setVisible(true);
//            JasperViewer.viewReport(jprint);
//            JasperViewer.
        } catch (JRException ex) {
            Logger.getLogger(JasperRp.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDeThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDeThi(new JFrame(),true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTestButton;
    private javax.swing.JComboBox<String> cbKyThi;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JButton delButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfLevel1;
    private javax.swing.JTextField tfLevel2;
    private javax.swing.JTextField tfLevel3;
    private javax.swing.JTextField tfMaxPoint;
    private javax.swing.JTextField tfNumQuestion;
    private javax.swing.JTextField tfTenDeThi;
    private javax.swing.JTextField tfTestTime;
    // End of variables declaration//GEN-END:variables

}
