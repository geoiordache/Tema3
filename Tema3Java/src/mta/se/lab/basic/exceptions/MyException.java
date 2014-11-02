package mta.se.lab.basic.exceptions;

@SuppressWarnings("serial")
/**
 * Extending the Exception class
 * Exceptions thrown by setCuloare method
 * 
 * @author George Iordache 31/10/2014
 * 
 */
public class MyException extends Exception
{
	public MyException(String mesaj)
	{
		super(mesaj);
	}
}
