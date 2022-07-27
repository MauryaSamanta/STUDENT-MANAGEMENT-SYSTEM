/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.attendnace;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MASTER
 */
public class MARKATTEND extends javax.swing.JFrame {

    /**
     * Creates new form MARKATTEND
     */
    public MARKATTEND() {
        initComponents();
        //jButton4.setVisible(false);
        jButton1.setEnabled(false);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //show_user();
    }

    public ArrayList<User> userList() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            String url = "jdbc:ucanaccess://c:\\JDK1\\sAttend.accdb";
            Connection cn = DriverManager.getConnection(url);
            Statement stmt = cn.createStatement();
            PreparedStatement ac;
            String query = "SELECT NameStud FROM Table1";
            ResultSet rs = stmt.executeQuery(query);

            User user;
            while (rs.next()) {
                user = new User(rs.getString("NameStud"));
                usersList.add(user);

            }

        } catch (Exception e) {

        }

        return usersList;
    }

    public void show_user() {
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sf.format(jDateChooser1.getDate());
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getName();
            row[1] = date;
            model.addRow(row);

        }

    }

    public void erase_user() {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rows = jTable1.getRowCount();
        model.setRowCount(0);

    //model.addRow(row);
    }

    public boolean checkDate(String d) {
        int c = 0;
        d.replaceAll("\\s+", "");
        if (d.length() > 8) {
            return false;
        }
        for (int i = 0; i < d.length(); i++) {
            char y = d.charAt(i);
            boolean f = Character.isDigit(y);
            if (f == true) {

            }

        }
        return true;

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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1224, 774));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/attendnace/Actions-document-save-icon.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setToolTipText("");
        jButton1.setPreferredSize(new java.awt.Dimension(95, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER DATE OF CLASS");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/attendnace/save-as-icon.png"))); // NOI18N
        jButton2.setText("LOAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/attendnace/Files-New-File-icon.png"))); // NOI18N
        jButton3.setText("NEW ENTRY");
        jButton3.setPreferredSize(new java.awt.Dimension(95, 41));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOME");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HELP");
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setToolTipText("CLOSE WINDOW");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("_");
        jLabel10.setToolTipText("MINIMIZE WINDOW");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(893, 893, 893)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>STUDENT ATTENDANCE<br><br><br>MANAGEMENT SYSTEM</html> ");

        jLabel8.setBackground(new java.awt.Color(0, 153, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/attendnace/Button-Close-icon (1).png"))); // NOI18N
        jLabel8.setText("EXIT");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 153, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/attendnace/Log-Out-icon.png"))); // NOI18N
        jLabel9.setText("LOG OUT");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("THEORY ATTENDANCE MARKING");

        jLabel6.setText("TEACHER'S NAME:");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("*");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Teacher's Name", "CP GH0SH", "DC ROY", "N GHOSH", "R SAMANTA", "S BERA", "TEACHER I", "TEACHER II", "TEACHER III", "TEACHER IV" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(125, 125, 125)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(130, 130, 130)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)
                                    .addGap(14, 14, 14))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1213, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Button1.addActionListener(new ActionListener(){
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
String x = String.valueOf(jComboBox1.getSelectedItem());
        if (check(jTable1) == true) {

            int s[] = new int[jTable1.getRowCount()];
            try {

                int rows = jTable1.getRowCount();
                System.out.println(rows);
                String url = "jdbc:ucanaccess://c:\\JDK1\\sAttend.accdb";
                Connection cn = DriverManager.getConnection(url);
                for (int i = 0; i < rows; i++) {
                    String qty = (String) jTable1.getValueAt(i, 0);
                    String unitprice = (String) jTable1.getValueAt(i, 1);
                    String description = (String) jTable1.getValueAt(i, 2);

                    int d = Integer.parseInt(description);
                    s[i] = d;//System.out.println(i);
                    // Double total = (Double)jTable1.getValueAt(row, 3);
                    String queryco = "Insert into Table2(rollSTUD,DATEclass,STATUS) values ('" + qty + "','" + unitprice + "','" + d + "')";

                    PreparedStatement pst = cn.prepareStatement(queryco);
                    pst.execute();
                }

            } catch (Exception e) {

            }
            Object[] rowData = new Object[jTable1.getRowCount()];
            int n = 0;
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                rowData[i] = jTable1.getValueAt(i, 0);
   //System.out.println(rowData[i]);

                try {
                    String url = "jdbc:ucanaccess://c:\\JDK1\\sAttend.accdb";
                    Connection cn = DriverManager.getConnection(url);
                    Statement stmt = cn.createStatement();
                    String ab1 = "SELECT Noclass FROM Table1 WHERE NameStud='" + rowData[i] + "'";
                    ResultSet rs1 = stmt.executeQuery(ab1);
                    while (rs1.next()) {
                        if (s[i] == 2) {
                            n = rs1.getInt("Noclass");
                        } else {
                            n = rs1.getInt("Noclass");
                            n++;
                        }

         //System.out.println(n);
                    }

                } catch (Exception e) {
                }
                try {
                    String url = "jdbc:ucanaccess://c:\\JDK1\\sAttend.accdb";
                    Connection cn = DriverManager.getConnection(url);
                    Statement stmt = cn.createStatement();

                    PreparedStatement ac;
                    String ab = "select Noclass from Table1 where NameStud='" + rowData[i] + "'";

                    ResultSet rs = stmt.executeQuery(ab);
                    while (rs.next()) {
                        ac = cn.prepareStatement("UPDATE Table1 SET Noclass='" + n + "' WHERE NameStud='" + (String) jTable1.getValueAt(i, 0) + "'   ");
                        ac.executeUpdate();
           //ac=cn.prepareStatement("ALTER TABLE Table1 ADD COLUMN Presence VARCHAR(50)");
                        //ac.executeUpdate();
                        //ac=cn.prepareStatement("update Table1 set MSV20192='"+lname+"'");
                        //ac.executeUpdate();
                        // JOptionPane.showMessageDialog(null,"ISSUED");

                    }

                } catch (Exception e) {
                }
                int g = 0;

                try {
                    String url = "jdbc:ucanaccess://c:\\JDK1\\sAttend.accdb";
                    Connection cn = DriverManager.getConnection(url);
                    Statement stmt = cn.createStatement();
                    String ab1 = "SELECT Noclass FROM Table1 WHERE NameStud='" + rowData[i] + "'";
                    ResultSet rs1 = stmt.executeQuery(ab1);
                    while (rs1.next()) {
                        n = rs1.getInt("Noclass");

         //System.out.println(n);
                    }
                    String ab = "SELECT STATUS FROM Table2 WHERE rollSTUD='" + rowData[i] + "'";
                    ResultSet rs = stmt.executeQuery(ab);
                    while (rs.next()) {
                        int p = rs.getInt("STATUS");
                        if (p == 2) {
                            continue;
                        } else {
                            g = g + p;
                        }

                    }

                    PreparedStatement ac;
                    // System.out.println(g);
                    System.out.println("g=" + g);
                    System.out.println("n=" + n);
                    double per = Math.ceil(((double) g / (double) n) * 100.0);
                    System.out.println("per=" + per);
                    ab = "select Attper from Table1 where NameStud='" + rowData[i] + "'";
                    rs = stmt.executeQuery(ab);
                    while (rs.next()) {
                        ac = cn.prepareStatement("UPDATE Table1 SET Attper='" + per + "' WHERE NameStud='" + (String) jTable1.getValueAt(i, 0) + "'   ");
                        ac.executeUpdate();
           //ac=cn.prepareStatement("ALTER TABLE Table1 ADD COLUMN Presence VARCHAR(50)");
                        //ac.executeUpdate();
                        //ac=cn.prepareStatement("update Table1 set MSV20192='"+lname+"'");
                        //ac.executeUpdate();
                        // JOptionPane.showMessageDialog(null,"ISSUED");

                    }
                    g = 0;
        // hao++;
                    //sp.jProgressBar1.setValue(hao);

                } catch (Exception e) {
                }
            }
            //jButton4.setVisible(false);
//sp.setVisible(false);
            JOptionPane.showMessageDialog(null, "ATTENDNACE SAVED");
        }
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sf.format(jDateChooser1.getDate());
        String N = String.valueOf(jComboBox1.getSelectedItem());
        try {
            String urlac = "jdbc:ucanaccess://c:\\JDK1\\sAttend.accdb";
            Connection cnac = DriverManager.getConnection(urlac);
            Statement stmtac = cnac.createStatement();
            PreparedStatement acac;
            acac = cnac.prepareStatement("insert into Table3(TEACHER,DATE) values(?,?)");
            acac.setString(1, N);
            acac.setString(2, date);
       //  acac.setString(3,null);
            //acac.setString(4,null);
            acac.execute();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        show_user();
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        erase_user();
        jButton2.setEnabled(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        HOME ob = new HOME();

        ob.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        HELP ob = new HELP();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Login ob = new Login();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        // dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        Color customColor = new Color(02, 153, 255);
        jLabel9.setBackground(customColor);
        Border blackline = BorderFactory.createLineBorder(Color.blue, 4);
        jLabel9.setBorder(blackline);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        Color customColor = new Color(0, 153, 204);
        jLabel9.setBackground(customColor);
        jLabel9.setBorder(null);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        Color customColor = new Color(02, 153, 255);
        jLabel8.setBackground(customColor);
        Border blackline = BorderFactory.createLineBorder(Color.blue, 4);
        jLabel8.setBorder(blackline);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        Color customColor = new Color(0, 153, 204);
        jLabel8.setBackground(customColor);
        jLabel8.setBorder(null);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked
    public boolean check(JTable j) {
        boolean k = true;
        Object[] rowData = new Object[j.getRowCount()];
        Object[] df = new Object[j.getRowCount()];
        for (int i = 0; i < j.getRowCount(); i++) {
            rowData[i] = j.getValueAt(i, 2);
            df[i] = j.getValueAt(i, 0);
            if (Integer.parseInt((String) rowData[i]) >= 3 || Integer.parseInt((String) rowData[i]) <= -1) {
                JOptionPane.showMessageDialog(null, "THERE IS INVALID STATUS INPUT IN ROLL NUMBER=" + df[i]);
                k = false;
                return k;
            }
        }

        return k;
    }

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
            java.util.logging.Logger.getLogger(MARKATTEND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MARKATTEND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MARKATTEND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MARKATTEND.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MARKATTEND().setVisible(true);
                //MARKATTEND ob=new MARKATTEND();
                //ob. jLabel6.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
