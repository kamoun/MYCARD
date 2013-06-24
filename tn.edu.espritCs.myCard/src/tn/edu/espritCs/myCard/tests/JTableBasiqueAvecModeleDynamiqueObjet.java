package tn.edu.espritCs.myCard.tests;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class JTableBasiqueAvecModeleDynamiqueObjet extends JFrame {
    private ModeleDynamiqueObjet modele = new ModeleDynamiqueObjet();
    private JTable tableau;
 
    public JTableBasiqueAvecModeleDynamiqueObjet() {
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
        new JTableBasiqueAvecModeleDynamiqueObjet().setVisible(true);
    }
 

 
    private class RemoveAction extends AbstractAction {
        private RemoveAction() {
            super("Supprimmer");
        }
 
        public void actionPerformed(ActionEvent e) {
            int[] selection = tableau.getSelectedRows();
 
            for(int i = selection.length - 1; i >= 0; i--){
                modele.removeAmi(selection[i]);
            }
        }
    }
}