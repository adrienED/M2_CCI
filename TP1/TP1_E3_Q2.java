import java.util.Scanner;

public class TP1_E3_Q2 {
	
	public static void main(String[] args) {
		SEPARE(364);
	}
	
	
	

	public static void SEPARE(int N){


		//System.out.println("saisir un nombre a 3 chiffres");
		//int N;
		//Scanner sc = new Scanner(System.in);
		//N=sc.nextInt();
		int C, D,U;
		
		U=N%10;
		N=N/10;
		D=N%10;
		C=N/10;
		
				
		System.out.println("le chiffre des centaine est "+C);
		System.out.println("le chiffre des dizaine est "+D);
		System.out.println("le chiffre des unité est "+U);

	}

}
