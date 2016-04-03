package oopMyTest01.tahovyBoj;

public class Bojovnik {
	
        /** Jm�no bojovn�ka */
		protected String jmeno;
        /** �ivot v HP */
		protected int zivot;
        /** Maxim�ln� zdrav� */
		protected int maxZivot;
        /** �tok v HP */
		protected int utok;
        /** Obrana v HP */
		protected int obrana;
        /** Instance hrac� kostky */
		protected Kostka kostka;
        private String zprava;
        
   
        
//      int uder = utok + kostka.hod();
        
        public Bojovnik(String jmeno, int zivot, int utok, int obrana, Kostka kostka)
        {
                this.jmeno = jmeno;
                this.zivot = zivot;
                this.maxZivot = zivot;
                this.utok = utok;
                this.obrana = obrana;
                this.kostka = kostka;
        }	
        
        @Override
        public String toString()
        {
                return jmeno;
        }
        
        public boolean nazivu()
        {
                return (zivot > 0);
        }
        
        protected String grafickyUkazatel(int aktualni, int maximalni)
        {
                String s = "[";
                int celkem = 20;
                double pocet = Math.round(((double)aktualni / maximalni) * celkem);
                if ((pocet == 0) && (nazivu()))
                        pocet = 1;
                if (nazivu() == false)
                		pocet = 0;                                 
                for (int i = 0; i < pocet; i++)
                        s += "#";
                s = String.format("%1$-" + (celkem + 1) + "s", s);
                s += "]";             
                return s;              
        }
        
        public String grafickyZivot()
        {
                return grafickyUkazatel(zivot, maxZivot);
        }
         
        protected void nastavZpravu(String zprava)
        {
                this.zprava = zprava;
        }

        public String vratPosledniZpravu()
        {
                return zprava;
        }

        public void utoc(Bojovnik souper)
        {
                int uder = utok + kostka.hod();
                nastavZpravu(String.format("%s utoci s uderem za %s hp", jmeno, uder));
                souper.branSe(uder);
        }

        public void branSe(int uder)
        {
                int zraneni = uder - (obrana + kostka.hod());
                if (zraneni > 0)
                {
                        zivot -= zraneni;
                        zprava = String.format("%s utrpel poskozeni %s hp", jmeno, zraneni);
                        if (zivot <= 0)
                        {
                                zivot = 0;
                                zprava += " a zemrel";
                        }

                } else
                        zprava = String.format("%s odrazil utok", jmeno);
                nastavZpravu(zprava);
        }        

        public void vypisBojovnika(Bojovnik b)
        {
                System.out.println(b);
                System.out.print("Zivot: ");
                System.out.println(b.grafickyZivot());
                if (b instanceof Mag)
                {
                        System.out.print("Mana:  ");
                        System.out.println(((Mag)b).grafickaMana());
                }
        }     
        
}
