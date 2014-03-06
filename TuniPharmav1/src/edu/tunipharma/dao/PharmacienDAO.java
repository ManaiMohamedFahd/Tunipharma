/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.dao;

import edu.tunipharma.entities.Pharmacien;
import edu.tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author azerty
 */
public class PharmacienDAO {
    public void insertPharmacien(Pharmacien ph){

        String requete = "insert into pharmacien (cin,nom,prenom,Telp,Email,id_ph) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
          //  ps.setInt(1, ph.getId_phc());
            ps.setInt(1, ph.getCin());
            ps.setString(2, ph.getNom());
            ps.setString(3, ph.getPrenom());
            ps.setInt(4, ph.getTelP());
            ps.setString(5, ph.getEmail());
            ps.setInt(6, ph.getId_ph());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updatePharmacien(Pharmacien  ph){
        String requete = "update pharmacien set cin=?,nom=?,prenom=?,telP=?,email=?,id_ph=? where id_phc=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(7, ph.getId_phc());
            ps.setInt(1, ph.getCin());
            ps.setString(2, ph.getNom());
            ps.setString(3, ph.getPrenom());
            ps.setInt(4, ph.getTelP());
            ps.setString(5, ph.getEmail());
            ps.setInt(6, ph.getId_ph());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deletePharmacien (int id_phc){
        String requete = "delete from Pharmacien where id_phc=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_phc);
            ps.executeUpdate();
            System.out.println("Pharmacien supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Pharmacien  findPharmacienById(int id_phc){
    Pharmacien  pharmacien  = new Pharmacien ();
     String requete = "select * from pharmacien where id_phc=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_phc);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                pharmacien.setId_phc(resultat.getInt(1));
                pharmacien.setCin(resultat.getInt(2));
                pharmacien.setNom(resultat.getString(3));
                pharmacien.setPrenom(resultat.getString(4));
                pharmacien.setTelP(resultat.getInt(5));
                pharmacien.setEmail(resultat.getString(6));
                pharmacien.setId_ph(resultat.getInt(7));
                
                
                
            }
            return pharmacien;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pharmacien "+ex.getMessage());
            return null;
        }
    }

   
    

    public List<Pharmacien> DisplayAllPharmaciens(){


        List<Pharmacien> listepharmaciens = new ArrayList<Pharmacien>();

        String requete = "select * from pharmacien";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Pharmacien pharmacien =new Pharmacien();
                pharmacien.setId_phc(resultat.getInt(1));
                pharmacien.setCin(resultat.getInt(2));
                pharmacien.setNom(resultat.getString(3));
                pharmacien.setPrenom(resultat.getString(4));
                pharmacien.setTelP(resultat.getInt(5));
                pharmacien.setEmail(resultat.getString(6));
                pharmacien.setId_ph(resultat.getInt(7));

                listepharmaciens.add(pharmacien);
            }
            return listepharmaciens;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Pharmacien "+ex.getMessage());
            return null;
        }
    }
    
}

