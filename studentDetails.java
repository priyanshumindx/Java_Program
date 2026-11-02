class Student {
    String name;
    int rollNumber;
    int marks;

        Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        
    }
}

public class studentDetails {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 101, 85);
        Student s2 = new Student("Sita", 102, 92);
        Student s3 = new Student("Arjun", 103, 78);

        s1.display();
        s2.display();
        s3.display();
    }
}