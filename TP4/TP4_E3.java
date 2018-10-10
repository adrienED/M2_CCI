import java.util.*;

public class TP4_E3 {

	private static int[] W;
	private int N;

	public TP4_E3(int N) {

		W = new int[10];
	}

public static int [] Algo3(int []T1,int [] T2) {
	int LT1=T1.length-1, LT2=T2.length-1;
	int rang1=0, rang2=0;
	int rang=0;
	
	while(rang1<=LT1 || rang2<=LT2) {
		if(rang1>LT1) {
			while (rang2<=LT2) {
				W[rang]=T2[rang2];
				rang=rang+1;
						rang2=rang2+1;
			}
		}
		else {
				if(rang2>LT2) {
					while(rang1<=LT1) {
						W[rang]=T1[rang1];
								rang=rang+1;
								rang1=rang1+1;
					}
				}

	
		
				else {
					if(T1[rang1]<T2[rang2]) {
						W[rang]=T1[rang1];
						rang =rang+1;
						rang1=rang1+1;
			}

					else {
						W[rang]=T2[rang2];
						rang=rang+1;
						rang2=rang2+1;
		}
		}
			}
		}
		
		
	
	return W;

}

	public static void main(String args[]) {

		TP4_E3 W = new TP4_E3(10);
		int[] T1 = { 10, 20, 30,40,50};
		int[] T2 = { 5, 15, 25,35,45};

		int[] n = Algo3(T1, T2);

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);

		}

	}
}
