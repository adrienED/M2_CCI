
public class Matrice{

	private double[][] T;

	/*
	 * initialiser un tableau de L ligne et c colonne avec 0 dedans
	 * 
	 * @ paramètre L nb de ligne >=1
	 * 
	 * @ paramètre c nb colonne >=1
	 */
	public Matrice (int L, int c) {
			// T est le tableau en memoire qui contient les éléments
			this.T = new double [L][c];
			/*this : @ memoire qui est affecté au stockage
			de l'instance actuelle */
			
			//remplir
			for (int lig=0;lig<this.T.length;lig++) {
				for (int col=0;col<this.T[lig].length;col++) {
					this.T[lig][col]=0.;
					
				}
			}
	
		}
	
	public String toString() {
		String res ="";
		for (int lig=0;lig<this.T.length;lig++) {
			for(int col=0;col<this.T[lig].length;col++) {
				res=res+this.T[lig][col]+" ";
				
			}
			res+="\n";
		}
		return res;
	}
	


	public void display() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {

	}

}
