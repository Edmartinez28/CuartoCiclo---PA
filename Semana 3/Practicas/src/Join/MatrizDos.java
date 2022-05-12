package Join;

public class MatrizDos implements Runnable{
    private int count;
    private int[] temporal;

    public MatrizDos(int[] x) {
        temporal = x;
    }

    public void  increment(){
        for(int i=0 ; i<temporal.length ; i++){
            setCount(temporal[i]);
        }
        System.out.println(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        increment();
    }
}


