
public class TP1_E4_Q1 {



	public static void main(String[] args) {

		System.out.println(STATUT(16));

	}

	public static String STATUT(double age) {

		String res = "";
		if (age>=18) {
			res="majeur";
		}
		else {
			res="mineur";
		}
		return(res);
	}

}
