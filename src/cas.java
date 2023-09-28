
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class cas extends javax.swing.JFrame {

     String driver="com.mysql.jdbc.Driver";
     static final String DB_URL="jdbc:mysql://localhost/inventorysystem?zeroDateTimeBehavior=convertToNull";
     static final String USER="root";
     static final String PASS="pass1234";

     
    String names="";
    int quans=0;
    int total_amount=0;
    int price=0;
    int sale=0;
    int total_bill=0;
    int catch_cash_rec=0;
    int catch_con_change=0;
    public static String password="";
    public cas() {
        initComponents();
    }
    cas(int cash_rec,int con_change){
    initComponents();
    this.catch_cash_rec=cash_rec;
    this.catch_con_change=con_change;
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qty", "Item price", "Item Name", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("0");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Total");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setText("Changed");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setText("Cash Recieved");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Cash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("2000");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("1500");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("1000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("300");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setText("400");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setText("500");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setText("600");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setText("100");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton11.setText("200");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton12.setText("OK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton13.setText("Sales");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3)))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(158, 158, 158))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(237, 237, 237))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(314, 314, 314))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
        jTable1.setRowHeight(40);
        TableColumnModel columnModel=jTable1.getColumnModel();
        columnModel.getColumn(0).setWidth(20);
        columnModel.getColumn(1).setWidth(20);
        columnModel.getColumn(2).setPreferredWidth(300);
        columnModel.getColumn(3).setWidth(50);
        
       
        Connection conns=null;
       Statement stmts=null;
      try {
                Class.forName(driver);
                conns=DriverManager.getConnection(DB_URL,USER,PASS);
                stmts = conns.createStatement();
                 String sql="SELECT  *  FROM catch";
                ResultSet rs=stmts.executeQuery(sql);
                DefaultTableModel table=(DefaultTableModel) jTable1.getModel();
                table.setRowCount(0);
                
               
                while (rs.next()){
                        String catch_name=rs.getString("name");
                        int catch_quantity=rs.getInt("quantity");
                        int catch_item_price=rs.getInt("Amount_per_item");
                        int catch_amount=rs.getInt("total_amount");
                        
                        total_bill=total_bill+catch_amount;
                table.addRow(new Object[] {catch_quantity,catch_item_price,catch_name,catch_amount});
                }
                
        String con_total_bill=String.valueOf(total_bill);
        jTextField2.setText(con_total_bill);
        jLabel1.setText(con_total_bill);
        String change=String.valueOf(catch_con_change);
        jLabel4.setText(change);
        String rec=String.valueOf(catch_cash_rec);
        jLabel7.setText(rec);
                jTable1.setRowSelectionInterval(0,0);
        
       rs.close();     
        stmts.close();
        conns.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conns!=null){
        conns.close();
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

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
       
       
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
        jTextField1.grabFocus();
        
       String scs="";
         try {
            
          FileReader file=new FileReader("C:\\Users\\Almei\\Documents\\NetBeansProjects\\InventorySystem\\handle.txt");
          BufferedReader bf=new BufferedReader(file);
          
          String st=bf.readLine().trim();
          
              StringTokenizer stn=new StringTokenizer(st);
              scs=stn.nextToken();
             jTextField3.setText(scs);
          } catch (FileNotFoundException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
      String barcode=jTextField1.getText();
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        quantity quan=new quantity(barcode);
        quan.setVisible(true);
        this.dispose();}
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        cash_rec cash=new cash_rec(total_bill);
        cash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int matic1=2000;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int matic1=1500;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int matic1=1000;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int matic1=300;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         int matic1=400;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         int matic1=500;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int matic1=600;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         int matic1=100;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         int matic1=200;
        int sum=matic1-total_bill;
        
       String con_matic1=String.valueOf(matic1);
       jLabel7.setText(con_matic1);
       
       String con_sum=String.valueOf(sum);
       jLabel4.setText(con_sum);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          // print reciept and saving purchased in database
          DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String scs="";
         try {
            
          FileReader file=new FileReader("C:\\Users\\Almei\\Documents\\NetBeansProjects\\InventorySystem\\handle.txt");
          BufferedReader bf=new BufferedReader(file);
          
          String st=bf.readLine().trim();
          
              StringTokenizer stn=new StringTokenizer(st);
              scs=stn.nextToken();
             
          } catch (FileNotFoundException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         Connection co=null;
       Statement st=null;
      try {
                Class.forName(driver);
                co=DriverManager.getConnection(DB_URL,USER,PASS);
                st = co.createStatement();
                 String sql="SELECT  *  FROM catch";
                ResultSet rs=st.executeQuery(sql);
               
                while (rs.next()){
                        String catch_bar=rs.getString("barcode");
                        String catch_name=rs.getString("name");
                        int catch_item_amount=rs.getInt("Amount_per_item");
                        int catch_quantity=rs.getInt("quantity");
                        int catch_amount=rs.getInt("total_amount");
                        
                        total_bill=total_bill+catch_amount;
        // print reciept and saving purchased in database
                        
                        
          // code for decreasing the quantity
          Connection c_p=null;
          Statement s_p=null;
          int quantity_p=0;
        try {
                Class.forName(driver);
                c_p=DriverManager.getConnection(DB_URL,USER,PASS);
                s_p = co.createStatement();
                 String sql_p="SELECT quantity FROM purchased_item WHERE code_num='"+catch_bar+"'";
                ResultSet rs_p=s_p.executeQuery(sql_p);
               
                while (rs_p.next()){
                    quantity_p=rs_p.getInt("quantity");
                }
                
                s_p.close();
                c_p.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
                
                
        int total_quantity=quantity_p-catch_quantity;
         // code for decreasing the quantity
        
        // after decreasing the quantity, update the quantity
       Connection c=null;
       Statement s=null;
      try {
          
                Class.forName(driver);
                c=DriverManager.getConnection(DB_URL,USER,PASS);
                s = c.createStatement();
                 String sq="UPDATE purchased_item set quantity="+total_quantity+" WHERE code_num='"+catch_bar+"' ";
                  s.execute(sq);
        s.close();
        c.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
      
      // after decreasing the quantity, update the quantity
      
      
       // inserting transaction in database
                          
       Connection con_tran=null;
       Statement stm_tran=null;
      try {
          JOptionPane.showMessageDialog(null,"transaction");
                Class.forName(driver);
                con_tran=DriverManager.getConnection(DB_URL,USER,PASS);
                stm_tran = con_tran.createStatement();
                 String sq="INSERT INTO transaction (cashier_name, quantity, Amount_per_item, total_amount, date) VALUES('"+scs+"',"+catch_quantity+",'"+catch_name+"','"+catch_item_amount+"',"+catch_amount+",'"+dtf.format(now)+"') ";
                  stm_tran.execute(sq);
        stm_tran.close();
        con_tran.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
                }
              
       rs.close();     
        st.close();
        co.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (co!=null){
        co.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
        // inserting transaction in database
      
      
      // code for printing reciept
      Connection c_p=null;
          Statement s_p=null;
          
        try {
                Class.forName(driver);
                c_p=DriverManager.getConnection(DB_URL,USER,PASS);
                s_p = co.createStatement();
                 String sql_p="SELECT * FROM catch";
                ResultSet rs_p=s_p.executeQuery(sql_p);
               
                while (rs_p.next()){
                    String name_c=rs_p.getString("name");
                    int quantity_c=rs_p.getInt("quantity");
                    int Amount_per_item_c=rs_p.getInt("Amount_per_item");
                    int total_amount_c=rs_p.getInt("total_amount");
                
                
                String reciept_write="'"+name_c+"','\n'"
                                     + "'"+         quantity_c +"','*','"+ Amount_per_item_c +"','"+                 total_amount_c+"' ";
                try{
            FileWriter fw= new FileWriter("C:\\Users\\Almei\\Documents\\NetBeansProjects\\InventorySystem\\Reciept.txt");
            fw.write(reciept_write);
            fw.close();
           
        
        } catch (IOException ex) { 
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         }
                
                }
                s_p.close();
                c_p.close();
                
                
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
      // code for printing reciept  
      
      
      //code for deleting the item that purchased from the last customer
       Connection conns=null;
       Statement stmts=null;
       
      try {
                Class.forName(driver);
                conns=DriverManager.getConnection(DB_URL,USER,PASS);
                stmts = conns.createStatement();
                 String sql="DELETE FROM catch";
                  stmts.execute(sql);
        stmts.close();
        conns.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conns!=null){
        conns.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
       cas c=new cas();
       c.setVisible(true);
       this.dispose();
       
          //code for deleting the item that purchased from the last customer
          
          // this print code is just for a while
           try {
            
          FileReader file=new FileReader("C:\\Users\\Almei\\Documents\\NetBeansProjects\\InventorySystem\\Reciept.txt");
          BufferedReader bf=new BufferedReader(file);
          
          String sts=bf.readLine().trim();
          
         
              StringTokenizer stn=new StringTokenizer(sts);
              String reciept;
              reciept = stn.nextToken();
             
              JOptionPane.showMessageDialog(null,reciept);
             
              
          } catch (FileNotFoundException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         }
        try {
           

             jTable1.print();
         } catch (PrinterException ex) {
             Logger.getLogger(cas.class.getName()).log(Level.SEVERE, null, ex);
         }
      // this print code is just for a while
        
                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // setting blank into the table textfields and database (catch)
        
        
        jTextField2.setText("");
        jLabel7.setText("");
        jLabel4.setText("");
        jLabel1.setText("");
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String scs="";
         try {
            
          FileReader file=new FileReader("C:\\Users\\Almei\\Documents\\NetBeansProjects\\InventorySystem\\handle.txt");
          BufferedReader bf=new BufferedReader(file);
          
          String st=bf.readLine().trim();
          
              StringTokenizer stn=new StringTokenizer(st);
              scs=stn.nextToken();
             
          } catch (FileNotFoundException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(cashier.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         Connection co=null;
       Statement st=null;
      try {
                Class.forName(driver);
                co=DriverManager.getConnection(DB_URL,USER,PASS);
                st = co.createStatement();
                 String sql="SELECT  *  FROM catch";
                ResultSet rs=st.executeQuery(sql);
               
                while (rs.next()){
                        String catch_bar=rs.getString("barcode");
                        String catch_name=rs.getString("name");
                        int catch_quantity=rs.getInt("quantity");
                        int catch_amount=rs.getInt("total_amount");
                        
                        total_bill=total_bill+catch_amount;
        
          // code for lessing the quantity
          Connection c_p=null;
          Statement s_p=null;
          int quantity_p=0;
        try {
                Class.forName(driver);
                c_p=DriverManager.getConnection(DB_URL,USER,PASS);
                s_p = co.createStatement();
                 String sql_p="SELECT quantity FROM purchased_item WHERE code_num='"+catch_bar+"'";
                ResultSet rs_p=s_p.executeQuery(sql_p);
               
                while (rs_p.next()){
                    quantity_p=rs_p.getInt("quantity");
                }
                
                s_p.close();
                c_p.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
                
                
        int total_quantity=quantity_p-catch_quantity;
        // after lessing the quantity, update the quantity
       Connection c=null;
       Statement s=null;
      try {
          
                Class.forName(driver);
                c=DriverManager.getConnection(DB_URL,USER,PASS);
                s = c.createStatement();
                 String sq="UPDATE purchased_item set quantity="+total_quantity+" WHERE code_num='"+catch_bar+"' ";
                  s.execute(sq);
        s.close();
        c.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
       // inserting transaction in database
                          
       Connection con=null;
       Statement stm=null;
      try {
          
                Class.forName(driver);
                con=DriverManager.getConnection(DB_URL,USER,PASS);
                stm = con.createStatement();
                 String sq="INSERT INTO transaction (cashier_name, quantity, items, amount, date) VALUES('"+scs+"',"+catch_quantity+",'"+catch_name+"',"+catch_amount+",'"+dtf.format(now)+"') ";
                  stm.execute(sq);
        stm.close();
        con.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
                }
              
       rs.close();     
        st.close();
        co.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (co!=null){
        co.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
        
       
        
               
       Connection conns=null;
       Statement stmts=null;
       
      try {
                Class.forName(driver);
                conns=DriverManager.getConnection(DB_URL,USER,PASS);
                stmts = conns.createStatement();
                 String sql="DELETE FROM catch";
                  stmts.execute(sql);
        stmts.close();
        conns.close();
        }
        catch(java.sql.SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
        
        finally {
        try{
        if (conns!=null){
        conns.close();
        }
        }
        catch(java.sql.SQLException se){
        se.printStackTrace();
        }
        catch(IllegalArgumentException il){
            il.printStackTrace();
        }
                
        }
       cas c=new cas();
       c.setVisible(true);
       this.dispose();
       
                
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(cas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
