import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Estudiante> estudiantes = new ArrayList<>();

        System.out.println("Ingrese el número de estudiantes:");
        int numEstudiantes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numEstudiantes; i++) {
            Estudiante estudiante = new Estudiante();

            System.out.println("Ingrese el nombre del estudiante:");
            estudiante.setNombre(scanner.nextLine());

            System.out.println("Ingrese los apellidos del estudiante:");
            estudiante.setApellidos(scanner.nextLine());

            System.out.println("Ingrese la fecha de nacimiento del estudiante:");
            estudiante.setFechaNacimiento(scanner.nextLine());

            System.out.println("Ingrese el DNI del estudiante:");
            estudiante.setDni(scanner.nextLine());

            System.out.println("Ingrese los estudios previos del estudiante:");
            estudiante.setEstudiosPrevios(scanner.nextLine());

            System.out.println("Ingrese el teléfono del estudiante:");
            estudiante.setTelefono(scanner.nextLine());

            estudiantes.add(estudiante);
        }

        // Realizar operaciones o acceder a los datos de la lista de estudiantes como se requiera

        scanner.close();
    }
}

class Estudiante {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String dni;
    private String estudiosPrevios;
    private String telefono;

    // Métodos getter y setter para cada atributo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstudiosPrevios() {
        return estudiosPrevios;
    }

    public void setEstudiosPrevios(String estudiosPrevios) {
        this.estudiosPrevios = estudiosPrevios;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
