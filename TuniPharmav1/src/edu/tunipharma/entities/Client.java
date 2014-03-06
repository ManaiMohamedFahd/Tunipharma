/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tunipharma.entities;

import java.util.Date;

/**
 *
 * @author Mohamed
 */
public class Client {
            private int id;
            private String Nom;
            private String Prenom;
            private String Sexe;
            private String Date_Naissance;
            private String Adresse_mail;
            private String Gouvernaurat;
            private String Ville;
            private String Adresse;
            private String Mot_de_passe;
            
            
            

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

    public String getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(String Date_Naissance) {
        this.Date_Naissance = Date_Naissance;
    }

    public String getAdresse_mail() {
        return Adresse_mail;
    }

    public void setAdresse_mail(String Adresse_mail) {
        this.Adresse_mail = Adresse_mail;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getMot_de_passe() {
        return Mot_de_passe;
    }

    public void setMot_de_passe(String Mot_de_passe) {
        this.Mot_de_passe = Mot_de_passe;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getGouvernaurat() {
        return Gouvernaurat;
    }

    public void setGouvernaurat(String Gouvernaurat) {
        this.Gouvernaurat = Gouvernaurat;
    }
            
            
    
}
