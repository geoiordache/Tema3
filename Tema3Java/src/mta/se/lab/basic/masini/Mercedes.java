package mta.se.lab.basic.masini;

import mta.se.lab.basic.interfaces.IService;
/**
 * Inherited class from Masina class.
 * There are implemented the 2 abstract methods of the Masina class.
 * There are implemented the 2 methods from the interface IService.
 * @author George Iordache 31/10/2014
 *
 */

public class Mercedes extends Masina implements IService
{
	public Mercedes(String cul, Integer nr)
	{
		super(cul, nr);
	}

	@Override
	public void merge()
	{
		System.out.println("Mercedes merge confortabil!");
	}

	@Override
	public void roti() 
	{
		System.out.println("Mercedes are 4 roti!");
	}

	@Override
	public void schimbUlei() 
	{
		System.out.println("A fost schimbat uleiul la Mercedes!");
	}

	@Override
	public void schimbCauciucuri()
	{
		System.out.println("Au fost schimbate cauciucurile la Mercedes!");
	}
}
