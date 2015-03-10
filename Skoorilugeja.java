package oop_proj;

public class Skoorilugeja
{
	private int õigeid;
	private int kokku;

	public Skoorilugeja()
	{
		this.õigeid = 0;
		this.kokku = 0;
	}
	
	public void setKokku(int kokku)
	{
		this.kokku = kokku;
	}
	
	public void lisaPunkt()
	{
		this.õigeid++;
	}
	
	public void lisaVastatud()
	{
		this.kokku++;
	}

	@Override
	public String toString()
	{
		return "Skoor: " + õigeid + "/" + kokku;
	}
	
	
}
