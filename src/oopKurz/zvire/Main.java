/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopKurz.zvire;

/**
 *
 * @author PavelSch
 */
public class Main {
 
    public static void main (String [] args) {
        Zvire zvire = new Zvire("Špacek", 1);
        zvire.vypis();
        zvire.nakrm(11);
        zvire.vypis();
    }
    
}
