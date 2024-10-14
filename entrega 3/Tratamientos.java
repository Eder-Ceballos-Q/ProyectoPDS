import java.util.*;
public class Tratamientos extends AET {
    List<Tratamientos> tratamientos = new ArrayList<>();

    public Tratamientos(String tipo, String nombre, String descripcion, int id, String fechaFin, String fechaInicio) {
        super(tipo, nombre, fechaInicio, fechaFin, id, descripcion);
    }
}
