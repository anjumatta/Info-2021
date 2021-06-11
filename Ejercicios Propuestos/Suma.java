import java.util.Scanner;

public class Suma{
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int x = scan.nextInt();
        System.out.println("Por favor ingrese otro numero");
        int n = scan.nextInt();
        scan.close();

        System.out.println("El resultado es: " + sum(x,n));
    }

    public static int sum(int x, int n){

        return x + n;
    }
}