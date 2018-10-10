
public class DemoMatrice {

	public static void main(String[] args) {

		//Matrice M = new Matrice (5,3);
		//System.out.println(M);
		//M.display();
		
		/*
		double[][] tmp = { {1.5,2.2,3.0}, {4.6,5.2,6.9}, {7.1,8.3,9.7} };
		//System.out.println(tmp);
		
		Question_2 m2 = new Question_2(tmp);
		m2.display();
		*/
		
		double [][]tmp1 ={ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ;
		Question_2 m4 = new Question_2(tmp1);
		Question_2 m5= new Question_2(tmp1);	
		Question_2 m6 = m4.add(m5);
		m6.display();
		}
	}	

	
	


