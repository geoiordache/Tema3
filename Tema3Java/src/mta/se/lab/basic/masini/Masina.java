package mta.se.lab.basic.masini;

import mta.se.lab.basic.exceptions.MyException;

/**
 * Abstract class with 2 abstract methods
 * @author George Iordache 31/10/2014
 *
 */

public abstract class Masina 
{
	private String mCuloare;
	private Integer mKilometri;
	
	public Masina(String cul,Integer nr)
	{
		this.mCuloare=cul;
		this.mKilometri=nr;
	}
	
	public String getCuloare()
	{
		return this.mCuloare;
	}
	
	public void setCuloare(String culoare) throws MyException
	{
		if(culoare==null)
			throw new MyException("Masina trebuie sa aiba o culoare!");
		this.mCuloare=culoare;
	}
	
	public Integer getNrKilometri()
	{
		return this.mKilometri;
	}
	
	public void setNrKilometri(Integer numar)
	{
		this.mKilometri=numar;
	}
	
	public void addKilometri(Integer Kilo)
	{
		this.mKilometri=this.mKilometri+Kilo;
		System.out.printf("Au fost parcursi %d kilometri.\n",Kilo);
	}
	
	abstract void merge();
	
	abstract void roti();
	
}
