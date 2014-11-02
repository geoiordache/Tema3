
package mta.se.lab.basic;

import mta.se.lab.basic.exceptions.MyException;
import mta.se.lab.basic.masini.Camion;
import mta.se.lab.basic.masini.Mercedes;

/**The entry point to the application
 * Testing inheritance, abstract classes, interfaces, exceptions
 * @author Iordache George 31/10/2014
 * 
 */

public class Main {

	/**
	 * The entry point to the project
	 * @param args The arguments to the executable
	 */
	public static void main(String[] args) {
		Camion camion1=new Camion("rosu", 1000);
		Camion camion2=new Camion("verde",100);
		
		System.out.printf("camion 1 este %s.\n", camion1.getCuloare());
		try
		{
			camion1.setCuloare("negru");
		}
		catch(MyException exceptie1)
		{
			exceptie1.printStackTrace();
		}
		System.out.printf("camion 1 este %s.\n", camion1.getCuloare());
		camion1.merge();
		
		
		try
		{
			camion1.setCuloare(null);
		}
		catch(MyException exceptie1)
		{
			/*exceptie1.printStackTrace();*/
			String msg=exceptie1.getMessage();
			System.out.printf("\nExceptie la modificarea culorii!\n%s\n\n",msg);
		}
		
		
		System.out.printf("camion2 a parcurs %d kilometri.\n", camion2.getNrKilometri());
		camion2.addKilometri(1234);
		System.out.printf("camion2 a parcurs %d kilometri.\n", camion2.getNrKilometri());
		camion2.roti();
		
		Mercedes SClass=new Mercedes("gri",1500);
		Mercedes EClass=new Mercedes("negru",10000);
		
		SClass.addKilometri(3500);
		SClass.schimbCauciucuri();
		SClass.merge();
		
		EClass.setNrKilometri(22000);
		EClass.schimbUlei();
		EClass.roti();
	}

}
