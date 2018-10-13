package geometrie;

import java.util.Arrays;

public class TestSegment {
	

	
	public static void main (String [] args) {
		
		
		
		//Test origine
		segment origine = new segment (new Point (0,0),new Point (0,0));		
		Point P= new Point(0,0);
		
		if (origine.getDebut().getX() == P.getX() && origine.getDebut().getY()==P.getY())
			System.out.println("Test origine.getDebut()                     [ok]");
		else
			System.out.println("Test origine.getDebut()                     [erreur]");


		if (origine.getFin().getX() == P.getX() && origine.getFin().getY()==P.getY())
			
			System.out.println("Test origine.getFin()                     [ok]");
		else
			System.out.println("Test origine.getFin()                     [erreur]");
		
		
		//teste new 
		segment newS = new segment (new Point (1,2),new Point (3,4));
		Point D= new Point(1,2);
		Point F= new Point(3,4);
		
		if (newS.getDebut().getX() == D.getX() && newS.getDebut().getY()==D.getY())
			System.out.println("Test newS.getDebut()                     [ok]");
		else
			System.out.println("Test newS.getDebut()                     [erreur]");


		if (newS.getFin().getX() == F.getX() && newS.getFin().getY()==F.getY())
			
			System.out.println("Test newS.getFin()                     [ok]");
		else
			System.out.println("Test newS.getFin()                     [erreur]");
		
		
		// teste copy 
		
		segment copieS = newS.copy();
		Point de= new Point(1,2);
		Point fin= new Point(3,4);
		
		
		if (copieS.getDebut().getX() == de.getX() && copieS.getDebut().getY()==de.getY())
			System.out.println("Test origine.getDebut()                     [ok]");
		else
			System.out.println("Test origine.getDebut()                     [erreur]");


		if (copieS.getFin().getX() == fin.getX() && copieS.getFin().getY()==fin.getY())
			
			System.out.println("Test origine.getFin()                     [ok]");
		else
			System.out.println("Test origine.getFin()                     [erreur]");
		
		
		
		// teste set 
		
		
		origine.setDebut(3,2);
		Point deb= new Point(3,2);
		
		
		
		if (origine.getDebut().getX() == deb.getX() && origine.getDebut().getY()==deb.getY())
			System.out.println("Test origine.settDebut()                     [ok]");
		else
			System.out.println("Test origine.setDebut()                     [erreur]");


		origine.setFin(4,5);
		Point fina= new Point(4,5);
		
		
		
		if (origine.getFin().getX() == fina.getX() && origine.getFin().getY()==fina.getY())
			
			System.out.println("Test origine.setFin()                     [ok]");
		else
			System.out.println("Test origine.setFin()                     [erreur]");
		
		
		// teste translater 
		
		segment transeg = new segment (new Point (3,2), new Point (4,5));
		
		transeg.translater (new Point (10,10), new Point (10,10));
		Point start= new Point(13,12);
		Point end= new Point(14,15);
		
		
		
		if (transeg.getDebut().getX() == start.getX() && origine.getDebut().getY()==start.getY())
			System.out.println("Test origine.trans()                     [ok]");
		else
			System.out.println("Test origine.trans()                     [erreur]");
		
		
		
		if (transeg.getFin().getX() == end.getX() && origine.getFin().getY()==end.getY())
			
			System.out.println("Test origine.trans()                     [ok]");
		else
			System.out.println("Test origine.trans()                     [erreur]");
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
