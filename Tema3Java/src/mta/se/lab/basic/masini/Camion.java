package mta.se.lab.basic.masini;

import mta.se.lab.basic.interfaces.IService;
/**
 * Inherited class from Masina class.
 * There are implemented the 2 abstract methods of the Masina class.
 * There are implemented the 2 methods from the interface IService.
 * @author George Iordache 31/10/2014
 *
 */

public class Camion extends Masina implements IService{

	public Camion(String cul, Integer nr)
	{
		super(cul, nr);
	}

	@Override
	public void merge() 
	{
		System.out.println("Camionul transporta marfa.");
		
	}

	@Override
	public void roti() 
	{
		System.out.println("Camionul are 8 roti.");		
	}

	@Override
	public void schimbUlei() 
	{
		System.out.println("A fost schimbat uleiul la camion!");
		
	}

	@Override
	public void schimbCauciucuri() 
	{
		System.out.println("Au fost schimbate cauciucurile la Mercedes!");
		
	}

}
