import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese los apellidos del estudiante:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento del estudiante:");
        String fechaNacimiento = scanner.nextLine();

        System.out.println("Ingrese el DNI del estudiante:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese los estudios previos del estudiante:");
        String estudiosPrevios = scanner.nextLine();

        System.out.println("Ingrese el teléfono del estudiante:");
        String telefono = scanner.nextLine();

        // Realizar operaciones o almacenar los datos como se requiera

        scanner.close();
    }
}
