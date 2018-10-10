import java.util.Scanner;

public class TP1_exo1{  

	
public static float CalculMensualiteCreditTauxFixe1(int C, Float T, int N){

	
	
	float calcul1=C*T;
	float calcul2=(float)Math.pow((1+T),N);
	float calcul3=calcul2-1;
	float M=calcul1*(calcul2/calcul3);
	return M;
	
	
}


	
	public static void main(String[] args) {


float X=CalculMensualiteCreditTauxFixe1(1000,0.018f,12);




	}
}
