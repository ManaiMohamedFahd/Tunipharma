/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.gui;

import java.sql.PreparedStatement;
import tunipharma.dao.AdministrateurDAO;
import tunipharma.entities.Administrateurs;
import tunipharma.util.MyConnection;
import javax.swing.JTextField;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author HOOD
 */
public class administrateur_Ajout extends javax.swing.JFrame {
java.util.Date Date_Naissance = new java.util.Date(90, 01, 02);
        //year = year + 1900 
        //mois = mois + 1
        java.sql.Date sqlDate = new java.sql.Date(Date_Naissance.getTime());
    /**
     * Creates new form administrateur_Ajout
     */
    public administrateur_Ajout() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nom = new javax.swing.JTextField();
        tf_prenom = new javax.swing.JTextField();
        tf_adresse = new javax.swing.JTextField();
        tf_adresse_mail = new javax.swing.JTextField();
        tf_num_telephone = new javax.swing.JTextField();
        tpw_password = new javax.swing.JPasswordField();
        rb_homme = new javax.swing.JRadioButton();
        rb_femme = new javax.swing.JRadioButton();
        botton_valider = new javax.swing.JButton();
        botton_annuler = new javax.swing.JButton();
        ScrollPane_photo = new javax.swing.JScrollPane();
        JCalendar = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("              Ajouter un administrateur");

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        jLabel4.setText("Date de naissance");

        jLabel5.setText("photo");

        jLabel6.setText("Sexe");

        jLabel7.setText("Adresse");

        jLabel8.setText("Adresse Mail");

        jLabel9.setText("Mot de passe");

        jLabel11.setText("Numèro de téléphone ");

        tf_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_homme);
        rb_homme.setText("Homme");
        rb_homme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_hommeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_femme);
        rb_femme.setText("Femme");

        botton_valider.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botton_valider.setText("Valider");
        botton_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_validerActionPerformed(evt);
            }
        });

        botton_annuler.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botton_annuler.setText("Annuler");
        botton_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_annulerActionPerformed(evt);
            }
        });

        JCalendar.setDateFormatString("yyyy-mm-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botton_valider)
                        .addGap(112, 112, 112)
                        .addComponent(botton_annuler))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nom)
                    .addComponent(tf_adresse)
                    .addComponent(tf_adresse_mail)
                    .addComponent(tf_num_telephone)
                    .addComponent(tpw_password)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_homme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(rb_femme))
                    .addComponent(tf_prenom)
                    .addComponent(JCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(ScrollPane_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tf_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(JCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40))
                    .addComponent(ScrollPane_photo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rb_homme, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rb_femme, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_adresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_adresse_mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpw_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_num_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botton_valider)
                    .addComponent(botton_annuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botton_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_validerActionPerformed
        // TODO add your handling code here:
         //  recup.Type (radio Button)
        String type="";
        if(rb_femme.isSelected())
            type=rb_femme.getText();
        if (rb_homme.isSelected())
            type=rb_homme.getText();
      try{
        String requete = "insert into administrateur  (Nom,Prenom,Date_Naissance,adresse,adresse_mail,Mot_de_passe,Numero_telephone) values (?,?,?,?,?,?,?)";
      PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, tf_nom.getText());
            ps.setString(2, tf_prenom.getText());
            ps.setString(3,((JTextField)JCalendar.getDateEditor().getUiComponent()).getText());
            ps.setString(4,tf_adresse.getText());
            ps.setString(5,tf_adresse_mail.getText());
            ps.setString(6,tpw_password.getText());
             int num =tf_num_telephone.getX();
            ps.setInt(7,num);
              System.out.println("a");
            ps.execute();
          JOptionPane.showMessageDialog(null,"valide");
      }
      catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
      
      
      }
        
       
         // recup.date de naissance*****************a verifier)*********
      //  String date_de_naissance = sp_jour.getValue().toString()+ sp_mois.getValue().toString()+sp_annee.getValue().toString();
    }//GEN-LAST:event_botton_validerActionPerformed

    private void botton_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_annulerActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botton_annulerActionPerformed

    private void rb_hommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_hommeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_hommeActionPerformed

    private void tf_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomActionPerformed

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
            java.util.logging.Logger.getLogger(administrateur_Ajout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrateur_Ajout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrateur_Ajout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrateur_Ajout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrateur_Ajout().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JCalendar;
    private javax.swing.JScrollPane ScrollPane_photo;
    private javax.swing.JButton botton_annuler;
    private javax.swing.JButton botton_valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_femme;
    private javax.swing.JRadioButton rb_homme;
    private javax.swing.JTextField tf_adresse;
    private javax.swing.JTextField tf_adresse_mail;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextField tf_num_telephone;
    private javax.swing.JTextField tf_prenom;
    private javax.swing.JPasswordField tpw_password;
    // End of variables declaration//GEN-END:variables
}
