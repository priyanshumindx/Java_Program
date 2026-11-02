interface TestInterface{
	final int a = 10;
	
	default void display(){
		System.out.println("Hello");
}
}

class TestClass1 implements TestInterface
{
	public static void main(String s[]){
		TestClass1 t = new TestClass1();
		t.display();
}
}