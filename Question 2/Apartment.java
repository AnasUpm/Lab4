
public class Apartment extends House {
	
	int level;

	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apartment(double wideness, double regularPrice, String address,int level) {
		super(wideness, regularPrice, address);
		this.level=level;
		// TODO Auto-generated constructor stub
	}
	
	public double SalePrice() {
		if(this.level<=5) {
		return getRegularPrice()-(getRegularPrice()*0.075);
		}
		
		else
			return getRegularPrice()-(getRegularPrice()*0.01);
			
	}
	public String toString() {
		return super.toString()+"\nLevel : "+level+"\nSale Price : "+SalePrice()+"k";
	}

}
