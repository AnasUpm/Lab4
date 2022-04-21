
public class Cube extends ThreeDimensional{
	
	double length;
	
	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cube(String color, boolean filled,double length) {
		super(color, filled);
		this.length=length;
		
		// TODO Auto-generated constructor stub
	}



	public double calArea() {
		// TODO Auto-generated method stub
		return Math.round(length*length*6);
	}




	public double calVolume() {
		// TODO Auto-generated method stub
		return Math.round(length*length*length);
	}
	
	public String toString() {
		return super.toString()+"\nArea   : "+calArea()+"\nVolume : "+calVolume();
	}
	

}
