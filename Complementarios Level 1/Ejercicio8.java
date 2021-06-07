import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese nombre y apellido:"); 
        String nombre = scan.nextLine();
        System.out.println("Por favor, ingrese edad:"); 
        String edad = scan.nextLine();
        System.out.println("Por favor, ingrese su dirección:"); 
        String dir = scan.nextLine();
        System.out.println("Por favor, ingrese ciudad:"); 
        String ciudad = scan.nextLine();

        scan.close();
           
        System.out.println(ciudad + " - " + dir + " - " + edad +" - " + nombre);        
    }
}

