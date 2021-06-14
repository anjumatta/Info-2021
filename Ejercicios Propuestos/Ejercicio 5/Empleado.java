import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private double sueldo;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(String fechaNac) {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNac = LocalDate.parse(fechaNac,formatter);;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    Empleado(String nombre, String apellido, String fechaNac, double sueldo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSueldo(sueldo);
        this.setFechaNac(fechaNac); 
    }

    public Empleado(String nombre2, String apellido2, String fechaNac2, String string) {
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " - Fecha de Nacimiento : " + this.fechaNac + " - Sueldo: " + this.sueldo;
    }

    
}