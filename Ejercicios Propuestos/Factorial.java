import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Por favor, ingrese un número:"); 
        int numero = scan.nextInt();

        scan.close();

        System.out.println("El factorial es: " + fact(numero));
    }

    public static int fact(int numero){

        if(numero == 0){
            return 1;
        }
        else
            return numero * fact(numero-1);
    }
}