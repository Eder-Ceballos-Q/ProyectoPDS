import java.util.*;
public class Enfermedades extends AET {
    List<Enfermedades> enfermedades = new ArrayList<>();

    public Enfermedades(String tipo, String nombre, String descripcion, int id, String fechaFin, String fechaInicio) {
        super(tipo, nombre, fechaInicio, fechaFin, id, descripcion);
    }
}

