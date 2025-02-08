package securemessagewriter_vf;

import java.awt.Color;
import java.awt.Insets;
import java.time.LocalTime;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFileChooser;

public class AppMainFrame extends javax.swing.JFrame {

    public AppMainFrame() {
        initComponents();
    }
    
    // global variable for secret key, encrypted message, decrypted message
    private static String secretKey, encryptedMessage, decryptedMessage, copiedText;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JOptionPane = new javax.swing.JOptionPane();
        sidenavbar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        generalContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        encryptionTabPanel = new javax.swing.JPanel();
        encryptionMenuTab = new javax.swing.JPanel();
        encryptionTabText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        decryptionTabPanel = new javax.swing.JPanel();
        decryptionMenuTab = new javax.swing.JPanel();
        decryptionTabText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supportContainer = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        encryptionTabPanel1 = new javax.swing.JPanel();
        encryptionMenuTab1 = new javax.swing.JPanel();
        shareFileTab = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        copyrightPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        decryptionPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        originalMessageBox2 = new javax.swing.JScrollPane();
        encryptedMessageTextArea2 = new javax.swing.JTextArea();
        clearBtnOG2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        encryptedMessageBox1 = new javax.swing.JScrollPane();
        originalMessageTextArea2 = new javax.swing.JTextArea();
        pasteBtnEMssg2 = new javax.swing.JButton();
        copyBtnEMssg1 = new javax.swing.JButton();
        originalMessageErrorLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        DecryptionKeyBox = new javax.swing.JTextField();
        pasteBtnEKey1 = new javax.swing.JButton();
        decryptionBtn = new javax.swing.JButton();
        encryptionKeyErrorLabel1 = new javax.swing.JLabel();
        encryptionPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        originalMessageBox1 = new javax.swing.JScrollPane();
        originalMessageTextArea = new javax.swing.JTextArea();
        clearBtnOG1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        encryptedMessageBox = new javax.swing.JScrollPane();
        encryptedMessageTextArea = new javax.swing.JTextArea();
        pasteBtnOGMssg1 = new javax.swing.JButton();
        copyBtnEMssg = new javax.swing.JButton();
        originalMessageErrorLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        encryptionKeyBox = new javax.swing.JTextField();
        pasteBtnEKey = new javax.swing.JButton();
        copyBtnEKey = new javax.swing.JButton();
        createKey = new javax.swing.JButton();
        encryptBtn = new javax.swing.JButton();
        encryptionKeyErrorLabel = new javax.swing.JLabel();
        usernameTextfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        fileSaveErrorLabel = new javax.swing.JLabel();
        browseFileBtn = new javax.swing.JButton();
        shareFilePanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        recipientEmailField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        emailMessageBox = new javax.swing.JScrollPane();
        emailMessage = new javax.swing.JTextArea();
        emailErrorLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fileField = new javax.swing.JTextField();
        browseFile = new javax.swing.JButton();
        sendEmailBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secure Message Writer");

