/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Coup;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import Model.Joueur;
import Model.Partie;

/**
 * Classe de panel d'Hitorique,pour afficher les historique de jeu ,elle
 * implemente un observeur.
 *
 * @author XING Yuming
 */
public class PanelHistorique extends JPanel implements Observer {

    private JTable historiques;
    private Partie partie;
    private HistoriquePartie historiquePartie;

    /**
     * Cette classe crée le panel dans lequel on met le tableau de historiques.
     */
    public PanelHistorique() {
        historiquePartie = new HistoriquePartie();
        historiques = new JTable(historiquePartie);
        partie = new Partie();
        partie.addObserver(this);
        setLayout(new BorderLayout());
        add(new JScrollPane(historiques), BorderLayout.CENTER);
        setBorder(BorderFactory.createTitledBorder("Historiques"));

    }

    /**
     * Cette méthode met à jour les historiques.
     *
     * @param o type observable
     * @param arg type objet
     */
    @Override
    public void update(Observable o, Object arg) {
        //historiquePartie.addHistorique();
        if (partie.equals(o)) {
            int numeroCoup = partie.GetNbCoup() - 1;
            boolean choixA = partie.getChoixCoup(Joueur.A, numeroCoup);
            boolean choixB = partie.getChoixCoup(Joueur.B, numeroCoup);
            int gainA = partie.getGainParCoup(Joueur.A, numeroCoup);
            int gainB = partie.getGainParCoup(Joueur.B, numeroCoup);
            Coup historique = new Coup(numeroCoup + 1, choixA, choixB, gainA, gainB);
            historiquePartie.addHistorique(historique);

        }
    }

    /**
     * Cette classe privée crée le tableau de historiques. Les historiques de
     * chaque coup sont affichés dans ce tableau.
     */
    private class HistoriquePartie extends AbstractTableModel {

        private final String[] entetes = {"N°", "Choix A", "Choix B", "Gain A", "Gain B"};
        private final List<Coup> historiques;

        public HistoriquePartie() {
            super();
            historiques = new ArrayList<Coup>();
        }

        @Override
        public int getRowCount() {
            return historiques.size();
        }

        @Override
        public int getColumnCount() {
            return entetes.length;
        }

        @Override
        public String getColumnName(int columnIndex) {
            return entetes[columnIndex];
        }

        /** Inserer les valeur dans la table.
         */
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return historiques.get(rowIndex).getNbCoup();
                case 1:
                    return historiques.get(rowIndex).getcA();
                case 2:
                    return historiques.get(rowIndex).getcB();
                case 3:
                    return historiques.get(rowIndex).getGainA();
                case 4:
                    return historiques.get(rowIndex).getGainB();
                default:
                    return null; //Ne devrait jamais arriver
            }
        }

        public void addHistorique(Coup h) {
            historiques.add(h);

            fireTableRowsInserted(historiques.size() - 1, historiques.size() - 1);
        }

    }

    /** Lancer une partie      
     */
    public void setPartie(Partie partie) {
        this.partie = partie;
        partie.addObserver(this);
    }

}
