import java.util.Scanner;

public class TP2_E2_Q3 {

	
public static int aleatoire (int x, int y ) {

	return (int) Math.round(Math.random()*(y-x)+x);

}
	public static int SaisieNombre (int x, int y) {
		
		int r;
		do{
			System.out.println("Saisir un nombre entre "+x+" et "+y);
			Scanner sc = new Scanner (System.in);
			r= sc.nextInt();
		}
		while (r<=x || r>y);
		return r;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = aleatoire (0,100);
int essaie=0;
int d;
System.out.println("le nombre est"+n);
do {
	
	d = SaisieNombre (0,100);
	essaie++;
}
	while(n%d!=0.0);
	System.out.println("Gagné");
	if(essaie<5) {
		System.out.println("pas mal");
	}
	else 
		System.out.println("trop nul");


	}

}
