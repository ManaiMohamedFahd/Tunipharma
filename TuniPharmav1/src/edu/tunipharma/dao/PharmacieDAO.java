/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.dao;

import edu.tunipharma.entities.Pharmacie;
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
public class PharmacieDAO {
    public void insertPharmacie(Pharmacie p){

        String requete = "insert into pharmacie (nom_ph,tel,fax,adresse,type,gouvernorat,garde) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getNom_ph());
            ps.setInt(2, p.getTel());
            ps.setInt(3, p.getFax());
            ps.setString(4, p.getAdresse());
            ps.setString(5, p.getType());
            ps.setString(6, p.getGouvernorat());
            ps.setString(7, p.getGarde());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
        
         
      public void updatePharmacie(Pharmacie  p){
        String requete = "update pharmacie set nom_ph=?,tel=?,fax=?,adresse=?,type=?,gouvernorat=?,garde=? where id_ph=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(8, p.getId_ph());
            ps.setString(1, p.getNom_ph());
            ps.setInt(2, p.getTel());
            ps.setInt(3, p.getFax());
            ps.setString(4, p.getAdresse());
            ps.setString(5, p.getType());
            ps.setString(6, p.getGouvernorat());
            ps.setString(7, p.getGarde());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deletePharmacie (int id_ph){
        String requete = "delete from Pharmacie where id_ph=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_ph);
            ps.executeUpdate();
            System.out.println("Pharmacie supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Pharmacie  findPharmacieById(int id_ph){
    Pharmacie  pharmacie  = new Pharmacie ();
     String requete = "select * from pharmacie where id_ph=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_ph);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                pharmacie.setId_ph(resultat.getInt(1));
                pharmacie.setNom_ph(resultat.getString(2));
                pharmacie.setAdresse(resultat.getString(5));
                pharmacie.setType(resultat.getString(6));
                pharmacie.setTel(resultat.getInt(3));
                pharmacie.setFax(resultat.getInt(4));
                pharmacie.setGouvernorat(resultat.getString(7));
                pharmacie.setGarde(resultat.getString(8));
            }
            return pharmacie;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pharmacie "+ex.getMessage());
            return null;
        }
    }

    public Pharmacie  findPharmacieByAdresse (String adresse){
    Pharmacie  pharmacie  = new Pharmacie ();
     String requete = "select * from pharmacie where adresse = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, adresse);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                pharmacie.setId_ph(resultat.getInt(1));
                System.out.println("testttttttt"+pharmacie.getId_ph());
                pharmacie.setAdresse(resultat.getString(5));
                System.out.println(resultat.getString(5));
                pharmacie.setType(resultat.getString(6));
                System.out.println(resultat.getString(6));
                pharmacie.setTel(resultat.getInt(3));
                System.out.println(resultat.getInt(3));
                pharmacie.setFax(resultat.getInt(4));
                System.out.println(resultat.getInt(4));
                pharmacie.setNom_ph(resultat.getString(2));
                System.out.println(resultat.getString(2));
                pharmacie.setGouvernorat(resultat.getString(7));
                System.out.println(resultat.getString(7));
                pharmacie.setGarde(resultat.getString(8));
                System.out.println(resultat.getString(8));
                
                
            }
            return pharmacie ;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pharmacie "+ex.getMessage());
            return null;
        }
    }
    
    
    public List<Pharmacie> findPharmacieByGouvernements(String gouvernorat){
        
        List<Pharmacie> ListeDePharmacies = new ArrayList<Pharmacie>();
        String requete = "select * from pharmacie where gouvernorat = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,gouvernorat );
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
                {
                    Pharmacie pharmacie =new Pharmacie();
                pharmacie.setId_ph(resultat.getInt(1));
                System.out.println("testttttttt"+pharmacie.getId_ph());
                pharmacie.setAdresse(resultat.getString(5));
                System.out.println(resultat.getString(5));
                pharmacie.setType(resultat.getString(6));
                System.out.println(resultat.getString(6));
                pharmacie.setTel(resultat.getInt(3));
                System.out.println(resultat.getInt(3));
                pharmacie.setFax(resultat.getInt(4));
                System.out.println(resultat.getInt(4));
                pharmacie.setNom_ph(resultat.getString(2));
                System.out.println(resultat.getString(2));
                pharmacie.setGouvernorat(resultat.getString(7));
                System.out.println(resultat.getString(7));
                pharmacie.setGarde(resultat.getString(8));
                System.out.println(resultat.getString(8));
                
                ListeDePharmacies.add(pharmacie);
            }
            return ListeDePharmacies;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pharmacie "+ex.getMessage());
            return null;
                
                
                }
    }
    
    
    public List<Pharmacie> findPharmacieByType(String type){
        
        List<Pharmacie> TypeDePharmacies = new ArrayList<Pharmacie>();
        String requete = "select * from pharmacie where type = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,type );
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
                {
                    Pharmacie pharmacie =new Pharmacie();
                pharmacie.setId_ph(resultat.getInt(1));
                System.out.println("testttttttt"+pharmacie.getId_ph());
                pharmacie.setAdresse(resultat.getString(5));
                System.out.println(resultat.getString(5));
                pharmacie.setType(resultat.getString(6));
                System.out.println(resultat.getString(6));
                pharmacie.setTel(resultat.getInt(3));
                System.out.println(resultat.getInt(3));
                pharmacie.setFax(resultat.getInt(4));
                System.out.println(resultat.getInt(4));
                pharmacie.setNom_ph(resultat.getString(2));
                System.out.println(resultat.getString(2));
                pharmacie.setGouvernorat(resultat.getString(7));
                System.out.println(resultat.getString(7));
                pharmacie.setGarde(resultat.getString(8));
                System.out.println(resultat.getString(8));
                
                TypeDePharmacies.add(pharmacie);
            }
            return TypeDePharmacies;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pharmacie "+ex.getMessage());
            return null;
                
                
                }
    }

    public List<Pharmacie> DisplayAllPharmacies(){


        List<Pharmacie> listepharmacies = new ArrayList<Pharmacie>();

        String requete = "select * from pharmacie";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                
                Pharmacie pharmacie =new Pharmacie();
                pharmacie.setId_ph(resultat.getInt(1));
                pharmacie.setNom_ph(resultat.getString(2));
                pharmacie.setAdresse(resultat.getString(5));
                pharmacie.setType(resultat.getString(6));
                pharmacie.setTel(resultat.getInt(3));
                pharmacie.setFax(resultat.getInt(4));
                pharmacie.setGouvernorat(resultat.getString(7));
                pharmacie.setGarde(resultat.getString(8));
                

                listepharmacies.add(pharmacie);
            }
            return listepharmacies;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des Pharmacie "+ex.getMessage());
            return null;
        }
    }
    
}
