class Student{

    String name;
    int rollno;

    Student(String name , int rollno){
        this.name = name ;
        this.rollno = rollno;
    }

    Student(Student s){
        this.name = s.name;
        this.rollno = s.rollno;
    }

    void display(){
        System.out.println(""+name+  "" +rollno);
    }
}
public class StudentDetails {
    public static void main(String[] args) {

        Student s1 = new Student("yash" , 100);

        s1.display();

        Student s2 = new Student(s1);

        s2.display();
    }
}
