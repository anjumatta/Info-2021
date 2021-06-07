import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> ciudadesArgentinas = new ArrayList<>();

        int continuar = 1;
        while (continuar==1) {
            System.out.print("Por favor, ingrese una ciudad argentina: ");
            String ciudad = scan.nextLine();
            ciudadesArgentinas.add(ciudad);
            
            System.out.print("Para continuar presione 1. Para salir presione cualquier otro número.");
            continuar = Integer.parseInt(scan.nextLine());
        }

        scan.close();

        int nro = 1;
        for(int i = 0;i < ciudadesArgentinas.size();i++){
            System.out.print("# "+ nro +" ");
            System.out.println(ciudadesArgentinas.get(i));
            nro++;  
        }
    }
}
