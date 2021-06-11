import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Alumnos {
    public static void main(String[] args) throws IOException {
        String path = "alumnos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException noFile) {
            System.out.println("Archivo no encontrado: " + noFile);
        }
    }
}
