package cse360assignment02;

public class AddingMachine 
{
	private int total;
	private String history; //keeps the history of addition and subtraction in a string
  
	public AddingMachine() 
	{
		history = "0";
	}
  
	public int getTotal () //return current total
	{
		return total;
	}
  
	public void add(int value) //add parameter to the total variable
	{
		total = total + value;
		
	
		history = history + " + " + value;
		
	}

	public void subtract(int value) //subtract parameter from total
	{
		total = total - value;
		
		history = history + " - " + value;
	}

	public String toString() //returns history of add/subtract in a string
	{
		return history;
	}

	public void clear() 
	{
		history = "0";
	}
}
