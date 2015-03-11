package oop_proj;

public class Skoorilugeja
{
	private int �igeid;
	private int kokku;

	public Skoorilugeja()
	{
		this.�igeid = 0;
		this.kokku = 0;
	}
	
	public void setKokku(int kokku)
	{
		this.kokku = kokku;
	}
	
	public void lisaPunkt()
	{
		this.�igeid++;
	}
	
	public void lisaVastatud()
	{
		this.kokku++;
	}

	@Override
	public String toString()
	{
		return "Tulemus: " + �igeid + "/" + kokku;
	}
	
	
}
