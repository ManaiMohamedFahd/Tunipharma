/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tunipharma.dao;

import edu.tunipharma.entities.Client;
import edu.tunipharma.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mohamed
 */
public class ClientDAO {
    
    public void insertClient(Client cl){
        
       java.util.Date Date_Naissance = new java.util.Date(90, 01, 02);
       java.sql.Date sqlDate = new java.sql.Date(Date_Naissance.getTime());
       String requete = "insert into clients  (Nom,Prenom,Sexe,Date_Naissance,Adresse_mail,Gouvernaurat,Ville,Adresse,Mot_de_passe) values (?,?,?,?,?,?,?,?,?)";
       try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getPrenom());
            ps.setString(3, cl.getSexe());
            ps.setDate(4, sqlDate);
            ps.setString(5, cl.getAdresse_mail());
            ps.setString(6, cl.getGouvernaurat());
            ps.setString(7, cl.getVille());
            ps.setString(8, cl.getAdresse());
            ps.setString(9, cl.getMot_de_passe());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
    
     public void updateClient(Client cl, Date sqlDate) {
        String requete = "update Client set Nom=?,Prenom=?,Sexe=?,Date_Naissance=?,Adresse_mail=?,Gouvernaurat=?,Ville=?,Adresse=?=,mot_de_passe=?  where id=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getPrenom());
            ps.setString(3, cl.getSexe());
            ps.setDate(4, sqlDate);
            ps.setString(5, cl.getAdresse_mail());
            ps.setString(6, cl.getGouvernaurat());
            ps.setString(7, cl.getVille());
            ps.setString(8, cl.getAdresse());
            ps.setString(9, cl.getMot_de_passe());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
     
       public void deleteClient(int id) {
        String requete = "delete from clients where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Clinet supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(AdministrateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
       
       
       public Client findClientById(int id) {
        Client client = new Client();
        String requete;
        requete = "select * from clients where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                client.setId(resultat.getInt(1));
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setSexe(resultat.getString(4));
                client.setDate_Naissance(resultat.getString(5));
                client.setAdresse_mail(resultat.getString(6));
                client.setGouvernaurat(resultat.getString(7));
                client.setVille(resultat.getString(8));
                client.setAdresse(resultat.getString(9));
                client.setMot_de_passe(resultat.getString(10));
                

            }
            return client;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du administrateur " + ex.getMessage());
            return null;
        }
    }
       
       
       public Client findaClientByNom(String nom) {
        Client client = new Client();
        String requete = "select * from clients where Nom = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                client.setId(resultat.getInt(1));
                System.out.println(resultat.getString(1));
                client.setNom(resultat.getString(2));
                System.out.println(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                System.out.println(resultat.getString(3));
                client.setSexe(resultat.getString(4));
                System.out.println(resultat.getString(4));
                client.setDate_Naissance(resultat.getString(5));
                System.out.println(resultat.getDate(5));
                client.setAdresse_mail(resultat.getString(6));
                System.out.println(resultat.getString(6));
                client.setGouvernaurat(resultat.getString(7));
                System.out.println(resultat.getString(7));
                client.setVille(resultat.getString(8));
                System.out.println(resultat.getString(8));
                client.setAdresse(resultat.getString(9));
                System.out.println(resultat.getString(9));
                client.setMot_de_passe(resultat.getString(10));
                System.out.println(resultat.getString(10));
                
            }
            return client;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du client " + ex.getMessage());
            return null;
        }
    }
       
       public List<Client> DisplayAllAClients() {

        List<Client> listeClient = new ArrayList<Client>();

        String requete = "select * from clients";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Client client = new Client();
                
                client.setId(resultat.getInt(1));
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                client.setSexe(resultat.getString(4));
                client.setDate_Naissance(resultat.getString(5));
                client.setAdresse_mail(resultat.getString(6));
                client.setGouvernaurat(resultat.getString(7));
                client.setVille(resultat.getString(8));
                client.setAdresse(resultat.getString(9));
                client.setMot_de_passe(resultat.getString(10));


                listeClient.add(client);
            }
            return listeClient;
        } catch (SQLException ex) {
            
            System.out.println("erreur lors du chargement des clients " + ex.getMessage());
            return null;
        }
    }
       
              public List<Client> DisplayAllDetailsAClients() {

        List<Client> listeClient = new ArrayList<Client>();

        String requete = "select * from clients";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Client client = new Client();
                
                client.setId(resultat.getInt(1));
                client.setNom(resultat.getString(2));
                client.setPrenom(resultat.getString(3));
                //client.setSexe(resultat.getString(4));
                //client.setDate_Naissance(resultat.getDate(5));
                client.setAdresse_mail(resultat.getString(6));
                //client.setGouvernaurat(resultat.getString(7));
                //client.setVille(resultat.getString(8));
                //client.setAdresse(resultat.getString(9));
                //client.setMot_de_passe(resultat.getString(10));


                listeClient.add(client);
            }
            return listeClient;
        } catch (SQLException ex) {
            
            System.out.println("erreur lors du chargement des clients " + ex.getMessage());
            return null;
        }
    }


 
    

    
    
}
