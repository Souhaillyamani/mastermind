
package edu.centralenantes.bataille;

/**
 * La classe représentant une case de la grille.
 *
 * @author [Votre nom]
 * @version 1.0
 */
public class Case {

    /**
     * Les coordonnées de la case.
     */
    private Coordonnees coordonnees;

    /**
     * Indique si la case est touchée.
     */
    private boolean touchee;

    /**
     * Indique si la case est coulée.
     */
    private boolean coulee;

    /**
     * Crée une nouvelle case aux coordonnées données.
     *
     * @param x L'abscisse de la case.
     * @param y L'ordonnée de la case.
     */
    public Case(int x, int y) {
        this.coordonnees = new Coordonnees(x, y);
        this.touchee = false;
        this.coulee = false;
    }

    /**
     * Récupère les coordonnées de la case.
     *
     * @return Les coordonnées de la case.
     */
    public Coordonnees getCoordonnees() {
        return coordonnees;
    }

    /**
     * Indique si la case est touchée.
     *
     * @return True si la case est touchée, false sinon.
     */
    public boolean estTouchee() {
        return touchee;
    }

    /**
     * Indique si la case est coulée.
     *
     * @return True si la case est coulée, false sinon.
     */
    public boolean estCoule() {
        return coulee;
    }

    /**
     * Met la case à l'état touché.
     */
    public void toucher() {
        this.touchee = true;

        // Si la case est la dernière du bateau, coule le bateau.
        if (estDerniereCaseTouchee()) {
            couler();
        }
    }

    /**
     * Met la case à l'état coulé.
     */
    public void couler() {
        this.coule = true;
    }

    /**
     * Indique si la case est la dernière case touchée du bateau.
     *
     * @return True si la case est la dernière case touchée du bateau, false sinon.
     */
    private boolean estDerniereCaseTouchee() {
        // On considère que la case est la dernière case touchée du bateau si elle est la seule case touchée du bateau.
        return !getGrille().estTouchee(coordonnees.x + 1, coordonnees.y) &&
                !getGrille().estTouchee(coordonnees.x - 1, coordonnees.y) &&
                !getGrille().estTouchee(coordonnees.x, coordonnees.y + 1) &&
                !getGrille().estTouchee(coordonnees.x, coordonnees.y - 1);
    }

    /**
     * Renvoie une représentation textuelle de la case.
     *
     * @return Une représentation textuelle de la case.
     */
    @Override
    public String toString() {
        if (estCoule()) {
            return "X";
        } else if (estTouchee()) {
            return "*";
        } else {
            return ".";
        }
    }
}
