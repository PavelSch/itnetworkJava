/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopKurz.nakladak;

/**
 *
 * @author PavelSch
 */
public class Main {

    public static void main (String args[]) {
        Nakladak nakladak = new Nakladak();
        nakladak.naloz(20);
            try {
                nakladak.vyloz(50);
            }
            catch (VykladkaException e)
            {
                e.vypisHlasku();
            }
            
        nakladak.vypis();
    }

}
