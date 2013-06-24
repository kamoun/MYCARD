package tn.edu.espritCs.myCard.tests;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

import tn.edu.espritCs.myCard.dao.UserDao;
import tn.edu.espritCs.myCard.domain.Admin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import junit.framework.Assert;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;

public class Authentification extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Authentification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblLogin = new JLabel("Login:");
		contentPane.add(lblLogin, BorderLayout.WEST);
		lblLogin.setBounds(61, 296, 414, 15);
	}

}
