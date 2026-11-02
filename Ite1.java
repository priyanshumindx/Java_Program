
import java.util.*;

class Emp implements Comparable<Emp>{
    int id ;
    int salary;

    Emp(int id , int salary){
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp other){
        return Integer.compare(this.salary , other.salary);
    }

    @Override
    public String toString(){
        return id +": " + salary;
    }
}
public class Ite1 {

    public static void main(String[] args) {

        List<Emp> employee = new ArrayList<>();

        employee.add(new Emp(101 , 50000));
        employee.add(new Emp(102 , 30000));
        employee.add(new Emp(103 , 70000));

        Collections.sort(employee);

        System.out.println(employee);

    }
}
