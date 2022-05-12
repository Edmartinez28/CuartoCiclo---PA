package PracticasExperimentacion;

import java.util.List;
import java.util.stream.IntStream;

public class PerfectoSecuencial {
    public static void main(String[] args) {
        //var nums = List.of(6,28,16,37,89);
        IntStream.range(100_000 , 1_000_000).forEach(num -> verificarPerfecto(num));
        /*for(var num : nums){
            verificarPerfecto(num);
        }*/
    }
    private static void verificarPerfecto(int nro){
        var suma = 0;
        for(var div=1 ; div<nro ; div++){
            if((nro%div) == 0){
                suma += div;
            }
        }
        if(suma == nro){
            System.out.println("Perfecto");
        }else{
            System.out.println("No Perfecto");
        }
    }
}
