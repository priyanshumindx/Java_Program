import java.util.*;
class Stacks{
	public static void main(String se[]){
Stack<Integer> s = new Stack<>();

s.push(1);
s.push(2);
s.push(3);
s.push(4);

while(!s.isEmpty()){
	System.out.println(s.pop());
	}
	}
}