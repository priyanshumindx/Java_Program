class Demo{
	static void checkage(int age){
	
		if(age < 18){
			throw new IllegalArgumentException("Age must be 18 or above");
}
}

public static void main(String s[]){
	checkage(13);
}
}