package oop_proj;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class M�lum�ng
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<K�simus> k�simused = new ArrayList<K�simus>();
		
		File fail = new File(System.getProperty("user.dir") + "\\oop_proj\\k�simused.txt");
		Scanner sc = new Scanner(fail);
		
		while (sc.hasNextLine()) 
		{
		    String rida = sc.nextLine();
		    String[] t�kid = rida.split("---");
		    k�simused.add(new K�simus(t�kid[0],t�kid[1]));
		}
		
		sc.close();
		
		
		int k�simusi = Integer.parseInt(JOptionPane.showInputDialog(null, "Mitu k�simust? ", "K�simuste arv", JOptionPane.QUESTION_MESSAGE));
		//mingi kontroll ka kas pandi arv v�i mitte
		Skoorilugeja skoor = new Skoorilugeja();
		
		int nr;
		String vastus;
		
		while(k�simusi>0 && k�simused.size()>0)
		{
			nr = (int)Math.round(Math.random()*(k�simused.size()-1));
			vastus = JOptionPane.showInputDialog(null, k�simused.get(nr).getK�simus(), "K�simus", JOptionPane.QUESTION_MESSAGE);
			
			
			skoor.lisaVastatud();
			
			if(k�simused.get(nr).kontrolli(vastus))
			{
				skoor.lisaPunkt();
				JOptionPane.showMessageDialog(null, "Vastus �ige", "Vastus �ige", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Vastus vale\n�ige vastus: " + k�simused.get(nr).getVastus(), "Vastus vale", JOptionPane.ERROR_MESSAGE);
			}
			
			k�simused.remove(nr);
			
			k�simusi--;
		}
		
		//peaks listi "k�simused" alles j��nud elemendid faili tagasi kirjutama
		JOptionPane.showMessageDialog(null, skoor, "Tulemus", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
