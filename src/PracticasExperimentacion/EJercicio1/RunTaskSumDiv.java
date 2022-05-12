package PracticasExperimentacion.EJercicio1;

import java.util.stream.IntStream;

public class RunTaskSumDiv {
    public static void main(String[] args) {
        /*var nums = List.of(6,28,16,37,89);
        for(var num : nums){
            TaskSumDiv task = new TaskSumDiv(num);
            Thread tread = new Thread(task);
            tread.start();
        }*/

        IntStream.range(100_000 , 1_000_000).forEach(num ->{
           TaskSumDiv task = new TaskSumDiv(num);
           Thread thread = new Thread(task);
           thread.start();
        });

    }
}
