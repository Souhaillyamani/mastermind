/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package edu.centralenantes.mastermind;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Souhail
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({edu.centralenantes.mastermind.JoueurTest.class, edu.centralenantes.mastermind.RangéeTest.class, edu.centralenantes.mastermind.CouleurTest.class, edu.centralenantes.mastermind.PlateauTest.class, edu.centralenantes.mastermind.JeuTest.class, edu.centralenantes.mastermind.PionTest.class})
public class MastermindSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
