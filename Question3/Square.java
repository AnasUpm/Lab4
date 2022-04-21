
public class Square extends TwoDimensional {
	
	double length;
	
	
	
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Square(String color, boolean filled,double length) {
		super(color, filled);
		this.length=length;
		
		// TODO Auto-generated constructor stub
	}



	public double calArea() {
		// TODO Auto-generated method stub
		return Math.round(length*length);
	}
	
	public String toString() {
		return super.toString()+"\nArea   : "+calArea();
	}

}
