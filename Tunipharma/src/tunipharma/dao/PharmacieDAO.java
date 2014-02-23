/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import tunipharma.entities.Pharmacie;
import tunipharma.util.MyConnection;

/**
 *
 * @author user
 */
public class PharmacieDAO {
    
    public void insertPharmacie(Pharmacie ph) {

        String requete = "insert into pharmacie  (nom_pharmacie,adresse_pharmacie,mail_pharmacie,telephone_pharmacie,numero_patente,gouvernaurat,jour_de_garde) values (?,?,?,?,?,?,?)";

        try {

            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, ph.getNom_pharmacie());
            ps.setString(4, ph.getAdresse_pharmacie());     
            ps.setString(3, ph.getMail_pharmacie());
            ps.setInt(4, ph.getTelephone_pharmacie());
            ps.setInt(5, ph.getNumero_patente());
            ps.setString(6, ph.getGouvernaurat());
            ps.setString(6, ph.getJour_de_garde());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }
    public void updatePharmacie(Pharmacie ph) {
        String requete = "update pharmacie set Nom_pharmacie=?,Adresse_pharmacie=?,Mail_pharmacie=?,Telephone_pharmacie=?,Numero_patente=?,Gouvernaurat=?,Jour_de_garde=? where id_pharmacie=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ph.getNom_pharmacie());
            ps.setString(4, ph.getAdresse_pharmacie());     
            ps.setString(3, ph.getMail_pharmacie());
            ps.setInt(4, ph.getTelephone_pharmacie());
            ps.setInt(5, ph.getNumero_patente());
            ps.setString(6, ph.getGouvernaurat());
            ps.setString(6, ph.getJour_de_garde());
            ps.executeUpdate();
            
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PharmacieDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
    public void deletePharmacie(int id_pharmacie) {
        String requete = "delete from pharmacie where id_pharmacie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_pharmacie);
            ps.executeUpdate();
            System.out.println("pharmacie supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
    
    
}
