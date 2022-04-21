
public class Sphere extends ThreeDimensional{
	
	double radius;

	public Sphere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sphere(String color, boolean filled,double radius) {
		super(color, filled);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return Math.round(4*Math.PI*radius);
	}

	@Override
	public double calVolume() {
		// TODO Auto-generated method stub
		return Math.round(4/3 *radius*radius*radius*Math.PI);   //can use java math function to do power of 3 *tapi saya malas :#
	}
	
	public String toString() {
		return super.toString()+"\nArea   : "+calArea()+"\nVolume : "+calVolume();
	}

}
