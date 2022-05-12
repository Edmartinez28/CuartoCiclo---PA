package Secuencial;

public class MatrizSecuencia {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int aux = 1;
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matriz[i][j] = aux;
                aux++;
            }
        }

        System.out.println("El resultado es: "+ sumar(matriz));
    }

    public static int sumar (int[][] x){
        int suma = 0;
        for(int i=0 ; i<x.length ; i++){
            for(int j=0 ; j<x[i].length ; j++){
                suma += x[i][j];
            }
        }
        return suma;
    }
}
