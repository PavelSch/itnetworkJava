package dbOrig.Slovnicek2.src.slovnicek2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Slovnicek2 {

    /*
    *	       __          __                __            
    *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
    *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
    *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
    *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
    *                                                   
    *                                                           
    *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
    * 
    *	Tento zdrojový kód je součástí tutoriálů na programátorské 
    *	sociální síti WWW.DEVBOOK.CZ	
    *	
    *	Kód můžete upravovat jak chcete, jen zmiňte odkaz 
    *	na www.devbook.cz :-) 
    */
    public static void main(String[] args) {
        try (Connection spojeni = DriverManager.getConnection("jdbc:mysql://localhost/slovnicek_db?user=root&password=");
            PreparedStatement dotaz = spojeni.prepareStatement("SELECT * FROM slovo");) {
            ResultSet vysledek = dotaz.executeQuery(); 
            vysledek.last();            
            System.out.println(vysledek.getRow());
        } catch (SQLException ex) {
            System.out.println("Chyba při komunikaci s databází");
        }
    }
    
}
