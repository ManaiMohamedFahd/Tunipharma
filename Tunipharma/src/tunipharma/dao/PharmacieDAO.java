/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tunipharma.entities.Pharmacie;
import tunipharma.util.MyConnection;

/**
 *
 * @author user
 */
public class PharmacieDAO {
    
    public void insertPharmacie(Pharmacie ph) {

        String requete = "insert into pharmacies  (nom_pharmacie,adresse_pharmacie,mail_pharmacie,telephone_pharmacie,numero_patente,gouvernaurat,jour_de_garde) values (?,?,?,?,?,?,?)";

        try {

            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, ph.getNom_pharmacie());
            ps.setString(2, ph.getAdresse_pharmacie());     
            ps.setString(3, ph.getMail_pharmacie());
            ps.setInt(4, ph.getTelephone_pharmacie());
            ps.setInt(5, ph.getNumero_patente());
            ps.setString(6, ph.getGouvernaurat());
            ps.setString(7, ph.getJour_de_garde());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }
    public void updatePharmacie(Pharmacie ph) {
        String requete = "update pharmacies set Nom_pharmacie=?,Adresse_pharmacie=?,Mail_pharmacie=?,Telephone_pharmacie=?,Numero_patente=?,Gouvernaurat=?,Jour_de_garde=? where id_pharmacie=?";

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
    public void deletePharmacie(int num) {
        String requete = "delete from pharmacies where id_pharmacie=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("pharmacie supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public List<Pharmacie> DisplayAllPharmacies() {
        
        List<Pharmacie> listpharmacie = new ArrayList<Pharmacie>();

        String requete = "select * from Pharmacies";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Pharmacie pharmacie = new Pharmacie();
                pharmacie.setId_pharmacie(resultat.getInt(1));
                pharmacie.setNom_pharmacie(resultat.getString(2));
                pharmacie.setAdresse_pharmacie(resultat.getString(3));
                pharmacie.setMail_pharmacie(resultat.getString(4));
                pharmacie.setTelephone_pharmacie(resultat.getInt(5));
                pharmacie.setNumero_patente(resultat.getInt(6));
                pharmacie.setGouvernaurat(resultat.getString(7));
                pharmacie.setJour_de_garde(resultat.getString(8));

                listpharmacie.add(pharmacie);
            }
            return listpharmacie;
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Pharmacies " + ex.getMessage());
            return null;
        }
    
    }
    
    
}
