/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends_notes_system;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class UploaaViewEditFrame extends javax.swing.JFrame {
      String[][] uploadeddata;
    /**
     * Creates new form ChatDataEditFrame
     */
   public UploaaViewEditFrame() {
    super("File Notes Edit Frame - " + StudentOPFrame.studentname);
   // Global declaration
    uploadeddata = UploadOP.getFileInfo();

    initComponents(); // Make sure this is called before using jTable1
     String columnames[] = {"filename", "description","date_time"};
        String uploadeddata[][] = UploadOP.getFileInfo();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(uploadeddata,columnames));
        for (int i = 0; i < uploadeddata.length; i++) {
            System.out.println("uploadeddata: "+uploadeddata[i][0]);
        }
        String filenames[] = new String[uploadeddata.length];
        for (int i = 0; i < filenames.length; i++) {
            filenames[i] = uploadeddata[i][0];
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(filenames));
        
    
        
        
        
        jMenuBar4.setBackground(new Color(0, 74, 124));
        jMenuBar4.setForeground(Color.WHITE);

        jMenu5.setBackground(new Color(0, 74, 124));
        jMenu5.setForeground(Color.WHITE);
        jMenu6.setBackground(new Color(0, 74, 124));
        jMenu6.setForeground(Color.WHITE);
        jMenu7.setBackground(new Color(0, 74, 124));
        jMenu7.setForeground(Color.WHITE);
        jMenu4.setBackground(new Color(0, 74, 124));
        jMenu4.setForeground(Color.WHITE);

        jMenuItem1.setBackground(new Color(0, 74, 124));
        jMenuItem1.setForeground(Color.WHITE);
        jMenuItem8.setBackground(new Color(0, 74, 124));
        jMenuItem8.setForeground(Color.WHITE);
        jMenuItem6.setBackground(new Color(0, 74, 124));
        jMenuItem6.setForeground(Color.WHITE);
         jMenuItem9.setBackground(new Color(0, 74, 124));
        jMenuItem9.setForeground(Color.WHITE);
         jMenuItem5.setBackground(new Color(0, 74, 124));
        jMenuItem5.setForeground(Color.WHITE);
         jMenuItem7.setBackground(new Color(0, 74, 124));
        jMenuItem7.setForeground(Color.WHITE);
        jPanel1.setOpaque(false);
        jTable1.setForeground(Color.WHITE);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setBackground(new java.awt.Color(55, 111, 148));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 110, 750, 380);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select File");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 540, 112, 36);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Discription");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 630, 112, 35);

        jButton5.setBackground(new java.awt.Color(0, 74, 124));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view or edit logo.png"))); // NOI18N
        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(380, 840, 160, 52);

        jButton1.setBackground(new java.awt.Color(0, 74, 124));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear logo.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 840, 154, 56);

        jComboBox1.setBackground(new java.awt.Color(55, 111, 148));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 540, 500, 36);

        jTextArea1.setBackground(new java.awt.Color(55, 111, 148));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(390, 630, 500, 160);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("View or Edit Data");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 40, 490, 48);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view or upload data frame.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1950, 1160);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Manage Profile logo.png"))); // NOI18N
        jMenu4.setText("Manage Profile");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit Profile logo.png"))); // NOI18N
        jMenuItem5.setText("Edit Profile");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar4.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload logo.png"))); // NOI18N
        jMenu5.setText("Upload");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload data logo.png"))); // NOI18N
        jMenuItem6.setText("Upload Notes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view or edit logo.png"))); // NOI18N
        jMenuItem7.setText("View / Edit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar4.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download logo.png"))); // NOI18N
        jMenu6.setText("Download");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download data logo.png"))); // NOI18N
        jMenuItem1.setText("Download Data");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download history logo.png"))); // NOI18N
        jMenuItem8.setText("Download History");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar4.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout logo.png"))); // NOI18N
        jMenu7.setText("Logout");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout logo.png"))); // NOI18N
        jMenuItem9.setText("Logout");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuBar4.add(jMenu7);

        setJMenuBar(jMenuBar4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedItem(" ");
        jTextArea1.setText("");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String filename=jComboBox1.getSelectedItem().toString().trim();
        String discription=jTextArea1.getText();
        if(new UploadOP().isFileInfoModified(filename, discription)){
            JOptionPane.showMessageDialog(null, "File Updated Successfully");

            UploaaViewEditFrame uvef=new UploaaViewEditFrame();
            uvef.setVisible(true);
            Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
            uvef.setSize(d);
            
        }else{
             JOptionPane.showMessageDialog(null, "Error occured !!! \n Please try again");
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        StudentEditFrame sef=new StudentEditFrame();
        sef.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        sef.setSize(d);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UploadFrame uf=new UploadFrame();
        uf.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        uf.setSize(d);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UploaaViewEditFrame uvef=new UploaaViewEditFrame();
        uvef.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        uvef.setSize(d);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DownloadFrame df=new DownloadFrame();
        df.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        df.setSize(d);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginFrame f1=new LoginFrame();
        f1.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        f1.setSize(d);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DownloadDataHistory ddf=new DownloadDataHistory();
        ddf.setVisible(true);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        ddf.setSize(d);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         String selectedFile = jComboBox1.getSelectedItem().toString().trim();
    
        for (int i = 0; i < uploadeddata.length; i++) {
          if (uploadeddata[i][0].equals(selectedFile)) {
            jTextArea1.setText(uploadeddata[i][1]); // description is column 1
            break;
        }
    }
         
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(UploaaViewEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploaaViewEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploaaViewEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploaaViewEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploaaViewEditFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
