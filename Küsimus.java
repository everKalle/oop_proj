package oop_proj;

public class Küsimus
{
	private String küsimus;
	private String vastus;
	
	public Küsimus(String küsimus, String vastus)
	{
		this.küsimus = küsimus;
		this.vastus = vastus;
	}

	public boolean kontrolli(String pakkumine)
	{
		if (pakkumine.equalsIgnoreCase(vastus))
			return true;
		else
			return false;
	}
	
	@Override
	public String toString()
	{
		return küsimus;
	}
	
	
}
