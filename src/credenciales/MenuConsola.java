package credenciales;

import java.util.Scanner;

/**
 *
 * @author hopu_
 */
public class MenuConsola {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Credencial plantillaBase = new Credencial("Nombre Base", "11.111.111-1", "Asistente");

        int opcion;

        do {
            System.out.println("=== GENERADOR DE CREDENCIALES ===");
            System.out.println("1. Agregar credencial personalizada");
            System.out.println("2. Ver credenciales");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Credencial clon = plantillaBase.clone();

                    System.out.print("Ingrese nombre: ");
                    clon.setNombre(scanner.nextLine());
                    System.out.print("Ingrese RUT: ");
                    clon.setRut(scanner.nextLine());
                    System.out.print("Ingrese cargo: ");
                    clon.setCargo(scanner.nextLine());

                    GestorCredenciales.getInstancia().agregarCredencial(clon);
                    System.out.println("Credencial agregada correctamente.");
                    break;

                case 2:
                    GestorCredenciales.getInstancia().mostrarCredenciales();
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 3);
    }
}