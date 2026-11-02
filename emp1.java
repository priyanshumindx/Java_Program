class Employ{
    int salary = 100000;
}
public class emp1 {
    public static void main(String[] args) {
        Employ e1 = new Employ();
        Employ e2 = e1;

        e2.salary = 200000;
        System.out.println(e1.salary);
    }
}
