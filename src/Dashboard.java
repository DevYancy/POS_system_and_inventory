

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
public class Dashboard extends javax.swing.JFrame {
    
     String driver="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/inventorysystem";
    static final String USER="root";
     static final String PASS="pass1234";
     
    
  int q=0;
  Boolean bol=false;

    public Dashboard() {
        initComponents();
    }
    
   
            

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTextField3 = new org.jdesktop.swingx.JXTextField();
        jXTextField7 = new org.jdesktop.swingx.JXTextField();
        jLabel11 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Parent = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        items1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        eitems1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        eitems2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ots = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jXTextField11 = new org.jdesktop.swingx.JXTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        transaction = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jXTextField8 = new org.jdesktop.swingx.JXTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        Cashier = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Purchase = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jXTextField4 = new org.jdesktop.swingx.JXTextField();
        jXTextField5 = new org.jdesktop.swingx.JXTextField();
        jXTextField6 = new org.jdesktop.swingx.JXTextField();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jXTextField9 = new org.jdesktop.swingx.JXTextField();
        jLabel13 = new javax.swing.JLabel();
        jXTextField10 = new org.jdesktop.swingx.JXTextField();
        jLabel20 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        income = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jXTextField12 = new org.jdesktop.swingx.JXTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        Items = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jXTextField1 = new org.jdesktop.swingx.JXTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        EItems = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jXTextField2 = new org.jdesktop.swingx.JXTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        insert_cashier = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cashname = new org.jdesktop.swingx.JXTextField();
        jButton10 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cashaddress = new org.jdesktop.swingx.JXTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        Income = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        jXTextField3.setText("jXTextField3");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Name of Item");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(150, 30));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("DashBoard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Items");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Expired Items");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Purchased");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Cashier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        items1.setBackground(new java.awt.Color(255, 255, 255));
        items1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        items1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                items1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ITEMS");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setText("0");
        jLabel15.setAlignmentX(2.0F);
        jLabel15.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel15AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout items1Layout = new javax.swing.GroupLayout(items1);
        items1.setLayout(items1Layout);
        items1Layout.setHorizontalGroup(
            items1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(items1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, items1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        items1Layout.setVerticalGroup(
            items1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(items1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        eitems1.setBackground(new java.awt.Color(255, 255, 255));
        eitems1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        eitems1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eitems1MouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setText("0");
        jLabel18.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel18AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("EXPIRED ITEMS");

        javax.swing.GroupLayout eitems1Layout = new javax.swing.GroupLayout(eitems1);
        eitems1.setLayout(eitems1Layout);
        eitems1Layout.setHorizontalGroup(
            eitems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eitems1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eitems1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        eitems1Layout.setVerticalGroup(
            eitems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eitems1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        eitems2.setBackground(new java.awt.Color(255, 255, 255));
        eitems2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        eitems2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eitems2MouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setText("0");
        jLabel23.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel23AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("TRANSACTION");

        javax.swing.GroupLayout eitems2Layout = new javax.swing.GroupLayout(eitems2);
        eitems2.setLayout(eitems2Layout);
        eitems2Layout.setHorizontalGroup(
            eitems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eitems2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eitems2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        eitems2Layout.setVerticalGroup(
            eitems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eitems2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(items1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(eitems1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(eitems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eitems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eitems1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(items1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        Parent.add(dashboard, "card4");

        jTable5.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item's Name"
            }
        ));
        jTable5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Out of Stock");

        jXTextField11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jXTextField11CaretUpdate(evt);
            }
        });
        jXTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXTextField11ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Search");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jButton11.setText("Print");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout otsLayout = new javax.swing.GroupLayout(ots);
        ots.setLayout(otsLayout);
        otsLayout.setHorizontalGroup(
            otsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(otsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(otsLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(409, 409, 409)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jLabel30)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        otsLayout.setVerticalGroup(
            otsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otsLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(otsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jXTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(jButton11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Parent.add(ots, "card10");

        jTable4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Cashier Name", "Quantity", "Item Name", "Amount"
            }
        ));
        jTable4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Transactions");

        jXTextField8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jXTextField8CaretUpdate(evt);
            }
        });
        jXTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXTextField8ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Search");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jButton14.setText("Print");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transactionLayout = new javax.swing.GroupLayout(transaction);
        transaction.setLayout(transactionLayout);
        transactionLayout.setHorizontalGroup(
            transactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(transactionLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel22))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        transactionLayout.setVerticalGroup(
            transactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(transactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jXTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(jButton14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Parent.add(transaction, "card8");

        jButton8.setBackground(new java.awt.Color(0, 204, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("+");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Number", "Name", "Address", "Password"
            }
        ));
        jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Cashier's");

        javax.swing.GroupLayout CashierLayout = new javax.swing.GroupLayout(Cashier);
        Cashier.setLayout(CashierLayout);
        CashierLayout.setHorizontalGroup(
            CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CashierLayout.setVerticalGroup(
            CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashierLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashierLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashierLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Parent.add(Cashier, "card6");

        Purchase.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PurchaseAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jXTextField4.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jXTextField4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jXTextField4CaretUpdate(evt);
            }
        });

        jXTextField5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jXTextField6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jXTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jXTextField6KeyPressed(evt);
            }
        });

        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Code Number");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Name of Item");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Quantity");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Expiration Date");

        jXTextField9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Sales Price");

        jXTextField10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Purchased Price");

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jRadioButton1.setText("No Expiration Date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, 0, 162, Short.MAX_VALUE)
                                        .addGap(14, 14, 14)
                                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1))
                            .addComponent(jXTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(jXTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PurchaseLayout = new javax.swing.GroupLayout(Purchase);
        Purchase.setLayout(PurchaseLayout);
        PurchaseLayout.setHorizontalGroup(
            PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchaseLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        PurchaseLayout.setVerticalGroup(
            PurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PurchaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent.add(Purchase, "card4");

        jTable6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Cashier Name", "Sales", "Income"
            }
        ));
        jTable6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jXTextField12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jXTextField12CaretUpdate(evt);
            }
        });
        jXTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXTextField12ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Search");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Income");

        jButton16.setText("Print");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout incomeLayout = new javax.swing.GroupLayout(income);
        income.setLayout(incomeLayout);
        incomeLayout.setHorizontalGroup(
            incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(incomeLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16)
                        .addGap(76, 76, 76))
                    .addGroup(incomeLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        incomeLayout.setVerticalGroup(
            incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incomeLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Parent.add(income, "card2");

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Quantiity", "Expiration Date", "Sales Price", "Purchased Price"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Sales Price");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Purchased Price");
        }

        jXTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jXTextField1CaretUpdate(evt);
            }
        });
        jXTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Search");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("List of Items");

        jButton13.setText("Print");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItemsLayout = new javax.swing.GroupLayout(Items);
        Items.setLayout(ItemsLayout);
        ItemsLayout.setHorizontalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGap(76, 76, 76))
                    .addGroup(ItemsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        ItemsLayout.setVerticalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemsLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Parent.add(Items, "card2");

        jTable2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantiity", "Expiration Date", "Sales Price", "Purchased Price"
            }
        ));
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jXTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Search");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Expired Items");

        jButton15.setText("Print");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EItemsLayout = new javax.swing.GroupLayout(EItems);
        EItems.setLayout(EItemsLayout);
        EItemsLayout.setHorizontalGroup(
            EItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EItemsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(EItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EItemsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(76, 76, 76))
                    .addGroup(EItemsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        EItemsLayout.setVerticalGroup(
            EItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EItemsLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(EItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Parent.add(EItems, "card3");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        cashname.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cashname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashnameActionPerformed(evt);
            }
        });

        jButton10.setText("Save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Name");

        cashaddress.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        cashaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashaddressActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Address");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Password");

        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cashaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashname, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(61, 61, 61))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel24)
                .addGap(3, 3, 3)
                .addComponent(cashname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setText("New Cashier");

        javax.swing.GroupLayout insert_cashierLayout = new javax.swing.GroupLayout(insert_cashier);
        insert_cashier.setLayout(insert_cashierLayout);
        insert_cashierLayout.setHorizontalGroup(
            insert_cashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_cashierLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(insert_cashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insert_cashierLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel25)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        insert_cashierLayout.setVerticalGroup(
            insert_cashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_cashierLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        Parent.add(insert_cashier, "card9");

        Income.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setText("Income");

        javax.swing.GroupLayout IncomeLayout = new javax.swing.GroupLayout(Income);
        Income.setLayout(IncomeLayout);
        IncomeLayout.setHorizontalGroup(
            IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        IncomeLayout.setVerticalGroup(
            IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        Parent.add(Income, "card5");

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setText("Transaction");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("Out of Stock");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 153, 0));
        jButton17.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jButton17.setText("Back");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton17)))
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(99, 99, 99)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Parent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Cashier
        Parent.removeAll();
        Parent.add(Cashier);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Dashboard
        Parent.removeAll();
        Parent.add(dashboard);
        Parent.repaint();
        Parent.revalidate();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Items
        Parent.removeAll();
        Parent.add(Items);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Expired Items
        Parent.removeAll();
        Parent.add(EItems);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Purchased
        Parent.removeAll();
        Parent.add(Purchase);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // insert data in database
        String codenum=jXTextField4.getText();
        String name=jXTextField5.getText();
        int year = jYearChooser1.getYear();
        String month=String.valueOf(jComboBox1.getSelectedItem());
       double sale_price=Double.parseDouble(jXTextField9.getText());
       double purchased_price=Double.parseDouble(jXTextField10.getText());
        int quantity=Integer.parseInt(jXTextField6.getText());
      
       int total=q+quantity;
       String yr=String.valueOf(year);
       String both=month+" "+yr;
         
       if(bol.equals(true)){
           if (jRadioButton1.isSelected()){
            
            both="";
        
         Connection conn=null;
         Statement stmt=null;
           
           try{
           
            
          Class.forName(driver);
          conn=DriverManager.getConnection(DB_URL,USER,PASS);
          stmt=conn.createStatement();
            String sql="UPDATE purchased_item set expired_date='"+both+"',sales_price="+sale_price+",purchase_price="+purchased_price+", quantity="+total+" WHERE code_num='"+codenum+"'";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Updated");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
            q=0;
            
             stmt.close();
             conn.close();
       
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
           }
        else{ Connection conn=null;
           Statement stmt=null;
           try{
           
          Class.forName(driver);
          conn=DriverManager.getConnection(DB_URL,USER,PASS);
          stmt=conn.createStatement();
            String sql="UPDATE purchased_item set expired_date='"+both+"',sales_price="+sale_price+",purchase_price="+purchased_price+", quantity="+total+" WHERE code_num='"+codenum+"'";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Updated");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
            q=0;
             stmt.close();
             conn.close();
       
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        }
          
       }
       
       else{
       
        if (jRadioButton1.isSelected()){
            
            both="";
        
        
        Statement stmt=null;
        Connection conn=null;
         try{

            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            
     
            String sql="INSERT INTO purchased_item (code_num,name_item,expired_date,sales_price,purchase_price,quantity) VALUES ('"+codenum+"','"+name+"','"+both+"',"+sale_price+","+purchased_price+","+total+")";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Save");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
            q=0;
       
         }
         
         
         catch(java.sql.SQLException sq){
            sq.printStackTrace();
            }
            catch(Exception ex){
            ex.printStackTrace();
            }
        }
        else{
        Statement stmt=null;
        Connection conn=null;
         try{

            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            
     
            String sql="INSERT INTO purchased_item (code_num,name_item,expired_date,sales_price,purchase_price,quantity) VALUES ('"+codenum+"','"+name+"','"+both+"',"+sale_price+","+purchased_price+","+total+")";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Save");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
           q=0;
           
           
         }
         
         catch(java.sql.SQLException sq){
            sq.printStackTrace();
            }
            catch(Exception ex){
            ex.printStackTrace();
            }
        
        }}
       jXTextField4.grabFocus();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // calling list of items in database
        Connection conn=null;
        Statement stmt=null;
        Connection con=null;
        Statement stm=null;
        try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM purchased_item";
        ResultSet rs=stmt.executeQuery(sql);
        
        DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
        table.setRowCount(0);
        while (rs.next()){
            
       String cn=rs.getString("code_num");
       String ni=rs.getString("name_item");
       String ed=rs.getString("expired_date");
       int sp=rs.getInt("sales_price");
       int pp=rs.getInt("purchase_price");
       int quan=rs.getInt("quantity");
       
        
         if(quan==0){
             Connection co=null;
         Statement st=null;
          try {
                Class.forName(driver);
                co=DriverManager.getConnection(DB_URL,USER,PASS);
                st = co.createStatement();
                
                
                String s="INSERT INTO outofstock (item_name) VALUES ('"+ni+"')";
                st.execute(s);
             
               String sq="DELETE FROM purchased_item WHERE code_num='"+cn+"' ";
                st.execute(sq);
                 
               
          }
           catch(java.sql.SQLException se){
                    se.printStackTrace();
                }
                catch(Exception e){
                }
             
            
         }
         
         int current_year = Calendar.getInstance().get(Calendar.YEAR);
        int month=Calendar.getInstance().get(Calendar.MONTH);
        String year=String.valueOf(current_year);
        String month_word="";
        
        if (month==0){
            month_word="January";
        }
        else if (month==1){
            month_word="February";
        }
        else if (month==2){
            month_word="March";
        }
        else if (month==3){
            month_word="April";
        }
        else if (month==4){
            month_word="May";
        }
        else if (month==5){
            month_word="June";
        }
        else if (month==6){
            month_word="July";
        }
        else if (month==7){
            month_word="August";
        }
        else if (month==8){
            month_word="September";
        }
        else if (month==9){
            month_word="October";
        }
        else if (month==10){
            month_word="November";
        }
        else if (month==11){
            month_word="December";
        }
        String pass=month_word+" "+year;
       
        if (pass.equals(ed)){
                try{

            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            
     
            String sql2="INSERT INTO expired (code_num,name_item,expired_date,sales_price,purchase_price,quantity) VALUES ('"+cn+"','"+ni+"','"+ed+"',"
                    + ""+sp+","+pp+","+quan+")";
            stmt.execute(sql2);
           
       
       
         }
         
         
         catch(java.sql.SQLException sq){
            sq.printStackTrace();
            }
            catch(Exception ex){
            ex.printStackTrace();
            }
        }
        
       
        try{
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        
            String sql1="DELETE FROM purchased_item WHERE expired_date='"+pass+"' ";
            stmt.execute(sql1);
            
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }        
      
     
         
          
        table.addRow(new Object[] {cn,ni,quan,ed,sp,pp});
         }
         jTable1.setRowSelectionInterval(0,0);
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jXTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jXTextField1CaretUpdate
        // This search code
        String search = jXTextField1.getText();
         Connection conn=null;
        Statement stmt=null;
        
     
        try{
           
            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
           
                String que="SELECT * FROM purchased_item WHERE code_num='"+search+"' OR name_item='"+search+"'";
                ResultSet rs=stmt.executeQuery(que);
                
                
                 DefaultTableModel tables=(DefaultTableModel) jTable1.getModel();
                  tables.setRowCount(0);
                while(rs.next()){
                        
         String cn=rs.getString("code_num");
        String ni=rs.getString("name_item");
        String ed=rs.getString("expired_date");
        int  sp=rs.getInt("sales_price");
        int pp=rs.getInt("purchase_price");
          int quan=rs.getInt("quantity");
        
       
        tables.addRow(new Object[] {cn,ni,ed,sp,pp,quan});
     
                       
                 
                }
                conn.close();
                stmt.close();
                rs.close();
               
         
        
         
        }
        catch(java.sql.SQLException s){
            s.printStackTrace();
        
        }
        catch(Exception e){
            e.printStackTrace();
        
        }
    }//GEN-LAST:event_jXTextField1CaretUpdate

    private void jLabel15AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel15AncestorAdded
        // calling for numbers of item
        Connection conn=null;
        Statement stmt=null;
        try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM purchased_item";
        ResultSet rs=stmt.executeQuery(sql);
        
        int item_no=0;
       
        while (rs.next()){
      
         item_no++;
       
       
        }
        String num_of_item=String.valueOf(item_no);
        jLabel15.setText(num_of_item);
        
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
        
    }//GEN-LAST:event_jLabel15AncestorAdded

    private void jTable3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable3AncestorAdded
        // viewing cashier data:
        Connection conn=null;
        Statement stmt=null;
        try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM Cashier";
        ResultSet rs=stmt.executeQuery(sql);
        
        DefaultTableModel table=(DefaultTableModel) jTable3.getModel();
        table.setRowCount(0);
        while (rs.next()){
            
        int cn=rs.getInt("ID");
        String ni=rs.getString("NAME");
        String ed=rs.getString("ADDRESS");
        String pas=rs.getString("PASSWORD");
       
        
       
        table.addRow(new Object[] {cn,ni,ed,pas});
        }
         jTable3.setRowSelectionInterval(0,0);
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
    }//GEN-LAST:event_jTable3AncestorAdded

    private void jTable4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable4AncestorAdded
        // TODO add your handling code here:
         Statement stmt=null;
         Connection conn=null;
        try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM transaction";
        ResultSet rs=stmt.executeQuery(sql);
        
        DefaultTableModel table=(DefaultTableModel) jTable4.getModel();
        table.setRowCount(0);
        while (rs.next()){
            
        String code=rs.getString("items");
        String name=rs.getString("cashier_name");
        String quant=rs.getString("quantity");
        String nitem=rs.getString("total_amount");
        String da=rs.getString("date");
       
        table.addRow(new Object[] {da,name,quant,code,nitem});
        }
         jTable2.setRowSelectionInterval(0,0);
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
    }//GEN-LAST:event_jTable4AncestorAdded

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // transaction
        Parent.removeAll();
        Parent.add(transaction);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Insert cashier
        Parent.removeAll();
        Parent.add(insert_cashier);
        Parent.repaint();
        Parent.revalidate();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //INSERT CASHIER
        String cn = cashname.getText();
         String ca = cashaddress.getText();
        String pa=jPasswordField1.getText();
        Statement stmt=null;
        Connection conn=null;
         try{

            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            
     
            String sql="INSERT INTO cashier (name,address,password) VALUES ('"+cn+"','"+ca+"','"+pa+"')";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Save");
           Parent.removeAll();
        Parent.add(Cashier);
        Parent.repaint();
        Parent.revalidate();
            
       
         }
         
         
         catch(java.sql.SQLException sq){
            sq.printStackTrace();
            }
            catch(Exception ex){
            ex.printStackTrace();
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void cashnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashnameActionPerformed

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
        // viewing the expired item
     int id=0;
     String code_num="";
     String name_item="";
     String date="";
     int sales_price=0;
     int purchase_price= 0;
     int quantity=0;
     
     
        Connection conn=null;
        Statement stmt=null;
       
         
        try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM expired";
        ResultSet rs=stmt.executeQuery(sql);
        
        DefaultTableModel table=(DefaultTableModel) jTable2.getModel();
        table.setRowCount(0);
        while (rs.next()){
            
        String code=rs.getString("code_num");
        String nitem=rs.getString("name_item");
        String da=rs.getString("expired_date");
        int sp=rs.getInt("sales_price");
        int pur=rs.getInt("purchase_price");
        int quan=rs.getInt("quantity");
        
       
        
       
        table.addRow(new Object[] {nitem,quan,da,sp,pur,quan});
        }
         jTable2.setRowSelectionInterval(0,0);
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
         
    }//GEN-LAST:event_jTable2AncestorAdded

    private void jXTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField2ActionPerformed

    private void jLabel18AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel18AncestorAdded
        // viewing expired data in dashboard
        Connection conn=null;
        Statement stmt=null;
         try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM expired";
        ResultSet rs=stmt.executeQuery(sql);
        
        int count_expired=0;
               
        while (rs.next()){
        count_expired++;
        }
    String count=String.valueOf(count_expired);
    jLabel18.setText(count);
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
    }//GEN-LAST:event_jLabel18AncestorAdded

    private void jXTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField1ActionPerformed

    private void cashaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashaddressActionPerformed

    private void jXTextField8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jXTextField8CaretUpdate
              
        String search = jXTextField8.getText();
         Connection conn=null;
        Statement stmt=null;
        
     
        try{
           
            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
           
                String que="SELECT * FROM transaction WHERE cashier_name='"+search+"' OR items='"+search+"'";
                ResultSet rs=stmt.executeQuery(que);
                
                
                 DefaultTableModel table=(DefaultTableModel) jTable4.getModel();
                  table.setRowCount(0);
                while(rs.next()){
                        
                      
         String cn=rs.getString("date");
        String ni=rs.getString("cashier_name");
        String ed=rs.getString("quantity");
        String  sp=rs.getString("items");
        String pp=rs.getString("amount");
         
        
       
        table.addRow(new Object[] {cn,ni,ed,sp,pp});
     
                       
                       
                 
                }
                conn.close();
                stmt.close();
                rs.close();
               
         
        
         
        }
        catch(java.sql.SQLException s){
            s.printStackTrace();
        
        }
        catch(Exception e){
            e.printStackTrace();
        
        }
    }//GEN-LAST:event_jXTextField8CaretUpdate

    private void jXTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField8ActionPerformed

    private void jXTextField4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jXTextField4CaretUpdate
         String search = jXTextField4.getText();
         Connection conn=null;
        Statement stmt=null;
        
     
        try{
           
            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
           
                String que="SELECT * FROM purchased_item WHERE code_num='"+search+"'";
                ResultSet rs=stmt.executeQuery(que);
                String name="";
                while(rs.next()){
                      name=rs.getString("name_item");
                      q=rs.getInt("quantity");
                }
                jXTextField5.setText(name);
                if (!name.isEmpty()){
                         bol=true;
                }
                else{
                    bol=false;
                }
                
                
                conn.close();
                stmt.close();
                rs.close();
        }
        catch(java.sql.SQLException s){
            s.printStackTrace();
        
        }
        catch(Exception e){
            e.printStackTrace();
        
        }
    }//GEN-LAST:event_jXTextField4CaretUpdate

    private void items1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_items1MouseClicked
        Parent.removeAll();
        Parent.add(Items);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_items1MouseClicked

    private void eitems1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eitems1MouseClicked
        Parent.removeAll();
        Parent.add(EItems);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_eitems1MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel23AncestorAdded
        // TODO add your handling code here:
         Connection conn=null;
        Statement stmt=null;
         try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM transaction";
        ResultSet rs=stmt.executeQuery(sql);
        
        int count_expired=0;
               
        while (rs.next()){
        count_expired++;
        }
    String count=String.valueOf(count_expired);
    jLabel23.setText(count);
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
    }//GEN-LAST:event_jLabel23AncestorAdded

    private void eitems2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eitems2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eitems2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // out of stock
        Parent.removeAll();
        Parent.add(ots);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable5AncestorAdded
        // out of stock
         Connection conn=null;
        Statement stmt=null;
         try {
        Class.forName(driver);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        
        String sql="SELECT  *  FROM outofstock";
        ResultSet rs=stmt.executeQuery(sql);
        DefaultTableModel table=(DefaultTableModel) jTable5.getModel();
        table.setRowCount(0);
        while (rs.next()){
            String name=rs.getString("item_name");
            
            table.addRow(new Object[] {name});
        }
        
        jTable3.setRowSelectionInterval(0,0);
        
        rs.close();
        stmt.close();
        conn.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conn!=null){
        conn.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
        
    }//GEN-LAST:event_jTable5AncestorAdded

    private void jXTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jXTextField11CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField11CaretUpdate

    private void jXTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField11ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jXTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXTextField6KeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_ENTER){
                    // insert data in database
        String codenum=jXTextField4.getText();
        String name=jXTextField5.getText();
        int year = jYearChooser1.getYear();
        String month=String.valueOf(jComboBox1.getSelectedItem());
       double sale_price=Double.parseDouble(jXTextField9.getText());
       double purchased_price=Double.parseDouble(jXTextField10.getText());
        int quantity=Integer.parseInt(jXTextField6.getText());
      
       int total=q+quantity;
       String yr=String.valueOf(year);
       String both=month+" "+yr;
         
       if(bol.equals(true)){
           if (jRadioButton1.isSelected()){
            
            both="";
        
         Connection conn=null;
         Statement stmt=null;
           
           try{
           
            
          Class.forName(driver);
          conn=DriverManager.getConnection(DB_URL,USER,PASS);
          stmt=conn.createStatement();
            String sql="UPDATE purchased_item set expired_date='"+both+"',sales_price="+sale_price+",purchase_price="+purchased_price+", quantity="+total+" WHERE code_num='"+codenum+"'";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Updated");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
            q=0;
            
             stmt.close();
             conn.close();
       
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
           }
        else{ Connection conn=null;
           Statement stmt=null;
           try{
           
          Class.forName(driver);
          conn=DriverManager.getConnection(DB_URL,USER,PASS);
          stmt=conn.createStatement();
            String sql="UPDATE purchased_item set expired_date='"+both+"',sales_price="+sale_price+",purchase_price="+purchased_price+", quantity="+total+" WHERE code_num='"+codenum+"'";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Updated");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
            q=0;
             stmt.close();
             conn.close();
       
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        }
          
       }
       
       else{
       
        if (jRadioButton1.isSelected()){
            
            both="";
        
        
        Statement stmt=null;
        Connection conn=null;
         try{

            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            
     
            String sql="INSERT INTO purchased_item (code_num,name_item,expired_date,sales_price,purchase_price,quantity) VALUES ('"+codenum+"','"+name+"','"+both+"',"+sale_price+","+purchased_price+","+total+")";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Save");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
            q=0;
       
         }
         
         
         catch(java.sql.SQLException sq){
            sq.printStackTrace();
            }
            catch(Exception ex){
            ex.printStackTrace();
            }
        }
        else{
        Statement stmt=null;
        Connection conn=null;
         try{

            Class.forName(driver);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            
     
            String sql="INSERT INTO purchased_item (code_num,name_item,expired_date,sales_price,purchase_price,quantity) VALUES ('"+codenum+"','"+name+"','"+both+"',"+sale_price+","+purchased_price+","+total+")";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"Save");
            jXTextField4.setText("");
            jXTextField5.setText("");
            jXTextField9.setText("");
            jXTextField10.setText("");
            jXTextField6.setText("");
           q=0;
           jXTextField4.grabFocus();
         }
         
         catch(java.sql.SQLException sq){
            sq.printStackTrace();
            }
            catch(Exception ex){
            ex.printStackTrace();
            }
        
        }}
      
      }
    }//GEN-LAST:event_jXTextField6KeyPressed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         try {
             // print the item list

             jTable1.print();
         } catch (PrinterException ex) {
             Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         try {
             // print transaction list

             jTable1.print();
         } catch (PrinterException ex) {
             Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         try {
             // print expired item

             jTable2.print();
         } catch (PrinterException ex) {
             Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         try {
             // print out of Stock and delete

             jTable5.print();
         } catch (PrinterException ex) {
             Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void PurchaseAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PurchaseAncestorAdded
        // focusing the cursor
        jXTextField4.grabFocus();
    }//GEN-LAST:event_PurchaseAncestorAdded

    private void jTable6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable6AncestorAdded

    private void jXTextField12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jXTextField12CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField12CaretUpdate

    private void jXTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXTextField12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    
       
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
        cashsier cc=new cashsier();
        cc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

   
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cashier;
    private javax.swing.JPanel EItems;
    private javax.swing.JPanel Income;
    private javax.swing.JPanel Items;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel Purchase;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private org.jdesktop.swingx.JXTextField cashaddress;
    private org.jdesktop.swingx.JXTextField cashname;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel eitems1;
    private javax.swing.JPanel eitems2;
    private javax.swing.JPanel income;
    private javax.swing.JPanel insert_cashier;
    private javax.swing.JPanel items1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private org.jdesktop.swingx.JXTextField jXTextField1;
    private org.jdesktop.swingx.JXTextField jXTextField10;
    private org.jdesktop.swingx.JXTextField jXTextField11;
    private org.jdesktop.swingx.JXTextField jXTextField12;
    private org.jdesktop.swingx.JXTextField jXTextField2;
    private org.jdesktop.swingx.JXTextField jXTextField3;
    private org.jdesktop.swingx.JXTextField jXTextField4;
    private org.jdesktop.swingx.JXTextField jXTextField5;
    private org.jdesktop.swingx.JXTextField jXTextField6;
    private org.jdesktop.swingx.JXTextField jXTextField7;
    private org.jdesktop.swingx.JXTextField jXTextField8;
    private org.jdesktop.swingx.JXTextField jXTextField9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JPanel ots;
    private javax.swing.JPanel transaction;
    // End of variables declaration//GEN-END:variables
}
