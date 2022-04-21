
public class House {
	
	private double wideness;
	private double regularPrice;
	private String address;
	
	
	House(){}
	
	House(double wideness, double regularPrice, String address){
		this.wideness=wideness;
		this.regularPrice=regularPrice;
		this.address=address;
		
	}
	
	
	
	public double getWideness() {
		return wideness;
	}

	public void setWideness(double wideness) {
		this.wideness = wideness;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double SalePrice() {
		return 0;
	}
	
	
	public String toString() {
		return getClass().getName()+"\n\nWideness : "+wideness+"\nRegular price : "+regularPrice+"k\nAddress : "+address;
	}

}
