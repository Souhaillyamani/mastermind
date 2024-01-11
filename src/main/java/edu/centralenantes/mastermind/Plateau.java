/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.mastermind;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Souhail
 */


public class Plateau {

    private List<Rangée> rangées;

    public Plateau() {
        this.rangées = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            rangées.add(new Rangée());
        }
    }

    public void poserPions(List<Couleur> couleurs) {
        // Le décodeur pose des pions sur le plateau
    }

    public void afficherPions() {
        // On affiche les pions du plateau
    }
}

