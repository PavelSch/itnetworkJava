package oopMyTest01.tahovyBoj;

public class TahovyBoj {

	public static void main(String[] args) {

		Kostka sestistenna = new Kostka();
		System.out.println(sestistenna);
//		System.out.println(sestistenna.vratPocetSten());
		for (int i = 0; i < 10; i++)
			System.out.print(sestistenna.hod() + " ");
		
		Kostka desetistenna = new Kostka(10);
		System.out.println("");
		System.out.println(desetistenna);
//		System.out.println(desetistenna.vratPocetSten());
		for (int i = 0; i < 10; i++) 
			System.out.print(desetistenna.hod() + " ");
		System.out.println("");		
		

/* 		Kostka kostka = new Kostka(10);
		Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kostka);

		System.out.printf("�ivot: %s\n", bojovnik.grafickyZivot()); // test GrafickyZivot();

		// �tok na na�eho bojovn�ka
		Bojovnik souper = new Bojovnik("Shadow", 60, 18, 15, kostka);
		souper.utoc(bojovnik);
		System.out.println(souper.vratPosledniZpravu());
		System.out.println(bojovnik.vratPosledniZpravu());

		System.out.printf("�ivot: %s\n", bojovnik.grafickyZivot());	
*/
	
		// vytvo�en� objekt�
		Kostka kostka = new Kostka(10);
		Bojovnik zalgoren = new Bojovnik("Zalgoren", 100, 20, 10, kostka); //100, 20, 10
//		Bojovnik shadow = new Bojovnik("Shadow", 60, 18, 15, kostka);
		Bojovnik gandalf = new Mag("Gandalf", 60, 15, 12, kostka, 30, 45);		
//		Arena arena = new Arena(zalgoren, shadow, kostka);
		Arena arena = new Arena(zalgoren, gandalf, kostka);		
		// z�pas
		arena.zapas();		
		
	}

}
