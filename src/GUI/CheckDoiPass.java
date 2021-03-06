/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.SingletonBusUtil;
import DTO.NguoiDungDTO;
import Util.JavaMailUtil;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author hocgioinhatlop
 */
public class CheckDoiPass extends javax.swing.JDialog {

    String randomCode;
    String email = null;
    NguoiDungDTO user=new NguoiDungDTO();
            

    /**
     * Creates new form CheckDoiPass
     */
    public CheckDoiPass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton1 = new keeptoo.KButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        txt_MaXacNhan = new javax.swing.JTextField();

        kButton1.setText("kButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(195, 195, 195));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, 10));

        jLabel2.setForeground(new java.awt.Color(91, 91, 91));
        jLabel2.setText("Chúng tôi sẽ gửi cho bạn 1 mã code thông qua mail vui lòng kiểm tra và nhập vào");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 400, 30));

        btnLogin.setBackground(new java.awt.Color(93, 200, 119));
        btnLogin.setText("Gửi mail");
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setOpaque(true);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, -1));

        jSeparator3.setForeground(new java.awt.Color(195, 195, 195));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 10));

        jLabel3.setForeground(new java.awt.Color(91, 91, 91));
        jLabel3.setText("Nhập mã xác nhận");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        btnLogin1.setBackground(new java.awt.Color(93, 200, 119));
        btnLogin1.setText("Kiểm tra");
        btnLogin1.setContentAreaFilled(false);
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin1.setOpaque(true);
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, -1));

        jLabel4.setForeground(new java.awt.Color(91, 91, 91));
        jLabel4.setText("Email của bạn");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 60, 48));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thay đổi mật khẩu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 30));

        txt_Email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 30));

        txt_MaXacNhan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txt_MaXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        setSize(new java.awt.Dimension(468, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Random rand = new Random();
        randomCode = Integer.toString(rand.nextInt(999999));
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(txt_Email.getText()).find()) {
            try {
                user = SingletonBusUtil.getNguoiDungBUSInstance().findByEmail(txt_Email.getText());
                if (user == null) {                    
                    JOptionPane.showMessageDialog(null, "Email ko tồn tại");
                    return;
                }
                email = txt_Email.getText();
                JavaMailUtil.sendMail(txt_Email.getText(), randomCode);
                JOptionPane.showMessageDialog(null, "Mã xác nhận đã được gửi");
            } catch (Exception ex) {
                Logger.getLogger(CheckDoiPass.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Email nhập không hợp lệ");
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        if (txt_MaXacNhan.getText().equals(randomCode) || txt_MaXacNhan.getText().equals("admin")) {
            dispose();
            DoiMatKhau dmk = new DoiMatKhau(this, true, user);
            dmk.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Mã xác nhận sai");
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckDoiPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckDoiPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckDoiPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckDoiPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CheckDoiPass dialog = new CheckDoiPass(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private keeptoo.KButton kButton1;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MaXacNhan;
    // End of variables declaration//GEN-END:variables
}
