import java.util.Scanner;

public class TD1_E4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
double Note;
double Somme = 0 ;
double nbNote = 0;
int choix;

do {
	System.out.println("Note ?");
	
	Scanner sc = new Scanner(System.in);
	Note = sc.nextDouble();
	Somme=Somme+Note;
	nbNote=nbNote+1.0;

	do {
		System.out.println("Continuer la saisie ?");
		Scanner ch = new Scanner(System.in);
		choix = ch.nextInt();
		
		
	}
	while((choix==1) || (choix==2));
}
	while(choix==1);
	
System.out.println("La moyenne est "+Somme/nbNote);
	}

}