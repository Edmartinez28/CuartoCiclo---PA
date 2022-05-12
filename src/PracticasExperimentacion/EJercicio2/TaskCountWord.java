package PracticasExperimentacion.EJercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TaskCountWord extends Thread{
    private String document;
    private List<WordCounter> counters = new ArrayList<>();

    public TaskCountWord(String document){
        this.document = document;
    }

    @Override
    public void run() {
        String[] words = document
                .toLowerCase()
                .split("\\s");

        var uniqueWords =
                Arrays.stream(words)
                        .distinct()
                        .toList();

        for(var word : uniqueWords){
            counterWords(words,word);
        }
    }

    public void counterWords(String[] words , String wordToCount){
        int count = 0;
        for(var word : words){
            if(word.equals(wordToCount)){
                count++;
            }
        }
        counters.add(new WordCounter(wordToCount,count));
    }

    public List<WordCounter> getCounters() {
        return counters;
    }
}
