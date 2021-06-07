import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[]args) {
        
        List<String> alumnos = new ArrayList<>();
        alumnos.add("María Pérez");
        alumnos.add("Juan Gomez");
        alumnos.add("Matías Gutierrez");
        alumnos.add("Mariela Ramirez");
        alumnos.add("Laura Morales");
        alumnos.add("Lucas Martinez");
        alumnos.add("Felipe Barrios");
        alumnos.add("Carla Lopez");
        alumnos.add("Pedro Arias");
        alumnos.add("Manuel Torres");
        alumnos.add("Florencia Díaz");
        alumnos.add("Pamela Sosa");

        List<String> grupo1 = alumnos.subList(0, 4);
        List<String> grupo2 = alumnos.subList(4, 8);
        List<String> grupo3 = alumnos.subList(8, 12);

        System.out.println("Alumnos del grupo 1: " + grupo1);
        System.out.println("Alumnos del grupo 2: " + grupo2);
        System.out.println("Alumnos del grupo 3: " + grupo3);
    }
}
