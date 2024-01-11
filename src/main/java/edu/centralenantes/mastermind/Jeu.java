/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.mastermind;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Souhail
 */

public class Jeu {

    private int nombreDeManches;
    private Joueur codeur;
    private Joueur décodeur;
    private Plateau plateau;

    public Jeu(int nombreDeManches) {
        this.nombreDeManches = nombreDeManches;
        this.codeur = new Joueur("Codeur");
        this.décodeur = new Joueur("Décodeur");
        this.plateau = new Plateau();
    }

    public void jouer() {
        for (int i = 0; i < nombreDeManches; i++) {
            // Le codeur choisit son code secret
            codeur.choisirCode();

            // Le décodeur tente de deviner le code
            while (true) {
                // Le décodeur propose une combinaison de pions
                List<Couleur> combinaison = (List<Couleur>) décodeur.proposerCombinaison();

                // Le codeur donne des indices
                List<Couleur> indices = (List<Couleur>) codeur.donnerIndices(combinaison);

                // Le décodeur vérifie les indices
                if (indices.equals(Collections.emptyList())) {
                    // Le décodeur a trouvé le code
                    break;
                }
            }

            // On inverse les rôles
            Joueur temp = codeur;
            codeur = décodeur;
            décodeur = temp;
        }

        // On détermine le vainqueur
        Joueur vainqueur = codeur.getScore() > décodeur.getScore() ? codeur : décodeur;
        System.out.println("Le vainqueur est " + vainqueur.getNom());
    }
}

