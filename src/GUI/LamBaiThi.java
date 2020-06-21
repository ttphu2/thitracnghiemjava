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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

import java.util.List;

/**
 *
 * @author User
 */
public class LamBaiThi extends javax.swing.JFrame {
    private static final Integer IDS=Integer.parseInt(SessionUser.getMaNguoiDung());
    public static int testID;
    private List<CauHoiDTO> listQuestion;
    private DeThiDTO deThi;
    
    //private ArrayList<Answer> listChoice = new ArrayList<>();
  //  private Answer[] listChoice ; 
    private int amountQue;
    
    /**
     * Creates new form Take_exam
     */
    public LamBaiThi(Integer testId) {
        initComponents();
        setBounds(50,50,850,610);
        setResizable(false);
        
        tfStuId.setText(String.valueOf(IDS));
        tfDate.setText(java.time.LocalDate.now().toString());
        System.out.println(testId);
        testID = testId;
        deThi=SingletonBusUtil.getDeThiBUSInstance().findById(testId);
        tfSub.setText(deThi.getMonHocDTO().getTenMonHoc());      
        listQuestion = SingletonBusUtil.getDeThiBUSInstance().getCauHoiByMaDe(testId);
        amountQue = listQuestion.size();
        Collections.shuffle(listQuestion);
        addTime();
        showQuestion(1);
        setCbQuestion();
        
    }
    
    static int second, minute;
    static Timer timer;
    
     private void addTime(){              
        int delay = 1000;
        int period = 1000;
        timer  = new Timer();
        second =    60;   
        minute =   deThi.getThoiGian() -1 ;  
        lbMinutes.setText(""+minute+"m ");
        lbSec.setText(""+second+" s");       
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {             
                lbSec.setText(""+setSeconds()+" s");
            }
        }, delay, period);         
    }
    private  int setSeconds() {
        if (second == 0){
           lbMinutes.setText(""+setMinute());
        }      
        if (minute == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hết giờ làm bài ");
            KetQuaDTO ketQua= SingletonBusUtil.getKetQuaBUSInstance().saveResult(Integer.parseInt(SessionUser.getMaNguoiDung()), deThi.getMaDeThi(), listQuestion);
            
            JOptionPane.showMessageDialog(rootPane, "Điểm thi là: "+ketQua.getDiemBaiThi());
            dispose();
//            endExam();
        }
        return --second;        
    }
    private int setMinute(){
        if (minute == 0 ){             
             timer.cancel();                       
        }           
        second = 60;             
        return --minute;
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
             if(lbAns1.getText().equals(dapAnNguoiDung)){
               rbChoiceA.setSelected(true);            
             }else if(lbAns2.getText().equals(dapAnNguoiDung)){
                rbChoiceB.setSelected(true);  
             }else if(lbAns3.getText().equals(dapAnNguoiDung)){
                rbChoiceC.setSelected(true);  
             }else if(lbAns4.getText().equals(dapAnNguoiDung)){
                rbChoiceD.setSelected(true);  
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
        labelTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbChoiceA = new javax.swing.JRadioButton();
        rbChoiceB = new javax.swing.JRadioButton();
        rbChoiceC = new javax.swing.JRadioButton();
        rbChoiceD = new javax.swing.JRadioButton();
        btPre = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btDone = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfStuId = new javax.swing.JLabel();
        tfSub = new javax.swing.JLabel();
        tfDate = new javax.swing.JLabel();
        lbMinutes = new javax.swing.JLabel();
        tfNumOfQes = new javax.swing.JLabel();
        cbQuestion = new javax.swing.JComboBox<>();
        lbSec = new javax.swing.JLabel();
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

        labelTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTime.setText("Thời gian còn :");
        getContentPane().add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 11, -1, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Câu hỏi số :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 107, 89, 32));

        buttonGroup1.add(rbChoiceA);
        rbChoiceA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceA.setText("A");
        rbChoiceA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceAMouseClicked(evt);
            }
        });
        rbChoiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceAActionPerformed(evt);
            }
        });
        getContentPane().add(rbChoiceA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 72));

        buttonGroup1.add(rbChoiceB);
        rbChoiceB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceB.setText("B");
        rbChoiceB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceBMouseClicked(evt);
            }
        });
        rbChoiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceBActionPerformed(evt);
            }
        });
        getContentPane().add(rbChoiceB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 69));

        buttonGroup1.add(rbChoiceC);
        rbChoiceC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceC.setText("C");
        rbChoiceC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceCMouseClicked(evt);
            }
        });
        rbChoiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceCActionPerformed(evt);
            }
        });
        getContentPane().add(rbChoiceC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, 72));

        buttonGroup1.add(rbChoiceD);
        rbChoiceD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbChoiceD.setText("D");
        rbChoiceD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbChoiceDMouseClicked(evt);
            }
        });
        rbChoiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChoiceDActionPerformed(evt);
            }
        });
        getContentPane().add(rbChoiceD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 69));

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

        btDone.setBackground(new java.awt.Color(0, 204, 204));
        btDone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDone.setText("Nộp bài");
        btDone.setContentAreaFilled(false);
        btDone.setOpaque(true);
        btDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoneActionPerformed(evt);
            }
        });
        getContentPane().add(btDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 120, -1));

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

        lbMinutes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbMinutes.setText("time");
        getContentPane().add(lbMinutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 18, -1, -1));

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

        lbSec.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbSec.setText("jLabel5");
        getContentPane().add(lbSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 18, -1, -1));

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

    private void rbChoiceAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceAMouseClicked
       String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        listQuestion.get(a).setDapAnNguoiDung(lbAns1.getText());
        System.out.println(listQuestion.get(a).getDapAnNguoiDung());
        
    }//GEN-LAST:event_rbChoiceAMouseClicked

    private void rbChoiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceBActionPerformed
       String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        listQuestion.get(a).setDapAnNguoiDung(lbAns2.getText());
        System.out.println(listQuestion.get(a).getDapAnNguoiDung());
    }//GEN-LAST:event_rbChoiceBActionPerformed

    private void rbChoiceCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceCMouseClicked
    
        
    }//GEN-LAST:event_rbChoiceCMouseClicked

    private void rbChoiceDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceDMouseClicked
       
    }//GEN-LAST:event_rbChoiceDMouseClicked

    private void rbChoiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceAActionPerformed
        // TODO add your handling code here:
