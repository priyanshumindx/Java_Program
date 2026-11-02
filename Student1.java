class Student1{
	String name;
	
	Student1(String name){
		this.name = name;
	}
	
	void display(){
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args){
		Student1 s1 = new Student1("Priya");
		s1.display();
	}
}