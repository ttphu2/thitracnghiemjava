/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SingletonBusUtil;
import DTO.CauHoiDTO;
import DTO.DeThiDTO;
import DTO.KetQuaDTO;
import Util.SessionUser;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author User
 */
public class XemBaiThi extends javax.swing.JDialog {
    private static Integer maSV;
    public static int maKetQua;
    private List<CauHoiDTO> listQuestion;
    private DeThiDTO deThi;
    
    //private ArrayList<Answer> listChoice = new ArrayList<>();
  //  private Answer[] listChoice ; 
    private int amountQue;
    
    /**
     * Creates new form Take_exam
     */
    public XemBaiThi(java.awt.Dialog parent, boolean modal,Integer maSV,Integer maKetQua) {
        super(parent, modal);
        initComponents();
        setBounds(50,50,850,610);
        setResizable(false);
        
        tfStuId.setText(maSV.toString());
        tfDate.setText(java.time.LocalDate.now().toString());
        maKetQua=maKetQua;       
       maSV=maSV;
        listQuestion = SingletonBusUtil.getKetQuaBUSInstance().xemBaiThi(maKetQua);
         tfSub.setText(listQuestion.get(0).getChuongMonHocDTO().getMonHocDTO().getTenMonHoc());      
        amountQue = listQuestion.size();
        
        showQuestion(1);
        setCbQuestion();
        
    }
    
    
 
    
   
    private void showQuestion(int index){
         tfNumOfQes.setText(String.valueOf(index+1));
         tfQueContent.setText(listQuestion.get(index).getCauHoi()); 
         lbAns1.setText(listQuestion.get(index).getDapAn1());
         lbAns2.setText(listQuestion.get(index).getDapAn2());
         lbAns3.setText(listQuestion.get(index).getDapAn3());
         lbAns4.setText(listQuestion.get(index).getDapAn4());
         //System.out.println(listQuestion.get(index).getDapAnNguoiDung()!=null)
         if(listQuestion.get(index).getDapAnNguoiDung()!=null){
             String dapAnDung=listQuestion.get(index).getDapAnDung();
             String dapAnNguoiDung=listQuestion.get(index).getDapAnNguoiDung();
             jcauA.setIcon(null);
             jcauB.setIcon(null);
             jcauC.setIcon(null);
             jcauD.setIcon(null);
             if(lbAns1.getText().equals(dapAnNguoiDung)||lbAns1.getText().equals(dapAnDung)){
                 if(lbAns1.getText().equals(dapAnDung)){
                      ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_checkmark_24px_1.png"); 
                      jcauA.setIcon(iconLogo);
                 }else{
                     ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_delete_24px.png"); 
                      jcauA.setIcon(iconLogo);
                 }
                   
             }
             if(lbAns2.getText().equals(dapAnNguoiDung)||lbAns2.getText().equals(dapAnDung)){
              if(lbAns2.getText().equals(dapAnDung)){
                      ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_checkmark_24px_1.png"); 
                      jcauB.setIcon(iconLogo);
                 }else{
                     ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_delete_24px.png"); 
                      jcauB.setIcon(iconLogo);
                 }
             }
             if(lbAns3.getText().equals(dapAnNguoiDung)||lbAns3.getText().equals(dapAnDung)){
            if(lbAns3.getText().equals(dapAnDung)){
                      ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_checkmark_24px_1.png"); 
                      jcauC.setIcon(iconLogo);
                 }else{
                     ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_delete_24px.png"); 
                      jcauC.setIcon(iconLogo);
                 }
             }
             if(lbAns4.getText().equals(dapAnNguoiDung)||lbAns4.getText().equals(dapAnDung)){
          if(lbAns4.getText().equals(dapAnDung)){
                      ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_checkmark_24px_1.png"); 
                      jcauD.setIcon(iconLogo);
                 }else{
                     ImageIcon iconLogo = new ImageIcon(System.getProperty("user.dir")+"\\src\\img\\icons8_delete_24px.png"); 
                      jcauD.setIcon(iconLogo);
                 }  
             }
         }
        
    }
    
