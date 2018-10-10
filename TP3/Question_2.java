
public class Question_2 {
	
	private double[][] T;
	
	
	public Question_2 (double [][] in) {
		
		/*int L=in.length;
		int c= in[0].length;
		
		this.T = new double [L][c];
		for (int lig=0;lig<this.T.length;lig++) {
			for (int col=0;col<this.T[lig].length;col++) {
				this.T[lig][col]=in[lig][col];
					
		}
		}
	
	*/
	this.T=in;
	}
	public String toString() {
		String res ="";
		for (int lig=0;lig<this.T.length;lig++) {
			for(int col=0;col<this.T[lig].length;col++) {
				res=res+this.T[lig][col]+" ";
				
			}
			res+="\n";
		}
		return res;
	}

	public void display() {
		System.out.println(this.T);
		System.out.println(this);
	}

	 double [][] addition;
	public  Question_2 add(Question_2 ad) {
		addition = new double [this.T.length][this.T[0].length];
		for (int i=0;i<T.length;i++) {
			for (int j=0;j<T[i].length;j++) {
				addition[i][j]=this.T[i][j]+ad.T[i][j];
				
			}
		}
		return new Question_2 (addition);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
