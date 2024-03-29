/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.System.exit;
import javax.swing.JButton;

/**
 *
 * @author OzKA
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        
         //to get middle of screen
        Toolkit toolkit=getToolkit();
        Dimension size =toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2-getHeight()/2);
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
        welcomelabble = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ABButton = new javax.swing.JButton();
        EBButton = new javax.swing.JButton();
        DBButton = new javax.swing.JButton();
        VAButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 550));

        welcomelabble.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        welcomelabble.setForeground(new java.awt.Color(204, 0, 0));
        welcomelabble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomelabble.setText("WELCOME");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INFT/bus12.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ABButton.setBackground(new java.awt.Color(255, 255, 255));
        ABButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ABButton.setText("Add Bus Schedule");
        ABButton.setBorder(null);
        ABButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ABButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ABButtonMouseExited(evt);
            }
        });
        ABButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABButtonActionPerformed(evt);
            }
        });

        EBButton.setBackground(new java.awt.Color(255, 255, 255));
        EBButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        EBButton.setText("Edit Bus Schedule");
        EBButton.setBorder(null);
        EBButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EBButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EBButtonMouseExited(evt);
            }
        });
        EBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EBButtonActionPerformed(evt);
            }
        });

        DBButton.setBackground(new java.awt.Color(255, 255, 255));
        DBButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DBButton.setText("Delete Bus Schedule");
        DBButton.setBorder(null);
        DBButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DBButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DBButtonMouseExited(evt);
            }
        });
        DBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBButtonActionPerformed(evt);
            }
        });

        VAButton.setBackground(new java.awt.Color(255, 255, 255));
        VAButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        VAButton.setText("View All Bus Schedules");
        VAButton.setBorder(null);
        VAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VAButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VAButtonMouseExited(evt);
            }
        });
        VAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAButtonActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INFT/icons8-home-30.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/INFT/icons8-exit-30.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DBButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EBButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ABButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VAButton, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addGap(176, 176, 176))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomelabble, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(welcomelabble))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(ABButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(EBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ABButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABButtonActionPerformed
       
        addbusshedule ad=new addbusshedule();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ABButtonActionPerformed

    private void EBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EBButtonActionPerformed
        edit_bus os =new edit_bus();
        os.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_EBButtonActionPerformed

    public void setColour(JButton p){
    
    p.setBackground(new Color(204,204,255));
    }
    public void resetColour(JButton p1){
    
    p1.setBackground(new Color(255,255,255));
    }
    
    
    private void ABButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABButtonMouseEntered
        // TODO add your handling code here:
        setColour(ABButton);
    }//GEN-LAST:event_ABButtonMouseEntered

    private void ABButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABButtonMouseExited
        // TODO add your handling code here:
        resetColour(ABButton);
    }//GEN-LAST:event_ABButtonMouseExited

    private void EBButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EBButtonMouseEntered
        // TODO add your handling code here:
        setColour(EBButton);
    }//GEN-LAST:event_EBButtonMouseEntered

    private void EBButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EBButtonMouseExited
        // TODO add your handling code here:
         resetColour(EBButton);
    }//GEN-LAST:event_EBButtonMouseExited

    private void DBButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DBButtonMouseEntered
        // TODO add your handling code here:
         setColour(DBButton);
    }//GEN-LAST:event_DBButtonMouseEntered

    private void DBButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DBButtonMouseExited
        // TODO add your handling code here:
         resetColour(DBButton);
    }//GEN-LAST:event_DBButtonMouseExited

    private void VAButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VAButtonMouseEntered
        // TODO add your handling code here:
         setColour(VAButton);
    }//GEN-LAST:event_VAButtonMouseEntered

    private void VAButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VAButtonMouseExited
        // TODO add your handling code here:
         resetColour(VAButton);
    }//GEN-LAST:event_VAButtonMouseExited

    private void DBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBButtonActionPerformed
        // TODO add your handling code here:
        Delete_bus_she dl=new Delete_bus_she();
        dl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DBButtonActionPerformed

    private void VAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAButtonActionPerformed
        // TODO add your handling code here:
        View_all v1=new View_all();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VAButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       bustwstframe BT =new bustwstframe();
    BT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABButton;
    private javax.swing.JButton DBButton;
    private javax.swing.JButton EBButton;
    private javax.swing.JButton VAButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcomelabble;
    // End of variables declaration//GEN-END:variables
}
