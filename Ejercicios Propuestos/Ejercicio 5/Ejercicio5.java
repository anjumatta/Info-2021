import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Ejercicio5 {
    private static List<Empleado> listaEmpleados = new ArrayList<>();
    public static void main(String args[]) throws IOException{
        
        //Menú?

        leerEmpleados();

        String letra = "g";
        System.out.println("Los empleados que empiezan con la letra " + letra + " son: " + porApellido(letra));

        System.out.println("Lista de empleados ordenada por nombre: ");
        ordenarNombre();

        System.out.println("Lista de empleados ordenada por apellido: ");
        ordenarApellido();

        System.out.println("El empleado de mayor edad es: " );

    }

    //Leer archivo txt y listar Empleados

    public static void leerEmpleados() throws IOException{
        String path = "Ejercicio 5/empleados.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea =  br.readLine();
            while (linea != null){
                String[] dato = linea.split(",");
                Empleado e = new Empleado(dato[0], dato[1], dato[2], dato[3]);
                listaEmpleados.add(e); 
                linea = br.readLine();
            }
        } catch (FileNotFoundException noFile) {
            System.out.println("Archivo no encontrado: " + noFile);
        }
    }


    //Buscar empleados por primer letra de apellido

    public static List<Empleado> porApellido(String letra){
        List<Empleado> letraApellido = new ArrayList<>();
        for (Empleado e: listaEmpleados){
            if (e.getApellido().startsWith(letra.toUpperCase())){
                letraApellido.add(e);
            }
        }
        return letraApellido;
    }


    //Ordenar lista de empleados por nombre

    public static void ordenarNombre() {
        listaEmpleados.sort(Comparator.comparing(Empleado::getNombre));
        System.out.println(listaEmpleados);
        }
    

    //Ordenar lista de empleados por apellido

    public static void ordenarApellido() {
        listaEmpleados.sort(Comparator.comparing(Empleado::getApellido));
        System.out.println(listaEmpleados);
        }


    public static void masJoven() {
        
    }

    public static void masViejo() {
  
    }
    
}