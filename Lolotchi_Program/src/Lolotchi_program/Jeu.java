/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lolotchi_program;

/**
 *
 * @author benedetti 21
 */
public class Jeu {
    
    private final Fenetre fenetre;
    
    public Jeu() throws Exception {
        this.fenetre = new Fenetre();
        Horloge time = new Horloge(this);
    }
    
    public Fenetre getFenetre() {
        return this.fenetre;
    }
    
    
}
