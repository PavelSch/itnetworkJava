package oopMyTest01.rozhrani;

import java.util.ArrayList;

public class Rozhrani {

	public static void main(String[] args) {

		ArrayList<Zvire> zvirata = new ArrayList<>();
		zvirata.add(new Ptak(1));
		zvirata.add(new Delfin(8));
		zvirata.add(new Delfin(9));
		zvirata.add(new PtakoJester(3));
		zvirata.add(new PtakoJester(2));

		for (Zvire zvire : zvirata)
	        System.out.println(zvire);
		
        System.out.println(" ");		
		
		for (Zvire zvire : zvirata)
		{
		        System.out.println(zvire);
		        zvire.dychej();
		        System.out.println("Vazim: " + zvire.getVaha());
		        if (zvire instanceof Delfin)
		                ((Delfin)zvire).vyskoc();
		}

	}

}
