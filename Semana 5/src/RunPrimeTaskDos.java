import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RunPrimeTaskDos {
    public static void main(String[] args) throws InterruptedException {
        var nums = List.of(2,3,4,5,6,7,8,9,11,13,15,17,18);
        CountDownLatch endController = new CountDownLatch(nums.size());
        var numCores = Runtime.getRuntime().availableProcessors();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);

        for(var num : nums){
            executor.execute(new PrimeTaskDos(num , endController));
        }

        endController.await(); // La otra opcion es meterlo en un try-catch
        System.out.println("Fin");
        executor.shutdown();

    }
}
