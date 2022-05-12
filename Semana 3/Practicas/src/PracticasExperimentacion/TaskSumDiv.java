package PracticasExperimentacion;

public class TaskSumDiv implements Runnable{
    private int num;
    private boolean esPerfecto;

    public TaskSumDiv(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        var suma = 0;
        for(var div=1 ; div<=(num/2) ; div++){
            if((num%div) == 0){
                suma += div;
            }
        }
        if(suma == num){
            System.out.printf("%d es Perfecto%n",num);
        }else{
            System.out.printf("%d no Perfecto%n",num);
        }
    }

    public boolean isEsPerfecto() {
        return esPerfecto;
    }
}
