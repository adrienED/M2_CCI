import java.util.*;

public class TP2_E3 {

	private static int[] T;
	private int N;

	public TP2_E3(int N) {
		N = 10;
		T = new int[N];
	}

	private static int alea() {
		return (int) (Math.round(Math.random() * (20)-10));
	}

	public static int Max() {
		int max = -10;
		

		for (int m = 0; m < T.length; m++) {

			if (T[m] > max) {
				max = T[m];
			}
		}
		return max;
	}

	public static int Min() {
		int min = 10;

		for (int m = 0; m < T.length; m++) {

			if (T[m] < min) {
				min = T[m];

			}
		}
		return min;
	}
	
	
	public static double Moyenne() {
		int somme =0;
		for (int i = 0;i<T.length;i++) {
			somme=somme+T[i];
			
			
		}
		double moyenne = (double) somme/ (double) T.length;
		
		return moyenne;
	}	
	

	private static void remplirTableau() {

		for (int i = 0; i < T.length; i++) {
			T[i] = alea();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TP2_E3 TP2_E3 = new TP2_E3(5);
		remplirTableau();

		for (int c = 0; c < T.length; c++) {

			System.out.println(T[c]);

		}
		System.out.println("max = " + Max());
		System.out.println("min = " + Min());
		System.out.println("moyenne = " + Moyenne());

	}

}
