
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Flights extends javax.swing.JFrame {

    
    public Flights() {
        initComponents();
        DisplayFlight();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FSourceCb = new javax.swing.JComboBox<>();
        FCodeTb = new javax.swing.JTextField();
        FDestCb = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        SeatsTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Flights List");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Turbo Airways");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Source");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Flight Code");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Take Of Date");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 51));
        jLabel8.setText("Number Of Seats");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Destination");

        FSourceCb.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        FSourceCb.setForeground(new java.awt.Color(102, 0, 51));
        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore", "Dilhy", "Mumbai", "Chennai" }));
        FSourceCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSourceCbActionPerformed(evt);
            }
        });

        FCodeTb.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N

        FDestCb.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        FDestCb.setForeground(new java.awt.Color(102, 0, 51));
        FDestCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore", "Dilhy", "Mumbai", "Chennai" }));
        FDestCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDestCbActionPerformed(evt);
            }
        });

        FDate.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        SeatsTb.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        SeatsTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatsTbActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Manage Flights");

        DeleteBtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(102, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(102, 0, 0));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(102, 0, 0));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(102, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        FlightsTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightsTable.setRowHeight(25);
        FlightsTable.setSelectionBackground(new java.awt.Color(153, 0, 51));
        FlightsTable.setShowGrid(false);
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FDestCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SeatsTb, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FDate, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FSourceCb, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(FDestCb))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FCodeTb)
                            .addComponent(SeatsTb))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FSourceCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSourceCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FSourceCbActionPerformed

    private void FDestCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDestCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FDestCbActionPerformed

    private void SeatsTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatsTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeatsTbActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    private void DisplayFlight()
    {
        try {
            
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb" ,"root" , "" );
            St = Con.createStatement();
            Rs = St.executeQuery("select * from FlightTbl");
            FlightsTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch (Exception e){
            
        }
    }
    
     private void Clear()
    {
        FCodeTb.setText("");
        SeatsTb.setText("");
        
    }
    
   
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(FCodeTb.getText().isEmpty()|| SeatsTb.getText().isEmpty() || FSourceCb.getSelectedIndex() == -1 || FDestCb.getSelectedIndex() == -1) 
        {
            JOptionPane.showMessageDialog(this, "Misiing Information");
        } else{
            try{
                
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb" ,"root" , "" );
                PreparedStatement Add = Con.prepareStatement("insert into FlightTbl values(?,?,?,?,?)");
                Add.setString(1,FCodeTb.getText());
                Add.setString(2, FSourceCb.getSelectedItem().toString());
                Add.setString(3, FDestCb.getSelectedItem().toString());
                Add.setString(4, FDate.getDate().toString());
                Add.setInt(5, Integer.valueOf(SeatsTb.getText()));
                 
                 int row= Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Flight Added");
                 Con.close();
                 DisplayFlight();
                 Clear();
                
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
                
                
                
            }
        }    
    }//GEN-LAST:event_SaveBtnMouseClicked

    String Key="";
    private void FlightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)FlightsTable.getModel();
       int MyIndex = FlightsTable.getSelectedRow();
       Key = (model.getValueAt(MyIndex,0).toString());
       FCodeTb.setText(model.getValueAt(MyIndex,0).toString());
      FDate.setDateFormatString(model.getValueAt(MyIndex,3).toString());
       FSourceCb.setSelectedItem(model.getValueAt(MyIndex,1).toString());
       FDestCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());
       SeatsTb.setText(model.getValueAt(MyIndex,4).toString());
       
    }//GEN-LAST:event_FlightsTableMouseClicked

    
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key == ""){
            
            JOptionPane.showMessageDialog(this,"select a Flight");
        }else{
            try{
                 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb" ,"root" , "" );
                String Query = "Delete from FlightTbl where Flcode='"+Key+"'";
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Flight Deleted");
                DisplayFlight();
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
                
            }
            
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
       if(Key == "") 
        {
            JOptionPane.showMessageDialog(this, "Select A Passenger");
        } else{
            try{
                //CountPassengers();
                
                
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb" ,"root" , "" );
                String Query = "Update FlightTbl set FlSource=?, FlDes=?, FlDate=?, FlSeats=? where FlCode=?";
                PreparedStatement Add = Con.prepareStatement(Query);
                Add.setString(5,Key);
                Add.setString(5, FCodeTb.getText());
                Add.setString(1, FSourceCb.getSelectedItem().toString());
                Add.setString(2, FDestCb.getSelectedItem().toString());
                Add.setString(3, FDate.getDate().toString());
                Add.setString(4, SeatsTb.getText());

                 int row= Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Flight Updated");
                 Con.close();
                 DisplayFlight();
                 Clear();
                
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,e);
                
                
                
            }
        }  
    }//GEN-LAST:event_EditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox<String> FDestCb;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField SeatsTb;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
