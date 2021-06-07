import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[]args) {

        List<Integer> cartas = new ArrayList<>();
        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        cartas.add(8);
        cartas.add(9);
        cartas.add(10);
        
        ordenadas(cartas);
        invertir(cartas);
        mezclar(cartas);
    }

    public static void ordenadas(List<Integer> cartas) {
        System.out.println("Cartas en orden: " + cartas);
    }

    public static void invertir(List<Integer> cartas) {
        Collections.reverse(cartas);
        System.out.println("Cartas en orden inverso: " + cartas);
    }

    public static void mezclar(List<Integer> cartas) {
        Collections.shuffle(cartas);
        System.out.println("Cartas desordenadas: " +  cartas);
    }
}   
