package tn.edu.espritCs.myCard.tests;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

import javax.swing.table.*;

public class ModeleDynamiqueObjet extends AbstractTableModel {

	private final List<Ami> amis = new ArrayList<Ami>();
 
    private final String[] entetes = {"First Name", "Last Name", "Phone Number", "Email", "Login"};
 
    public ModeleDynamiqueObjet() {
        super();
 
        amis.add(new Ami());
        amis.add(new Ami());
        amis.add(new Ami());
        amis.add(new Ami());
        amis.add(new Ami());
        amis.add(new Ami());
        amis.add(new Ami());
    }
 
    public int getRowCount() {
        return amis.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return amis.get(rowIndex).getPrenom();
            case 1:
                return amis.get(rowIndex).getNom();
            case 2:
                return amis.get(rowIndex).getCouleur();
            case 3:
                return amis.get(rowIndex).getHomme();
            case 4:
                return amis.get(rowIndex).getSport();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
  
    public void removeAmi(int rowIndex) {
        amis.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

	
}