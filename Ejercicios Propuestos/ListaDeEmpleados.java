import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class ListaDeEmpleados {

    private static String path = "empleados.txt";
    private static BufferedWriter bw;
        
    public static void main(String[]args) {
        List<Empleado> empleadosLista = new LinkedList<Empleado>();
        
        Empleado e1 = new Empleado("Freddie Mercury", 1234);
        Empleado e2 = new Empleado("Brian May", 5678);
        Empleado e3 = new Empleado("Roger Taylor", 3579);
        Empleado e4 = new Empleado("John Deacon", 2468);

        empleadosLista.add(e1);
        empleadosLista.add(e2);
        empleadosLista.add(e3);
        empleadosLista.add(e4);

        try {

            bw = new BufferedWriter(new FileWriter(path));

            for (Empleado empleado : empleadosLista) {
                bw.write(empleado.toString());
                bw.newLine();
            }            

            bw.close();

        } catch (Exception e) {
            System.out.println("Ocurrio un error " + e);
        }       
    }
}

