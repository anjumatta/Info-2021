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

    // Conviertir fecha a LocalDate
    public void setFechaNac(String fechaNac) {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNac = LocalDate.parse(fechaNac,formatter);
    }

    // Conviertir Sueldo a double 
    public void setSueldo(String sueldo) {
        this.sueldo = Double.parseDouble(sueldo);
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


    Empleado(String nombre, String apellido, String fechaNac, String sueldo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSueldo(sueldo);
        this.setFechaNac(fechaNac); 
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

    
    public int getEdad(String fechaActual){
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate hoy = LocalDate.parse(fechaActual,formatter);
        int diaActual = hoy.getDayOfMonth();
        int mesActual = hoy.getMonthValue();
        int anioActual = hoy.getYear();
        int edad = anioActual - this.fechaNac.getYear();
        if (mesActual < fechaNac.getMonthValue()){
            edad = edad -1;
        }
        if (mesActual == fechaNac.getMonthValue()){
            if (diaActual < fechaNac.getDayOfMonth()){
                edad = edad -1;
            }
        }
        return edad;
    }

}