/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**classe Coup definit les paramétres de chaque coup, ex:les choix de joueur, les gains,etc
 *
 * @author xym
 */
public class Coup {
    private int NbCoup;
    private String cA;
    private String cB;
    private boolean ChoixA;
    private boolean ChoixB;
    private int GainA;
    private int GainB;

    /** Constructeur   
     * @param NbCoup: nombre de coup
     * @param ChoixA: choix de joueur A
     * @param ChoixB: choix de joueur B
     * @param GainB : gain de joueur B par coup
     * @param GainA : gain de joueur A par coup
     */
    public Coup(int NbCoup, boolean ChoixA, boolean ChoixB, int GainA, int GainB) {
        this.NbCoup = NbCoup;
        this.ChoixA = ChoixA;
        this.ChoixB = ChoixB;
        this.GainA = GainA;
        this.GainB = GainB;
    }

    /** cette méthode retourne le nombre de coup
     *  
     * @return nombre de coup
     */
    public int getNbCoup() {
        return NbCoup;
    }

      /** cette méthode définit le nombre de coup
     *  
     * @param NbCoup ：nombre de coup
     */
    public void setNbCoup(int NbCoup) {
        this.NbCoup = NbCoup;
    }

      /** cette méthode retourne le choix de Joueur A 
     * @return en boolean
     */
    public boolean getChoixA() {
        return ChoixA;
    }
 /** cette méthode définit le choix de Joueur A
     *  
     * @param ChoixA ：choix de joueur A , en boolean
     */
    public void setChoixA(boolean ChoixA) {
        this.ChoixA = ChoixA;
    }
    
     /** cette méthode retourne le choix de Joueur B 
     * @return en type  'boolean'
     */
    public boolean getChoixB() {
        return ChoixB;
    }
 /** cette méthode définit le choix de joueur B
     *  
     * @param ChoixB ：choix de joueur B
     */
    public void setChoixB(boolean ChoixB) {
        this.ChoixB = ChoixB;
    }

    /** cette méthode retourne le choix de Joueur A 
     * @return en type 'string'
     */
    public String getcA() {
        if(this.getChoixA())
            this.cA= "C";
        else{
            this.cA= "D";
        }
        return cA;
    }

    /** cette méthode retourne le choix de Joueur B 
     * @return en type 'string'
     */
    public String getcB() {
        if(this.getChoixB())
            this.cB= "C";
        else{
            this.cB= "D";
        }
        return cB;
    }
    
    /** cette méthode retourne le gain de Joueur A 
     *  
     * @return int 
     */
    public int getGainA() {
        return GainA;
    }


    /** cette méthode retourne le gain de Joueur A 
     *  
     * @return int
     */
    public int getGainB() {
        return GainB;
    }
    
      /**
     * Cette classe crée le type de donnée "historique" qui enregistre les historiques de choix et de gains pour les deux joueurs.
     * @param numeroCoup-le numéro de coup
     * @param choixA:-le choix de joueur A pour ce coup
     * @param choixB:-le choix de joueur B pour ce coup
     * @param gainA:-le gain de joueur A pour ce coup
     * @param gainB:-le gain de joueur B pour ce coup
     */
}
