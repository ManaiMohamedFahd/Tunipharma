/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tunipharma.gui;


import edu.tunipharma.dao.PharmacieDAO;
import edu.tunipharma.entities.Pharmacie;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Houssem Eddine
 */
public class MyTableModel extends AbstractTableModel {

    List<Pharmacie> Pharmacies = new ArrayList<Pharmacie>();
    String []header = {"id ","Nom pharmacie","Telephone","Fax","Adresse","Type","Gouvernorat","Garde"};

    public MyTableModel() { //remplissage de la liste des stocks
        Pharmacies=new PharmacieDAO().DisplayAllPharmacies();
        
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return Pharmacies.size();
    }
public void removeRow(int row) {
        Pharmacies.remove(row);
    }
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return Pharmacies.get(rowIndex).getId_ph();
            case 1://colonne id_Stock
                return Pharmacies.get(rowIndex).getNom_ph();
            case 2://colonne type_vetement
                return Pharmacies.get(rowIndex).getTel();
            case 3://colonne g
                return Pharmacies.get(rowIndex).getFax();
            case 4://colonne adresse depot
                return Pharmacies.get(rowIndex).getAdresse();
            case 5://colonne adresse depot
                return Pharmacies.get(rowIndex).getType();
            case 6:
                return Pharmacies.get(rowIndex).getGouvernorat();
            case 7:
                return Pharmacies.get(rowIndex).getGarde();
                   
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    

}
