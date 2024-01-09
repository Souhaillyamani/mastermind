/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.mastermind;

/**
 *
 * @author Souhail
 */
public enum Couleur {

    JAUNE,
    BLEU,
    ROUGE,
    VERT,
    BLANC,
    NOIR;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}

