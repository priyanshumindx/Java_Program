class Employess{
    int salary = 100000;
}
public class emp2 {
    static void update(Employess e){
        e.salary = 200000;
        e = new Employess();
        e.salary = 300000;
    }

    public static void main(String[] args) {
        Employess emp = new Employess();

        update(emp);

        System.out.println(emp.salary);
    }
}
