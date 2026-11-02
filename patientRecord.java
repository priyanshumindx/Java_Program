class Patient {
    String name;
    int age;

    void displayDetails() {
        System.out.println(name);
        System.out.println(age);
    }
}

class patientRecord {
    public static void main(String[] args) {
        Patient p1 = new Patient();

        p1.name = "Rahul";
        p1.age = 25;

        p1.displayDetails();
    }
}