
public class TP4_E4 {
	

	private static int[] W;
	

	public static int [] tableau (int [] T) {
		
		W= new int [T.length];
		for (int k=0;k<T.length-1;k++) {
			W[k]=0;
		}
		
		int p=6;
		//int p=(int) Math.round(Math.random() *(T.length-1));
		int d=0;
		int f=T.length-1;
		int i=0,j=0;

				do{
				if (p>T[i]) {
					W[d]=T[i];
					d=d+1;
					i++;
			}
				else {
					if(p<T[i]) {
						W[f]=T[i];
					f=f-1;
					i++;
					}
				
				
					}

					
		
				}
				while (i<T.length-1); 
		
	return W;
	
	}	
		public static void main(String args[]) {
		int [] T= {3,6,9,3,5,6,1,6,8,3,4};
		
		int[] n=tableau(T);
		for (int i=0;i<n.length-1;i++) {
		System.out.println(n[i]);
		}
		}
	
}
