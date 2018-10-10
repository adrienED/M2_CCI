
public class TP5_E5 {

	
	public static void main (String [] args) {
		afficher("GU18 bricolage Pack tournevis".split(" "));
		String [] tab = {"GU18 bricolage Pack tournevis", "H4467 bricolage Perceuse", 
							"F132 vetement Tee-Shirt a fleurs"};
			
				
		recap(tab,"bricolage");
		
	}
	public static void afficher (String[] S) {
		
		System.out.println("code:");
		System.out.println(S[0]);
		System.out.println("Rayon");
		System.out.println(S[1]);
		System.out.println("Article");
		for (int k = 2; k < S.length; k++) {
			System.out.println(S[k] + " ");
			System.out.println();
					}
	}
		
	
	public static void recap (String [] tab , String rayon ) {
		int nb_art=0;
	for (int k =0; k<tab.length;k++) {
		
		String[] data = tab[k].split(" ");
		//test si article dans bon rayon
		if (data[1].equals(rayon)) {
			//affichage
			System.out.println("Code"+data[0]);
			System.out.println("Article :");
			
			for (int w=2; w<data.length;w++) {
				System.out.println(data[w]=" ");
				
			}
			//compter
			nb_art++;

			}
		}
	//synthese
	System.out.println("Nombre d'article au rayon"+rayon+":"+nb_art);



	}
}
