import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException{
        LeerEmpleados();

        //Menú?
        

        
    }

    public static void LeerEmpleados() throws IOException{

        String path = ("Ejercicio 5/empleados.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea = br.readLine();

            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException noFile) {
            System.out.println("Archivo no encontrado: " + noFile);
        }   
    }

    

    public static void ListarEmpleados(String linea){
        List<Empleado> listaEmpleados = new ArrayList<>();

        if (linea != null){
            String[] dato = linea.split(",");
            Empleado e = new Empleado(dato[0], dato[1], dato[2], dato[3]);
            listaEmpleados.add(e); 
      
        }  
    }
    
}

