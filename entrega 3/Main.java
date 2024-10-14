import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();

        // Agregar médicos a la lista
        medicos.add(new Medico("Eder", 1, 30, "eder@example.com", "password123", "General"));
        medicos.add(new Medico("Thomas", 2, 45, "thomas@example.com", "password456", "Pediatra"));
        medicos.add(new Medico("Nico", 3, 50, "nico@example.com", "password789", "Psiquiatra"));
        medicos.add(new Medico("Emilio", 4, 35, "emilio@example.com", "password000", "Odontología"));

        // Agregar pacientes a la lista
        pacientes.add(new Paciente("Juan Pérez", 101, 28, "juan@example.com", "contraseñaJuan"));
        pacientes.add(new Paciente("María López", 102, 22, "maria@example.com", "contraseñaMaria"));
        pacientes.add(new Paciente("Carlos Sánchez", 103, 40, "carlos@example.com", "contraseñaCarlos"));

        // Iniciar la interfaz gráfica
        JFrame frame = new JFrame("Interfaz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Interfaz(pacientes, medicos)); // Asegúrate de que el constructor de Interfaz acepte estas listas
        frame.pack();
        frame.setVisible(true);
    }
}
