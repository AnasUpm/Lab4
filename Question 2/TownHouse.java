
public class TownHouse extends House{
	
	int year;
	double manufacturerDiscount;
	public TownHouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TownHouse(double wideness, double regularPrice, String address,int year, double manufacturerDiscount) {
		super(wideness, regularPrice, address);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	
	public double SalePrice() {
		
			return getRegularPrice()-this.manufacturerDiscount;
			
	}
	
	public String toString() {
		return super.toString()+"\nYear : "+year+"\nManufacterer Discount : "+manufacturerDiscount+"\nSale Price : "+SalePrice()+"k";
	}

}
