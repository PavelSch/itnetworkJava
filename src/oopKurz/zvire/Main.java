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
    //    zvire.vypis();
        System.out.println(zvire);
        zvire.nakrm(11);
    //    zvire.vypis();
        System.out.println(zvire);
        Zvire [] zvireArr = {new Kachna("kachna", 10), new Kachna("kachna", 5), new Kocka("kocka", 7)};
        for (int i = 0; i < zvireArr.length; i++) {
            System.out.println(zvireArr[i]);
            zvireArr[i].nakrm(11);
            zvireArr[i].vydejZvuk2();
            System.out.println(zvireArr[i]);
        }
       
    }
    
}
