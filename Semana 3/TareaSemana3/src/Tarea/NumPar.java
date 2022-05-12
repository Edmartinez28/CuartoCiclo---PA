package Tarea;

public class NumPar implements Runnable{
    int num;
    boolean aux = false;
    public NumPar(int numero){
        num = numero;
    }


    @Override
    public void run() {
        if(num % 2 == 0){
            System.out.printf("El numero %d es par\n",num);
            aux = true;
        }
    }

    public boolean getNumeros(){
        return aux;
    }
}
