import java.util.Scanner;

public class TD1_E2_Q2 {

	public static void main(String[] args) {
		
int T;
System.out.println("Table de multiplication ?");


Scanner sc = new Scanner(System.in);
T = sc.nextInt();
int i=0;
while(i<=10) {
	int R=T*i;
	System.out.println(T+"*"+i+"="+R);
	i++;
}

		
		
	}
	

}
