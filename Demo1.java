import java.io.*;

class Demo1{
	
	static void readFile(String filename) throws IOException{
		try(FileReader file = new FileReader(filename)){
			int data;
			while((data = file.read()) != -1){
				System.out.print((char) data);
			}
		}

}

public static void main(String[] args){
	
	try{
		readFile("test.txt");
	}

	catch(IOException e){
		System.out.println("File not found or error reading file: " +e.getMessage());
}

System.out.println("\nProgram continues after file operation.");

}

}