package tn.edu.espritCs.myCard.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
 
public class HomeAdmin extends JFrame {
  private JMenuBar menuBar = new JMenuBar();
  private JMenu test1 = new JMenu("Cashier Account Management");
  private JMenu test2 = new JMenu("Customer Account Managment");
  private JMenu test3 = new JMenu("Fidelity Offers Management");
  
  private JMenuItem item1 = new JMenuItem("Add Cashier");
  private JMenuItem item5 = new JMenuItem("List Cashiers");
  private JMenuItem item2 = new JMenuItem("Close");
  private JMenuItem item3 = new JMenuItem("Add Customer");
  private JMenuItem item4 = new JMenuItem("List Customers");
  private JMenuItem item6 = new JMenuItem("Update Offers");

  public static void main(String[] args){
    HomeAdmin zFen = new HomeAdmin();
  }
 
  public HomeAdmin(){
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
 
    //On initialise nos menus      
    this.test1.add(item1);
    this.test1.add(item5);
    //Ajout d'un séparateur
    this.test1.addSeparator();
    item2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        System.exit(0);
      }        
    });
    item1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {
        	
        AddCashier newCashier=new AddCashier();
       	newCashier.setVisible(true);
       	newCashier.setSize(800, 600);
        }        
      });
    this.test1.add(item2); 
    
    this.test2.add(item3);
    this.test2.add(item4);
 
    this.test3.add(item6);
    //L'ordre d'ajout va déterminer l'ordre d'apparition dans le menu de gauche à droite
    //Le premier ajouté sera tout à gauche de la barre de menu et inversement pour le dernier
    this.menuBar.add(test1);
    this.menuBar.add(test2);
    this.menuBar.add(test3);
    this.setJMenuBar(menuBar);
    this.setVisible(true);
  }
}