        sidenavbar.setBackground(new java.awt.Color(255, 255, 255));
        sidenavbar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(221, 221, 221)));
        sidenavbar.setPreferredSize(new java.awt.Dimension(250, 600));
        sidenavbar.setLayout(new javax.swing.BoxLayout(sidenavbar, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(221, 221, 221)));
        jPanel3.setMaximumSize(new java.awt.Dimension(250, 80));
        jPanel3.setMinimumSize(new java.awt.Dimension(250, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 80));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(33, 150, 243));
        jLabel15.setText("SecureWrite");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(31, 31, 31))
        );

        sidenavbar.add(jPanel3);

        generalContainer.setBackground(new java.awt.Color(255, 255, 255));
        generalContainer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(221, 221, 221)));
        generalContainer.setMaximumSize(new java.awt.Dimension(250, 200));
        generalContainer.setPreferredSize(new java.awt.Dimension(250, 200));
        generalContainer.setLayout(new java.awt.GridLayout(3, 1, 0, 1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("GENERAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        generalContainer.add(jPanel2);

        encryptionTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        encryptionMenuTab.setBackground(new java.awt.Color(255, 255, 255));
        encryptionMenuTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encryptionMenuTab.setMinimumSize(new java.awt.Dimension(116, 21));
        encryptionMenuTab.setPreferredSize(new java.awt.Dimension(169, 31));
        encryptionMenuTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encryptionMenuTabMouseClicked(evt);
            }
        });
        encryptionMenuTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encryptionTabText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        encryptionTabText.setForeground(new java.awt.Color(70, 70, 70));
        encryptionTabText.setText("Encrypt Message");
        encryptionTabText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        encryptionMenuTab.add(encryptionTabText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/encrypted-data.png"))); // NOI18N
        encryptionMenuTab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        javax.swing.GroupLayout encryptionTabPanelLayout = new javax.swing.GroupLayout(encryptionTabPanel);
        encryptionTabPanel.setLayout(encryptionTabPanelLayout);
        encryptionTabPanelLayout.setHorizontalGroup(
            encryptionTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptionTabPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(encryptionMenuTab, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        encryptionTabPanelLayout.setVerticalGroup(
            encryptionTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encryptionTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encryptionMenuTab, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        generalContainer.add(encryptionTabPanel);

        decryptionTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        decryptionMenuTab.setBackground(new java.awt.Color(255, 255, 255));
        decryptionMenuTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decryptionMenuTab.setPreferredSize(new java.awt.Dimension(169, 31));
        decryptionMenuTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decryptionMenuTabMouseClicked(evt);
            }
        });
        decryptionMenuTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        decryptionTabText.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        decryptionTabText.setForeground(new java.awt.Color(70, 70, 70));
        decryptionTabText.setText("Decrypt Message");
        decryptionTabText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        decryptionMenuTab.add(decryptionTabText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/decrypt.png"))); // NOI18N
        decryptionMenuTab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        javax.swing.GroupLayout decryptionTabPanelLayout = new javax.swing.GroupLayout(decryptionTabPanel);
        decryptionTabPanel.setLayout(decryptionTabPanelLayout);
        decryptionTabPanelLayout.setHorizontalGroup(
            decryptionTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decryptionTabPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(decryptionMenuTab, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        decryptionTabPanelLayout.setVerticalGroup(
            decryptionTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decryptionTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decryptionMenuTab, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        generalContainer.add(decryptionTabPanel);

        sidenavbar.add(generalContainer);

        supportContainer.setBackground(new java.awt.Color(255, 255, 255));
        supportContainer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(221, 221, 221)));
        supportContainer.setMaximumSize(new java.awt.Dimension(250, 180));
        supportContainer.setPreferredSize(new java.awt.Dimension(250, 200));
        supportContainer.setLayout(new java.awt.GridLayout(3, 1, 0, 1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("SUPPORT");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );

        supportContainer.add(jPanel9);

        encryptionTabPanel1.setBackground(new java.awt.Color(255, 255, 255));

        encryptionMenuTab1.setBackground(new java.awt.Color(255, 255, 255));
        encryptionMenuTab1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encryptionMenuTab1.setMinimumSize(new java.awt.Dimension(116, 21));
        encryptionMenuTab1.setPreferredSize(new java.awt.Dimension(169, 31));
        encryptionMenuTab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encryptionMenuTab1MouseClicked(evt);
            }
        });
        encryptionMenuTab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shareFileTab.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        shareFileTab.setForeground(new java.awt.Color(70, 70, 70));
        shareFileTab.setText("Share");
        shareFileTab.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        shareFileTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shareFileTabMouseClicked(evt);
            }
        });
        encryptionMenuTab1.add(shareFileTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/send.png"))); // NOI18N
        encryptionMenuTab1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        javax.swing.GroupLayout encryptionTabPanel1Layout = new javax.swing.GroupLayout(encryptionTabPanel1);
        encryptionTabPanel1.setLayout(encryptionTabPanel1Layout);
        encryptionTabPanel1Layout.setHorizontalGroup(
            encryptionTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptionTabPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(encryptionMenuTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        encryptionTabPanel1Layout.setVerticalGroup(
            encryptionTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encryptionTabPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encryptionMenuTab1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        supportContainer.add(encryptionTabPanel1);

        sidenavbar.add(supportContainer);

        copyrightPanel.setBackground(new java.awt.Color(255, 255, 255));
        copyrightPanel.setAlignmentY(-0.5F);
        copyrightPanel.setMaximumSize(new java.awt.Dimension(32767, 93));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Copyright @2024 - Amrik Bhadra");

        jLabel13.setText("✉ amrik.bhadra@gmail.com");

        javax.swing.GroupLayout copyrightPanelLayout = new javax.swing.GroupLayout(copyrightPanel);
        copyrightPanel.setLayout(copyrightPanelLayout);
        copyrightPanelLayout.setHorizontalGroup(
            copyrightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copyrightPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(copyrightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(copyrightPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        copyrightPanelLayout.setVerticalGroup(
            copyrightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copyrightPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        sidenavbar.add(copyrightPanel);

        getContentPane().add(sidenavbar, java.awt.BorderLayout.LINE_START);

        rightPanel.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(221, 221, 221)));
        header.setPreferredSize(new java.awt.Dimension(730, 80));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeText.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(95, 95, 95));
        welcomeText.setText("Welcome, Good Morning");
        header.add(welcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        rightPanel.add(header, java.awt.BorderLayout.PAGE_START);

        content.setBackground(new java.awt.Color(255, 51, 51));
        content.setLayout(new java.awt.CardLayout());

        decryptionPanel.setBackground(new java.awt.Color(249, 249, 249));
        decryptionPanel.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(249, 249, 249));
        jPanel7.setPreferredSize(new java.awt.Dimension(730, 270));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 150, 243));
        jLabel8.setText("Encrypted Message");

        originalMessageBox2.setPreferredSize(new java.awt.Dimension(268, 174));

        encryptedMessageTextArea2.setColumns(20);
        encryptedMessageTextArea2.setRows(5);
        originalMessageBox2.setViewportView(encryptedMessageTextArea2);

        clearBtnOG2.setText("clear");
        clearBtnOG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnOG2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(33, 150, 243));
        jLabel9.setText("Original Message");

        encryptedMessageBox1.setPreferredSize(new java.awt.Dimension(268, 174));

        originalMessageTextArea2.setColumns(20);
        originalMessageTextArea2.setRows(5);
        encryptedMessageBox1.setViewportView(originalMessageTextArea2);

        pasteBtnEMssg2.setText("paste");
        pasteBtnEMssg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBtnEMssg2ActionPerformed(evt);
            }
        });

        copyBtnEMssg1.setText("copy");
        copyBtnEMssg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnEMssg1ActionPerformed(evt);
            }
        });

        originalMessageErrorLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        originalMessageErrorLabel1.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originalMessageErrorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(pasteBtnEMssg2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtnOG2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(copyBtnEMssg1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(originalMessageBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(encryptedMessageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 122, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(copyBtnEMssg1)
                        .addComponent(pasteBtnEMssg2)
                        .addComponent(clearBtnOG2)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(originalMessageErrorLabel1))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 74, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(originalMessageBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(encryptedMessageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 22, Short.MAX_VALUE)))
        );

        decryptionPanel.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(249, 249, 249));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 150, 243));
        jLabel10.setText("Decryption Key");

        pasteBtnEKey1.setText("paste");
        pasteBtnEKey1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBtnEKey1ActionPerformed(evt);
            }
        });

        decryptionBtn.setBackground(new java.awt.Color(51, 51, 51));
        decryptionBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        decryptionBtn.setForeground(new java.awt.Color(255, 255, 255));
        decryptionBtn.setText("Decrypt It");
        decryptionBtn.setBorder(null);
        decryptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionBtnActionPerformed(evt);
            }
        });

        encryptionKeyErrorLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        encryptionKeyErrorLabel1.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(encryptionKeyErrorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(DecryptionKeyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decryptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pasteBtnEKey1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pasteBtnEKey1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DecryptionKeyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decryptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptionKeyErrorLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        decryptionPanel.add(jPanel5, java.awt.BorderLayout.CENTER);

        content.add(decryptionPanel, "card3");

        encryptionPanel.setBackground(new java.awt.Color(0, 102, 204));
        encryptionPanel.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(249, 249, 249));
        jPanel6.setPreferredSize(new java.awt.Dimension(730, 270));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 150, 243));
        jLabel5.setText("Original Message");

        originalMessageBox1.setPreferredSize(new java.awt.Dimension(268, 174));

        originalMessageTextArea.setColumns(20);
        originalMessageTextArea.setRows(5);
        originalMessageBox1.setViewportView(originalMessageTextArea);

        clearBtnOG1.setText("clear");
        clearBtnOG1.setToolTipText("Clear original message");
        clearBtnOG1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtnOG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnOG1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 150, 243));
        jLabel6.setText("Encrypted Message");

        encryptedMessageBox.setPreferredSize(new java.awt.Dimension(268, 174));

        encryptedMessageTextArea.setColumns(20);
        encryptedMessageTextArea.setRows(5);
        encryptedMessageBox.setViewportView(encryptedMessageTextArea);

        pasteBtnOGMssg1.setText("paste");
        pasteBtnOGMssg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasteBtnOGMssg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBtnOGMssg1ActionPerformed(evt);
            }
        });

        copyBtnEMssg.setText("copy");
        copyBtnEMssg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyBtnEMssg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnEMssgActionPerformed(evt);
            }
        });

        originalMessageErrorLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        originalMessageErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pasteBtnOGMssg1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtnOG1))
                    .addComponent(originalMessageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originalMessageErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(encryptedMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyBtnEMssg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(copyBtnEMssg)
                            .addComponent(jLabel5)
                            .addComponent(pasteBtnOGMssg1)
                            .addComponent(clearBtnOG1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(originalMessageBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(encryptedMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(originalMessageErrorLabel))
        );

        encryptionPanel.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(249, 249, 249));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 150, 243));
        jLabel7.setText("Encryption Key");

        pasteBtnEKey.setText("paste");
        pasteBtnEKey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasteBtnEKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBtnEKeyActionPerformed(evt);
            }
        });

        copyBtnEKey.setText("copy");
        copyBtnEKey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyBtnEKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnEKeyActionPerformed(evt);
            }
        });

        createKey.setBackground(new java.awt.Color(33, 150, 243));
        createKey.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        createKey.setForeground(new java.awt.Color(255, 255, 255));
        createKey.setText("Create Key");
        createKey.setBorder(null);
        createKey.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createKeyActionPerformed(evt);
            }
        });

        encryptBtn.setBackground(new java.awt.Color(51, 51, 51));
        encryptBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        encryptBtn.setForeground(new java.awt.Color(255, 255, 255));
        encryptBtn.setText("Encrypt It");
        encryptBtn.setBorder(null);
        encryptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptBtnActionPerformed(evt);
            }
        });

        encryptionKeyErrorLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        encryptionKeyErrorLabel.setForeground(new java.awt.Color(255, 0, 51));

        usernameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextfieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(33, 150, 243));
        jLabel14.setText("File Name");

        saveBtn.setBackground(new java.awt.Color(51, 51, 51));
        saveBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.setBorder(null);
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        fileSaveErrorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fileSaveErrorLabel.setForeground(new java.awt.Color(255, 51, 51));

        browseFileBtn.setBackground(new java.awt.Color(0, 153, 255));
        browseFileBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        browseFileBtn.setForeground(new java.awt.Color(255, 255, 255));
        browseFileBtn.setText("Browse");
        browseFileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseFileBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encryptionKeyErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(encryptionKeyBox)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(pasteBtnEKey, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(copyBtnEKey, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(createKey, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(encryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(fileSaveErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pasteBtnEKey)
                        .addComponent(copyBtnEKey))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptionKeyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createKey, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(encryptionKeyErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseFileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileSaveErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        encryptionPanel.add(jPanel4, java.awt.BorderLayout.CENTER);

        content.add(encryptionPanel, "card2");

        shareFilePanel.setBackground(new java.awt.Color(249, 249, 249));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 255));
        jLabel18.setText("Recipient Email:");

        recipientEmailField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 255));
        jLabel19.setText("Message:");

        emailMessage.setColumns(20);
        emailMessage.setRows(5);
        emailMessageBox.setViewportView(emailMessage);

        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 255));
        jLabel20.setText("Choose a file");

        fileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileFieldActionPerformed(evt);
            }
        });

        browseFile.setBackground(new java.awt.Color(51, 51, 51));
        browseFile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        browseFile.setForeground(new java.awt.Color(255, 255, 255));
        browseFile.setText("Browse");
        browseFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseFileMouseClicked(evt);
            }
        });

        sendEmailBtn.setBackground(new java.awt.Color(0, 153, 255));
        sendEmailBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        sendEmailBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendEmailBtn.setText("Send");
        sendEmailBtn.setMaximumSize(new java.awt.Dimension(79, 27));
        sendEmailBtn.setMinimumSize(new java.awt.Dimension(79, 27));
        sendEmailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendEmailBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout shareFilePanelLayout = new javax.swing.GroupLayout(shareFilePanel);
        shareFilePanel.setLayout(shareFilePanelLayout);
        shareFilePanelLayout.setHorizontalGroup(
            shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shareFilePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(shareFilePanelLayout.createSequentialGroup()
                        .addGroup(shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fileField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, shareFilePanelLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recipientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailMessageBox, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sendEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        shareFilePanelLayout.setVerticalGroup(
            shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shareFilePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(recipientEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailErrorLabel))
                .addGap(35, 35, 35)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(shareFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(sendEmailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        content.add(shareFilePanel, "card4");

        rightPanel.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(rightPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptionMenuTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encryptionMenuTabMouseClicked
        encryptionMenuTab.setBackground(new Color(245, 245, 245));
        decryptionMenuTab.setBackground(Color.WHITE);
        shareFileTab.setBackground(Color.WHITE);
        shareFilePanel.setVisible(false);
        decryptionPanel.setVisible(false);
        encryptionPanel.setVisible(true);
    }//GEN-LAST:event_encryptionMenuTabMouseClicked

    private void decryptionMenuTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decryptionMenuTabMouseClicked
        encryptionMenuTab.setBackground(Color.WHITE);
        decryptionMenuTab.setBackground(new Color(245, 245, 245));
        shareFileTab.setBackground(Color.WHITE);
        shareFilePanel.setVisible(false);
        decryptionPanel.setVisible(true);
        encryptionPanel.setVisible(false);
    }//GEN-LAST:event_decryptionMenuTabMouseClicked

    private void clearBtnOG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnOG1ActionPerformed
        originalMessageTextArea.setText("");
    }//GEN-LAST:event_clearBtnOG1ActionPerformed

    private void pasteBtnOGMssg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBtnOGMssg1ActionPerformed
        pasteContent();
        originalMessageTextArea.setText(copiedText);
    }//GEN-LAST:event_pasteBtnOGMssg1ActionPerformed

    private void copyBtnEMssgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnEMssgActionPerformed
        copiedText = encryptedMessageTextArea.getText();
        copyToClipBoard(copiedText);
    }//GEN-LAST:event_copyBtnEMssgActionPerformed

    private void pasteBtnEKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBtnEKeyActionPerformed
        // TODO add your handling code here:
        encryptionKeyBox.setText(copiedText);
    }//GEN-LAST:event_pasteBtnEKeyActionPerformed

    private void copyBtnEKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnEKeyActionPerformed

        copiedText = encryptionKeyBox.getText();
        copyToClipBoard(copiedText);
    }//GEN-LAST:event_copyBtnEKeyActionPerformed

    private void createKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createKeyActionPerformed
        // TODO add your handling code here:
        try {
            secretKey = AESUtility.generateKey();
            System.out.println("Generated Secret Key: " + secretKey);
            encryptionKeyBox.setText(secretKey);
        } catch (Exception e) {
            encryptionKeyErrorLabel.setText("Error in generating the secret key: " + e.getMessage());
        }
    }//GEN-LAST:event_createKeyActionPerformed

    private void encryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptBtnActionPerformed

        if (originalMessageTextArea.getText().equals("")) {
            originalMessageErrorLabel.setText("This field cannot be empty!");
            encryptionKeyErrorLabel.setText("");
        } else if (encryptionKeyBox.getText().equals("")) {
            originalMessageErrorLabel.setText("");
            encryptionKeyErrorLabel.setText("This field cannot be empty!");
        } else {
            originalMessageErrorLabel.setText("");
            encryptionKeyErrorLabel.setText("");
            String plainText = originalMessageTextArea.getText();
            try {
                encryptedMessage = AESUtility.encryptMessage(plainText, secretKey);
                encryptedMessageTextArea.setText("");
                encryptedMessageTextArea.setText(encryptedMessage);
                JOptionPane.showMessageDialog(this, "Message Encrypted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                encryptionKeyErrorLabel.setText("Error in encryption: " + e.getMessage());  // need to change
            }
        }
    }//GEN-LAST:event_encryptBtnActionPerformed

    private void clearBtnOG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnOG2ActionPerformed
        // TODO add your handling code here:
        encryptedMessageTextArea2.setText("");
    }//GEN-LAST:event_clearBtnOG2ActionPerformed

    private void pasteBtnEMssg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBtnEMssg2ActionPerformed
        pasteContent();
        encryptedMessageTextArea2.setText(copiedText);
    }//GEN-LAST:event_pasteBtnEMssg2ActionPerformed

    private void copyBtnEMssg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnEMssg1ActionPerformed
        copiedText = originalMessageTextArea2.getText();
        copyToClipBoard(copiedText);
    }//GEN-LAST:event_copyBtnEMssg1ActionPerformed

    private void pasteBtnEKey1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBtnEKey1ActionPerformed
        pasteContent();
        DecryptionKeyBox.setText(copiedText);
    }//GEN-LAST:event_pasteBtnEKey1ActionPerformed

    private void decryptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionBtnActionPerformed
        // TODO add your handling code here:
        String cipherText = encryptedMessageTextArea2.getText();
        String sKey = DecryptionKeyBox.getText();
        try {
            decryptedMessage = AESUtility.decryptMessage(cipherText, sKey);
            originalMessageTextArea2.setText("");
            originalMessageTextArea2.setText(decryptedMessage);
            JOptionPane.showMessageDialog(this, "Message Decrypted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            encryptionKeyErrorLabel.setText("Error in encryption: " + e.getMessage());
        }
    }//GEN-LAST:event_decryptionBtnActionPerformed

    private void encryptionMenuTab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encryptionMenuTab1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_encryptionMenuTab1MouseClicked

    private void usernameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameTextfieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String fileName = usernameTextfield.getText();
        if (fileName.equals("")) {
            fileSaveErrorLabel.setForeground(Color.red);
            fileSaveErrorLabel.setText("Name Field cannot be empty!");
        } else {
            fileSaveErrorLabel.setText("");
            String content = encryptedMessageTextArea.getText();
            saveEncryptedMessage(fileName, content);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void shareFileTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shareFileTabMouseClicked
        // TODO add your handling code here:
        encryptionMenuTab.setBackground(Color.WHITE);
        shareFileTab.setBackground(new Color(245, 245, 245));
        decryptionMenuTab.setBackground(Color.WHITE);
        shareFilePanel.setVisible(true);
        decryptionPanel.setVisible(false);
        encryptionPanel.setVisible(false);
    }//GEN-LAST:event_shareFileTabMouseClicked

    private void browseFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseFileMouseClicked
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(fc);
        File file = fc.getSelectedFile();
        String filePath = file.getAbsolutePath();
        fileField.setText(filePath);
    }//GEN-LAST:event_browseFileMouseClicked

    private void sendEmailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendEmailBtnMouseClicked
        // TODO add your handling code here:
        if(recipientEmailField.getText().equals("")){
            emailErrorLabel.setText("Recipient Email Cannot be empty");
        }else{
            emailErrorLabel.setText("");
            sendFileToRecipient();
        }
    }//GEN-LAST:event_sendEmailBtnMouseClicked

    private void fileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileFieldActionPerformed

    private void browseFileBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseFileBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser fc1 = new JFileChooser();
        fc1.showOpenDialog(fc1);
        File file = fc1.getSelectedFile();
        String filePath = file.getAbsolutePath();
        int indexStart = filePath.lastIndexOf('\\');
        int indexEnd = filePath.lastIndexOf('.');
        String fileName = filePath.substring(indexStart+1, indexEnd);
        usernameTextfield.setText(fileName);
    }//GEN-LAST:event_browseFileBtnMouseClicked

    
    // send email
    private void sendFileToRecipient(){
        final String senderEmail = "amrik.bhadra@gmail.com";
        final String senderPassword = "uptpqdmtmhsjnaei";
        final String subject = "Sharing Encrypted Message File";
        final String reciverEmail = recipientEmailField.getText();
        final String text = emailMessage.getText();

        Properties props = new Properties();

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword); // Replace with your email and password
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            
            // set reciver email
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciverEmail));
            
            // set subject
            message.setSubject(subject);
            
            // get the file path
            String path = fileField.getText();
            System.out.println(path);
            
            // creating object of multipart
            MimeMultipart mimeMultipart = new MimeMultipart();

            // creating object for text and file body for the multipart
            MimeBodyPart textMime = new MimeBodyPart();
            MimeBodyPart fileMime = new MimeBodyPart();

            // set the message
            textMime.setText(text);
            
