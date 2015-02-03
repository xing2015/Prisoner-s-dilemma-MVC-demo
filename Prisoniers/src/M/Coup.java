/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;

/**
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

    public Coup(int NbCoup, boolean ChoixA, boolean ChoixB, int GainA, int GainB) {
        this.NbCoup = NbCoup;
        this.ChoixA = ChoixA;
        this.ChoixB = ChoixB;
        this.GainA = GainA;
        this.GainB = GainB;
    }

    public int getNbCoup() {
        return NbCoup;
    }

    public void setNbCoup(int NbCoup) {
        this.NbCoup = NbCoup;
    }

    public boolean getChoixA() {
        return ChoixA;
    }

    public void setChoixA(boolean ChoixA) {
        this.ChoixA = ChoixA;
    }

    public boolean getChoixB() {
        return ChoixB;
    }

    public void setChoixB(boolean ChoixB) {
        this.ChoixB = ChoixB;
    }

    
    public String getcA() {
        if(this.getChoixA())
            this.cA= "C";
        else{
            this.cA= "D";
        }
        return cA;
    }

    public String getcB() {
        if(this.getChoixB())
            this.cB= "C";
        else{
            this.cB= "D";
        }
        return cB;
    }
    
    public int getGainA() {
        return GainA;
    }

    public void setGainA(int GainA) {
        this.GainA = GainA;
    }

    public int getGainB() {
        return GainB;
    }

    public void setGainB(int GainB) {
        this.GainB = GainB;
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
