/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.dao;

import edu.tunipharma.entities.Medicament;
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
public class MedicamentDAO {
     public void insertMedicament(Medicament m){

        String requete = "insert into medicament (ref,libelle,type,prix,id_ph) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           // ps.setInt(1, m.getId_mdc());
            ps.setString(1, m.getRef());
            ps.setString(2, m.getLibelle());
            ps.setString(3, m.getType());
            ps.setFloat(4, m.getPrix());
            ps.setInt(5, m.getId_ph());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateMedicament(Medicament  m){
        String requete = "update medicament set ref=?,libelle=?,type=?,prix=?,id_ph=? where id_mdc=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(6, m.getId_mdc());
            ps.setString(1, m.getRef());
            ps.setString(2, m.getLibelle());
            ps.setString(3, m.getType());
            ps.setFloat(4, m.getPrix());
            ps.setInt(5, m.getId_ph());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteMedicament (int id_mdc){
        String requete = "delete from medicament where id_mdc=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_mdc);
            ps.executeUpdate();
            System.out.println("medicament supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Medicament findMedicamentById(int id_mdc){
    Medicament  medicament  = new Medicament();
     String requete = "select * from medicament where id_mdc=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_mdc);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                medicament.setId_mdc(resultat.getInt(1));
                medicament.setRef(resultat.getString(2));
                medicament.setLibelle(resultat.getString(3));
                medicament.setType(resultat.getString(4));
                medicament.setPrix(resultat.getFloat(5));
                medicament.setId_ph(resultat.getInt(6));
                
                
            }
            return medicament;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du medicament "+ex.getMessage());
            return null;
        }
    }

   
    

    public List<Medicament> DisplayAllMedicaments(){


        List<Medicament> listemedicaments = new ArrayList<Medicament>();

        String requete = "select * from medicament";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Medicament medicament =new Medicament();
                 medicament.setId_mdc(resultat.getInt(1));
                 medicament.setRef(resultat.getString(2));
                 medicament.setLibelle(resultat.getString(3));
                 medicament.setType(resultat.getString(4));
                 medicament.setPrix(resultat.getFloat(5));
                 medicament.setId_ph(resultat.getInt(6));

                listemedicaments.add(medicament);
            }
            return listemedicaments;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des medicaments "+ex.getMessage());
            return null;
        }
    }
     public List<Medicament> findMedicamentByType(String type){
        
        List<Medicament> TypeDeMedicament = new ArrayList<Medicament>();
        String requete = "select * from medicament where type = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,type );
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
                {
                    Medicament mdc =new Medicament();
                mdc.setId_mdc(resultat.getInt(1));
                System.out.println("testttttttt"+mdc.getId_mdc());
                mdc.setRef(resultat.getString(2));
                System.out.println(resultat.getString(2));
                mdc.setLibelle(resultat.getString(3));
                System.out.println(resultat.getString(3));
                mdc.setType(resultat.getString(4));
                System.out.println(resultat.getString(4));
                mdc.setPrix(resultat.getFloat(5));
                System.out.println(resultat.getInt(5));
                mdc.setId_ph(resultat.getInt(6));
                System.out.println(resultat.getInt(6));
                
                
                TypeDeMedicament.add(mdc);
            }
            return TypeDeMedicament;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du pharmacie "+ex.getMessage());
            return null;
                
                
                }
    }
    
}
