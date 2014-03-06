/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.gui;

import edu.tunipharma.dao.PharmacienDAO;
import edu.tunipharma.entities.Pharmacien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author azerty
 */
public class MyTableModelPhrn extends AbstractTableModel {
    
    List<Pharmacien> Pharmaciens = new ArrayList<Pharmacien>();
    String []header = {"Id Pharmacien ","Cin","Nom","Prénom","Tel Portable","Email","Id Pharmacie"};

    public MyTableModelPhrn() { //remplissage de la liste des stocks
        Pharmaciens=new PharmacienDAO().DisplayAllPharmaciens();
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return Pharmaciens.size();
    }
public void removeRow(int row) {
        Pharmaciens.remove(row);
    }
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return Pharmaciens.get(rowIndex).getId_phc();
            case 1://colonne id_Stock
                return Pharmaciens.get(rowIndex).getCin();
            case 2://colonne type_vetement
                return Pharmaciens.get(rowIndex).getNom();
            case 3://colonne g
                return Pharmaciens.get(rowIndex).getPrenom();
            case 4://colonne adresse depot
                return Pharmaciens.get(rowIndex).getTelP();
            case 5://colonne adresse depot
                return Pharmaciens.get(rowIndex).getEmail();
           case 6:
                return Pharmaciens.get(rowIndex).getId_ph();
           
                   
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
}
