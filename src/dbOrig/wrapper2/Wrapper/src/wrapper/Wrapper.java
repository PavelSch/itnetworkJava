/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbOrig.wrapper2.Wrapper.src.wrapper;

import dbOrig.wrapper2.Wrapper.src.DB.Database;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Libor
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Database database = new Database("osoby", "root", "");
            Object[] firstParams = {22, "Galí", 43, "PHP"};
            int uspech1 = database.insert("programatori", firstParams);
            System.out.println("Uložení uživatele = "+uspech1);

            Object[] params2 = {"Galí"};
            int uspech2 = database.delete("programatori", "jmeno = ?", params2);
            System.out.println("Smazání uživatele Gali = "+uspech2);

            String[] columns = {"jmeno","vek","jazyk"};
            Object[] params = {"Galileo", 18, "Java", 6};
            int uspech4 = database.update("programatori", columns, "id = ?", params);
            System.out.println("Přepsání uživate = "+uspech4);

            String[] columns3 = {"jmeno","jazyk"};
            Object[] params3 = {"Java"};
            ResultSet rs = database.select("programatori", columns3, "jazyk = ?", params3);

            while(rs.next()){
                System.out.println(rs.getString("jmeno")+" - "+rs.getString("jazyk"));
            }
            System.out.println(database.count("programatori"));
        } catch (SQLException ex) {
            System.out.println("error - "+ex.getMessage());
        }
        
        /* Query query = new Query();
        
        query.delete("programatori").where("jmeno = ?");
        System.out.println(query.getQuery());
        //Výstup: DELETE FROM programatori WHERE jmeno = ?
        
        String[] columns3 = {"jmeno","jazyk"};
        query.update("programatori").set(columns3).where("where id = ?");
        System.out.println(query.getQuery());
        //Výstup: UPDATE programatori SET jmeno = ?,jazyk = ? WHERE where id = ?
        
        query.select(null).from("programatori").where("jazyk = ?");
        System.out.println(query.getQuery());
        //Výstup: SELECT * FROM programatori WHERE jazyk = ?
        
        Object[] firstParams = {null, "Galí", 43, "PHP"};
        query.insert("programatori").values(firstParams);
        System.out.println(query.getQuery());
        //Výstup: INSERT INTO programatori VALUES(?,?,?,?);*/
    }
    
}
