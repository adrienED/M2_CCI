package geometrie;

public class Point {
	
	
	//constructeurs
	public Point() {
		//this.x=0;
		//this.y=0;
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}

	public Point (Point autrePoint) {
		this.x=autrePoint.getX();
		this.y=autrePoint.getY();
	}
	
	//Methodes :
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	public void translater (int a , int b) {
		//this.x=this.x+a
		//x=x+a
		//x+=a
		this.setX(this.getX()+a);
		this.setY(this.getY()+b);
	}
	
	public void translater (int a) {
		//x=x+a;
		//y=y+a;
		translater(a,a);
	}
	
	public Point copy() {
		
		//Point uneCopie = new Point (x,y);
		//return uneCopie;
		//return new Point(this);
		return new Point(this.getX(),this.getY());
	}

	
	//variable d'instances
	private int x;
	private int y;
	

}

