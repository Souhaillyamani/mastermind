
package edu.centralenantes.mastermind;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class CouleurTest {
    
    public CouleurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of values method, of class Couleur.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Couleur[] expResult = null;
        Couleur[] result = Couleur.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Couleur.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Couleur expResult = null;
        Couleur result = Couleur.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Couleur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Couleur instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
