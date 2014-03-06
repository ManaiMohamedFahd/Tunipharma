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
public class Administrateur {
    private int id_ad;
    private String login ;
    private String pwd ;
    
    public Administrateur (int id_ad ,String login , String pwd){
        this.id_ad=id_ad ;
        this.login=login ;
        this.pwd = pwd ;
    }
    
    public Administrateur (){}
    
    public void setId_ad(int id_ad){
        this.id_ad=id_ad;
    }
    
    public void setLogin (String login){
        this.login=login;
    }
    
    public void setPwd (String pwd){
        this.pwd=pwd;
    }
    
    public int getId_ad(){
        return id_ad;
    }
    
    public String getLogin (){
        return login;
    }
    
    public String getPwd (){
        return pwd ;
    }
    
    
}
