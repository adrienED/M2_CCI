
public class TD5 {

	public static void main(String[] args) {
		//affiche ("UE info ");
		//String R = AjouteEtoile("UE info",3);
		//System.out.println(R);
		System.out.println(SupprimeCar("chocolat", 'o'));
		
		
	}		
		
		public static void affiche (String S) {
			for (int i=0;i<S.length();i++) {
				System.out.println(S.charAt(i));
					if(i<S.length()-1) {
						System.out.println(',');
					}
			}
		}

public static String AjouteEtoile (String S, int n) {
	String E= "";
	for (int k = 0;k<n;k++) 
		E+='*';  // E=E+'*'
	
		return E+S+E;
		
	}


private static String [] R;


public static String SupprimeCar (String [] S, char c) {
	

	for (int k=0;k<S.length;k++) {
		if (S.chartAt(k)==c) {
		R=R+S.charAt(k);
		
	}
	}
	return R;
	
	

	
//}


}

