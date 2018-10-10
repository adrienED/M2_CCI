
public class TD3_E1 {

	int[][] T;

	public TD3_E1(int L, int C) {

		T = new int[L][C];
		for (int l = 0; l < T.length; l++) {
			for (int c = 0; c < T[l].length; c++) {
				T[l][c] = alea();
			}
		}
	}

	private int alea() {
		return (int) (Math.round(Math.random() * 10));
	}

	public void afficher() {
		for (int l = 0; l < T.length; l++) {
			for (int c = 0; c < T[l].length; c++) {

				// entre 2 éléments de la même ligne du tableau on reste sur la meme ligne de la
				// console
				System.out.print(T[l][c] + " ");

			}
			// a la fin de l'affichage d'une ligne on passe a la ligne (dans la console au
			// dessus)
			System.out.println();
		}

	}

	public int[] SommeEnligne() {

		// declarer allouer le resultat
		int[] res = new int[T.length];

		// Pour chaque ligne
		for (int l = 0; l < T.length; l++) {
			// ini somme
			res[l] = 0;
			// calcule la somme, le long de la ligne
			for (int c = 0; c < T[l].length; c++) {
				res[l] += T[l][c];

			}
		}
		return res;
	}
public int[] SommeEnColonne() {
	
	int[] res= new int[T[0].length];
	//Hyp la table est rectangulaire, toutes les lignes ont la même longueur
	
	for(int c=0;c<T[0].length; c++) {
		res[c]=0;
	
	for (int l=0;l<T.length;l++) {
		res[c]+=T[l][c];
	}
	}
	return res;
	
	
		}

public int Somme() {
	int res = 0;
	for(int l=0;l<T.length; l++) {
		for (int c=0; c<T[l].length;c++) {
			res+=T[l][c];
		}
	}
	return res;
}

//Repeter l'extraction pour chaque ligne-->Extraire le min d'une ligne
	//-->Memoriser une première valeur pour le minimum (ex : le premier element de la ligne)
	//-->Examiner chaque element, par pour verifier qu'il n'est pas plus petit
		//--> Dans le cas contraire, on met a pour la vlauer de notre min

//Etape :
//Allouer le tableau pour les resultats
//extraire le min de chaque ligne
  //*Repeter sur chaque ligne :
	//*Affecter au min le premier etat de la ligne
		//*Comparer le min et l'etat en cours
		//*Si necessaire modifier le min


public int[] min() {
	int[] res=new int [T.length];
	for (int l=0;l<T.length;l++) {
		res[l]=T[l][0];
		for( int c=1; c<T[l].length;c++) {
			if(T[l][c]<res[l]) {
				res[l]=T[l][c];
			}
		}
	}
	return res;
}

//BUT : faire une methode qui duplique l'integralite de l'objet 
//COPIE : -->Dupliquer toutes les zones mémoire alloué
		//-->Recopier toute les valeurs stockés
//Dans le constructeur par recopie on peut acceder aux paramètre d'un objet de la même classe que moi comme si c'etait les mien


public TD3_E1 (TD3_E1 obj) {
//dimension du tableau de l'objet 
int L= obj.T.length;
int C=obj.T[0].length;

//alloc
T= new int [L][C];

//copie 
for (int l=0; l<L;l++) {
	for (int c=0;c<C;c++) {
		T[l][c]=obj.T[l][c];
	}
}
}


//exercice 2 q2
public String toString() {
	String res = "";
	for(int l=0; l<T.length;l++) {
		for (int c =0;c<T[0].length; c++) {
			res+=T[l][c];
			res+="";
			
			
		}
		res+="\n";
	}
	return res;
}

//exercice 2 q3

public static TD3_E1 add (TD3_E1 obj1, TD3_E1 obj2) {
	//créer 1 résulat qui soit la copie d'un paramètre
	
	TD3_E1 res = new TD3_E1 (obj1);
	//res etant la copie de obj1, on lui rajoute obj2, element par element
	
	for (int l=0;l<res.T.length;l++) {
		for (int c=0;c<res.T[0].length;c++) {
			res.T[l][c]+=obj2.T[l][c];
			
		}
		
		
	}
	return res;
	
}

//exercice 2 q4

public void add (TD3_E1 obj2) {
	
	for (int l=0;l<this.T.length;l++) {
		for (int c=0;c<this.T[0].length;c++) {
			this.T[l][c]+=obj2.T[l][c];
	

	


	}
	}


}
}


