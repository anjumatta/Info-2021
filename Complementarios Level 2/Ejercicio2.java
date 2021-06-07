import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[]args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);

        System.out.println("Cantidad de elementos en la lista: " + numeros.size());
        System.out.println("Los elementos son:");
        for(int i = 0;i < numeros.size();i++){
            System.out.println(numeros.get(i));
        }

        numeros.add(0,9);
        numeros.add(5,15);

        System.out.println("Cantidad de elementos en la lista: " + numeros.size());
        System.out.println("Los elementos son:");
        for(int i = 0;i < numeros.size();i++){
            System.out.println(numeros.get(i));
        }

    }
}
