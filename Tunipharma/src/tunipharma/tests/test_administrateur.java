/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.tests;

import com.mysql.jdbc.Blob;
import tunipharma.dao.AdministrateurDAO;
import tunipharma.entities.Administrateurs;

/**
 *
 * @author HOOD
 */
public class test_administrateur {

    public static void main(String[] args) {
                java.util.Date Date_Naissance = new java.util.Date(90,01, 02);
                
                
                java.sql.Date sqlDate = new java.sql.Date(Date_Naissance.getTime());
                //java.sql.Blob sqlBlob = new 
        Administrateurs administrateurs = new Administrateurs();
        AdministrateurDAO administrateurDAO = new AdministrateurDAO();
        administrateurs.setNom("fahd");
        administrateurs.setPrenom("manai");
        administrateurs.setDate_Naissance(Date_Naissance);
        //administrateur.setPhoto(photo);
        administrateurs.setSexe("Homme");
        administrateurs.setAdresse("1 Rue ibn abuu zammaa Jendouba Tunisie");
        administrateurs.setAdresse_mail("mohamedfahd.manai@esprit.tn");
        administrateurs.setMot_de_passe("azerty722mc");
        administrateurs.setNumero_telephone(23332518);
        //  administrateur.setimage(null);
        administrateurDAO.insertAdministrateur(administrateurs);
    }

}
