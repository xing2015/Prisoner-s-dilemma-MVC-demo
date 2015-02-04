/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**Cette classe definie les règles de gains et calcule les gains selon ces règles.
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
    /** constucteur
     * @param d: le gain de dupe = 0.
     * @param p: le gain de punition = 1.
     * @param r: le gain de recompense = 1.
     * @param t: le gain de tentation = 5.
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
  
}
