package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;
import java.util.HashSet;


public abstract class Beobachtbar
{
	private HashSet<Beobachter> _Beobachter;
	
	public Beobachtbar ()
	{
		_Beobachter = new HashSet<Beobachter>();
	}
	
	public void addBeobachter(Beobachter b)
	{
		_Beobachter.add(b);
	}
	
	public void meldeAenderung(Object o)
	{
		for (Beobachter b : _Beobachter)
		{
			b.BeachteAenderung(o);
		}
	}
}
