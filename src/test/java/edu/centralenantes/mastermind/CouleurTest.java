package edu.centralenantes.mastermind;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakariae
 */
public class CouleurTest {

    @Test
    void testValues() {
        // Vérifiez que la méthode `values()` renvoie bien les six couleurs possibles.
        Couleur[] couleurs = Couleur.values();
        assertEquals(6, couleurs.length);

        // Vérifiez que chaque élément de l'array est une instance de Couleur et qu'il correspond bien à une couleur valide.
        for (Couleur couleur : couleurs) {
            assertTrue(couleur instanceof Couleur);

            String couleurString = couleur.toString();
            assertTrue(couleurString.equals("jaune") || couleurString.equals("bleu") || couleurString.equals("rouge")
                    || couleurString.equals("vert") || couleurString.equals("blanc") || couleurString.equals("noir"));
        }
    }

    @Test
    void testValueOf() {
        // Vérifiez que la méthode `valueOf()` renvoie bien la couleur correspondante à une chaîne de caractères valide.
        assertEquals(Couleur.JAUNE, Couleur.valueOf("jaune"));
        assertEquals(Couleur.BLEU, Couleur.valueOf("bleu"));
        assertEquals(Couleur.ROUGE, Couleur.valueOf("rouge"));
        assertEquals(Couleur.VERT, Couleur.valueOf("vert"));
        assertEquals(Couleur.BLANC, Couleur.valueOf("blanc"));
        assertEquals(Couleur.NOIR, Couleur.valueOf("noir"));

        // Vérifiez que la méthode `valueOf()` renvoie null pour une chaîne de caractères invalide.
        assertNull(Couleur.valueOf("invalide"));
    }

    @Test
    void testToString() {
        // Vérifiez que la méthode `toString()` renvoie bien la représentation de chaîne de caractères d'une couleur.
        assertEquals("jaune", Couleur.JAUNE.toString());
        assertEquals("bleu", Couleur.BLEU.toString());
        assertEquals("rouge", Couleur.ROUGE.toString());
        assertEquals("vert", Couleur.VERT.toString());
        assertEquals("blanc", Couleur.BLANC.toString());
        assertEquals("noir", Couleur.NOIR.toString());
    }
}
