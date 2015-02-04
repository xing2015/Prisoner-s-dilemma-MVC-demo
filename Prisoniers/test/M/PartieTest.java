/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package M;

import Model.Partie;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xym
 */
public class PartieTest {
    Partie p;
    
    public PartieTest() {
        
    }

    /**
     * Test of main method, of class Partie.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Partie.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
  /*  public void testCooperer(){
        p = new Partie();
        assertEquals(0,p.GetNbCoup());
        p.Cooperer(true,true);
        assertEquals(1,p.GetNbCoup());
        
          p.Cooperer(true,true);
          assertEquals(3,p.ScoreA);
          assertEquals(3,p.ScoreB);
          assertEquals(3,p.GainA);
          assertEquals(3,p.GainB);
         
          p.Cooperer(true,false);    
          assertEquals(0,p.GainA);
          assertEquals(5,p.GainB);
          assertEquals(3,p.ScoreA);
          assertEquals(8,p.ScoreB);
          
          p.Cooperer(false,true);    
          assertEquals(5,p.GainA);
          assertEquals(0,p.GainB);
          assertEquals(8,p.ScoreA);
          assertEquals(8,p.ScoreB);
          
           p.Cooperer(false,false);    
          assertEquals(1,p.GainA);
          assertEquals(1,p.GainB);
          assertEquals(9,p.ScoreA);
          assertEquals(9,p.ScoreB);
        
    }*/
    
    public void testAcooperer(){
        
    }
    
    public void testBcooperer(){
    
    }
    
    public void testGetNbCoup(){
   
        Partie p= new Partie();
        p.Cooperer(true, true);
        assertEquals(0,p.GetNbCoup());       
        
    }
    
    public void testGetScoreA(){
    
    }
    
    public void testGetScoreB(){
    
    }
    
    
}
