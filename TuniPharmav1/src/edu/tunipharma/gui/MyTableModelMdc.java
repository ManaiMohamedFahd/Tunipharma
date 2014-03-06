/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.gui;

import edu.tunipharma.entities.Medicament;
import java.util.ArrayList;
import java.util.List;
import edu.tunipharma.dao.MedicamentDAO;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author azerty
 */
public class MyTableModelMdc extends AbstractTableModel{
    List<Medicament> medicaments = new ArrayList<Medicament>();
    String []header = {"id_Medicament ","Refférence","Libelle","Type","Prix","id_pharmacie"};

    public MyTableModelMdc() { //remplissage de la liste des stocks
        medicaments=new MedicamentDAO().DisplayAllMedicaments();
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return medicaments.size();
    }
public void removeRow(int row) {
        medicaments.remove(row);
    }
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return medicaments.get(rowIndex).getId_mdc();
            case 1://colonne id_Stock
                return medicaments.get(rowIndex).getRef();
            case 2://colonne type_vetement
                return medicaments.get(rowIndex).getLibelle();
            case 3://colonne g
                return medicaments.get(rowIndex).getType();
            case 4://colonne adresse depot
                return medicaments.get(rowIndex).getPrix();
            case 5://colonne adresse depot
                return medicaments.get(rowIndex).getId_ph();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
}
