import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número: ");
        int n1 = scan.nextInt();
        System.out.println("Por favor, ingrese un número mayor al anterior: ");
        int n2 = scan.nextInt();

        if(n1>n2) {
            System.out.println("Error al cargar los números");
        }
        else{
            System.out.println(fizzBuzz(n1,n2));
        }
        
        scan.close();
    }

    public static List<String> fizzBuzz(int numero1, int numero2) {

        List<String> arrayStrings = new ArrayList<>();

        for (int i=numero1; i < numero2 ; i++) {

            String valor = String.valueOf(i);

            if (i % 2 == 0 && i % 3 == 0 ) {
                valor = "FizzBuzz";
            }
            else if (i % 2 == 0) {
                valor = "Fizz";
            }
            else if (i % 3 == 0) {
                valor = "Buzz";
            }

            arrayStrings.add(valor);
        }

        return arrayStrings;

    }  
}