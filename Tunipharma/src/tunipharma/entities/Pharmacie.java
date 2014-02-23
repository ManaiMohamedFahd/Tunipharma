/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author user
 */
public class Pharmacie {
    private int id_pharmacie;
    private String nom_pharmacie;
    private String adresse_pharmacie;
    private String mail_pharmacie;
    private int telephone_pharmacie;
    private int numero_patente;
    private String gouvernaurat;
    private String jour_de_garde;

    public int getId_pharmacie() {
        return id_pharmacie;
    }

    public void setId_pharmacie(int id_pharmacie) {
        this.id_pharmacie = id_pharmacie;
    }

    public String getNom_pharmacie() {
        return nom_pharmacie;
    }

    public void setNom_pharmacie(String nom_pharmacie) {
        this.nom_pharmacie = nom_pharmacie;
    }

    public String getAdresse_pharmacie() {
        return adresse_pharmacie;
    }

    public void setAdresse_pharmacie(String adresse_pharmacie) {
        this.adresse_pharmacie = adresse_pharmacie;
    }

    public String getMail_pharmacie() {
        return mail_pharmacie;
    }

    public void setMail_pharmacie(String mail_pharmacie) {
        this.mail_pharmacie = mail_pharmacie;
    }

    public int getTelephone_pharmacie() {
        return telephone_pharmacie;
    }

    public void setTelephone_pharmacie(int telephone_pharmacie) {
        this.telephone_pharmacie = telephone_pharmacie;
    }

    

    public int getNumero_patente() {
        return numero_patente;
    }

    public void setNumero_patente(int numero_patente) {
        this.numero_patente = numero_patente;
    }

    public String getGouvernaurat() {
        return gouvernaurat;
    }

    public void setGouvernaurat(String gouvernaurat) {
        this.gouvernaurat = gouvernaurat;
    }

    public String getJour_de_garde() {
        return jour_de_garde;
    }

    public void setJour_de_garde(String jour_de_garde) {
        this.jour_de_garde = jour_de_garde;
    }
    
    
    
}
