import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class PrimeTaskTres implements Runnable{
    private int number;
    private boolean isPrime;
    private CountDownLatch endController;

    public PrimeTaskTres(int number, CountDownLatch endController) {
        this.number = number;
        this.endController = endController;
    }

    @Override
    public void run() {
        isPrime = (IntStream.range(2,number).noneMatch(div -> number % div == 0));
    }

    public boolean isPrime(){
        return isPrime;
    }
}
