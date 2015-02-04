/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**Tester la classe Gain
 *
 * @author IT
 */
public class GainTest {
    Partie p;
    
    public GainTest() {
        p = new Partie();
    }
       

    /**
     * Test of calcul method, of class Gain.
     */
    @Test
    public void testCalcul() {
        System.out.println("calcul");
        assertEquals(3, p.gain.calcul(Joueur.A, true, true));
        assertEquals(0, p.gain.calcul(Joueur.A, true, false));
        assertEquals(1, p.gain.calcul(Joueur.A, false, false));
        assertEquals(5, p.gain.calcul(Joueur.A, false, true));
        assertEquals(3, p.gain.calcul(Joueur.B, true, true));
        assertEquals(5, p.gain.calcul(Joueur.B, true, false));
        assertEquals(1, p.gain.calcul(Joueur.B, false, false));
        assertEquals(0, p.gain.calcul(Joueur.B, false, true));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
