/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.tunipharma.gui;

import edu.tunipharma.dao.ServiceDAO;
import edu.tunipharma.entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author azerty
 */
public class MyTableModelSrv extends AbstractTableModel {

    List<Service> Service = new ArrayList<Service>();
    String []header = {"Id Service ","Prix","Type","Id Pharmacie"};

    public MyTableModelSrv() { //remplissage de la liste des stocks
        Service=new ServiceDAO().DisplayAllServices();
    }
    
    public int getRowCount() { //nombre de lignes de la table
        return Service.size();
    }
public void removeRow(int row) {
        Service.remove(row);
    }
    public int getColumnCount() { //nombre de colonnes de la table
        return header.length;
    }

    //récupération de chaque élément de la table
    public Object getValueAt(int rowIndex, int columnIndex) { 
        switch (columnIndex) {// parcour par colonne
            case 0://colonne id_Stock
                return Service.get(rowIndex).getId_sr();
            case 1://colonne id_Stock
                return Service.get(rowIndex).getPrix_sr();
            case 2://colonne g
                return Service.get(rowIndex).getType_sr();
            case 3://colonne adresse depot
                return Service.get(rowIndex).getId_ph();
                 
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
}
