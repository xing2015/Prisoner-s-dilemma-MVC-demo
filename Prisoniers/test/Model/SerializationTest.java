/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**  Tester  la serialisation de Partie
    
 *
 * @author Yuming
 */
public class SerializationTest {
     private Partie partie;
     private final String PATH="C:\\Users\\IT\\Desktop\\Game.date";
    //   "C:\\Users\\u21319076\\bureau\\Prisoner\\Game.dat";
  
    public SerializationTest() {
        partie = new Partie();
        partie.Cooperer(true, true);
        partie.Cooperer(false, false);
    }
    
    /**
     *  Méthode de test pour la serialisation de Partie
     */
    @Test
    public void serialisation() throws FileNotFoundException, IOException{
      FileOutputStream fileOs = new FileOutputStream(PATH);
      ObjectOutputStream objectOs = new ObjectOutputStream(fileOs);
      objectOs.writeObject(partie);
      objectOs.close();
    }
    /**
     *  Méthode de test pour la déserialisation de Partie
     */
    @Test
     public void deserialisation()throws FileNotFoundException, IOException{
         try{
             Partie p;
             FileInputStream fileIn = new FileInputStream(PATH);
             ObjectInputStream objectIN = new ObjectInputStream(fileIn);
             p = (Partie)objectIN.readObject();
             objectIN.close();
             for(int i=0;i< p.GetNbCoup();i++)
            {
                assertEquals(partie.getChoixCoup(Joueur.A,i),p.getChoixCoup(Joueur.A,i));
                assertEquals(partie.getChoixCoup(Joueur.B,i),p.getChoixCoup(Joueur.B,i));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializationTest.class.getName()).log(Level.SEVERE, null, ex);
        
         }
     }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
