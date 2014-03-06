/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tunipharma.gui;


import edu.tunipharma.dao.AdministrateurDAO;
import edu.tunipharma.entities.Administrateurs;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HOOD
 */
public class MyTableModeladmin extends AbstractTableModel {

    List<Administrateurs> listAdministrateurs = new ArrayList<Administrateurs>();
    String[] header = {"id", "Nom", "Prenom", "adresse", "adresse_mail", "Mot_de_passe","Date_Naissance", "Photo", "Sexe",  "Numero_telephone"};

    public MyTableModeladmin() { //remplissage de la liste des Administrateur
        listAdministrateurs = new AdministrateurDAO().DisplayAllAdministrateurs();
    }

    public int getRowCount() { //nombre de lignes de la table
        return listAdministrateurs.size();
    }

    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }
    //récupération de chaque élément de la table

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id
                return listAdministrateurs.get(rowIndex).getId();
            case 1://colonne Nom
                return listAdministrateurs.get(rowIndex).getNom();
            case 2://colonne Prenom
                return listAdministrateurs.get(rowIndex).getPrenom();
                case 3://colonne adresse
                return listAdministrateurs.get(rowIndex).getAdresse();
            case 4://colonne adresse mail
                return listAdministrateurs.get(rowIndex).getAdresse_mail();
            case 5://colonnemot de passe
                return listAdministrateurs.get(rowIndex).getMot_de_passe(); 
            case 6://colonne date de naissance
                return listAdministrateurs.get(rowIndex).getDate_Naissance();
            case 7://colonne Photo
                return listAdministrateurs.get(rowIndex).getPhoto();
            case 8://colonne Sexe
                return listAdministrateurs.get(rowIndex).getSexe();
            
            case 9://colonne numéro telephone
                return listAdministrateurs.get(rowIndex).getNumero_telephone(); 


            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column];
    }
}