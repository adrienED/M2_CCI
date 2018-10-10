
public class chiffrement {

	private static int[] W;
	
	public static int [] tableau (int [] T) {
		
		W= new int [T.length];
		for (int k=0;k<T.length;k++) {
			W[k]=0;
		}
		
		int p=6;
		//int p=(int) Math.round(Math.random() *(T.length-1));
		int d=0;
		int f=10;
		for (int i=0;i<W.length;i++) {
				
				if (p>T[i] ) {
					W[d]=T[i];
					d=d+1;
					
				}
				if(p<T[i] ) {
						W[f]=T[i];
						f=f-1;
				}
	
				}
				
					
		
				
		for (int k=0;k<T.length;k++) {
			if (W[k]==0) {
				W[k]=p;
			}
		}
		

		
	return W;
	
	}	
		public static void main(String args[]) {
		int [] T= {3,6,9,3,5,6,1,6,8,3,4};
		
		int[] n=tableau(T);
		for (int i=0;i<n.length;i++) {
		System.out.println(n[i]);
		}
		}
	
}

