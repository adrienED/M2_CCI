import java.util.*;

public class MaxMin {

	private static int[] T;
	private int N;
	

public MaxMin(int N ) {
	N=10;
	T= new int[N];
}

private static int alea() {
	return (int) (Math.round(Math.random() * 10));
}


public static int Max () {
	int max = 0;
	int min= 0;
	
	for (int m=0;m<T.length;m++) {
		
		if (T[m]>max) {
			max=T[m];
		}
	
	}
	
	return max;
	
}


public static int Min () {
	int min= 0;
	
	for (int m=0;m<T.length;m++) {
		
		if (T[m]<min) {
			min=T[m];
		

		}
	
	}
	
	return min;
	
}

public static int sommeMax(int max) {
	int somme =0;
	for (int i = 0;i<T.length;i++) {
		somme=somme+T[i];
		
	}
	somme=somme-max;
	return somme;
}



public static int sommeMin(int min) {
	int somme =0;
	for (int i = 0;i<T.length;i++) {
		somme=somme+T[i];
		
	}
	somme=somme-min;
	return somme;
}





private static void remplirTableau ( ){

 
	for(int i=0; i<T.length; i++) {
T[i]=alea();


	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxMin MaxMin = new MaxMin (5);
		remplirTableau();
		

for (int c=0; c<T.length ; c++) {
	
	System.out.println(T[c]);
	

}
	System.out.println("max = "+Min());
	System.out.println("max = "+Min());
		
	
	System.out.println("la somme est "+sommeMax(Max()));
	System.out.println("la somme est "+sommeMin(Min()));
		
	}

}
