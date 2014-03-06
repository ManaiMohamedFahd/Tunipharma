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
public class Service {
    private int id_sr;
    private Float prix_sr;
    private String type_sr;
    private int id_ph;
    
    public Service(int id_sr ,Float prix_sr ,String type_sr ,int id_ph){
        this.id_sr=id_sr;
        this.prix_sr=prix_sr;
        this.type_sr=type_sr;
        this.id_ph=id_ph;
    }
    
    public Service(){}
    
    public void setId_sr(int id_sr){
        this.id_sr=id_sr;
    }
    
    public void setPrix_sr(Float prix_sr){
        this.prix_sr=prix_sr;
    }
    
    public void setType_sr(String type_sr){
        this.type_sr=type_sr;
    }
    
    public void setId_ph(int id_ph){
        this.id_ph=id_ph;
    }
    
    public int getId_sr(){
        return id_sr;
    }
    
    public Float getPrix_sr(){
        return prix_sr;
    }
    
    public String getType_sr(){
        return type_sr;
    }
    
    public int getId_ph(){
        return id_ph;
    }
}
