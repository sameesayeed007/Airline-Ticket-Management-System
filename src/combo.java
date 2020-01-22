
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rscombd
 */
public class combo extends javax.swing.JFrame {

    /**
     * Creates new form combo
     */
    public combo() {
        initComponents();
        populate();
        
    }
    String locations [] = {"Dhaka","Chittagong","Khulna","Barisal"};
    public void populate()
    {
       DefaultComboBoxModel dm = new DefaultComboBoxModel(locations);
       jComboBoxfrom.setModel(dm);
     
        
    }
         public void populate2()
         {
             Object select = jComboBoxfrom.getSelectedItem();
             String selection = select.toString();
             ArrayList<String> loc=new ArrayList<String>();
             for(int i =0; i<locations.length ; i++)
             {
                 if(locations[i].equals(selection))
                 {
                 }
                 else{
                     loc.add(locations[i]);
                 }
                 
             }
              String[] item = loc.toArray(new String[loc.size()]); 
             DefaultComboBoxModel jm = new DefaultComboBoxModel(item);
             jComboBoxto.setModel(jm);
             
             
             
         }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxfrom = new javax.swing.JComboBox<>();
        jComboBoxto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxfrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxfromItemStateChanged(evt);
            }
        });
        jComboBoxfrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxfromMouseClicked(evt);
            }
        });
        jComboBoxfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxfromActionPerformed(evt);
            }
        });

        jComboBoxto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxtoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxtoMouseEntered(evt);
            }
        });

        jLabel1.setText("From");

        jLabel2.setText("To");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jComboBoxfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jComboBoxto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxfromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxfromItemStateChanged
        // TODO add your handling code here:
        Object select = jComboBoxfrom.getSelectedItem();
             String selection = select.toString();
             ArrayList<String> loc=new ArrayList<String>();
             for(int i =0; i<locations.length ; i++)
             {
                 if(locations[i].equals(selection))
                 {
                 }
                 else{
                     loc.add(locations[i]);
                 }
                 
             }
              String[] item = loc.toArray(new String[loc.size()]); 
             DefaultComboBoxModel jm = new DefaultComboBoxModel(item);
             jComboBoxto.setModel(jm);
        
   
    }//GEN-LAST:event_jComboBoxfromItemStateChanged

    private void jComboBoxfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxfromActionPerformed
        // TODO add your handling code here:
       
          
        
    }//GEN-LAST:event_jComboBoxfromActionPerformed

    private void jComboBoxfromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxfromMouseClicked
        // TODO add your handling code here:
                    
        
        
       
        
    }//GEN-LAST:event_jComboBoxfromMouseClicked

    private void jComboBoxtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxtoMouseEntered
        // TODO add your handling code here:
   
               
    }//GEN-LAST:event_jComboBoxtoMouseEntered

    private void jComboBoxtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxtoMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jComboBoxtoMouseClicked

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
            java.util.logging.Logger.getLogger(combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new combo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxfrom;
    private javax.swing.JComboBox<String> jComboBoxto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
