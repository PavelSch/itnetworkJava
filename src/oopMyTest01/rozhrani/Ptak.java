package oopMyTest01.rozhrani;

public class Ptak extends Zvire implements PtakInterface
{
		
		public Ptak(int vaha)
		{
			super(vaha);
		}
	
		@Override
		public void pipni()
        {
                System.out.println("♫ ♫ ♫");
        }

		public void klovni()
        {
                System.out.println("Klov, klov!");
        }

}
