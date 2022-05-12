package Paralelo;

public class MatrizParalelo {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int aux = 1;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matriz[i][j] = aux;
                aux++;
            }
        }

        var suma = new Matriz();

        for(int i=0 ; i<matriz.length ; i++){

            int[] lista = new int[matriz.length];

            for(int j=0 ; j<matriz.length ; j++){
                lista[j] = matriz[i][j];
            }

            new Thread( ()->{
                suma.increment(lista);
            }).start();

        }
        System.out.println("El resultado es: " + suma.getCount());

    }

}
