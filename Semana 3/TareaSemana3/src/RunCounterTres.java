import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunCounterTres {
    private static int count = 0 ;
    private Lock counterLock;

    public RunCounterTres(){
        counterLock = new ReentrantLock();
    }
    public void increment(){
        counterLock.lock();
        try{
            TimeUnit.MICROSECONDS.sleep(100);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        try{
            count++;
        }finally {
            counterLock.unlock();
        }
    }

    public static int getCount() {
        return count;
    }
}
