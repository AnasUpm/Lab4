
public class Triangle extends TwoDimensional{

	double height;
	double base;
	
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Triangle(String color, boolean filled,double height,double base) {
		super(color, filled);
		this.base=base;
		this.height=height;
	}



	public double calArea() {
		// TODO Auto-generated method stub
		return Math.round(base*height/2);
	}
	
	public String toString() {
		return super.toString()+"\nArea   : "+calArea();
	}

}
