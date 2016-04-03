package oopMyTest01.tahovyBoj;

class Arena
{
        private Bojovnik bojovnik1;
        private Bojovnik bojovnik2;
        private Kostka kostka;

        public Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kostka kostka)
        {
                this.bojovnik1 = bojovnik1;
                this.bojovnik2 = bojovnik2;
                this.kostka = kostka;
        }

        
        private void vypisZpravu(String zprava)
        {
            	System.out.println(zprava);
            	try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.err.println("Chyba, nepovedlo se uspat vlakno");
                }
        }        

        public void zapas()
        {
                // pùvodní poøadí
                Bojovnik b1 = bojovnik1;
                Bojovnik b2 = bojovnik2;
                System.out.println("Vitejte v arene!");
                System.out.printf("Dnes se utkaji %s s %s! \n\n", bojovnik1, bojovnik2);
                // prohození bojovníkù
                boolean zacinaBojovnik2 = (kostka.hod() <= kostka.vratPocetSten() / 2);
                if (zacinaBojovnik2)
                {
                        b1 = bojovnik2;
                        b2 = bojovnik1;
                }
                System.out.printf("Zacinat bude bojovnik %s! \n\nZapas muze zacit...", b1);
                System.out.println("");
            	vykresli(b1, b2);
                
                // cyklus s bojem
                while (b1.nazivu() && b2.nazivu())
                {
                    	b1.utoc(b2);
                	    vypisZpravu(b1.vratPosledniZpravu()); // zpráva o útoku
                        vypisZpravu(b2.vratPosledniZpravu()); // zpráva o obranì
                    	vykresli(b1, b2);
                        if (b2.nazivu())
                        {
                                b2.utoc(b1);
                                vypisZpravu(b2.vratPosledniZpravu()); // zpráva o útoku
                                vypisZpravu(b1.vratPosledniZpravu()); // zpráva o obranì
                                vykresli(b1, b2);
                        }
                        System.out.println();
                }
        }      
    
       private void vykresli(Bojovnik b1, Bojovnik b2)
        {
                System.out.println("-------------- Aréna -------------- \n");
                System.out.println("Bojovníci: \n");
                b1.vypisBojovnika(bojovnik1);                
                System.out.println();
                b2.vypisBojovnika(bojovnik2);                
                System.out.println();
        }

/*
        private void vykresli()
        {
                System.out.println("-------------- Aréna -------------- \n");
                System.out.println("Zdravi bojovniku: \n");
                System.out.printf("%s %s\n", bojovnik1, bojovnik1.grafickyZivot());
                System.out.printf("%s %s\n", bojovnik2, bojovnik2.grafickyZivot());
        }
*/        
        
}