package oopMyTest01.tahovyBoj;

public class Mag extends Bojovnik {

	private int mana;
	private int maxMana;
	private int magickyUtok;
	
	public Mag(String jmeno, int zivot, int utok, int obrana, Kostka kostka, int mana, int magickyUtok)
	{
	        super(jmeno, zivot, utok, obrana, kostka);
	        this.mana = mana;
	        this.maxMana = mana;
	        this.magickyUtok = magickyUtok;
	}

	@Override
	public void utoc(Bojovnik souper)
	{
	        // Mana není naplněna
	        if (mana < maxMana)
	        {
	                mana += 10;
	                if (mana > maxMana)
	                        mana = maxMana;
	                super.utoc(souper);
	        }
	        else // Magický útok
	        {
	                int uder = magickyUtok + kostka.hod();
	                nastavZpravu(String.format("%s pouzil magii za %s hp", jmeno, uder));
	                souper.branSe(uder);
	                mana = 0;
	        }
	}	
	
    public String grafickaMana()
    {
//            System.out.println("Nazivu je: " + nazivu());    		
            return grafickyUkazatel(mana, maxMana);
    }        
	
}	
	

