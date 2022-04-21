
public class Shape {
	
	String color;
	boolean filled;
	
	Shape(){}
	
	Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	public String toString() {
		return "|"+getClass().getName()+"|\n\nColor  : "+color+"\nfilled : "+filled;
	}

}
