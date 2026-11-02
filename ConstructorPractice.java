import java.io.*;

class Geeks{
	String name;
	int id;

	Geeks(String name , int id){
	this.name = name;
	this.id = id;
	}
	
	Geeks(Geeks obj2){
		this.name = obj2.name;
		this.id = obj2.id;
	}
}


class ConstructorPractice{
	public static void main(String args[]){
		System.out.println("First Object");
		Geeks geek1 = new Geeks("Priyanshu Gupta" , 513);
		System.out.println("Geekname: " +geek1.name+ " and GeekId: " +geek1.id);

System.out.println();


Geeks geeks2 = new Geeks(geek1);
System.out.println("GeekName: " +geeks2.name+ " and GeekId: " +geeks2.id);
}
}