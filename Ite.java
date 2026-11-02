import java.util.*;


public class Ite {
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>(List.of("Amit" , "Rahul" , "Priya"));

        Iterator<String> iterator = employees.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();

            if(name.equals("Rahul")){
                iterator.remove();
            }
        }
        System.out.println(employees);

    }
}
