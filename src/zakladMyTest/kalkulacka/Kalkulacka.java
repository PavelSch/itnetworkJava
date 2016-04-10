package zakladMyTest.kalkulacka;

import java.util.Scanner;

public class Kalkulacka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        
        System.out.println("Vítejte v kalkulačce");
        String pokracovat = "ano";
        while (pokracovat.equals("ano"))
        {
                System.out.println("Zadejte první číslo:");
                float a = Float.parseFloat(sc.nextLine());
                System.out.println("Zadejte druhé číslo:");
                float b = Float.parseFloat(sc.nextLine());
                System.out.println("Zvolte si operaci:");
                System.out.println("1 - sčítání");
                System.out.println("2 - odčítání");
                System.out.println("3 - násobení");
                System.out.println("4 - dělení");
                int volba = Integer.parseInt(sc.nextLine());
                float vysledek = 0;
                switch (volba)
                {
                        case 1:
                                        vysledek = a + b;
                        break;
                        case 2:
                                        vysledek = a - b;
                        break;
                        case 3:
                                        vysledek = a * b;
                        break;
                        case 4:
                                        vysledek = a / b;
                        break;
                }
                if ((volba > 0) && (volba < 5))
                        System.out.printf("Výsledek: %f", vysledek);
                else
                        System.out.println("Neplatná volba");
                System.out.println("Přejete si zadat další příklad? [ano/ne]");
                pokracovat = sc.nextLine();
        }
        System.out.println("Děkuji za použití kalkulačky.");

        
    }
}
