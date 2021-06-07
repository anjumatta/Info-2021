import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Por favor, ingrese un número:"); 
        int a = scan.nextInt();

        System.out.println("Por favor, ingrese otro número:"); 
        int b = scan.nextInt();

        scan.close();
           
        System.out.println("Suma= " + (a+b));
        System.out.println("Resta= " + (a-b));
        System.out.println("Multiplicación= " + (a*b));
        System.out.println("División= " + (a/b));
        System.out.println("Resto= " + (a%b));
    }
}