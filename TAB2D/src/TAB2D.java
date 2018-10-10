
public class TAB2D {


	int[][] T;

	public TAB2D(int L, int C) {

		T = new int[L][C];
		for (int l = 0; l < T.length; l++) {
			for (int c = 0; c < T[L].length; c++) {
				T[l][c] = alea();
			}
		}

	}

	private int alea() {
		return (int) (Math.round(Math.random() * 10));
	}

	public void afficher() {
		for (int l=0; l<T.length;l++) {
			for ( int c=0; c<T.length; c++) {
				
				
				// entre 2 éléments de la même ligne du tableau on reste sur la meme ligne de la console
				System.out.println(T[l][c]+" ");
				
				
			}
			//a la fin de l'affichage d'une ligne on passe a la ligne (dans la console au dessus)
			System.out.println();
		}

	}

}


