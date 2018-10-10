import java.util.Scanner;

public class TP4_E1 {


	private static int[] T;
	private int N;

	public TP4_E1(int N) {
		
		T = new int[N];
	}	
public static int Algo1 (int [] T,int v) {

int pos = -1;
int rang = T.length-1;
boolean trouve = false;

while (rang>=1 && trouve==false)
 {
	if (T[rang]==v) {
		trouve = true;
		pos = rang;
	}
	else
		rang=rang-1;
}

return pos;	
}	

	public static void main(String[] args) {


int [] T= {4,21,6,9,3,67,6,1,3,5};

System.out.println("entrer un nombre");
Scanner sc = new Scanner (System.in);
int v= sc.nextInt();
int n= Algo1(T,v);
System.out.println(n);
	}
}
