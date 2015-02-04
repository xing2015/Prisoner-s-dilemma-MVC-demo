/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author xym
 */
public class Partie extends Observable implements Serializable {

    List<boolean[]> Choix;
    Gain gain;

    public Partie() {
        this(new Gain());
    }

    public Partie(Gain g) {
        Choix = new ArrayList<boolean[]>();
        gain = g;
        setChanged();
        notifyObservers();
    }

    /**
     * Cette méthode enregistre les choix de deux joueurs.
     *
     * choix de joueur A de quel coup. @param ChoixA: 
     * choix de joueur B de quel coup. @param ChoixB:
     */
    public void Cooperer(boolean ChoixA, boolean ChoixB) {

        boolean[] ChoixTmp = new boolean[2];
        ChoixTmp[0] = ChoixA;
        ChoixTmp[1] = ChoixB;
        Choix.add(ChoixTmp);
        setChanged();
        notifyObservers();

    }

    /**
     * Cette méthode retourne le gain pour joueur j au coup numéro coup. joueur
     * @param j numéro de coup @param coup
     *
     * @return gainTmp: gain
     */
    public int getGainParCoup(Joueur j, int coup) {
        int gainTmp = gain.calcul(j, Choix.get(coup)[0], Choix.get(coup)[1]);
        return gainTmp;
    }

    /**
     * Cette méthode retourne le nombre de coup.
     *
     * @return
     */
    public int GetNbCoup() {
        return Choix.size();
    }

    /**
     * Cette méthode retourne le score pour joueur j. joueur @param j:
     *
     * @return
     */
    public int getScore(Joueur j) {
        int score = 0;
        for (int i = 0; i < Choix.size(); i++) {
            score += getGainParCoup(j, i);
        }
        return score;
    }

    /**
     * Cette méthode retourne le choix d'un joueur au coup numéro i. joueur
     * @param joueur: numéro de coup @param i
     *
     * @return
     */
    public boolean getChoixCoup(Joueur joueur, int coup) {
        return Choix.get(coup)[joueur.getValeur()];

    }

    /**
     * Cette méthode retourne l'ensemble de choix.
     *
     * choix de joueur @return Choix
     */
    public List<boolean[]> getChoix() {
        return Choix;
    }

    public void setChoix(List<boolean[]> choix) {
        this.Choix = choix;
    }

    public Gain getGain() {
        return gain;
    }

    /* @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

/* if(ChoixA && ChoixB){
 this.GainA=3;
 this.GainB=3;
 }
 else if(ChoixA &&!ChoixB){
 this.GainA=0;
 this.GainB=5;
 }
 else if(!ChoixA &&ChoixB){
 this.GainA=5;
 this.GainB=0;
 }
 else if(!ChoixA &&!ChoixB){
 this.GainA=1;
 this.GainB=1;
 }
 this.ScoreA = this.ScoreA+this.GainA;
 this.ScoreB=this.ScoreB+this.GainB;
 this.NbCoup++;*/
