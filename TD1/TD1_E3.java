import java.util.Scanner;

public class TD1_E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double P;
double T=0;
do {
	System.out.println("Prix ?");
	
	Scanner sc = new Scanner(System.in);
	P = sc.nextInt();
	T=T+P;
}
	while(P!=0);

System.out.println("Le total des prix est de "+T+" euros");
	}

}
