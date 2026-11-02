import java.util.*;

public class Collection3{
	public static void main(String args[]){
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("mindX360");
		ll.add("mindX360");
		ll.add("mindX360");
		ll.add(1 , "mindX360");

		
		for(int i=0 ; i< ll.size() ; i++){
			System.out.println(ll.get(i) + " ");
		}
		
		System.out.println();
		
		for(String str : ll)
			System.out.print(str + " ");
 	}
}