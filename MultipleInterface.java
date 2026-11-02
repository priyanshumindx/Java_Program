import java.io.*;

interface Add{
int add(int a , int b);
}

interface Sub{
int sub(int a , int b);
}

class Cal implements Add , Sub
{

public int add(int a , int b){
return a+b;
}

public int sub(int a , int b){
return a-b;
}
}

class MultipleInterface{
public static void main(String s[]){
Cal x = new Cal();
System.out.println("Addition: "+x.add(2,1));
System.out.println("Subtraction : "+x.sub(2,1));
}
}