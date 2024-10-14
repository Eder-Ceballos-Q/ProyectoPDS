import java.util.*;

public class Paciente extends mp {
    List<Paciente> pacientes = new ArrayList<>();
    List<Cita> citas;
    Scanner scanner = new Scanner(System.in);

    public Paciente(String nombre, int id, int edad, String email, String contraseña) {
        super(nombre, id, edad, email, contraseña);
        this.citas = new ArrayList<>();
    }

    public void register(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void login(int id, String contraseña) {
        boolean encontrado = false;

        for (Paciente p : pacientes) {
            if (p.id == id && p.contraseña.equals(contraseña)) {
                System.out.println("Bienvenido " + p.nombre);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

    public void inputData() {
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        System.out.print("ID: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.print("Contraseña: ");
        contraseña = scanner.nextLine();
    }

    public void solicitarCita(Cita c) {
        citas.add(c);
        System.out.println("Cita solicitada con éxito.");
    }

    public void consultarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No tienes citas agendadas.");
        } else {
            System.out.println("Tus citas:");
            for (Cita c : citas) {
                System.out.println(c);
            }
        }
    }

    public void cancelarCita(Cita c) {
        if (citas.remove(c)) {
            System.out.println("Cita cancelada con éxito.");
        } else {
            System.out.println("La cita no se encontró.");
        }
    }
}
