import java.io.*;

class Geeks{
	Geeks(String name){
		System.out.println("Constructor with one "  + "argument - String: " +name);
}

Geeks(String name , int age){
	System.out.println("Constructor with two arguments: " + " String and Integer: " +name + " " + age);
}

Geeks(long id){
System.out.println("Constructor with one argument: " +"Long:" +id);
}
}


class ConsP2{
public static void main(String ags[]){
	Geeks geek2 = new Geeks("Priyanshu");

	Geeks geek3 = new Geeks("Vivek Kumar Behera" ,534);
	
	Geeks geek4 = new Geeks(1234567890);
}
}