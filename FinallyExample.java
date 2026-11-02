class FinallyExample{
	public static void main(String[] args){
		
		int numbers[] = {1 , 2, 3};

		try{
			System.out.println(numbers[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception Caught");
		}
		finally{
			System.out.println("Finally Block executed");
}

System.out.println("Program Continues...");
}
}
		