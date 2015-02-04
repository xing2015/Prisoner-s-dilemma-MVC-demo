/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Joueur;
import Model.Partie;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author xym
 */
public class PartieTest {

    Partie p;
    int coup;
    List<boolean[]> Choix;
    
    @Before
    public void testInit() {
        p = new Partie();
        coup = 0;
        Choix = null; 
        p.Cooperer(true, true);
        p.Cooperer(false, false);
        p.Cooperer(true, false);
        p.Cooperer(false, true);
    }


    /**
     * cette méthode pour tester si le gain par coup est egale la valeur qu'on a
     * définit. méthode à tester: getGainParCoup();
     */
    @Test
    public void testPartie() {
        assertEquals(p.getGain().recompense, p.getGainParCoup(Joueur.A, 0));
        assertEquals(p.getGain().punition, p.getGainParCoup(Joueur.B, 1));

    }

    @Test
    public void testGain() {
        System.out.println("Si cooperant tous les 2 ");
        System.out.println("Gain joueur1 :" + p.getGainParCoup(Joueur.A, 0));
        System.out.println("Gain joueur2 :" + p.getGainParCoup(Joueur.B, 0));
        System.out.println("Si non cooperant tous les 2 ");
        System.out.println("Gain joueur1 :" + p.getGainParCoup(Joueur.A, 1));
        System.out.println("Gain joueur2 :" + p.getGainParCoup(Joueur.B, 1));
        System.out.println("Si le joueur1 oui, le joueur2 non ");
        System.out.println("Gain joueur1 :" + p.getGainParCoup(Joueur.A, 2));
        System.out.println("Gain joueur2 :" + p.getGainParCoup(Joueur.B, 2));
        System.out.println("Si le joueur1 non, le joueur2 oui ");
        System.out.println("Gain joueur1 :" + p.getGainParCoup(Joueur.A, 3));
        System.out.println("Gain joueur2 :" + p.getGainParCoup(Joueur.B, 3));

    }
    
    /** cette méthode teste le getChoixCoup()
     * s'elle bonne, le valeur de coup retourne sera equale un valeur boolean prédéfinit.
     */
    @Test
    public void testGetChoixCoup(){
        //CC
        assertEquals(true,p.getChoixCoup(Joueur.A, 0));
        assertEquals(true,p.getChoixCoup(Joueur.B, 0));
        //DD
        assertEquals(false,p.getChoixCoup(Joueur.A, 1));
        assertEquals(false,p.getChoixCoup(Joueur.B, 1));
        //CD
        assertEquals(true,p.getChoixCoup(Joueur.A, 2));
        assertEquals(false,p.getChoixCoup(Joueur.B, 2));
        //DC
        assertEquals(false,p.getChoixCoup(Joueur.A, 3));
        assertEquals(true,p.getChoixCoup(Joueur.B, 3));
    }
    
    /** cette méthode teste le getNbCoup()
     */
    @Test
    public void testGetNbCoup() {
        assertEquals(4, p.GetNbCoup());
    }
    
    /** cette méthode teste le getScore
     */
    @Test
    public void testGetScore() {
        assertEquals(9,p.getScore(Joueur.A));
        assertEquals(9,p.getScore(Joueur.B));
    }

    

}
