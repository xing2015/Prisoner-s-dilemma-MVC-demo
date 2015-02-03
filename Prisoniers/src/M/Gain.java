/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;

import java.io.Serializable;

/**
 *
 * @author xym
 */
public class Gain implements Serializable{

    public int dupe;
    public int punition;
    public int recompense;
    public int tentation;

    public Gain() {
        this(0, 1, 3, 5);
    }
    /**
     * Cette classe defini les règles de gains et calcule les gains selon ces règles.
     * @param d: le gain de dupe.
     * @param p: le gain de punition.
     * @param r: le gain de recompense.
     * @param t: le gain de tentation.
     */
    public Gain(int d, int p, int r, int t) {
        this.dupe = d;
        this.punition = p;
        this.recompense = r;
        this.tentation = t;
    }
    /**
     * Cette méthode calcule le gain d'un coup pour joueur j.
     * @param j: joueur
     * @param c1:choix de joueur A
     * @param c2:choix de joueur B
     * @return :le gain du joueur j.
     */
    public int calcul(Joueur j, boolean c1, boolean c2) {
        int resultat;
        if (c1 && c2) {
            resultat=recompense;
            
        } else if (c1 && !c2) {
            if (j.equals(Joueur.A)) {
                resultat=dupe;
            } else {
                resultat=tentation;
            }
        } else if (!c1 && c2) {
            if (j.equals(Joueur.A)) {
                resultat=tentation;
            } else {
                resultat=dupe;
            }
        } else {
           resultat=punition;
        }
        return resultat;

    }
    /**
     * Cette méthode justifi si les nouveaux règles de gains satisfait une condition invariante.
     * @param d: le gain de dupe.
     * @param p: le gain de punition.
     * @param r: le gain de recompense.
     * @param t: le gain de tentation.
     * @return: Si la condition est satisfaite, il retourne True. Sinon False.
     */
    public boolean invariantOk(int d, int p, int r, int t) {
        return d < p && p < r && r < t && ((t + d) / 2) < r;
    }
    /**
     * Cette méthode redefini les règles de gains.
     * @param d: le nouveau gain de dupe.
     * @param p: le nouveau gain de punition.
     * @param r: le nouveau gain de recompense.
     * @param t: le nouveau gain de tentation.
     */
  
}
