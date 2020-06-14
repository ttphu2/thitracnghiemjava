
package GUI;

import Util.SessionUser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class MenuGV extends javax.swing.JFrame {

    
     int xMouse;
     int yMouse;
    public MenuGV() {
       
        initComponents();
        btnDash.setBackground(new java.awt.Color(44,59,66));
        pnlDashBoard.setVisible(true);
        setInfor();
        setIcon();
       // paint_table();
       // cod.preencherTabela("SELECT * FROM person ORDER BY id", table);
        
    }
    private void setInfor(){
        txTen.setText(SessionUser.getTenDangNhap());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txTen = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnTest = new javax.swing.JPanel();
        TestVar = new javax.swing.JLabel();
        btnDash = new javax.swing.JPanel();
        btnDashBoard1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDashBoard2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pnlDashBoard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pnlTest = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jAbout = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        txTen.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        txTen.setForeground(new java.awt.Color(255, 255, 255));
        txTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTen.setText("Thanh Phu");
        jPanel2.add(txTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 20));

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

        btnTest.setBackground(new java.awt.Color(34, 45, 49));
        btnTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTestMouseClicked(evt);
            }
        });

        TestVar.setBackground(new java.awt.Color(34, 45, 49));
        TestVar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        TestVar.setForeground(new java.awt.Color(255, 255, 255));
        TestVar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TestVar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_folder_24px.png"))); // NOI18N
        TestVar.setText("Quản lý kỳ thi");
        TestVar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TestVar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TestVarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnTestLayout = new javax.swing.GroupLayout(btnTest);
        btnTest.setLayout(btnTestLayout);
        btnTestLayout.setHorizontalGroup(
            btnTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTestLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(TestVar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnTestLayout.setVerticalGroup(
            btnTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTestLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TestVar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 30));

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

        jLabel31.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Đổi mật khẩu");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        pnlDashBoard.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 250, 100));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(57, 129, 215));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_student_male_64px.png"))); // NOI18N
        jLabel26.setOpaque(true);
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel27.setText("Thêm,xóa sinh viên");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Quản lý sinh viên");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        pnlDashBoard.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 100));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBackground(new java.awt.Color(0, 192, 239));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_literature_64px.png"))); // NOI18N
        jLabel32.setOpaque(true);
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel33.setText("Thêm,xóa môn học");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Quản lý môn học");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        pnlDashBoard.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 100));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(0, 167, 89));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_test_passed_64px_1.png"))); // NOI18N
        jLabel35.setOpaque(true);
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel36.setText("Thêm,xóa câu hỏi");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Quản lý câu hỏi");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        pnlDashBoard.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 250, 100));

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

        jPanel7.add(pnlDashBoard, "card2");

        pnlTest.setBackground(new java.awt.Color(255, 255, 255));
        pnlTest.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(236, 239, 244));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(210, 214, 223));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 1, 13)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_24px.png"))); // NOI18N
        jLabel14.setText("Home >");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_folder_24px.png"))); // NOI18N
        jLabel15.setText("Quản lý kỳ thi");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 410, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 630, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBackground(new java.awt.Color(0, 192, 239));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_literature_64px.png"))); // NOI18N
        jLabel38.setOpaque(true);
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel39.setText("Thêm,xóa môn học");
        jPanel15.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Quản lý kỳ thi");
        jPanel15.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 100));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setBackground(new java.awt.Color(0, 167, 89));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_test_passed_64px_1.png"))); // NOI18N
        jLabel41.setOpaque(true);
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel42.setText("Thêm,xóa đề thi");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Quản lý đề thi");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        jPanel4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 250, 100));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setBackground(new java.awt.Color(220, 237, 193));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_class_64px.png"))); // NOI18N
        jLabel44.setOpaque(true);
        jPanel17.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Quản lý phòng thi");
        jPanel17.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        jPanel4.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 250, 100));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setBackground(new java.awt.Color(57, 129, 215));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_student_male_64px.png"))); // NOI18N
        jLabel47.setOpaque(true);
        jPanel18.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 90, 110));

        jLabel48.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel48.setText("Thêm,xóa sinh viên");
        jPanel18.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Quản lý kết quả");
        jPanel18.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, -1));

        jPanel4.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, 100));

        javax.swing.GroupLayout pnlTestLayout = new javax.swing.GroupLayout(pnlTest);
        pnlTest.setLayout(pnlTestLayout);
        pnlTestLayout.setHorizontalGroup(
            pnlTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTestLayout.setVerticalGroup(
            pnlTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        jLabel2.setText("GIANGVIEN");
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

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_info_24px.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 40));

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 670, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(909, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TestVarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TestVarMouseClicked
        
        btnDash.setBackground(new java.awt.Color(34,45,49));
        pnlDashBoard.setVisible(false);
        btnTest.setBackground(new java.awt.Color(44,59,66));
        pnlTest.setVisible(true);
        
    }//GEN-LAST:event_TestVarMouseClicked

    private void btnDashBoard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashBoard1MouseClicked
        btnDash.setBackground(new java.awt.Color(44,59,66));
        pnlDashBoard.setVisible(true);
        btnTest.setBackground(new java.awt.Color(34,45,49));
        pnlTest.setVisible(false);
       
    }//GEN-LAST:event_btnDashBoard1MouseClicked

    private void btnDashBoard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashBoard2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashBoard2MouseClicked

    private void btnTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseClicked
        
    }//GEN-LAST:event_btnTestMouseClicked

    private void btnDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashMouseClicked
       
    }//GEN-LAST:event_btnDashMouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
     new QLMonHoc(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel13MouseClicked

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

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        new QLSinhVien(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        new DoiMatKhau1(this, true).setVisible(true);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
      new QLCauHoi(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
       new QLKyThi(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        new QLDeThi(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
         new DanhSachPhongThi(this,true).setVisible(true);
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAboutMouseClicked
       JOptionPane.showMessageDialog(this, "Nhóm gồm 4 thành viên: \n Trần Thanh Phú \n Bùi Minh Cương \n Trần Ngọc Sang \n Tô Hồng Phúc");
    }//GEN-LAST:event_jAboutMouseClicked

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
            java.util.logging.Logger.getLogger(MenuGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TestVar;
    private javax.swing.JPanel btnDash;
    private javax.swing.JLabel btnDashBoard1;
    private javax.swing.JLabel btnDashBoard2;
    private javax.swing.JPanel btnTest;
    private javax.swing.JLabel jAbout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlDashBoard;
    private javax.swing.JPanel pnlTest;
    private javax.swing.JLabel txTen;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon_exam.png")));
    }
}
