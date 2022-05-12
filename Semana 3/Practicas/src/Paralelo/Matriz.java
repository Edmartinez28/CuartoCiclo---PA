package Paralelo;

public class Matriz {
    private int count;

    public synchronized void  increment(int[] x){
        try{
            Thread.sleep(100);
        } catch (InterruptedException ie) {

        }
        for(int i=0 ; i<x.length ; i++){
            setCount(x[i]);
        }
        System.out.println(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }
}
