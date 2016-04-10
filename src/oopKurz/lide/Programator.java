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
public class Programator extends Clovek implements Pracujici {
    private String jazyk;
    
    public Programator (String jmeno, int vek, String jazyk) {
        super(jmeno, vek);
        this.jazyk = jazyk;
    }
    
    // přetížení i v rámci jedné třídy, přepsání = modifikace v potomkovi
    @Override // anotace není povinná, ale je to užitečné
    public void pozdrav() {
        System.out.println("Hello World!");
    }

    @Override
    public void pracuj() {
        System.out.println ("Pilně programuji!");
    }
    
    public String getJazyk () {
    return jazyk;
    }    
    
    @Override
    public void vypisPovolani() {
        System.out.println ("Programator!");
    }

}
