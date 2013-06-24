package tn.edu.espritCs.myCard.services;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import javax.swing.table.*;

import tn.edu.espritCs.myCard.domain.Cashier;
import tn.edu.espritCs.myCard.technical.UtilJdbc;
import tn.edu.espritCs.myCard.tests.Ami;

public class ModelListCashier extends AbstractTableModel {
	UtilJdbc utilJdbc = new UtilJdbc();
	Connection connection = utilJdbc.testConnexion();
	private final List<Cashier> cashiers = new ArrayList<Cashier>();
	private final List<String> cashiersIndex = new ArrayList<>();
	
    private final String[] entetes = {"First Name", "Last Name", "Phone Number", "Email", "Login", "Password"};
 
    public ModelListCashier()  {
        super();
        try {
        Statement statement = connection.createStatement();
		String sql = "select * from cashier ";
		//System.out.println(sql);
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			//System.out.println(resultSet.getString());
			//System.out.println(resultSet.getString(2));
			cashiersIndex.add(resultSet.getString(1));
			cashiers.add(new Cashier(resultSet.getString(2) ,resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
		}
    }
     catch (Exception e) {

	}

    }
 
    public int getRowCount() {
        return cashiers.size();
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
                return cashiers.get(rowIndex).getFirstNameUser();
            case 1:
                return cashiers.get(rowIndex).getLastNameUser();
            case 2:
                return cashiers.get(rowIndex).getPhoneNumberUser();
            case 3:
                return cashiers.get(rowIndex).getEmailUser();
            case 4:
                return cashiers.get(rowIndex).getLogin();
            case 5:
                return cashiers.get(rowIndex).getPwd();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
  
    public void removeCashier(int rowIndex) {
    	cashiers.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
        
        Integer removeId=Integer.parseInt(cashiersIndex.get(rowIndex));
        System.out.println(removeId);
        try{
        Statement statement = connection.createStatement();
		String sql = "Delete from cashier where idCashier='" + removeId + "'";
		
		statement.executeUpdate(sql);
		
        }
        catch (Exception e){
        	
        }
        
    }

	
}