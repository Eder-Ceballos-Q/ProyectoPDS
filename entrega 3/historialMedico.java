import java.util.List;

public class historialMedico {
    String tipoSangre;
    List<Enfermedades> enfermedades;
    List<Tratamientos> tratamientos;
    List<Alergias> alergias;
    Paciente paciente;

    public historialMedico(String tipoSangre, List<Enfermedades> enfermedades, List<Tratamientos> tratamientos, List<Alergias> alergias, Paciente paciente) {
        this.tipoSangre = tipoSangre;
        this.enfermedades = enfermedades;
        this.tratamientos = tratamientos;
        this.alergias = alergias;
        this.paciente = paciente;
    }
}

