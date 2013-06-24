package tn.edu.espritCs.myCard.dao;

import java.sql.SQLException;
import java.sql.Statement;

import tn.edu.espritCs.myCard.domain.Cashier;
import tn.edu.espritCs.myCard.technical.UtilJdbc;

public class CashierDao {
	private UtilJdbc utilJdbc = new UtilJdbc();

	public boolean addCashier(Cashier cashier) {
		boolean b = false;
		try {
			Statement statement = utilJdbc.testConnexion()
					.createStatement();
			String sql = "insert into cashier (firstNameCashier, lastNameCashier,phoneNumberCashier,emailCashier,login,pwd) " +
					"values('"+ cashier.getFirstNameUser() + "','"+ cashier.getLastNameUser() + "','"+ cashier.getPhoneNumberUser() + "','"+ cashier.getEmailUser() + "','"+ cashier.getLogin() + "','"+ cashier.getPwd() + "')";
			statement.executeUpdate(sql);
			System.out.println("Nouveau caissier a été ajouté ...");
			b = true;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return b;
	}
}
