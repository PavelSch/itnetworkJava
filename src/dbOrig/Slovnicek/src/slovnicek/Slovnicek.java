package dbOrig.Slovnicek.src.slovnicek;

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
public class Slovnicek {

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
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej anglické slovíčko k překladu:");
        String anglicky = scanner.nextLine();        
        try (Connection spojeni = DriverManager.getConnection("jdbc:mysql://localhost/slovnicek_db?user=root&password=");
            PreparedStatement dotaz = spojeni.prepareStatement("SELECT cesky FROM slovo WHERE anglicky=?");) {
            dotaz.setString(1, anglicky);
            try (ResultSet vysledky = dotaz.executeQuery()) {
                vysledky.next();          
                String cesky = vysledky.getString("cesky");                
                System.out.println("Překlad " + anglicky + ": " + cesky);
            }
        } catch (SQLException ex) {
            System.out.println("Chyba při komunikaci s databází");
        }
    }
    
}
