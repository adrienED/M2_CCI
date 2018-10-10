import java.util.Scanner;

public class CalculMensualiteCreditTauxFixe{  


	public static float CalculMensualiteCreditTauxFixe1(int C, Float T, int N){



		float calcul1=C*T;
		float calcul2=(float)Math.pow((1+T),N);
		float calcul3=calcul2-1;
		float M=calcul1*(calcul2/calcul3);
		return M;

	}

	public static void main(String[] args) {


		int C;
		float T;
		int N;
		float M;

		System.out.println("Saisir le montant emprunté");
		Scanner sc = new Scanner(System.in);
		C= sc.nextInt();
		System.out.println("Saisir le Taux");
		Scanner sd = new Scanner(System.in);
		T= sd.nextFloat();
		System.out.println("Saisir le nombre de mois");
		Scanner sn = new Scanner(System.in);
		N= sn.nextInt();

		System.out.println("M= "+CalculMensualiteCreditTauxFixe1(C,T,N));


	}
}
