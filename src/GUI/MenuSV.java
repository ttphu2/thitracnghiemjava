/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import Util.ConnectUtil;
//import Util.ControlPerson;
//import Util.SingletonServiceUtil;
import Util.SessionUser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author hocgioinhatlop
 */
public class MenuSV extends javax.swing.JFrame {

    //ConnectUtil connectUtil=new ConnectUtil();
   // ControlPerson cod = new ControlPerson();
     int xMouse;
     int yMouse;
    public MenuSV() {
       
        initComponents();
        btnDash.setBackground(new java.awt.Color(44,59,66));
        pnlDashBoard.setVisible(true);
        setIcon();
        jLabel5.setText(SessionUser.getTenDangNhap());
       // paint_table();
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnDash = new javax.swing.JPanel();
        btnDashBoard1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDashBoard2 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JLabel();
        btnTest1 = new javax.swing.JPanel();
        TestVar1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pnlDashBoard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pnlTest = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jAbout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(35, 45, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ONLINE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 20));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Thanh Phu");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 20));

        jTextField1.setBackground(new java.awt.Color(54, 73, 80));
        jTextField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 30));

        jLabel7.setBackground(new java.awt.Color(54, 73, 80));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_22px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 30, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-36.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 40));

        btnDash.setBackground(new java.awt.Color(34, 45, 49));
        btnDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashMouseClicked(evt);
            }
        });

        btnDashBoard1.setBackground(new java.awt.Color(34, 45, 49));
        btnDashBoard1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnDashBoard1.setForeground(new java.awt.Color(255, 255, 255));
        btnDashBoard1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashBoard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_speed_24px.png"))); // NOI18N
        btnDashBoard1.setText("Dashboard");
        btnDashBoard1.setToolTipText("");
        btnDashBoard1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashBoard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashBoard1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDashLayout = new javax.swing.GroupLayout(btnDash);
        btnDash.setLayout(btnDashLayout);
        btnDashLayout.setHorizontalGroup(
            btnDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDashLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(btnDashBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDashLayout.setVerticalGroup(
            btnDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDashLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDashBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 30));

        jPanel9.setBackground(new java.awt.Color(34, 45, 49));

        btnDashBoard2.setBackground(new java.awt.Color(34, 45, 49));
        btnDashBoard2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnDashBoard2.setForeground(new java.awt.Color(255, 255, 255));
        btnDashBoard2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashBoard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-speed-24.png"))); // NOI18N
        btnDashBoard2.setText("Dashboard");
        btnDashBoard2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashBoard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashBoard2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDashBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDashBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 30));

        btnQuit.setBackground(new java.awt.Color(34, 45, 49));
        btnQuit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_exit_24px_1.png"))); // NOI18N
        btnQuit.setText("Thoát");
        btnQuit.setToolTipText("");
        btnQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });
        jPanel2.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 214, 30));

        btnTest1.setBackground(new java.awt.Color(34, 45, 49));
        btnTest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTest1MouseClicked(evt);
            }
        });

        TestVar1.setBackground(new java.awt.Color(34, 45, 49));
        TestVar1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar1.setForeground(new java.awt.Color(255, 255, 255));
        TestVar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_undo_24px.png"))); // NOI18N
        TestVar1.setText("Đăng nhập lại");
        TestVar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnTest1Layout = new javax.swing.GroupLayout(btnTest1);
        btnTest1.setLayout(btnTest1Layout);
        btnTest1Layout.setHorizontalGroup(
            btnTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTest1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnTest1Layout.setVerticalGroup(
            btnTest1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTest1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnTest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 240, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 510));

        jPanel7.setLayout(new java.awt.CardLayout());

        pnlDashBoard.setBackground(new java.awt.Color(236, 239, 244));
        pnlDashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Version 1.0");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDashBoard.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel11.setText("Dashboard");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDashBoard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        jPanel5.setBackground(new java.awt.Color(210, 214, 223));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_24px.png"))); // NOI18N
        jLabel12.setText("Home >");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_speed_24px_1.png"))); // NOI18N
        jLabel13.setText("Dashboard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 436, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        pnlDashBoard.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 630, 30));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(102, 0, 204));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_play_64px_1.png"))); // NOI18N
        jLabel35.setOpaque(true);
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Làm bài thi");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        pnlDashBoard.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 100));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlDashBoard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 40));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(220, 237, 193));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_class_64px.png"))); // NOI18N
        jLabel29.setOpaque(true);
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Đổi mật khẩu");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        pnlDashBoard.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 250, 100));

        jPanel7.add(pnlDashBoard, "card2");

        pnlTest.setBackground(new java.awt.Color(255, 255, 255));
        pnlTest.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 139, 350, 370));

        javax.swing.GroupLayout pnlTestLayout = new javax.swing.GroupLayout(pnlTest);
        pnlTest.setLayout(pnlTestLayout);
        pnlTestLayout.setHorizontalGroup(
            pnlTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTestLayout.setVerticalGroup(
            pnlTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.add(pnlTest, "card3");

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 670, 510));

        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel8MouseDragged(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(54, 127, 168));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SINHVIEN");
        jLabel2.setOpaque(true);
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        jPanel3.setBackground(new java.awt.Color(60, 141, 166));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_window_24px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_info_24px.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 40));

        jAbout.setBackground(new java.awt.Color(54, 127, 168));
        jAbout.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jAbout.setForeground(new java.awt.Color(255, 255, 255));
        jAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAbout.setText("About Team");
        jAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAboutMouseClicked(evt);
            }
        });
        jPanel3.add(jAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 130, 40));

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 670, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(909, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashBoard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashBoard1MouseClicked
        btnDash.setBackground(new java.awt.Color(44,59,66));
        pnlDashBoard.setVisible(true);
       // btnTest.setBackground(new java.awt.Color(34,45,49));
        pnlTest.setVisible(false);
       
    }//GEN-LAST:event_btnDashBoard1MouseClicked

    private void btnDashBoard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashBoard2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashBoard2MouseClicked

    private void btnDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashMouseClicked
       
    }//GEN-LAST:event_btnDashMouseClicked

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased

    }//GEN-LAST:event_tableMouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableFocusGained

    }//GEN-LAST:event_tableFocusGained

    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged
        int x= evt.getXOnScreen();
      int y= evt.getYOnScreen();
      this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel8MouseDragged

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        xMouse= evt.getX();
     yMouse=evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAboutMouseClicked
        JOptionPane.showMessageDialog(this, "Nhóm gồm 4 thành viên: \n Trần Thanh Phú \n Bùi Minh Cương \n Trần Ngọc Sang \n Tô Hồng Phúc");
    }//GEN-LAST:event_jAboutMouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        new VaoPhongThi(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        new DoiMatKhau1(this, true).setVisible(true);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    private void TestVar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVar1MouseClicked
        dispose();
        SessionUser.removeSession();
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_TestVar1MouseClicked

    private void btnTest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTest1MouseClicked

    }//GEN-LAST:event_btnTest1MouseClicked

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
            java.util.logging.Logger.getLogger(MenuSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MenuSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TestVar1;
    private javax.swing.JPanel btnDash;
    private javax.swing.JLabel btnDashBoard1;
    private javax.swing.JLabel btnDashBoard2;
    private javax.swing.JLabel btnQuit;
    private javax.swing.JPanel btnTest1;
    private javax.swing.JLabel jAbout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlDashBoard;
    private javax.swing.JPanel pnlTest;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
private void paint_table() {
       jScrollPane1.getViewport().setBackground(Color.WHITE);       
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(60, 127, 177));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(50);
        
    }
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon_exam.png")));
    }
}
