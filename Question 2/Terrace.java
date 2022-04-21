
public class Terrace extends House {
	
	private String position;

	public Terrace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terrace(double wideness, double regularPrice, String address, String position) {
		super(wideness, regularPrice, address);
		this.position=position;
		// TODO Auto-generated constructor stub
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public double SalePrice() {
		if(this.position=="centre") {
		return getRegularPrice()-(getRegularPrice()*0.075);
		}
		if(this.position=="corner") {
			return getRegularPrice()-(getRegularPrice()*0.05);
			}
		else
			return getRegularPrice()-(getRegularPrice()*0.03);
			
	}
	
	public String toString() {
		return super.toString()+"\nPosition : "+position+"\nSale Price : "+SalePrice()+"k";
	}

}
