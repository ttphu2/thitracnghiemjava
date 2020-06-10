/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SingletonBusUtil;
import DTO.CauHoiDTO;
import DTO.DeThiDTO;
import DTO.MonHocDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author DuongSon
 */
public class QLBaiThi extends javax.swing.JFrame {
    
     private List<MonHocDTO> listSubjectName;
     private int subjectID, topicID;
     DefaultTableModel model;
     private List<DeThiDTO> listTest;
    /**
     * Creates new form TestManagerment
     */
    public QLBaiThi() {
        initComponents();
        setBounds(50,50,800,500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setCbMonHoc();
        showTable();
    }
    
    public void showTable(){
        listTest = SingletonBusUtil.getDeThiBUSInstance().findAll();
        model =(DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã đề", "Số câu hỏi", "Môn học", "Chủ đề"
        });

        for(DeThiDTO t : listTest){
            model.addRow(new Object[]{
                t.getMaDeThi(),t.getSlCauHoi() ,t.getChuongMonHocDTO().getMonHocDTO().getTenMonHoc(),
                t.getChuongMonHocDTO().getTenChuong()
            });
        }
        
    }

    public void setCbMonHoc(){
        listSubjectName=SingletonBusUtil.getMonHocBUSInstance().findAll();
       
        for(int i=0; i< listSubjectName.size(); i++){
            cbMonHoc.addItem(listSubjectName.get(i).getTenMonHoc());
            
        }
   
//    public void setCbTopic(int id){
//        cbTopic.removeAllItems();
//        ArrayList<Topic> list = new GetDB().getListTopic(id);  //tìm cách sử dụng hàm getListTopic có sẵn trong
//         for(int i=0; i<list.size(); i++){
//            cbTopic.addItem(list.get(i).getTopicName());
//        }   
//    }
    
//    public Vector randomList(int input, int get){
//        Random rd = new Random();
//        Vector v = new Vector();
//        int iNew = 0;
//        for (int i = 0; i < get ;  ) {
//            iNew = rd.nextInt(input);
//            if (!v.contains(iNew)){
//                i++;
//                v.add(iNew);
//            }
//        
//        }
////        
//        return v;
        
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
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfMaxPoint = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Số câu hỏi :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Môn học :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Thời gian (phút ) :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Số câu dễ :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Số câu trung bình :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Số câu khó :");

        tfNumQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumQuestionActionPerformed(evt);
            }
        });

        cbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonHocActionPerformed(evt);
            }
        });

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

        addTestButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addTestButton.setText("Thêm ");
        addTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestButtonActionPerformed(evt);
            }
        });

        delButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delButton.setText("Xóa");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Thoát ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tổng điểm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLevel1)
                            .addComponent(tfLevel2)
                            .addComponent(tfLevel3)
                            .addComponent(cbMonHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNumQuestion)
                            .addComponent(tfTestTime)
                            .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(tfMaxPoint))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNumQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfTestTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(tfLevel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMaxPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addTestButton)
                            .addComponent(delButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MenuGV().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestButtonActionPerformed
        // TODO add your handling code here:
        DeThiDTO t = new DeThiDTO();
               
          //  t.setTopicID(topicID);
            t.setSlCauHoi(Integer.parseInt(tfNumQuestion.getText()));
            t.setDiemToiDa(Integer.parseInt(tfMaxPoint.getText()));
            t.setThoiGian(Integer.parseInt(tfTestTime.getText()));
            t.setSlCauHoiDe(Integer.parseInt(tfLevel1.getText()));
            t.setSlCauHoiTb(Integer.parseInt(tfLevel2.getText()));
            t.setSlCauHoiKho(Integer.parseInt(tfLevel3.getText()));
            List<CauHoiDTO> cauHoiDTOS=SingletonBusUtil.getCauHoiBUSInstance().findEqualUnique("chuongMonHocEntity.monHocEntity.tenMonHoc", cbMonHoc.getSelectedItem().toString());
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
            System.out.println(de);
              System.out.println(tb);
                System.out.println(kho);
            if (((t.getSlCauHoiDe()+t.getSlCauHoiTb()+t.getSlCauHoiKho()) != t.getSlCauHoi())||(t.getSlCauHoi()==0))
                JOptionPane.showMessageDialog(rootPane,"Mời nhập lại số câu hỏi !");
            else if  ((Integer.parseInt(tfLevel1.getText()))> de
                   || (Integer.parseInt(tfLevel2.getText()))> tb
                   || (Integer.parseInt(tfLevel3.getText()))> kho)
                JOptionPane.showMessageDialog(rootPane, "Ngân hàng đề không đủ số câu hỏi");
         /*   else{
            
            try {
                UpdateDB up = new UpdateDB();
                up.dbTest(t);
                listTest.add(t);


                ArrayList list1 = new GetDB().getListLevel(topicID,1);
                Vector v1 = randomList(list1.size(),t.getLevel1());
                for ( int i = 0 ; i < v1.size() ; i++){
                   // System.out.println(v1.elementAt(i));
                    CreateTest creTest = new CreateTest();
                    Questions que = new Questions();
                    que = (Questions) list1.get((int)v1.elementAt(i));                  
                    creTest.setTestID(t.getTestID());
                    creTest.setquestionID(que.getQuestionID());         
                    System.out.println("testID = " + t.getTestID()+"cau hoi : " +que.getQuestionID());
                    UpdateDB u = new UpdateDB();
                    u.dbCreateTest(creTest);
                }

                ArrayList list2 = new GetDB().getListLevel(topicID,2);
                Vector v2 = randomList(list2.size(),t.getLevel2());
                for (  int i = 0 ; i < v2.size() ; i++){
                    //System.out.println(v2.elementAt(i));
                    CreateTest creTest = new CreateTest();
                    Questions que = new Questions();
                    que = (Questions) list2.get((int) v2.elementAt(i));
                    //System.out.println(que.getQuestionID());
                    creTest.setTestID(t.getTestID());
                    creTest.setquestionID(que.getQuestionID());
                    System.out.println("testID = " + t.getTestID()+"cau hoi : " +que.getQuestionID());
                    UpdateDB u = new UpdateDB();
                    u.dbCreateTest(creTest);
                }

                ArrayList list3 = new GetDB().getListLevel(topicID,3); 
                Vector v3 = randomList(list3.size(),t.getLevel3());
                for (  int i = 0 ; i < v3.size() ; i++){
                    //System.out.println(v3.elementAt(i));
                    CreateTest creTest = new CreateTest();
                    Questions que = new Questions();
                    que = (Questions) list3.get((int) v3.elementAt(i));
                    //System.out.println(que.getQuestionID());
                    creTest.setTestID(t.getTestID());
                    creTest.setquestionID(que.getQuestionID());
                    System.out.println("testID = " + t.getTestID()+"cau hoi : " +que.getQuestionID());
                    UpdateDB u = new UpdateDB();
                    u.dbCreateTest(creTest);
                }
                addTable();
                JOptionPane.showMessageDialog(rootPane, "Thêm đề thi thành công !");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Thêm đề thi không thành công !");
            }
            
        }*/
        
        
        
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
int index ; //chỉ số hàng được chọn trong bảng
    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
//        Object[] options = {"Xóa  ", "Thôi không xóa "};
//                    int n = JOptionPane.showOptionDialog(rootPane,
//                                    "Chắc chắn muốn xóa ? ",
//                                    "Question",
//                                    JOptionPane.YES_NO_OPTION,
//                                    JOptionPane.QUESTION_MESSAGE,
//                                    null,
//                                    options,
//                                    options[0]);
//                    if (n == JOptionPane.YES_OPTION) {
//                       //     
//                       Test t = new Test();
//                        TableModel mdl = jTable1.getModel();
//                        String ID = model.getValueAt(index, 0).toString();
//                        DeleteDB del = new DeleteDB();
//                        del.deleteTest(Integer.parseInt(ID));
//                        listTest.remove(t);
//                        model = (DefaultTableModel) jTable1.getModel();
//                        model.removeRow(index);
//                        JOptionPane.showMessageDialog(rootPane,"Xoá thành công");
//                       //
//                    } else if (n == JOptionPane.NO_OPTION) {                        
//                       return;
//                    } else {                       
//                    }                           
    }//GEN-LAST:event_delButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index =jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(QLBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLBaiThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTestButton;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JButton delButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfLevel1;
    private javax.swing.JTextField tfLevel2;
    private javax.swing.JTextField tfLevel3;
    private javax.swing.JTextField tfMaxPoint;
    private javax.swing.JTextField tfNumQuestion;
    private javax.swing.JTextField tfTestTime;
    // End of variables declaration//GEN-END:variables



}
