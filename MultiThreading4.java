
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class MultiThreading4 {
    public static void main(String[] args) {

        List<Integer> salaries = Arrays.asList(10000,20000, 30000,40000 ,25000, 45000, 60000, 35000, 80000);

        ExecutorService executor =Executors.newFixedThreadPool(2);

        try{
            Future<List<Integer>> future = executor.submit(() -> salaries.stream().filter(salary -> salary > 40000).sorted().collect(Collectors.toList()));

            List<Integer> result = future.get();
            System.out.println(result);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Task interrupted");
        } catch (ExecutionException e){
            System.out.println("Task failed: " +e.getCause());
        } finally {
            executor.shutdown();
        }

    }
}
