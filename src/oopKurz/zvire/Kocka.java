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
public class Kocka extends Zvire {
    
    public Kocka (String jmeno, int vaha) {
    super (jmeno, vaha);
    zvuk = "MnauMnau";
    maKridla = false;
    }
 
 /*   
    @Override
    public void vydejZvuk () {
        System.out.println(zvuk);
    }
*/    
  
    public String getZvuk () {
    return zvuk;
    }

    public Boolean getMaKridla () {
    return maKridla;
    }
    
}
