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
 
public class HomeCashier extends JFrame {
  private JMenuBar menuBar = new JMenuBar();
  private JMenu test1 = new JMenu("Transform Points");

  
  private JMenuItem item1 = new JMenuItem("Add Cashier");
  private JMenuItem item5 = new JMenuItem("List Cashiers");
  private JMenuItem item2 = new JMenuItem("Close");
  

  public static void main(String[] args){
	  HomeCashier zFen = new HomeCashier();
  }
 
  public HomeCashier(){
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
    this.test1.add(item2); 
    

    //L'ordre d'ajout va déterminer l'ordre d'apparition dans le menu de gauche à droite
    //Le premier ajouté sera tout à gauche de la barre de menu et inversement pour le dernier
    this.menuBar.add(test1);
    this.setJMenuBar(menuBar);
    this.setVisible(true);
  }
}