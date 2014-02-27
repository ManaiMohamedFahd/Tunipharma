/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.gui;

import java.sql.PreparedStatement;
import tunipharma.entities.Pharmacie;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tunipharma.util.MyConnection;
import java.util.List;

/**
 *
 * @author user
 */
public class pharmacie_ajouter extends javax.swing.JFrame {

    /**
     * Creates new form pharmacie_ajouter
     */
    public pharmacie_ajouter() {
        initComponents();
    }
    List<Pharmacie> maliste;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nom_pharmacie = new javax.swing.JTextField();
        tf_adresse_pharmacie = new javax.swing.JTextField();
        tf_mail_pharmacie = new javax.swing.JTextField();
        tf_telephone_pharmacie = new javax.swing.JTextField();
        tf_numero_patente = new javax.swing.JTextField();
        cb_gouvernaurat = new javax.swing.JComboBox();
        rb_garde = new javax.swing.JRadioButton();
        rb_non_garde = new javax.swing.JRadioButton();
        br_Ajouter = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("              Ajouter une Pharmacie");

        jLabel2.setText("nom_pharmacie         :");

        jLabel3.setText("adresse_pharmacie   :");

        jLabel4.setText("mail_pharmacie          :");

        jLabel5.setText("telephone_pharmacie:");

        jLabel6.setText("numero_patente        :");

        jLabel7.setText("gouvernaurat             :");

        jLabel8.setText("jour_de_garde           :");

        tf_adresse_pharmacie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_adresse_pharmacieActionPerformed(evt);
            }
        });

        cb_gouvernaurat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ariana", "Béja", "Ben Arous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kébili", "La Manouba", "Le Kef", "Mahdia", "Médenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan" }));
        cb_gouvernaurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_gouvernauratActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_garde);
        rb_garde.setText("garde");

        buttonGroup1.add(rb_non_garde);
        rb_non_garde.setText("non_garde");

        br_Ajouter.setText("Ajouter");
        br_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_AjouterActionPerformed(evt);
            }
        });

        btn_quitter.setText("Quitter");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nom_pharmacie)
                            .addComponent(tf_adresse_pharmacie)
                            .addComponent(tf_mail_pharmacie)
                            .addComponent(tf_telephone_pharmacie)
                            .addComponent(tf_numero_patente)
                            .addComponent(cb_gouvernaurat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(br_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(btn_quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_garde)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rb_non_garde)))
                                .addGap(10, 10, 10)))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nom_pharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_adresse_pharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_mail_pharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_telephone_pharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_numero_patente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_gouvernaurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rb_garde)
                    .addComponent(rb_non_garde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(br_Ajouter)
                    .addComponent(btn_quitter))
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_adresse_pharmacieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_adresse_pharmacieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_adresse_pharmacieActionPerformed

    private void cb_gouvernauratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_gouvernauratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_gouvernauratActionPerformed

    private void br_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_AjouterActionPerformed
        String type="";
        if(rb_non_garde.isSelected())
            type=rb_non_garde.getText();
        if (rb_garde.isSelected())
            type=rb_garde.getText();
      try{
        String requete = "insert into pharmacies  (nom_pharmacie,adresse_pharmacie,mail_pharmacie,telephone_pharmacie,numero_patente,gouvernaurat) values (?,?,?,?,?,?)";
      PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, tf_nom_pharmacie.getText());
            ps.setString(2, tf_adresse_pharmacie.getText());
            ps.setString(3,tf_mail_pharmacie.getText());
            int num =Integer.parseInt(tf_telephone_pharmacie.getText());
            ps.setInt(4,num);
            int patente =Integer.parseInt(tf_numero_patente.getText());
            ps.setInt(5,patente);
            ps.setString(6, type);
            Pharmacie p = maliste.get(cb_gouvernaurat.getSelectedIndex());
            ps.execute();
          JOptionPane.showMessageDialog(null,"valide");
      }
      catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
      
      
      }
    }//GEN-LAST:event_br_AjouterActionPerformed

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
        dispose();
    }//GEN-LAST:event_btn_quitterActionPerformed

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
            java.util.logging.Logger.getLogger(pharmacie_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacie_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacie_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacie_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacie_ajouter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton br_Ajouter;
    private javax.swing.JButton btn_quitter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_gouvernaurat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rb_garde;
    private javax.swing.JRadioButton rb_non_garde;
    private javax.swing.JTextField tf_adresse_pharmacie;
    private javax.swing.JTextField tf_mail_pharmacie;
    private javax.swing.JTextField tf_nom_pharmacie;
    private javax.swing.JTextField tf_numero_patente;
    private javax.swing.JTextField tf_telephone_pharmacie;
    // End of variables declaration//GEN-END:variables
}
