import java.util.Scanner;

public class DemoString {

	public String Saisie() {
		return (new Scanner (System.in).nextLine());

	}

	public static void affiche(String s) {

		System.out.println("chaine recue : " + s + ";" + " longueur totale : " + s.length());
	}

	public static void affiVertical(String s) {

		for (int k = 0; k < s.length(); k++) {
			System.out.println(s.charAt(k));

			}

		}
	
	
	public static int compteCar(String s, char c) {
		int compt=0;
		for (int i = 0; i<s.length();i++) {
			if (s.charAt(i)==c){
				compt++;
			}
		}
		
	return compt;
	}
	
	/*public static SaisieC (String s) {
		Scanner sc = new Scanner (System.in);
				car=sc.nextLine();
				while (car.length!=1);
				car.charAt(0);
	}
	*/
	
	public int compteVoy (String S) {
		int n= 0;
		String l= "aeiouy";
		for (int i =0 ; i<S.length();i++) {
			
			/*if (S.charAt(i)=='a' ||
			S.charAt(i)=='e'||
			S.charAt(i)=='i'||
			S.charAt(i)=='o'||
			S.charAt(i)=='u'||
			S.charAt(i)=='y')
				n=n+1;*/
			if (l.indexOf(S.charAt(i))>=0) 
				n++;	

		}	
		return n;
}
	
	public String remplace (String S,char a,char b) {
		String R= "";
		for (int i=0; i<S.length();i++) {
				if (S.charAt(i)==a)
					R+=b;
				else
					R+=S.charAt(i);
		}
		return R;
		}
		
	
	
	
	public String remplaceAutrefacon(String S, char a , char b) {
		char[]s=S.toCharArray();
				for (int i =0; i<S.length();i++) {
					if(s[i]==a)
						s[i]=b;
				}
				return (new String (s));
	
	}
	
	public static boolean dans (String S1, String S2) {
		return (S1.indexOf(S2)>=0);
	}
	

	
	public static String genere() {
		String R = "";
		String p =")(-:";
		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.floor(Math.random() * 4) + 0);
			R+=p.charAt(a);
		}

		return R;
	}


public static boolean gagne() {
	return (((genere()).indexOf(":-)"))>=0);
		
}

public static String joue () {
	String s=genere();
	boolean c=(((s).indexOf(":-)"))>=0);
	if(c==true)
		s+=" Gagné !";
	if(c==false) {
		s+=" Perdu !";
	}
		return s;
}

public static epure (String s) {
	
	for (int i=0;i<s.length();i++) {
		
		while (s.charAt(i)==' ' && s.charAt(i+1)==' ') {
			
			
		}
			
			
			
			
	}
	
	
}
	

	
	
	
	
	
	
	

}