/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Cette classe defini les joueurs.
 * @author XING Yuming
 */
public enum Joueur {
    A(0), B(1);
    private int valeur;

    /**
     * Cette méthode definit les 2 joueurs en classe énum.
     *
     * @param valeur: la valeur contenu par joueur.
     */
    private Joueur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

}