    public void setCbQuestion(){
       
        for(int i=0; i<listQuestion.size(); i++){
            cbQuestion.addItem(String.valueOf(i+1));
        }
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btPre = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfStuId = new javax.swing.JLabel();
        tfSub = new javax.swing.JLabel();
        tfDate = new javax.swing.JLabel();
        tfNumOfQes = new javax.swing.JLabel();
        cbQuestion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfQueContent = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbAns2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbAns3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbAns4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        lbAns1 = new javax.swing.JTextArea();
        jcauA = new javax.swing.JLabel();
        jcauB = new javax.swing.JLabel();
        jcauD = new javax.swing.JLabel();
        jcauC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thi Trắc Nghiệm ");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mã Sinh Viên:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 11, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Môn Thi :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 59, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Ngày thi :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 11, -1, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Câu hỏi số :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 107, 89, 32));

        btPre.setBackground(new java.awt.Color(93, 200, 119));
        btPre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btPre.setText("<< Câu trước");
        btPre.setContentAreaFilled(false);
        btPre.setOpaque(true);
        btPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreActionPerformed(evt);
            }
        });
        getContentPane().add(btPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 180, -1));

        btNext.setBackground(new java.awt.Color(93, 200, 119));
        btNext.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btNext.setText("Câu sau >>");
        btNext.setContentAreaFilled(false);
        btNext.setOpaque(true);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        getContentPane().add(btNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Chọn câu hỏi");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 25, 121, 48));

        tfStuId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfStuId.setText("mssv");
        getContentPane().add(tfStuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 18, -1, -1));

        tfSub.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfSub.setText("mon thi");
        getContentPane().add(tfSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 66, -1, -1));

        tfDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfDate.setText("date");
        getContentPane().add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 18, -1, -1));

        tfNumOfQes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfNumOfQes.setText("number");
        getContentPane().add(tfNumOfQes, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 115, 58, -1));

        cbQuestion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(cbQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 79, 121, 36));

        tfQueContent.setEditable(false);
        tfQueContent.setColumns(20);
        tfQueContent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfQueContent.setRows(5);
        jScrollPane1.setViewportView(tfQueContent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 145, 722, 100));

        lbAns2.setEditable(false);
        lbAns2.setColumns(20);
        lbAns2.setRows(3);
        jScrollPane2.setViewportView(lbAns2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 301, 69));

        lbAns3.setEditable(false);
        lbAns3.setColumns(20);
        lbAns3.setRows(3);
        jScrollPane3.setViewportView(lbAns3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 284, 72));

        lbAns4.setEditable(false);
        lbAns4.setColumns(20);
        lbAns4.setRows(3);
        jScrollPane4.setViewportView(lbAns4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 284, 69));

        lbAns1.setEditable(false);
        lbAns1.setColumns(20);
        lbAns1.setLineWrap(true);
        lbAns1.setRows(3);
        jScrollPane5.setViewportView(lbAns1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 301, 72));
        getContentPane().add(jcauA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 20, 20));
        getContentPane().add(jcauB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 20, 20));
        getContentPane().add(jcauD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 20, 20));
        getContentPane().add(jcauC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 20, 20));

        setSize(new java.awt.Dimension(865, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
// TODO add your handling code here:
       buttonGroup1.clearSelection();
     int m = Integer.parseInt(tfNumOfQes.getText());
     if (m == listQuestion.size()) m = 0;
     cbQuestion.setSelectedIndex(m);
        showQuestion(m);

    }//GEN-LAST:event_btNextActionPerformed

    private void btPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        int m = Integer.parseInt(tfNumOfQes.getText());  
        if (m == 1) m =  listQuestion.size()+1;
          cbQuestion.setSelectedIndex(m-2);
        showQuestion(m-2);
       
    }//GEN-LAST:event_btPreActionPerformed

    private void cbQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuestionActionPerformed
      // TODO add your handling code here:
        buttonGroup1.clearSelection();
        String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        showQuestion(a);
        
    }//GEN-LAST:event_cbQuestionActionPerformed

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
            java.util.logging.Logger.getLogger(XemBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemBaiThi(new JDialog(),true,maSV,maKetQua).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jcauA;
    private javax.swing.JLabel jcauB;
    private javax.swing.JLabel jcauC;
    private javax.swing.JLabel jcauD;
    private javax.swing.JTextArea lbAns1;
    private javax.swing.JTextArea lbAns2;
    private javax.swing.JTextArea lbAns3;
    private javax.swing.JTextArea lbAns4;
    private javax.swing.JLabel tfDate;
    private javax.swing.JLabel tfNumOfQes;
    private javax.swing.JTextArea tfQueContent;
    private javax.swing.JLabel tfStuId;
    private javax.swing.JLabel tfSub;
    // End of variables declaration//GEN-END:variables

}