//               addChoice(lbAns1.getText());
    }//GEN-LAST:event_rbChoiceAActionPerformed

    private void rbChoiceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceCActionPerformed
    String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        listQuestion.get(a).setDapAnNguoiDung(lbAns3.getText());
        System.out.println(listQuestion.get(a).getDapAnNguoiDung());
    }//GEN-LAST:event_rbChoiceCActionPerformed

    private void rbChoiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChoiceDActionPerformed
         String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        listQuestion.get(a).setDapAnNguoiDung(lbAns4.getText());
        System.out.println(listQuestion.get(a).getDapAnNguoiDung());
    }//GEN-LAST:event_rbChoiceDActionPerformed

    private void cbQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuestionActionPerformed
      // TODO add your handling code here:
        buttonGroup1.clearSelection();
        String str = cbQuestion.getSelectedItem().toString();
        int a=Integer.parseInt(str)-1;
        showQuestion(a);
        
    }//GEN-LAST:event_cbQuestionActionPerformed

    private void btDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoneActionPerformed
        // TODO add your handling code here:
        int count=0;
        for (int i=0; i< listQuestion.size();i++)
            if ( listQuestion.get(i).getDapAnNguoiDung() == null ){
                JOptionPane.showMessageDialog(rootPane,"Bạn còn câu chưa làm");
                break;
            } 
        
        int click = JOptionPane.showConfirmDialog(rootPane,"Thời gian vẫn còn . "
                + "Bạn có chắc chắn nộp bài không?", "Nộp bài", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION){
           //Integer.parseInt(SessionUser.getMaNguoiDung())
           KetQuaDTO ketQua= SingletonBusUtil.getKetQuaBUSInstance().saveResult(1, deThi.getMaDeThi(), listQuestion);
            
            JOptionPane.showMessageDialog(rootPane, "Điểm thi là: "+ketQua.getDiemBaiThi());
            dispose();
        }
        
        
        
    }//GEN-LAST:event_btDoneActionPerformed

    private void rbChoiceBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbChoiceBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbChoiceBMouseClicked

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
            java.util.logging.Logger.getLogger(LamBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LamBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LamBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LamBaiThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LamBaiThi(testID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDone;
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
    private javax.swing.JLabel labelTime;
    private javax.swing.JTextArea lbAns1;
    private javax.swing.JTextArea lbAns2;
    private javax.swing.JTextArea lbAns3;
    private javax.swing.JTextArea lbAns4;
    private javax.swing.JLabel lbMinutes;
    private javax.swing.JLabel lbSec;
    private javax.swing.JRadioButton rbChoiceA;
    private javax.swing.JRadioButton rbChoiceB;
    private javax.swing.JRadioButton rbChoiceC;
    private javax.swing.JRadioButton rbChoiceD;
    private javax.swing.JLabel tfDate;
    private javax.swing.JLabel tfNumOfQes;
    private javax.swing.JTextArea tfQueContent;
    private javax.swing.JLabel tfStuId;
    private javax.swing.JLabel tfSub;
    // End of variables declaration//GEN-END:variables

}
