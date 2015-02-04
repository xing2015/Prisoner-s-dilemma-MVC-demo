/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author XYM
 */
public enum Joueur {
  
    A(0),B(1);
    private int valeur;
    /**
     * Cette classe defini les joueurs.
     * @param valeur: la valeur contenu par joueur. 
     */
    private Joueur(int valeur){
        this.valeur=valeur;
    }
    public int getValeur(){
        return valeur;
    }
    
}
