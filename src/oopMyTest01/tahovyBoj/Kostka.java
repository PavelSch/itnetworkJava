package oopMyTest01.tahovyBoj;

import java.util.Random;

/** T��da reprezentuje hrac� kostku */
class Kostka
{
        /** Gener�tor n�hodn�ch ��sel */
        private Random random;
        /** Po�et st�n kostky */
        private int pocetSten;

        public Kostka() {
        	 pocetSten = 6;
        	 random = new Random(); }        
        
		public Kostka(int pocetSten)
		{
// PROMYSLET, k cemu je to dobre
// Pomoci this jsme specifikovali, ze leva promenna pocetSten nalezi instanci, pravou Java chape jako z parametru			
			 this.pocetSten = pocetSten;
		     random = new Random();
		}        
        /**
         * Vr�t� po�et st�n hrac� kostky
         * @return      po�et st�n hrac� kostky
         */
        public int vratPocetSten()
        {
                return pocetSten;
        }

        /**
        * Vykon� hod kostkou
        * @return ��slo od 1 do po�tu st�n
        */
        public int hod()
        {
// Dejte si pozor, abyste netvorili nahodny generator v metode, ktera ma nahodne cislo vracet, tedy ze by se pro kazde nahodne cislo vytvoril novy generator.
        	return random.nextInt(pocetSten) + 1;
        }        
        
        /**
         * K CEMU JE KURVA TOHLE DOBRY ??
         * Vrac� textovou reprezentaci kostky
         * @return Textov� reprezentace kostky
         */

        /**
         * 
         * 		System.out.println(desetistenna);
         * 
        itnetworkTest02.Kostka@3be67280
        6
        itnetworkTest02.Kostka@16675039
        10

        Kostka s 6 stenami
        6
        Kostka s 10 stenami
        10  
         */        
           
        @Override
        public String toString()
        {
                return String.format("Kostka s %s stenami", pocetSten);
        }
        
        
}