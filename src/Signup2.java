/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rscombd
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Signup2 extends javax.swing.JFrame {

    /**
     * Creates new form Signup2
     */
    public Signup2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private void backtologinActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Loginf rgf = new Loginf();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        //rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                           

    private void createActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String name  = jTextField_name.getText();
        String emailid = jTextField_emailid.getText();
        String pass = String.valueOf(jPasswordField_pass.getPassword());
        String passconfirm = String.valueOf(jPasswordField_passconfirm.getPassword());
        String Phoneno  = jTextField_phoneno.getText();
        String Ccno  = jTextField_ccno.getText();

        if(emailid.equals(""))
        {
            JOptionPane.showMessageDialog(null,"The email id is compulsory");
        }
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Add a password");
        }
          else if(pass.length()<7)
        {
            JOptionPane.showMessageDialog(null,"Password has to be more than 7 characters");
        }
        else if(!pass.equals(passconfirm))
        {
            JOptionPane.showMessageDialog(null,"Enter the password again");
        }
        else if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter your name");
        }
            else if(!Phoneno.matches("d{11}"))
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid contact number");
        }
            else if(Ccno.matches("d{11}"))
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid credit card number");
        }

        else if(checkUsername(emailid))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        else{
            PreparedStatement ps;

            try {
                String query = "INSERT INTO `userz`(`name`, `email_id`, `password`, `phone_no`, `credit_card_no`) VALUES (?,?,MD5(?),?,?)";

                ps = connect.getConnection().prepareStatement(query);

                ps.setString(1, name);
                ps.setString(2, emailid);
                ps.setString(3, pass);
                ps.setInt(4, Integer.parseInt(Phoneno));
                ps.setInt(5, Integer.parseInt(Ccno));
                //ps.executeQuery();
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"New User Added");
                }

                String pas = "INSERT INTO `passwordz` (`email_id`, `pass`) VALUES (?,MD5(?))";
                ps=connect.getConnection().prepareStatement(pas);
                ps.setString(1, emailid);
                ps.setString(2, pass);

                ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }                                      

    private void jTextField_emailidActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  
       public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `userz` WHERE `email_id` =?";
        
        try {
            ps = connect.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }    
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
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
 private javax.swing.JButton backtologin;
    private javax.swing.JButton create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JPasswordField jPasswordField_passconfirm;
    private javax.swing.JTextField jTextField_ccno;
    private javax.swing.JTextField jTextField_emailid;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phoneno;


}
