class Swap3{
	public static void main(String s[]){
	int a = 23 , b =34;
	a = a ^ b;
        b = a ^ b;
        a = a ^ b;
	System.out.println("Value of a : " +a);
	System.out.println("Value of b: " +b);
}
}