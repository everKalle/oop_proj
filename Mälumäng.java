package oop_proj;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mälumäng
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<Küsimus> küsimused = new ArrayList<Küsimus>();
		
		File fail = new File(System.getProperty("user.dir") + "\\oop_proj\\küsimused.txt");
		Scanner sc = new Scanner(fail);
		
		while (sc.hasNextLine()) 
		{
		    String rida = sc.nextLine();
		    String[] tükid = rida.split("---");
		    küsimused.add(new Küsimus(tükid[0],tükid[1]));
		}
		
		sc.close();
		
		
		int küsimusi = Integer.parseInt(JOptionPane.showInputDialog(null, "Mitu küsimust? ", "Küsimuste arv", JOptionPane.QUESTION_MESSAGE));
		//mingi kontroll ka kas pandi arv või mitte
		Skoorilugeja skoor = new Skoorilugeja();
		
		int nr;
		String vastus;
		
		while(küsimusi>0 && küsimused.size()>0)
		{
			nr = (int)Math.round(Math.random()*(küsimused.size()-1));
			vastus = JOptionPane.showInputDialog(null, küsimused.get(nr).getKüsimus(), "Küsimus", JOptionPane.QUESTION_MESSAGE);
			
			
			skoor.lisaVastatud();
			
			if(küsimused.get(nr).kontrolli(vastus))
			{
				skoor.lisaPunkt();
				JOptionPane.showMessageDialog(null, "Vastus õige", "Vastus õige", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Vastus vale\nÕige vastus: " + küsimused.get(nr).getVastus(), "Vastus vale", JOptionPane.ERROR_MESSAGE);
			}
			
			küsimused.remove(nr);
			
			küsimusi--;
		}
		
		//peaks listi "küsimused" alles jäänud elemendid faili tagasi kirjutama
		JOptionPane.showMessageDialog(null, skoor, "Tulemus", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
