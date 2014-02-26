/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tunipharma.dao.PharmacieDAO;
import tunipharma.entities.Pharmacie;

/**
 *
 * @author user
 */
public class PharmacieTableModel extends AbstractTableModel{
    
    List<Pharmacie> listpharmacie = new ArrayList<Pharmacie>();
    String []header ={"id_pharmacie","nom_pharmacie","adresse_pharmacie","mail_pharmacie","telephone_pharmacie","numero_patente","gouvernaurat","jour_de_garde"};
    public PharmacieTableModel(){
        listpharmacie=new PharmacieDAO().DisplayAllPharmacies();
    }
    
    @Override
    public int getRowCount() {
        return listpharmacie.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0:
                return listpharmacie.get(rowIndex).getId_pharmacie();
            case 1:
                return listpharmacie.get(rowIndex).getNom_pharmacie();
            case 2:
                return listpharmacie.get(rowIndex).getAdresse_pharmacie();
            case 3:
                return listpharmacie.get(rowIndex).getMail_pharmacie();
            case 4:
                return listpharmacie.get(rowIndex).getTelephone_pharmacie();
            case 5:
                return listpharmacie.get(rowIndex).getNumero_patente();
            case 6:
                return listpharmacie.get(rowIndex).getGouvernaurat();    
            case 7:
                return listpharmacie.get(rowIndex).getJour_de_garde();
            default:
                return null;     
      }
    }
    @Override
    public String getColumnName(int column) { // nom des colonnes
        return header[column]; 
    }
    
    
}
