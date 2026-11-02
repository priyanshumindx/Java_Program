class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Task Running: " +Thread.currentThread().getName());
    }
}
public class MultiThreading {
        public static void main(String[] args) {
            Thread t = new MyThread();
            t.start();

        }
    }


