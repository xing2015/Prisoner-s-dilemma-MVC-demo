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

/**
 *
 * @author IT
 */
public class CoupTest {
    Partie p;
    Coup coup;
    
     public CoupTest() {
        p = new Partie();
        coup = new Coup(1,true,true,3,3);        
    }
    
    

    /**
     * Test of getNbCoup method, of class Coup.
     */
    @Test
    public void testGetNbCoup() {
        System.out.println("getNbCoup");
        assertEquals(1, coup.getNbCoup());
    
    }

    /**
     * Test of getChoixA method, of class Coup.
     */
    @Test
    public void testGetChoixA() {
        System.out.println("getChoixA");
         assertEquals(true, coup.getChoixA());
    }

    /**
     * Test of getChoixB method, of class Coup.
     */
    @Test
    public void testGetChoixB() {
        System.out.println("getChoixB");
        assertEquals(true, coup.getChoixB());
    }

    

    /**
     * Test of getcA method, of class Coup.
     */
    @Test
    public void testGetcA() {
        System.out.println("getcA");
        assertEquals("C", coup.getcA());
    }

    /**
     * Test of getcB method, of class Coup.
     */
    @Test
    public void testGetcB() {
        System.out.println("getcB");
        assertEquals("C", coup.getcB());
    }

    /**
     * Test of getGainA method, of class Coup.
     */
    @Test
    public void testGetGainA() {
        System.out.println("getGainA");
          assertEquals(3, coup.getGainA());
    }

    /**
     * Test of getGainB method, of class Coup.
     */
    @Test
    public void testGetGainB() {
        System.out.println("getGainB");
        assertEquals(3, coup.getGainB());

    }
    
}
