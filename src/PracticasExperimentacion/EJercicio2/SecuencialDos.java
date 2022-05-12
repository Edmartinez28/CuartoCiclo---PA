package PracticasExperimentacion.EJercicio2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecuencialDos {
    public static void main(String[] args) {
        var text = "Esto es un ejemplo de un texto El texto es secillo EL texto es simple EL texto es corto";
        String[] words = text.toLowerCase().split("\\s");
        var uniqueWords = 
                Arrays.stream(words)
                        .distinct()
                        .toList();
        
        for(var word : uniqueWords){
            counterWords(words,word);
        }
    }

    public static void counterWords(String[] words , String wordToCount){
        int count = 0;
        for(var word : words){
            if(word.equals(wordToCount)){
                count++;
            }
        }
        System.out.printf("%s - %d%n", wordToCount,count);
    }
}
