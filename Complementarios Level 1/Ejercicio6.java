import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Por favor, ingrese un número:"); 
        int a = scan.nextInt();

        System.out.println("Por favor, ingrese otro número:"); 
        int b = scan.nextInt();

        scan.close();

        int resultado = 1;
        for (int i= 0; i < b; ++i){

            resultado *= a;   
        }    

        System.out.println("Resultado= " + resultado);
    }
}
