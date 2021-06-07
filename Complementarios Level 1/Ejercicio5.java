import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Por favor, ingrese un número:"); 
        int a = scan.nextInt();

        System.out.println("Por favor, ingrese otro número:"); 
        int b = scan.nextInt();

        scan.close();

        int resultado = 0;
        for (int i= 0; i < a; i++){

            resultado += b;       
        }

        System.out.println("Resultado= " + resultado);
    }
}
