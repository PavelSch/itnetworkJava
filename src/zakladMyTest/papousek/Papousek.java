package zakladMyTest.papousek;

import java.util.Scanner;

public class Papousek {

    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in, "Windows-1250");
         System.out.println("Ahoj, jsem virtuální papoušek Lóra, rád opakuji!");
         System.out.println("Napiš něco: ");
         String vstup = sc.nextLine();
         String vystup;
         vystup = vstup + ", " + vstup + "!";
         System.out.println(vystup);
    }
}
