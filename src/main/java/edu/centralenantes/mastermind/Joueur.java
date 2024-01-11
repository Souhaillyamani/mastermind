/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.mastermind;

import java.util.List;

/**
 *
 * @author Souhail
 */


public class Joueur {

    private String nom;
    private int score;

    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    public void choisirCode() {
        // Le codeur choisit son code secret
    }

    public List<Couleur> proposerCombinaison() {
        // Le décodeur propose une combinaison de pions
        return null;
    }

    public List<Couleur> donnerIndices(List<Couleur> combinaison) {
        // Le codeur donne des indices
        return null;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }
}

