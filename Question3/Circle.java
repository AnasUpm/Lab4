
public class Circle extends TwoDimensional{

	double radius;
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Circle(String color, boolean filled,double radius) {
		super(color, filled);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}


	public double calArea() {
		// TODO Auto-generated method stub
		return Math.round(radius * radius * Math.PI);
	}
	
	public String toString() {
		return super.toString()+"\nArea   : "+calArea();
	}

}
