
class MyTread extends Thread{
    public void run(){
        System.out.println("Child thread running");
    }
}

public class Multithread {
    public static void main(String[] args) {
        MyTread a = new MyTread();
        a.start();
        System.out.println("Main thread running");
    }
}
