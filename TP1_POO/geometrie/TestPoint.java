package geometrie;

public class TestPoint {

	public static void main(String[] args) {
		// test origine
		Point origine = new Point();
		if (origine.getX() == 0)
			System.out.println("Test origine.getX()                     [ok]");
		else
			System.out.println("Test origine.getX()                     [erreur]");

		if (origine.getY() == 0)
			System.out.println("Test origine.getY()                     [ok]");
		else
			System.out.println("Test origine.getY()                     [erreur]");

		// test nouveau point
		Point newP = new Point(3, 2);
		if (newP.getX() == 3)
			System.out.println("Test newP.getX()                     [ok]");
		else
			System.out.println("Test newP.getX()                     [erreur]");

		if (newP.getY() == 2)
			System.out.println("Test newP.getY()                     [ok]");
		else
			System.out.println("Test newP.getY()                     [erreur]");

		// test copie
		Point copieNewP = newP.copy();
		if (copieNewP.getX() == 3)
			System.out.println("Test copy(3,2).getX()                     [ok]");
		else
			System.out.println("Test copy(3,2).getX()                  [erreur]");

		if (copieNewP.getY() == 2)
			System.out.println("Test copy(3,2).getY()                     [ok]");
		else
			System.out.println("Test copy(3,2).getY()                  [erreur]");

		// test set
		origine.setX(4);
		if (origine.getX() == 4)
			System.out.println("Test origine.setX(4).getX()                     [ok]");
		else
			System.out.println("Test origine.setX(4).getX()                     [erreur]");

		origine.setY(7);
		if (origine.getY() == 7)
			System.out.println("Test origine.setY(7).getY()                     [ok]");
		else
			System.out.println("Test origine.setY(7).getY()                     [erreur]");

		// test translation
		Point p23 = new Point(2, 3);
		p23.translater(4, 7);
		if (p23.getX() == 6)
			System.out.println("Test (2,3).translater(4,7).getX()                     [ok]");
		else
			System.out.println("Test (2,3).translater(4,7).getX()                     [erreur]");

		if (p23.getY() == 10)
			System.out.println("Test (2,3).translater(4,7).getY()                      [ok]");
		else
			System.out.println("Test (2,3).translater(4,7).getY()                     [erreur]");

	}

}
