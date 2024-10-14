import java.util.*;

public class Alergias extends AET {
    List<Alergias> alergias = new ArrayList<>();

    public Alergias(String tipo, String nombre, String descripcion, int id, String fechaFin, String fechaInicio) {
        super(tipo, nombre, fechaInicio, fechaFin, id, descripcion);
    }
}

