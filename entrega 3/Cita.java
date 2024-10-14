public class Cita {
    private String fecha;
    private int hora; // Puede ser en formato de 24 horas o 12 horas, dependiendo de tu preferencia.
    private String tipoCita;
    private String lugar;
    private Medico medico;
    private Paciente paciente;

    public Cita(String fecha, int hora, String tipoCita, String lugar, Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoCita = tipoCita;
        this.lugar = lugar;
        this.medico = medico;
        this.paciente = paciente;
    }

    // Métodos getter
    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public String getLugar() {
        return lugar;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", hora=" + hora +
                ", tipoCita='" + tipoCita + '\'' +
                ", lugar='" + lugar + '\'' +
                ", medico=" + medico.getNombre() + // Asegúrate de tener un método getNombre() en Medico
                ", paciente=" + paciente.nombre +
                '}';
    }
}

