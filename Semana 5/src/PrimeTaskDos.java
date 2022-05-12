import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class PrimeTaskDos implements Runnable{
    private int number;
    private CountDownLatch endController;

    public PrimeTaskDos(int number, CountDownLatch endController) {
        this.number = number;
        this.endController = endController;
    }

    @Override
    public void run() {
        if(IntStream.range(2,number).anyMatch(div -> number % div == 0)){
            System.out.printf("%d NO es primo%n",number);
        }else{
            System.out.printf("%d ES primo%n",number);
        }
        endController.countDown();
    }
}
