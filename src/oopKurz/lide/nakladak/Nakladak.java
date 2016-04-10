/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopKurz.lide.nakladak;

/**
 *
 * @author PavelSch
 */
public class Nakladak {

    private int naklad = 0; // pokud neuvedu počáteční hodnotu, inicializuje se defaultní hodnotou
    private final int nosnost = 50;

    public void naloz(int nakladka) {
        if ((naklad + nakladka) <= nosnost) {
            naklad = naklad + nakladka;
        } else {
            System.out.println("Nákladák již nemá dostatečnou kapacitu pro naložení nákladu!");
        }
    }

    public void vyloz(int vykladka) {
        if ((naklad - vykladka) >= 0) {
            naklad = naklad - vykladka;
        } else {
            System.out.println("Nemůžete vyložit více, než je naloženo!");
        }
    }

    public void vypis() {
        System.out.printf("Náklad uvnitř náklaďáku je: %d", naklad);
    }
}
