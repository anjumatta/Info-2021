import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase:"); 
        String frase = scan.nextLine();

        System.out.println("Por favor, ingrese una letra:"); 
        String letra = scan.nextLine();

        scan.close();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if ( letra.charAt(0) == frase.charAt(i)) {
                contador += 1;
            }
        }

        System.out.println("La letra se repite " + contador + " veces.");
    }
    
}
