/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.mastermind;

/**
 *
 * @author Souhail
 */


public class Pion {

    private Couleur couleur;

    
    public Pion(int i) {
        this.couleur = Couleur(i);
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void afficherCouleur() {
        // On affiche la couleur du pion
    }

    private Couleur Couleur(int i) {
        switch (i) {
        case 0:
            return Couleur.JAUNE;
        case 1:
            return Couleur.BLEU;
        case 2:
            return Couleur.ROUGE;
        case 3:
            return Couleur.VERT;
        case 4:
            return Couleur.BLANC;
        case 5:
            return Couleur.NOIR;
        }
    return Couleur.NOIR;
    }
}

