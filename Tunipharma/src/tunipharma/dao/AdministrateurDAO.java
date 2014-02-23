/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.dao;

import tunipharma.entities.Administrateurs;
import tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Hood
 */
public class AdministrateurDAO {

    public void insertAdministrateur(Administrateurs ad) {

        // AdministrateurDAO administrateurdao=new AdministrateurDAO();
        java.util.Date Date_Naissance = new java.util.Date(90, 01, 02);
        //year = year + 1900 
        //mois = mois + 1
        java.sql.Date sqlDate = new java.sql.Date(Date_Naissance.getTime());
        String requete = "insert into administrateur  (Nom,Prenom,Date_Naissance,sexe,adresse,adresse_mail,Mot_de_passe,Numero_telephone) values (?,?,?,?,?,?,?,?)";

        try {

            //Administrateur=Administrateurdao.findAdministrateurById(st.getAdministrateur().getId());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, ad.getNom());
            ps.setString(2, ad.getPrenom());
            ps.setDate(3, sqlDate);
           
            ps.setString(4, ad.getSexe());
            ps.setString(5, ad.getAdresse());
            ps.setString(6, ad.getAdresse_mail());
            ps.setString(7, ad.getMot_de_passe());
            ps.setInt(8, ad.getNumero_telephone());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

    public void updateAdministrateur(Administrateurs ad) {
        String requete = "update Administrateur set Nom=?,Prenom=?,e_mail=?,mot_de_passe=?,pseudo=?,Date_de_naissance=?,CIN=?,Numero_Telephone=?  where id=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getNom());
            ps.setString(2, ad.getPrenom());
            ps.setDate(3, (java.sql.Date) ad.getDate_Naissance());
            ps.setBlob(4, ad.getPhoto());
            ps.setString(5, ad.getSexe());
            ps.setString(6, ad.getAdresse());
            ps.setString(7, ad.getAdresse_mail());
            ps.setString(8, ad.getMot_de_passe());
            ps.setInt(9, ad.getNumero_telephone());
            //ps.setString(9,ad.getImage_Profil());
           // ps.setInt(10, ad.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void deleteAdministrateur(int id) {
        String requete = "delete from pseudo where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Pseudo supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public Administrateurs findAdministrateurById(int id) {
        Administrateurs administrateur = new Administrateurs();
        String requete = "select * from Administrateur where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                administrateur.setId(resultat.getInt(1));
                administrateur.setNom(resultat.getString(2));
                administrateur.setPrenom(resultat.getString(3));
                administrateur.setDate_Naissance(resultat.getDate(4));
                administrateur.setPhoto(resultat.getBlob(5));
                administrateur.setSexe(resultat.getString(6));
                administrateur.setAdresse(resultat.getString(7));
                administrateur.setAdresse_mail(resultat.getString(8));
                administrateur.setMot_de_passe(resultat.getString(9));
                administrateur.setNumero_telephone(resultat.getInt(10));
//              administrateur.setImage_Profil(resultat.getImage(11));

            }
            return administrateur;

        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du administrateur " + ex.getMessage());
            return null;
        }
    }

    public Administrateurs findaAdministrateurByNom(String nom) {
        Administrateurs administrateur = new Administrateurs();
        String requete = "select * from Administrateur where Nom = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                administrateur.setId(resultat.getInt(1));
                System.out.println(resultat.getString(1));
                administrateur.setNom(resultat.getString(2));
                System.out.println(resultat.getString(2));
                administrateur.setPrenom(resultat.getString(3));
                System.out.println(resultat.getString(3));
                administrateur.setDate_Naissance(resultat.getDate(4));
                System.out.println(resultat.getDate(4));
                administrateur.setPhoto(resultat.getBlob(5));
                System.out.println(resultat.getString(5));
                administrateur.setSexe(resultat.getString(6));
                System.out.println(resultat.getString(6));
                administrateur.setAdresse(resultat.getString(7));
                System.out.println(resultat.getString(7));
                administrateur.setAdresse_mail(resultat.getString(8));
                System.out.println(resultat.getString(8));
                administrateur.setMot_de_passe(resultat.getString(9));
                System.out.println(resultat.getString(9));
                administrateur.setNumero_telephone(resultat.getInt(10));
                System.out.println(resultat.getInt(10));
//              administrateur.setImage_Profil(resultat.getImage(11));
//              System.out.println(resultat.getString(11));
            }
            return administrateur;

        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du administrateur " + ex.getMessage());
            return null;
        }
    }

    public List<Administrateurs> DisplayAllAdministrateurs() {

        List<Administrateurs> listeAdministrateurs = new ArrayList<Administrateurs>();

        String requete = "select * from Administrateur";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Administrateurs administrateur = new Administrateurs();
                administrateur.setId(resultat.getInt(1));
                administrateur.setNom(resultat.getString(2));
                administrateur.setPrenom(resultat.getString(3));
                administrateur.setDate_Naissance(resultat.getDate(4));
                administrateur.setPhoto(resultat.getBlob(5));
                administrateur.setSexe(resultat.getString(6));
                administrateur.setAdresse(resultat.getString(7));
                administrateur.setAdresse_mail(resultat.getString(8));
                administrateur.setMot_de_passe(resultat.getString(9));
                administrateur.setNumero_telephone(resultat.getInt(10));
//              administrateur.setImage_Profil(resultat.getImage(11));

                listeAdministrateurs.add(administrateur);
            }
            return listeAdministrateurs;
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs " + ex.getMessage());
            return null;
        }
    }
}