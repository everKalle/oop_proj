package oop_proj;

public class K�simus
{
	private String k�simus;
	private String vastus;
	
	public K�simus(String k�simus, String vastus)
	{
		this.k�simus = k�simus;
		this.vastus = vastus;
	}

	public String getK�simus()
	{
		return k�simus;
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
		return k�simus + "---" + vastus;
	}
	
	
}
