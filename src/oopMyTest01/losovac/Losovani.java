package oopMyTest01.losovac;

import java.util.Scanner;

public class Losovani {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in, "Windows-1250");
		Losovac losovac = new Losovac();
		System.out.println("V�tejte v programu losov�n�.");
		// losovac.otestujGetSet();  // POZOR, TOHLE HAZI CHYBU!!
		// losovac.otestujPredavku();
		String volba = "0";
		// hlavn� cyklus
		while (!(volba.equals("3")))
		{
		    // v�pis mo�nost�
		    System.out.println("1 - Losovat dalsi cislo");
		    System.out.println("2 - Vypsat cisla");
		    System.out.println("3 - Konec");
		    volba = sc.nextLine();
		    System.out.println();
		    // reakce na volbu
		    switch (volba)
		    {
		        case "1":
		            System.out.printf("Padlo cislo: %s\n", losovac.losuj());
		            break;
		        case "2":
		            System.out.printf("Padla cisla: %s\n", losovac.vypis());
		            break;
		        case "3":
		            System.out.println("Dekuji za pouziti programu");
		            break;
		        default:
		            System.out.println("Neplatna volba, zadejte prosim znovu.");
		            break;
		    }
		}

	}

}
