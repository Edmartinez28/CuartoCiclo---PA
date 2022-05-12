import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RunPrimeTaskTres {
    public static void main(String[] args) throws InterruptedException {
        var nums = List.of(2,3,4,5,6,7,8,9,11,13,15,17,18);
        List<PrimeTaskTres> threads = new ArrayList<>();
        CountDownLatch endController = new CountDownLatch(nums.size());
        var numCores = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);

        for(var num : nums){
            PrimeTaskTres primeTaskTres = new PrimeTaskTres(num , endController);
            threads.add(primeTaskTres);
            executor.execute(primeTaskTres);
        }

        endController.await();

        System.out.println("FIN");
        System.out.println(threads.stream().filter(PrimeTaskTres :: isPrime).count());
        executor.shutdown();

    }


}
