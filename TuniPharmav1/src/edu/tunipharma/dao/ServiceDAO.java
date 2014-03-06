/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.dao;

import edu.tunipharma.entities.Service;
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
public class ServiceDAO {
     public void insertService(Service s){

        String requete = "insert into service (prix_sr,type_sr,id_ph) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           // ps.setInt(1, s.getId_sr());
            ps.setString(2, s.getType_sr());
            ps.setFloat(1, s.getPrix_sr());
            ps.setInt(3, s.getId_ph());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateService(Service  s){
        String requete = "update service set prix_sr=?,type_sr=?,id_ph=? where id_sr=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(4, s.getId_sr());
            ps.setString(2, s.getType_sr());
            ps.setFloat(1, s.getPrix_sr());
            ps.setInt(3, s.getId_ph());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteService (int id_sr){
        String requete = "delete from service where id_sr=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_sr);
            ps.executeUpdate();
            System.out.println("service supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Service findServiceById(int id_sr){
    Service  service  = new Service();
     String requete = "select * from service where id_sr=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_sr);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                service.setId_sr(resultat.getInt(1));
                service.setPrix_sr(resultat.getFloat(2));
                service.setType_sr(resultat.getString(3));
                service.setId_ph(resultat.getInt(4));
                
                
            }
            return service;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du service "+ex.getMessage());
            return null;
        }
    }

   
    

    public List<Service> DisplayAllServices(){


        List<Service> listeservices = new ArrayList<Service>();

        String requete = "select * from service";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Service service =new Service();
                service.setId_sr(resultat.getInt(1));
                service.setPrix_sr(resultat.getFloat(2));
                service.setType_sr(resultat.getString(3));
                 service.setId_ph(resultat.getInt(4));;

                listeservices.add(service);
            }
            return listeservices;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des services "+ex.getMessage());
            return null;
        }
    }
    
}
