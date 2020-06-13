/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.KyThiBUS;
import BUS.MonHocBUS;
import BUS.SingletonBusUtil;
import BUSImpl.KyThiBUSImpl;
import BUSImpl.MonHocBUSImpl;
import DAO.KyThiDAO;
import DAO.MonHocDAO;
import DAOImpl.KyThiDAOImpl;
import DAOImpl.MonHocDAOImpl;
import DTO.KyThiDTO;
import DTO.MonHocDTO;
import Entity.KyThiEntity;
import Entity.MonHocEntity;
import Util.KyThiBeanUtil;
import Util.MonHocBeanUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author hocgioinhatlop
 */
public class QLKyThi extends javax.swing.JDialog {

    /**
     * Creates new form QLKyThi
     */
    private List<KyThiDTO> list=SingletonBusUtil.getKyThiBUSImplInstance().findAll();
     DefaultTableModel model;
     
    public QLKyThi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        model = (DefaultTableModel) jTable1.getModel();
        addTable();
        
    }
    
    public java.util.Date convertSQLDateToJavaDate(java.sql.Date date) {
    return new java.util.Date(date.getTime());
}
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
}
     public void addTable(){                
        model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã kỳ thi", "Tên kì thi", "Địa điểm","Ngày thi","Ngày kết thúc"
        });
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
       
        for(KyThiDTO tp : list){
            String date=(dt1.format(convertSQLDateToJavaDate(tp.getNgayThi())));
            String date1=(dt1.format(convertSQLDateToJavaDate(tp.getNgayKetThuc())));
            model.addRow(new Object[]{
                tp.getMaKyThi(),tp.getTenKyThi(),tp.getDiaDiem(),date,date1
            });
        }
    }
     private void showResult(){
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
        KyThiDTO topic = list.get(list.size() - 1);
        String date=(dt1.format(convertSQLDateToJavaDate(topic.getNgayThi())));
        String date1=(dt1.format(convertSQLDateToJavaDate(topic.getNgayKetThuc())));
        model.addRow(new Object[]{ topic.getMaKyThi(), topic.getTenKyThi(),topic.getDiaDiem(),date,date1});
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        txTenKyThi = new javax.swing.JTextField();
        btXoa = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txDiaDiem = new javax.swing.JTextField();
        txNgayThi = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nhập Kỳ Thi ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 63, -1, -1));

        jLabel2.setText("Ngày thi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 20));

        btThem.setText("Thêm ");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        getContentPane().add(btThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 230, 203, -1));

        txTenKyThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTenKyThiActionPerformed(evt);
            }
        });
        getContentPane().add(txTenKyThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 259, 203, -1));

        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 340, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chủ đề", "Tên chủ đề ", "Môn học "
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 98, 352, 236));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Danh Sách Kỳ Thi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 63, -1, -1));

        jLabel5.setText("Tên kỳ thi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 100, 50, 20));

        txDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDiaDiemActionPerformed(evt);
            }
        });
        getContentPane().add(txDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 120, -1));
        getContentPane().add(txNgayThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, -1));

        jLabel3.setText("Địa điểm:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 50, 20));
        getContentPane().add(txNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, -1));

        jLabel6.setText("Ngày kết thúc");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
       
        if(txDiaDiem.getText().equals("")|| txTenKyThi.getText().equals("")|| txNgayThi.getDate()==null|| txNgayKetThuc.getDate()==null){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng kiểm tra lại thông tin !!!");
            return;
        }
            
        KyThiDTO dto= new KyThiDTO();
        dto.setTenKyThi(txTenKyThi.getText());
        dto.setDiaDiem(txDiaDiem.getText());
        dto.setNgayThi(convertJavaDateToSqlDate(txNgayThi.getDate()));
        dto.setNgayKetThuc(convertJavaDateToSqlDate(txNgayKetThuc.getDate()));
          try{      
       Integer maKyThi= SingletonBusUtil.getKyThiBUSImplInstance().saveKyThi(dto);     
       dto.setMaKyThi(maKyThi);
        list.add(dto);
        showResult();
        JOptionPane.showMessageDialog(rootPane, "Thêm kỳ thi thành công !");
          }catch(ConstraintViolationException e){
              JOptionPane.showMessageDialog(rootPane, "Thêm kỳ thi thất bại vui lòng kiểm tra lại mã môn học!");
          }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btThemActionPerformed

    private void txTenKyThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTenKyThiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTenKyThiActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
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
            try{
                int SelectRow = jTable1.getSelectedRow();
                int id = Integer.parseInt(model.getValueAt(SelectRow, 0).toString()) ;
                
                SingletonBusUtil.getKyThiBUSImplInstance().deleteKyThi(id);
                model.removeRow(SelectRow);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Xóa không thành công !");
            }
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công !");
            //
        } else if (n == JOptionPane.NO_OPTION) {
            return;
        } else {
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        MenuGV menu = new MenuGV();
        menu.setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btThoatActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int SelectRow = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        //  int ID = Integer.parseInt(model.getValueAt(SelectRow, 0).toString()) ;
       // tx.setText(model.getValueAt(SelectRow, 0).toString());
        txTenKyThi.setText(model.getValueAt(SelectRow, 1).toString());
        txDiaDiem.setText(model.getValueAt(SelectRow, 2).toString());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void txDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDiaDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDiaDiemActionPerformed

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
            java.util.logging.Logger.getLogger(QLKyThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKyThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKyThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKyThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLKyThi dialog = new QLKyThi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txDiaDiem;
    private com.toedter.calendar.JDateChooser txNgayKetThuc;
    private com.toedter.calendar.JDateChooser txNgayThi;
    private javax.swing.JTextField txTenKyThi;
    // End of variables declaration//GEN-END:variables
}