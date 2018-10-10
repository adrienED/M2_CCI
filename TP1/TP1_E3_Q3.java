
public class TP1_E3_Q3 {

	public static void main(String[] args) {
		SUIVANTE(13,56,59);

	}

	public static void SUIVANTE(int AH, int AM, int AS) {

		int sec; 
		sec=AH*3600+AM*60+AS;
		sec++; //sec=sec+1
		int Q, NH,NM,NS;
		NS=sec%60;
		Q=sec/60;
		NM=Q%60;
		NH=(Q/60)%24;
		System.out.println(NH+" "+NM+" "+NS+" ");

	}

}
