package PracticasExperimentacion.EJercicio2;

import java.util.ArrayList;
import java.util.List;

public class RunCountWord {
    public static void main(String[] args) throws InterruptedException {
        var documents = List.of("Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto",
                "Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto",
                "Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto",
                "Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto",
                "Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto",
                "Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto");

        List<TaskCountWord> threads = new ArrayList<>();

        for(var document : documents){
            TaskCountWord taskCountWord = new TaskCountWord(document);
            taskCountWord.start();
            threads.add(taskCountWord);
        }

        waitingThreads(threads);

        for (var t : threads){
            System.out.println(">>>>>----------------------------<<<<<");
            for(var ac : t.getCounters()){
                System.out.printf("%s(%d)%n",ac.word(),ac.counter());
            }
            System.out.println(">>>>>----------------------------<<<<<");
        }
    }

    private static void waitingThreads(List<TaskCountWord> threads) throws InterruptedException{
        for(var t: threads){
            t.join();
        }
    }

}
