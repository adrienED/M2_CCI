
package test;
import java.util.Scanner;

public class test {

	


	public String Question;
	private String[] choix;
	private int[] res;
	private int N;
	
		public test(int N, String S) {

			Question = S;
			choix = new String[N];
			 res = new int[N];

		}

		public void ajouteQuestion(int k, String S) {

			// memorise choix
			choix[k - 1] = S;
			// mettre à 0 la qte de reponse pour ce choix
			res[k - 1] = 0;

		}

		public void afficherQuestion() {
			// affiche les options de choix
			for (int c = 0; c <= res.length-1; c++) 
				System.out.println(c+1 + " " + choix[c]);

			
		}

		public void saisie() {
			int rep;
			do {
				do {
					afficherQuestion();
					Scanner sc = new Scanner(System.in);
					rep = sc.nextInt();

				} while ((rep < 0) || (rep > choix.length));
				if (rep >= 1 && rep <= choix.length)
				res[rep - 1]++;
			} while (rep > 0);

		}

		public void afficheResultatsNombres() {
			int c;
			System.out.println("Resultat du sondage" + Question);
			for (c = 0; c <= choix.length-1; c++)
				
			System.out.println("[" + res[c] + "]" + choix[c]);

		}

	public void afficheResultatsPourcentages() {
		System.out.println("Resulat du sondage"+Question);
		//calcul somme
		 int somme = 0;
		 double P;
		for (int c=0; c<choix.length-1  ; c++) somme= somme+res[c];
		
		for (int c=0; c<=choix.length-1;c++) { P =(res[c]/(double)somme*100);
		
		System.out.println("["+P+" %]"+choix[c]);
		}	
	}

	public static int max (int T[] ) {
		int res=0;
		for (int c=0; c<=T.length-1;c++) {
			if(res<T[c]) {
				res=T[c];
				
			}
		}
			return res;
		
	}

	public void etoiles(double N) {
		
		
		
	}


	public void afficheResultatsBarres() {
		System.out.println("Resulat du sondage : "+Question);
		//max
		int maxi=max(res);
		
		//traiter chaque choix
		
		for (int c=0;c<choix.length;c++){
			double N=(res[c]/(double)maxi)*40;
			//afficher etoile
			etoiles(N);
			//afficher 
			System.out.println("--"+choix[c]);
			
		}
	}

		public static void main(String args[]) {

			test test = new test (5, "Quel plat préférez-vous :");
			test.ajouteQuestion(1, "les pâtes");
			test.ajouteQuestion(2, "les frites");
			test.ajouteQuestion(3, "les raviolis");
			test.ajouteQuestion(4, "les brocolis");
			test.ajouteQuestion(5, "les pizzas");
			test.saisie();
			test.afficheResultatsNombres();
			test.afficheResultatsPourcentages();
			test.afficheResultatsBarres();
		}

	}






