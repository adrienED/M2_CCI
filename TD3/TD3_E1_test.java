
public class TD3_E1_test {

	
	
	
	public static void main (String args [] ) {
		TD3_E1 t;
		t=new TD3_E1 (2,4);
		t.afficher();
		
		int[] s= t.SommeEnligne();
		// afficher somme 
		System.out.println(java.util.Arrays.toString(s));
		
		
		int[] somme= t.SommeEnColonne();
		// afficher somme 
		System.out.println(java.util.Arrays.toString(somme));
		
		int sommetotal = t.Somme();
		System.out.println(sommetotal);
		
		
		int[] min= t.min();
		// afficher somme 
		System.out.println(java.util.Arrays.toString(min));
		
		//exercice 2 question 2
		t = new TD3_E1 (2,4);
		System.out.println(t);
		
		//exercice 2 question 3
		TD3_E1 o1 = new TD3_E1 (2,4);
		TD3_E1 o2 = new TD3_E1 (2,4);
		TD3_E1 S = TD3_E1.add(o1, o2);
		System.out.println(S);
		
		
		//exercice 2 question 4
		TD3_E1 O1 = new TD3_E1 (2,4);
		TD3_E1 O2 = new TD3_E1 (2,4);
		System.out.println(O1);
		System.out.println(O2);
		O1.add(O2);
		System.out.println(O2);
		
		
	}
}
//la classe Arrays contient methode manip tab 1D et 2D 
// La methode toString renvoie une chaine avec tous les éléments tableau
