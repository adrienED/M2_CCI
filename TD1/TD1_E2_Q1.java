import java.util.Scanner;

public class TD1_E2_Q1 {

	public static void main(String[] args) {
		
int T;
System.out.println("Table de multiplication ?");


Scanner sc = new Scanner(System.in);
T = sc.nextInt();
for (int i=0; i<=10; i++) {
	int R=T*i;
	System.out.println(T+"*"+i+"="+R);
}

		
		
	}
	

}
