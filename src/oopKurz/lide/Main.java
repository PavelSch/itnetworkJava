/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopKurz.lide;

/**
 *
 * @author PavelSch
 */
public class Main {     
    
    public static void main (String [] args) {
        
        Clovek karel = new Clovek ("Karel", 43);
        // clovek, ktery nema zadne vlastnosti
        karel.pozdrav("Dobrý den");
        karel.pozdrav();
        
    }
    
}
