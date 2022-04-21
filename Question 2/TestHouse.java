import java.util.ArrayList;

public class TestHouse {
	
	public static void main(String[] args) {
		
		ArrayList<House> house = new ArrayList<>();
		
		house.add(new House(100,400,"subang"));
		house.add(new Terrace(830,200,"Sepang","centre"));
		house.add(new TownHouse(410,210,"Gelang Patah",2,5));
		house.add(new Apartment(503,200,"Paris",10));
		house.add(new House(100,20,"Bawah jambatan"));
		house.add(new Terrace(730,2320,"Central Park","corner"));
		house.add(new TownHouse(410,420,"Central Plains",5,22));
		house.add(new Apartment(503,220,"Murim",3));
		house.add(new House(100,20,"Tepi Lorong"));
		house.add(new Terrace(930,5520,"Longkang","tepi sungai"));
		house.add(new TownHouse(310,270,"Lorong tepi",10,50));
		house.add(new Apartment(403,320,"Atas Atap",1));
	
		for(int i = 0; i<house.size();i++) {
			System.out.println(house.get(i).toString());
			System.out.println("-------------------------------------------");
			
		}
		
		
	}
	
}
