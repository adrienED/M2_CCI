
public class DemoPalin {

	public static void main(String[] args) {
		// System.out.println( estPalindrome ("kayak"));
		//System.out.println(inverse("kayak"));
		//System.out.println(estPalindrome2("kayak"));
		
	}

	public static boolean estPalindrome(String S) {

		boolean r = true;
		for (int i = 0; i < S.length() / 2; i++) {
			if ((S.charAt(i)) != (S.charAt(S.length() - 1 - i)))
				r = false;
		}

		return r;

	}

	public static String inverse(String s) {

		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;

		}
		return r;
	}

	public static boolean estPalindrome2(String s) {
		
		return (s.equals(inverse(s)));
	}
	
}



