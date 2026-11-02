import java.io.*;

interface testInterface{
	final int a = 10;
	void display();
}

class TestClass implements testInterface{
	public void display(){
		System.out.println("Geek");
	}
}

class interfaceDemo{
	public static void main(String s[]){
		TestClass t = new TestClass();
		t.display();
		System.out.println(t.a);
		}
}