import java.util.Scanner;

public class TP2_E2 {

	
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
int n = aleatoire (10,100);
int d = SaisieNombre (3,7);
if (n%d==0) System.out.println("Gagné");
else System.out.println("Perdu");
	}

}
