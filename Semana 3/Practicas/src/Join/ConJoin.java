package Join;

import Paralelo.Matriz;

public class ConJoin {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int aux = 1;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matriz[i][j] = aux;
                aux++;
            }
        }

        int resultado = 0;

        for(int i=0 ; i<matriz.length ; i++){

            int[] lista = new int[matriz.length];

            for(int j=0 ; j<matriz.length ; j++){
                lista[j] = matriz[i][j];
            }

            //Aqui comienza lo paralelo
            MatrizDos suma = new MatrizDos(lista);

            Thread uno =  new Thread(suma);

            uno.start();

            try{
                uno.join();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

            resultado += suma.getCount();
        }

        System.out.println("El resultado es: "+ resultado);
    }

}
