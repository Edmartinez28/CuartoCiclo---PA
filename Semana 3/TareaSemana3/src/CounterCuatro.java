public class CounterCuatro {
    private int count;

    public synchronized void  increment(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException ie) {
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
