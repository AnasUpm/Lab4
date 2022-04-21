import java.util.ArrayList;

public class TestShape {
	
	public static void main(String[] args) {
		
		ArrayList<Shape> Shape = new ArrayList<>();
		
		Shape.add(new Shape("green",true));
		Shape.add(new Circle("red",false,5));
		Shape.add(new Cube("black",true,9));
		Shape.add(new Sphere("blue",true,7));
		Shape.add(new Square("grey",false,10));
		Shape.add(new Triangle("yellow",false,10,5));
		Shape.add(new Shape("beige",true));
		Shape.add(new Circle("pink",false,50));
		Shape.add(new Cube("orange",true,90));
		Shape.add(new Sphere("purple",true,70));
		Shape.add(new Square("magenta",false,100));
		Shape.add(new Triangle("brown",false,200,50));
		
		
		
		for(int i = 0; i<Shape.size(); i++) {
			System.out.println(Shape.get(i));
			System.out.println("-------------------------------------------");
		}
		
		
	}

}
