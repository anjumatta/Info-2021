import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese una palabra:"); 
        String palabra = scan.nextLine();
        char letra;

        scan.close();

        for (int i = 0; i < palabra.length(); i++){
            letra = palabra.charAt(i);
            if (letra >=97 && letra <= 122){
                letra -=32;
            }
            System.out.print(letra);
        }
     }
}