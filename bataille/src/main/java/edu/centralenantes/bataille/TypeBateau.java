
package edu.centralenantes.bataille;

/**
 * Une classe abstraite qui représente un type de bateau.
 *
 * @version 1.0
 */
public abstract class TypeBateau {

    /**
     * Le nom du type de bateau.
     */
    
    private String nom;

    /**
     * La taille du type de bateau.
     */
    
    private int taille;

    /**
     * Crée un nouveau type de bateau.
     *
     * @param nom Le nom du type de bateau.
     * @param taille La taille du type de bateau.
     */
    public TypeBateau(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    /**
     * Retourne le nom du type de bateau.
     *
     * @return Le nom du type de bateau.
     */
    
    public String getNom() {
        return nom;
    }

    /**
     * Retourne la taille du type de bateau.
     *
     * @return La taille du type de bateau.
     */
    
    public int getTaille() {
        return taille;
    }

    /**
     * Crée un nouveau bateau de ce type.
     *
     * @return Un nouveau bateau de ce type.
     */
    
    public abstract Bateau creerBateau();
}

