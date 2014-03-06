/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.entities;

/**
 *
 * @author azerty
 */
public class Pharmacie {
    private int id_ph;
    private String nom_ph;
    private int tel ;
    private int fax ;
    private String adresse;
    private String type ;
    private String gouvernorat ;
    private String garde;
    
    
    
    public Pharmacie (int id_ph ,String nom_ph ,int tel , int fax ,String adresse ,String type ,String gouvernorat ,String garde){
        this.id_ph=id_ph;
        this.nom_ph=nom_ph;
        this.tel=tel;
        this.fax=fax;
        this.adresse=adresse;
        this.type=type;
        this.gouvernorat=gouvernorat;
        this.garde=garde;
       }
    
    public Pharmacie(){}
    
    public void setId_ph(int id_ph){
        this.id_ph=id_ph;
    }
    
    public void setNom_ph(String nom_ph){
        this.nom_ph=nom_ph;
    }
    
    public void setTel(int tel){
        this.tel=tel;
    }
    
    public void setFax(int fax){
        this.fax=fax;
    }
    
    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    
    public void setType(String type){
        this.type=type;
    }
    
    public void setGouvernorat(String gouvernorat){
        this.gouvernorat=gouvernorat;
    } 
    
    public void setGarde(String garde){
        this.garde=garde;
    }
    
     
    
    public int getId_ph(){
        return id_ph;
    }
    
    public String getNom_ph(){
        return  nom_ph;
    }
    
    public int getTel(){
        return tel;
    }
    
    public int getFax(){
        return fax;
    }
    
    public String getAdresse(){
        return adresse;
    }
    
    public String getType(){
        return type;
    }
    
    public String getGouvernorat(){
        return  gouvernorat;
    } 
    
    public String getGarde(){
        return garde;
    }
    
    
    
}
