import java.util.Scanner;

public class TD1_E1 {

	
	private static int SaisirAnnee (int A) {
		
	do {
		System.out.println("Saisir une année entre 1 et 2100");
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();

		}	
		while(A<=1 && A>=2100);	
	return A;
}

	private static boolean TestBi (int A ) {

		if ((A % 4==0) && (A % 100 !=0)) {
			return true;
		}
		if ((A % 4==0) && (A % 100==0) && (A % 400==0)) {
			return true;
		}
		
		else {
			return false;
	}
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A =0;
A= SaisirAnnee(A);	
boolean Bi=TestBi(A);
if (Bi==true) {
	System.out.println(A+ " est une année bissextile");
}
else {
	System.out.println(A+ " n'est pas une année bissextile");
}
		
	}



}
