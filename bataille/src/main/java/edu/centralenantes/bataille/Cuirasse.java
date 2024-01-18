
package edu.centralenantes.bataille;

/**
 * Un cuirassé, un type de bateau de taille 4.
 *
 * @version 1.0
 */
public class Cuirasse extends Bateau {

    /**
     * Crée un nouveau cuirassé.
     */
    public Cuirasse() {
        super(4);
    }

    /**
     * Place le bateau sur la grille donnée.
     *
     * @param grille La grille sur laquelle placer le bateau.
     */
    @Override
    public void placer(Grille grille) {
        super.placer(grille);

        // Place le bateau en ligne horizontale ou verticale.
        boolean horizontal = Math.random() < 0.5;
        for (int i = 0; i < taille; i++) {
            cases[i] = grille.getCase(i, horizontal ? 0 : i);
        }
    }

    /**
     * Vérifie si la case donnée est touchée par le bateau.
     *
     * @param coordonnees Les coordonnées de la case à vérifier.
     *
     * @return True si la case est touchée, false sinon.
     */
    @Override
    public boolean estTouche(Coordonnees coordonnees) {
        for (Case caseCourante : cases) {
            if (caseCourante.getCoordonnees().equals(coordonnees)) {
                return true;
            }
        }

        return false;
    }
}
