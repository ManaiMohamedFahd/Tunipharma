/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tunipharma.entities;
import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author HOOD
 */
public class Administrateurs {
    
            private int id;
            private String Nom;
            private String Prenom;
            private Date Date_Naissance;
            private Blob Photo;
            private String Sexe;
            private String adresse;
            private String adresse_mail;
            private String Mot_de_passe;
            private int    Numero_telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public Date getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(Date Date_Naissance) {
        this.Date_Naissance = Date_Naissance;
    }

    public Blob getPhoto() {
        return Photo;
    }

    public void setPhoto(Blob Photo) {
        this.Photo = Photo;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String Adresse) {
        this.adresse = Adresse;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public String getMot_de_passe() {
        return Mot_de_passe;
    }

    public void setMot_de_passe(String Mot_de_passe) {
        this.Mot_de_passe = Mot_de_passe;
    }

    public int getNumero_telephone() {
        return Numero_telephone;
    }

    public void setNumero_telephone(int Numero_telephone) {
        this.Numero_telephone = Numero_telephone;
    }

    public void setDate_Naissance(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDate(Date Date_de_naissance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
            
            
           
            
    
}
