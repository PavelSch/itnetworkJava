package oopMyTest01.losovac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Losovac
{
        private ArrayList<Integer> cisla;
        private Random random;

        public Losovac()
        {
                random = new Random();
                cisla = new ArrayList<Integer>();
        }

        public int losuj()
        {
                Integer cislo = random.nextInt(100) + 1;
                cisla.add(cislo);
                return cislo;
        }        

        public String vypis()
        {
                String s = "";
                Collections.sort(cisla);
                for (int i : cisla)      // TOMUHLE ZAPISU NEROZUMIM!!!
                        s += i + " ";
                return s;
        }
        
        public void otestujGetSet() {
        	ArrayList<String> lt = new ArrayList<String>();
        	lt.add("Prvn�");
        	System.out.println(lt.get(0));
        	lt.set(0, "Prvn� polo�ka");
        	System.out.println(lt.get(0));
        	lt.set(1, "Druh� polo�ka");  // vyhod� chybu
        }
        
        public void otestujPredavku() {  // NEROZUMIM
        String[] poleStringu = {"Prvni", "Druha", "Treti"};
        List<String> l = new ArrayList<String>(Arrays.asList(poleStringu));
        System.out.println(l.get(2));
        }
        
}
