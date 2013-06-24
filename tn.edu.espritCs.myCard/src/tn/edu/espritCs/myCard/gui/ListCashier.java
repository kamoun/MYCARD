package tn.edu.espritCs.myCard.gui;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import tn.edu.espritCs.myCard.services.ModelListCashier;

public class ListCashier extends JFrame {
    private ModelListCashier modele = new ModelListCashier();
    private JTable tableau;
 
    public ListCashier() {
        super();
 
        setTitle("JTable avec modèle dynamique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        tableau = new JTable(modele);
 
        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        JPanel boutons = new JPanel();
 
       
        boutons.add(new JButton(new RemoveAction()));
 
        getContentPane().add(boutons, BorderLayout.SOUTH);
 
        pack();
    }
 
    public static void main(String[] args) {
        new ListCashier().setVisible(true);
    }
 

 
    private class RemoveAction extends AbstractAction {
        private RemoveAction() {
            super("Supprimmer");
        }
 
        public void actionPerformed(ActionEvent e) {
            int[] selection = tableau.getSelectedRows();
 
            for(int i = selection.length - 1; i >= 0; i--){
                modele.removeCashier(selection[i]);
            }
            
            
        }
    }
}