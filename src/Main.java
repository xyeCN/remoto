import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> estudiantes = new ArrayList<>();

        System.out.println("Ingrese el nombre del estudiante:");
        estudiantes.add(scanner.nextLine());

        System.out.println("Ingrese los apellidos del estudiante:");
        estudiantes.add(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento del estudiante:");
        estudiantes.add(scanner.nextLine());

        System.out.println("Ingrese el DNI del estudiante:");
        estudiantes.add(scanner.nextLine());

        System.out.println("Ingrese los estudios previos del estudiante:");
        estudiantes.add(scanner.nextLine());

        System.out.println("Ingrese el teléfono del estudiante:");
        estudiantes.add(scanner.nextLine());

        // Realizar operaciones o acceder a los datos del ArrayList como se requiera

        scanner.close();
    }
}