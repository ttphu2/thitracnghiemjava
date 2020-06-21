/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SingletonBusUtil;
import DAO.SingletonDaoUtil;
import DTO.NguoiDungDTO;
import DTO.PhongThiDTO;
import Entity.NguoiDungEntity;
import Util.SessionUser;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hocgioinhatlop
 */
public class VaoPhongThi extends javax.swing.JDialog {
 //Integer.parseInt(SessionUser.getMaNguoiDung())
    private List<PhongThiDTO> listPhongThi=SingletonBusUtil.getPhongThiBUSInstance().findPhongThiByUserId(Integer.parseInt(SessionUser.getMaNguoiDung()));
    DefaultTableModel tableModel;
    public VaoPhongThi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addTable();
    }
    public java.util.Date convertSQLDateToJavaDate(java.sql.Date date) {
    return new java.util.Date(date.getTime());
}
 private void addTable(){    // cai dat cho bang       
        tableModel = (DefaultTableModel)tbList.getModel();
        tableModel.setColumnIdentifiers(new Object[]{  // ten bang
            "Mã Phòng", "Mã đề thi", "Môn Thi","Tên Kỳ Thi","Ngày thi"
        });
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
        
        for(PhongThiDTO s : listPhongThi){
            String date=(dt1.format(convertSQLDateToJavaDate(s.getDeThiDTO().getKyThiDTO().getNgayThi())));
            tableModel.addRow(new Object[]{
                s.getMaPhong(),
                s.getDeThiDTO().getMaDeThi(),
                s.getDeThiDTO().getMonHocDTO().getTenMonHoc(),
                s.getDeThiDTO().getKyThiDTO().getTenKyThi(),
                date
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVaoPhong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbList = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chọn phòng thi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 30));

        btnVaoPhong.setBackground(new java.awt.Color(93, 200, 119));
        btnVaoPhong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVaoPhong.setText("Vào phòng thi");
        btnVaoPhong.setContentAreaFilled(false);
        btnVaoPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVaoPhong.setOpaque(true);
        btnVaoPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaoPhongActionPerformed(evt);
            }
        });
        jPanel1.add(btnVaoPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 30));

        tbList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Mã đề thi", "Môn Thi", "Tên Kỳ Thi", "Ngày Thi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 470, 270));

        btnThoat.setBackground(new java.awt.Color(93, 200, 119));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setContentAreaFilled(false);
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.setOpaque(true);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 340));

        setSize(new java.awt.Dimension(697, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaoPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaoPhongActionPerformed
int index = tbList.getSelectedRow();
    TableModel model = tbList.getModel();
    int idDethi = Integer.parseInt(model.getValueAt(index, 1).toString());
    new LamBaiThi(idDethi).setVisible(true);
    dispose();
   
        
    }//GEN-LAST:event_btnVaoPhongActionPerformed

    private void tbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListMouseClicked
       
    }//GEN-LAST:event_tbListMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
      new MenuGV().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(VaoPhongThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaoPhongThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaoPhongThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaoPhongThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VaoPhongThi dialog = new VaoPhongThi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnVaoPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbList;
    // End of variables declaration//GEN-END:variables
}