//            create file object
            File file = new File(path);
            
            // attach the file
            
            
            fileMime.attachFile(file);
            mimeMultipart.addBodyPart(textMime);
            mimeMultipart.addBodyPart(fileMime);

            message.setContent(mimeMultipart);
            Transport.send(message);
            System.out.println("Sent successfully!");

            JOptionPane.showMessageDialog(this, "File Sent successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            fileField.setText("");
            recipientEmailField.setText("");
            emailMessage.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
     // function to copy content to clip board
    private void copyToClipBoard(String text) {
        if (text != null && !text.isEmpty()) {
            // Copy the text to the system clipboard
            StringSelection stringSelection = new StringSelection(text);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            // Optional: Show a confirmation message
            JOptionPane.showMessageDialog(this, "Text copied to clipboard!", "Copy", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Optional: Show a warning if no text is available
            JOptionPane.showMessageDialog(this, "No text to copy!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    // function to obtain content from clipboard
    private void pasteContent() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        try {
            String clipBoardText = (String) clipboard.getData(DataFlavor.stringFlavor);
            if (clipBoardText != null) {
                copiedText = clipBoardText;
            } else {
                JOptionPane.showMessageDialog(this, "Clipboard has no text!", "Paste", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to paste from clipboard.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setGreetings() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isBefore(LocalTime.NOON)) {
            welcomeText.setText("Welcome, Good Morning");
        } else if (currentTime.isBefore(LocalTime.of(17, 0))) { // Before 5 PM
            welcomeText.setText("Welcome, Good Afternoon");
        } else {
            welcomeText.setText("Welcome, Good Evening");
        }
    }

    private void setStyle() {
        encryptedMessageTextArea.setMargin(new Insets(3, 3, 3, 3));
        encryptedMessageTextArea2.setMargin(new Insets(3, 3, 3, 3));
        originalMessageTextArea.setMargin(new Insets(3, 3, 3, 3));
        originalMessageTextArea2.setMargin(new Insets(3, 3, 3, 3));
        DecryptionKeyBox.setMargin(new Insets(0, 3, 0, 3));
        encryptionKeyBox.setMargin(new Insets(0, 3, 0, 3));
    }

    private void initialSetup() {
        encryptionMenuTab.setBackground(new Color(245, 245, 245));
        encryptionPanel.setVisible(true);
        decryptionPanel.setVisible(false);
    }
//    

    // function to save the encrypted message into the file
    private void saveEncryptedMessage(String fileName, String content) {
        try {
            // Get the current date and time
            LocalDateTime cdt = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = cdt.format(format);

            // Create or open the log file in append mode
            File fobj = new File("C:\\Users\\amkbh\\OneDrive\\Documents\\Super 30\\Java Swing Projects\\SecureMessageWriter_vf\\src\\resources\\saved files\\" + fileName + ".txt");
            FileWriter fout = new FileWriter(fobj, true);  // 'true' to enable appending

            fout.write(formattedDateTime + " - " + content + System.lineSeparator());  // Append new log with timestamp

            fout.close();
            JOptionPane.showMessageDialog(this, "Messaged Saved in file", "File Saved", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Log successfully written...");
        } catch (Exception e) {
            fileSaveErrorLabel.setForeground(Color.red);
            fileSaveErrorLabel.setText(e.getLocalizedMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppMainFrame frame = new AppMainFrame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setGreetings();
                frame.initialSetup();
                frame.setStyle();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DecryptionKeyBox;
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton browseFile;
    private javax.swing.JButton browseFileBtn;
    private javax.swing.JButton clearBtnOG1;
    private javax.swing.JButton clearBtnOG2;
    private javax.swing.JPanel content;
    private javax.swing.JButton copyBtnEKey;
    private javax.swing.JButton copyBtnEMssg;
    private javax.swing.JButton copyBtnEMssg1;
    private javax.swing.JPanel copyrightPanel;
    private javax.swing.JButton createKey;
    private javax.swing.JButton decryptionBtn;
    private javax.swing.JPanel decryptionMenuTab;
    private javax.swing.JPanel decryptionPanel;
    private javax.swing.JPanel decryptionTabPanel;
    private javax.swing.JLabel decryptionTabText;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JTextArea emailMessage;
    private javax.swing.JScrollPane emailMessageBox;
    private javax.swing.JButton encryptBtn;
    private javax.swing.JScrollPane encryptedMessageBox;
    private javax.swing.JScrollPane encryptedMessageBox1;
    private javax.swing.JTextArea encryptedMessageTextArea;
    private javax.swing.JTextArea encryptedMessageTextArea2;
    private javax.swing.JTextField encryptionKeyBox;
    private javax.swing.JLabel encryptionKeyErrorLabel;
    private javax.swing.JLabel encryptionKeyErrorLabel1;
    private javax.swing.JPanel encryptionMenuTab;
    private javax.swing.JPanel encryptionMenuTab1;
    private javax.swing.JPanel encryptionPanel;
    private javax.swing.JPanel encryptionTabPanel;
    private javax.swing.JPanel encryptionTabPanel1;
    private javax.swing.JLabel encryptionTabText;
    private javax.swing.JTextField fileField;
    private javax.swing.JLabel fileSaveErrorLabel;
    private javax.swing.JPanel generalContainer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane originalMessageBox1;
    private javax.swing.JScrollPane originalMessageBox2;
    private javax.swing.JLabel originalMessageErrorLabel;
    private javax.swing.JLabel originalMessageErrorLabel1;
    private javax.swing.JTextArea originalMessageTextArea;
    private javax.swing.JTextArea originalMessageTextArea2;
    private javax.swing.JButton pasteBtnEKey;
    private javax.swing.JButton pasteBtnEKey1;
    private javax.swing.JButton pasteBtnEMssg2;
    private javax.swing.JButton pasteBtnOGMssg1;
    private javax.swing.JTextField recipientEmailField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton sendEmailBtn;
    private javax.swing.JPanel shareFilePanel;
    private javax.swing.JLabel shareFileTab;
    private javax.swing.JPanel sidenavbar;
    private javax.swing.JPanel supportContainer;
    private javax.swing.JTextField usernameTextfield;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
