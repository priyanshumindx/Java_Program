class GFG{
	private GFG(){
		System.out.println("Private constructor called");
	}

	public static void displayMessage(){
		System.out.println("Hello from DSC Class!!");
	}
}

class ConsP1{
	public static void main(String[] args){
	
		GFG.displayMessage();
}
}