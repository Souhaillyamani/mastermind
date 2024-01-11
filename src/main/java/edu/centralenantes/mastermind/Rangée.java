/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Souhail
 */

public class Rangée {

    private List<Pion> pions;

    public Rangée() {
        this.pions = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int j = rd.nextInt(6);
            pions.add(new Pion(j));
        }
    }

    public void afficherPions() {
        // On affiche les pions de la rangée
    }
}

