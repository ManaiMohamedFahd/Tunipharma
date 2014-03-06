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
public class Medicament {
    private int id_mdc;
    private String ref;
    private String libelle;
    private String type;
    private Float prix;
    private int id_ph;
    
    public Medicament (int id_mdc ,String ref ,String libelle ,String type ,Float prix ,int id_ph){
        this.id_mdc=id_mdc;
        this.ref=ref;
        this.libelle=libelle;
        this.type=type;
        this.prix=prix;
        this.id_ph=id_ph;
    }
    
    public Medicament(){}
    
    public void setId_mdc(int id_mdc){
        this.id_mdc=id_mdc;
    }
    
    public void setRef(String ref){
        this.ref=ref;
    }
    
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }
    
    public void setType(String type){
        this.type=type;
    }
    
    public void setPrix(Float prix){
        this.prix=prix;
    }
    
    public void setId_ph(int id_ph){
        this.id_ph=id_ph;
    }
    
    public int getId_mdc(){
        return id_mdc;
    }
    
    public String getRef(){
        return ref;
    }
    
    public String getLibelle(){
        return libelle;
    }
    
    public String getType(){
        return type;
    }
    
    public Float getPrix(){
        return prix;
    }
    
    public int getId_ph(){
        return id_ph;
    }
            
}
