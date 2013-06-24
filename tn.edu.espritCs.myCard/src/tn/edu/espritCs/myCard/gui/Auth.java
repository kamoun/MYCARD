package tn.edu.espritCs.myCard.gui;

import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import tn.edu.espritCs.myCard.services.LoginService;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Auth extends JFrame{
	private JPanel contentPane;
	private JTextField loginTextField;
	private JPasswordField jPasswordField;
	private LoginService loginService=new  LoginService();
	private JLabel lblError; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auth frame = new Auth();
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
	public Auth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		loginTextField = new JTextField();
		loginTextField.setColumns(10);
		
		jPasswordField = new JPasswordField();
		jPasswordField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Login");
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		
		lblError = new JLabel("Authentification filed");
		
		lblError.setForeground(Color.RED);
		lblError.setVisible(false);
		JButton btnNewButton = new JButton("Sign in ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					System.out.println(loginTextField.getText());
					System.out.println(jPasswordField.getText());
					boolean b=loginService.loginAdmin(loginTextField.getText(), jPasswordField.getText());
					
					boolean a=loginService.loginCashier(loginTextField.getText(), jPasswordField.getText());
					//System.out.println(b);
					if(b)
					{
					HomeAdmin homeAdmin=new HomeAdmin();
					homeAdmin.setVisible(true);
					Auth.this.dispose();
					}
					else if(a)
					{
					HomeCashier homeCashier=new HomeCashier();
					homeCashier.setVisible(true);
					Auth.this.dispose();
					}
					else {
						lblError.setVisible(true);
					}
					
				} catch (Exception e) {
					System.err.println("hoops");
					e.printStackTrace();
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addComponent(lblNewLabel)
							.addGap(63))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1)							
							.addGap(54))
							
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblError)							
							.addGap(35))
							)
					
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(jPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(loginTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(176, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(197, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(138))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(loginTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(jPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(41)
					
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(loginTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblError))
					.addGap(20)
					
					.addComponent(btnNewButton)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		
		contentPane.setLayout(gl_contentPane);
	}
}
