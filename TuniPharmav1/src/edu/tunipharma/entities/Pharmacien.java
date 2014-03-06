/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.entities;

import javax.print.DocFlavor;

/**
 *
 * @author azerty
 */
public class Pharmacien {
    private int id_phc;
    private int cin;
    private String nom;
    private String prenom;
    private int telP;
    private String email;
    private int id_ph;
    
    public Pharmacien(int id_phc ,int cin ,String nom ,String prenom ,int telP ,String email ,int id_ph){
        this.id_phc=id_phc;
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.telP=telP;
        this.email=email;
        this.id_ph=id_ph;
    }
    
    public Pharmacien(){}
    
    public void setId_phc(int id_phc){
        this.id_phc=id_phc;
    }
    
    public void setCin(int cin){
        this.cin=cin;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    
    public void setTelP(int telP){
        this.telP=telP;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public void setId_ph(int id_ph){
        this.id_ph=id_ph;
    }
    
    
    
    public int getId_phc(){
        return id_phc;
    }
    
    public int getCin(){
        return cin;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return  prenom;
    }
    
    public int getTelP(){
        return telP;
    }
     
    public String getEmail(){
        return email;
    }
    
    public int getId_ph(){
        return id_ph;
    }
    
}
