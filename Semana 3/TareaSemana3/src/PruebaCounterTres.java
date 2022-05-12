import java.util.concurrent.atomic.AtomicInteger;

public class PruebaCounterTres {
    public static void main(String[] args) {
        var counter = new RunCounterTres();

        for(var i=0 ; i<10 ; i++){
            new Thread( ()->{
                counter.increment();
                System.out.printf("%d  para hilo %s%n",counter.getCount(),Thread.currentThread().getName());
            }).start();
        }
    }
}
