
public class Empleado {
    private String nombreApellido;
    private int dni;
    
    public Empleado (String nombreApellido, int dni){
        this.nombreApellido = nombreApellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre y Apellido: " + nombreApellido + " - DNI: " + dni;
        
    }

}
