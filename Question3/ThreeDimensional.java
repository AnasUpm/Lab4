
public abstract class ThreeDimensional extends Shape {
	
	

	public ThreeDimensional() {
		super();
		
	}

	public ThreeDimensional(String color, boolean filled) {
		super(color, filled);
		
	}
	
	
	public abstract double calArea();
	public abstract double calVolume();
	
	public String toString() {
		return super.toString();
	}
	
	
	

}
