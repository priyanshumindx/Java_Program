class Programmer{
	private String name;
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}

public class EnpPra{
	public static void main(String args[]){
		
		Programmer P = new Programmer();
		
		P.setName("Chandrakant");
		
		System.out.println("Name=> "+P.getName());
}
}