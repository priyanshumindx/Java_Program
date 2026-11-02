import java.util.ArrayList;
import java.util.Collections;

public class Collection1{
public static void main(String args[]){

ArrayList<String> al = new ArrayList<>();

al.add("Apple");
al.add("Banana");
al.add("Apple");

Collections.sort(al);

System.out.println(al);
}
}