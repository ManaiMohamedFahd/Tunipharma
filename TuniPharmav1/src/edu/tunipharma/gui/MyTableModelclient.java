/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tunipharma.gui;

import edu.tunipharma.dao.ClientDAO;
import edu.tunipharma.entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Houssem Eddine
 */
public class MyTableModelclient extends AbstractTableModel {

    List<Client> listClient = new ArrayList<Client>();
    String []header = {"id","Nom","Prenom","Adresse_mail"};
          

    public MyTableModelclient() { //remplissage de la liste des stocks
        listClient=new ClientDAO().DisplayAllDetailsAClients();
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return listClient.size();
    }

    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
           
            case 0 : 
                return  listClient.get(rowIndex).getId();
            case 1://colonne type_vetement
                return listClient.get(rowIndex).getNom();
            case 2://colonne quantité
                return listClient.get(rowIndex).getPrenom();
            case 3:
                return listClient.get(rowIndex).getAdresse_mail();
           
            
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}
