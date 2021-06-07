import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[]args) {
        Set<Empleado> listadoEmpleados = new HashSet<Empleado>();
        Map<Integer, Integer> sueldoTotal = new HashMap<>();

        Empleado e1 = new Empleado("Juan Perez", 1234, 40, 350);
        Empleado e2 = new Empleado("María Sanchez", 5678, 36, 400);

        listadoEmpleados.add(e1);
        listadoEmpleados.add(e2);

        for (Empleado e : listadoEmpleados) {
            int sueldo = e.horasTrabajadas*e.valorPorHora;
            sueldoTotal.put(e.dni,sueldo);
        }

        System.out.println("Dni + Sueldo: " + sueldoTotal);
        
    }
}
