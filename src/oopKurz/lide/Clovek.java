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
public class Clovek {
    
        protected String jmeno;
        protected int vek = 42;

        
        public Clovek(String jmeno, int vek) {
        //atribut i parametr se jmenuji stejně a rozliším je pomocí this
        this.jmeno = jmeno; // this je zástupný znak za instanci // volání objektu "zvnitřku" 
        this.vek = vek;
        }
       
        
        public void pozdrav(String pozdrav) {
            System.out.printf("%s %s, %d", pozdrav, jmeno, vek);
            System.out.println();
        }
        
        // pretizeni - nejcasteji jedna metoda vola jinou, jen neco prida > delegovani
        // casto kdyz mam cisla - navratova hodnota int vs double - pouziji stejny kod pouze pretypovany 
        public void pozdrav () {
            System.out.printf("Ahoj %s, %d", jmeno, vek);
            System.out.println();
        }
        
        // místo metody vypis() mohu přepsat defaulní metodu toString
        @Override
        public String toString() {
            return jmeno + ", " + vek;
        }
            
}
