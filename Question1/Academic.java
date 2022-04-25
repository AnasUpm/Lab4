
public class Academic extends Staff {
	
	String title;
	
	Academic(){
		
	}
	Academic(String staffId,String name,String email,String Grade,String title){
		super(staffId,name,email,Grade);
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString()+"\nTitle : "+title;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Academic) {
		
		
		return staffId.equals(((Academic)o).staffId);
		}
		else
		return false;
	}

}
