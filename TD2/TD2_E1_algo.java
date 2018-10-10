
public class TD2_E1_algo {

	
	
public sondage (int N, String S) {
	
	Question =S;
	choix = new String [N];
	res = new int [N];
	
}
	
	
	
public void ajouteQuestion (int k, String s) {


	//memorise choix 
	choix[k-1]=S;
	//mettre à 0 la qte de reponse pour ce choix
	res[k-1]=0;
	
	
}

public void saisie() {
		do {
			do {
				afficherQuestion
				Scanner sc = new Scanner(System.in);
				rep=sc.nextInt();
				
			
		}
			while ((rep<0)||(rep>choix.length));
			if (rep>=1 && rep<=choix.length);
			res[rep-1]++
		}
		while(rep>0);	
				
}


public void afficheQuestion() { 
	//affiche les options de choix
	for (int c=0; c<=choix.length;c++) {
		System.out.println(C+" "+choix[c]);
		
	}
}
public void afficheResultatsNombres() {
	System.out.println("Resultat du sondage"+Question);
	for(int c=0;c<=choix.length;c++);
	System.out.println("["+res[c]+"]"+choix[c]);
	
	
}


public void AfficheResulatsPourcentage() {
	System.out.println("Resulat du sondage"+Question);
	//calcul somme
	somme = 0;
	for (int c=0; c<  ; C++) somme= somme+res[c];
	
	for(int c=0; c<=choix.length;c++) double P =(res[c]/(double)somme*100);
	System.out.println("["+p+"+%]"+choix[c]);
	}
}

public int max(int[]) {
	int res=0;
	for (int c=0; c<=T.length;c++) {
		if(res<T[c]) {
			res=T[c];
			
		}
		return res;
	}
			
public void afficheResultatsBarres() {
	System.out.println("Resulat du sondage : "+Question);
	//max
	int maxi=max(res);
	//traiter chaque choix
	for int c=0;c<choix.length;c++){
		int n=(res[c]/(double)maxi)*40;
		//afficher etoile
		etoiles(n);
		//afficher 
		System.out.println("--"+choix[c]);
		
	}
}



	
		   public static void main(String args[]) {
			   
		Sondage test = new Sondage(5,"Quel plat préférez-vous :");
		test.ajouteQuestion(1,"les pâtes");
		test.ajouteQuestion(2,"les frites");
		test.ajouteQuestion(3,"les raviolis");
		test.ajouteQuestion(4,"les brocolis");
		test.ajouteQuestion(5,"les pizzas");
		test.saisie();
		test.afficheResultatsNombres();
		test.afficheResultatsPourcentages();
		test.afficheResultatsBarres();
		}
		

	}


