public class Medico extends mp {
    String especialidad;

    public Medico(String nombre, int id, int edad, String email, String contraseña, String especialidad) {
        super(nombre, id, edad, email, contraseña);
        this.especialidad = especialidad; 
    }

    public String getNombre() {
        return nombre; // Método para obtener el nombre del médico
    }

    public String toString() {
        return "Medico{" +
               "nombre='" + nombre + '\'' +
               ", id=" + id +
               ", edad=" + edad +
               ", email='" + email + '\'' +
               ", especialidad='" + especialidad + '\'' +
               '}';
    }
}


