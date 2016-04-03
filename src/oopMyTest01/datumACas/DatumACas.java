package oopMyTest01.datumACas;

import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.text.ParseException; 

public class DatumACas {

	public static void main(String[] args) {

		Calendar kalendar = Calendar.getInstance();
		SimpleDateFormat formatData = new SimpleDateFormat("d.MMMM yyyy H:mm");
		kalendar.add(Calendar.DAY_OF_MONTH, 3);
		kalendar.set(Calendar.DAY_OF_MONTH, 31);
		kalendar.set(Calendar.MONTH, 9);
		kalendar.set(Calendar.YEAR, 2013);
		System.out.printf("Hodina: %s\n", kalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(formatData.format(kalendar.getTime()));

		Scanner sc = new Scanner(System.in, "Windows-1250");


		System.out.print("Zadej datum ve form�tu 1.1.2000 13:14:");
		formatData = new SimpleDateFormat("d.M.yyyy H:mm");
		try {
		    kalendar.setTime(formatData.parse(sc.nextLine()));
		    System.out.println("Zadal jsi datum: " + formatData.format(kalendar.getTime()));
		} catch (ParseException ex) {
		    Logger.getLogger(DatumACas.class.getName()).log(Level.SEVERE, null, ex);
		}		
		
	}

}
