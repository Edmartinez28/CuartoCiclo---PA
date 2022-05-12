package Tarea;

import java.util.List;

public class MetodoParalelo {
    public static void main(String[] args) {
        List<Integer>  listado= List.of(2,4,6,8,10,1,3,5,7,9);
        int contador =0;

        for(int n:listado){
            new Thread(new NumPar(n)).start();
        }
    }
}
