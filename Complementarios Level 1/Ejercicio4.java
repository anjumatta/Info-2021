import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Por favor, ingrese un número:"); 
        int numero = scan.nextInt();

        scan.close();

        int factorial = 1;

        while (numero!=0) {
            factorial=factorial*numero;
            numero--;
          }
        
          System.out.println("El factorial es: " + factorial);
    }
}