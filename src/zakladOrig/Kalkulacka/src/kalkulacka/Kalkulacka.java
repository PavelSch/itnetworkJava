	/*
	 *	       __          __                __            
	 *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
	 *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
	 *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
	 *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
	 *                                                   
	 *                                                           
	 *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
	 * 
	 *	Tento zdrojový kód je součástí tutoriálů na programátorské 
	 *	sociální síti DEVBOOK.CZ	
	 *	
	 *	Kód můžete upravovat pod licencí MIT, 
	 *	tedy jak chcete, jen zmiňte odkaz na www.devbook.cz :-) 
	 */

package zakladOrig.Kalkulacka.src.kalkulacka;

import java.util.Scanner;


public class Kalkulacka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Vítejte v kalkulačce");
        System.out.println("Zadejte první číslo:");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhé číslo:");
        float b = Float.parseFloat(sc.nextLine());   
        float soucet = a + b;             
        float rozdil = a - b;             
        float soucin = a * b;             
        float podil = a / b;                   
        System.out.println("Součet: " + String.valueOf(soucet));
        System.out.println("Rozdíl: " + rozdil);
        System.out.println("Součin: " + soucin);
        System.out.println("Podíl: " + podil);
        System.out.println("Děkuji za použití kalkulačky, aplikaci ukončíte libovolnou klávesou.");
    }
}
