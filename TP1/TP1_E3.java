import java.util.Scanner;
public class TP1_E3 {


	public static double VOLUME( double L ,double l,double h)	{
		double V;	
		return V= L*h*l;



	}



	public static void main(String[] args) {
		double V;
		System.out.println("saisir la longueur");
		double l;
		Scanner sc = new Scanner(System.in);
		l=sc.nextDouble();
		System.out.println("saisir la largeur");
		double L;
		Scanner sl = new Scanner(System.in);
		L=sl.nextDouble();
		System.out.println("saisir la hauteur");
		double h;
		Scanner sh = new Scanner(System.in);
		h=sh.nextDouble();

		System.out.println("le volume du traingle est "+VOLUME(L,l,h));


	}
}
