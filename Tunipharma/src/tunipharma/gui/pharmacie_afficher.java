/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.gui;

import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Pharmacie;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tunipharma.util.MyConnection;

/**
 *
 * @author user
 */
public class pharmacie_afficher extends javax.swing.JFrame {

    /**
     * Creates new form pharmacie_afficher
     */
    public pharmacie_afficher() {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_pharmacie = new javax.swing.JTable();
        Btn_modifier = new javax.swing.JButton();
        Btn_supprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("                 Liste pharmacie");

        tab_pharmacie.setModel(new RestaurateursTableModel());
        jScrollPane2.setViewportView(tab_pharmacie);

        Btn_modifier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_modifier.setText("Modifier");
        Btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_modifierActionPerformed(evt);
            }
        });

        Btn_supprimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_supprimer.setText("Supprimer");
        Btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_supprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_supprimer)
                    .addComponent(Btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_modifier)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_supprimer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_modifierActionPerformed

    }//GEN-LAST:event_Btn_modifierActionPerformed

    private void Btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_supprimerActionPerformed
        Pharmacie ph1= new Pharmacie();
        PharmacieDAO pharmacieDAO= new PharmacieDAO();
        int index= tab_pharmacie.getSelectedRow();

        int id= (int)tab_pharmacie.getValueAt(index, 0);
        PharmacieDAO.deletePharmacie();
        tab_pharmacie.setModel(new PharmacieTableModel());

    }//GEN-LAST:event_Btn_supprimerActionPerformed

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
            java.util.logging.Logger.getLogger(pharmacie_afficher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacie_afficher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacie_afficher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacie_afficher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacie_afficher().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_modifier;
    private javax.swing.JButton Btn_supprimer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_pharmacie;
    // End of variables declaration//GEN-END:variables
}
