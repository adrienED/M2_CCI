

public class TP4_E2 {


	private static int[] W;
	private int N;

	public TP4_E2(int N) {
		
		W = new int[N];
	}	
public static int[] Algo1 (int [] T) {

	
int pos = -1;


for (int k=1; k<=T.length;k++) {
	 W[k-1] = T[T.length-1-k+1];
}

return W;	
}	

	public static void main(String[] args) {

TP4_E2 W= new TP4_E2 (10);

int [] T= {1,2,3,4,5,6,7,8,9};



int[] n= Algo1(T);
for (int i=0;i<n.length;i++) {
System.out.println(n[i]);
	}
}
}
