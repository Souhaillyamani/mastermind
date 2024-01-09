/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.centralenantes.mastermind;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Souhail
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of choisirCode method, of class Joueur.
     */
    @Test
    public void testChoisirCode() {
        System.out.println("choisirCode");
        Joueur instance = null;
        instance.choisirCode();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proposerCombinaison method, of class Joueur.
     */
    @Test
    public void testProposerCombinaison() {
        System.out.println("proposerCombinaison");
        Joueur instance = null;
        List<Couleur> expResult = null;
        List<Couleur> result = instance.proposerCombinaison();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of donnerIndices method, of class Joueur.
     */
    @Test
    public void testDonnerIndices() {
        System.out.println("donnerIndices");
        List<Couleur> combinaison = null;
        Joueur instance = null;
        List<Couleur> expResult = null;
        List<Couleur> result = instance.donnerIndices(combinaison);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Joueur.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
