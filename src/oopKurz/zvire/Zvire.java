/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopKurz.zvire;

/**
 *
 * @author PavelSch
 */
public class Zvire {
    
    private String jmeno;
    private int vaha;
    protected String zvuk;
    protected Boolean maKridla = false;
    // private Boolean letajici;

    public Zvire (String jmeno, int vaha)  {
        this.jmeno = jmeno;
        this.vaha = vaha;
    } 

 /*   public void setLetajici () {
        if (vaha < 9)
            {letajici = true;
            }
        else letajici = false;
    }  
 */   
    public Boolean getLetajici () {
        Boolean leta = maKridla &&  (vaha < 9);
   //     setLetajici();
        return leta;
    }
    
    public int getVaha() {
        return vaha;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public void nakrm (int krmeni) {
        if (krmeni > 0)
            {vaha = vaha + krmeni;
            }
    }
    
    public String vydejZvuk() {
        return zvuk;
    }
    
    // Jsem schopen vlastnost létání odkontrolovat pouze na výstupu, tudíž nemusím zavádět další proměnnou.
    /*
    public String vypisLetajici () {
        if (letajici)
            return "umím";
        else return "neumím";
        }
    */
    
    /*
    public void vypis () {
       // System.out.printf("Jsem zvířátko %s, vážím %d a " + vypisLetajici() + "létat", jmeno, vaha);
        System.out.printf("Jsem zvířátko %s, vážím %d a létající vlastnost %b." , getJmeno(), getVaha(), getLetajici());
        System.out.println();           
    }
    */
    
    @Override
    public String toString () {
        return ("Jsem " + getJmeno() + ", vážím " + getVaha() + " létám: " + getLetajici() + ", " + vydejZvuk());
    }
   

}
