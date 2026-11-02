public class MultiThreading3 {
    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Worker finished");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        worker.start();

        worker.join();

        System.out.println("Main finished");
    }
}
