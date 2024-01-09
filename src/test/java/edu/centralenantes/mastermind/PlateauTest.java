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
public class PlateauTest {
    
    public PlateauTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of poserPions method, of class Plateau.
     */
    @Test
    public void testPoserPions() {
        System.out.println("poserPions");
        List<Couleur> couleurs = null;
        Plateau instance = new Plateau();
        instance.poserPions(couleurs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherPions method, of class Plateau.
     */
    @Test
    public void testAfficherPions() {
        System.out.println("afficherPions");
        Plateau instance = new Plateau();
        instance.afficherPions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
