/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package M;

import java.util.Observable;

/**
 *
 * @author Administrator
 */
public class Partie extends Observable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     int NbCoup;
     int ScoreA;
     int ScoreB;
     int GainA;
     int GainB;

    public int getScoreA() {
        return ScoreA;
    }

    public int getScoreB() {
        return ScoreB;
    }

    public int getGainA() {
        return GainA;
    }

    public int getGainB() {
        return GainB;
    }

    public int GetNbCoup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public void Cooperer(boolean choixA,boolean choixB) {
      
        if(choixA && choixB){
            this.GainA=3;
            this.GainB=3;
        }
        else if(choixA &&!choixB){
            this.GainA=0;
            this.GainB=5;
         }
        else if(!choixA &&choixB){
            this.GainA=5;
            this.GainB=0;
         }
        else if(!choixA &&!choixB){
            this.GainA=1;
            this.GainB=1;
        }
         this.ScoreA = this.ScoreA+this.GainA;
         this.ScoreB=this.ScoreB+this.GainB;
        this.NbCoup++;
        setChanged();
        notifyObservers(this);
    }

    }

   
    
