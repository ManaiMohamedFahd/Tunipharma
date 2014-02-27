/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.tests;

import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Pharmacie;

/**
 *
 * @author user
 */
public class test_pharmacie {
    public static void main(String[] args) {
                
                //java.sql.Blob sqlBlob = new 
        Pharmacie pharmacie = new Pharmacie();
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        pharmacie.setNom_pharmacie("haythem");
        pharmacie.setAdresse_pharmacie("chagouani");
        pharmacie.setMail_pharmacie("chagouani@dd.com");
        pharmacie.setTelephone_pharmacie(222);
        pharmacie.setNumero_patente(44);
        pharmacie.setGouvernaurat("ben arous");
        pharmacie.setJour_de_garde("nongarde");
        
        //  administrateur.setimage(null);
        pharmacieDAO.insertPharmacie(pharmacie);
    
}
}
