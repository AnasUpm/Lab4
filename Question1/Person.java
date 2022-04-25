
public class Person {
	
	String id;
	String address;
	
	
	
	Person(){}
	
	Person(String id, String address){
		this.id=id;
		this.address=address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "ID : "+id+" Address : "+address;
	}
	
	public String getStaffId() {
		return id;
	}

}
