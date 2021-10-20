package SucecionFibonacci;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("tamaño de la serie:");
        int num=teclado.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println(" ");
    }
    public static int fibonacci(int n){
        if(n==0 || n==1)
            return n;
        else return fibonacci(n-1)+fibonacci(n-2);
       /* if(n>1){
            return fibonacci(n-1)+fibonacci(n-2);
        }else if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else {
            System.out.println("tamaño");
            return 1;
        }*/

    }
}
