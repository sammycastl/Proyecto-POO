

package com.mycompany.proyectopoodenuncia;


import java.util.Scanner;


public class ProyectoPOODenuncia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un usuario
        Usuario usuario = new Usuario("usuario1", "contraseña123");

        // Mostrar un mensaje de bienvenida
        System.out.println("¡Bienvenido al sistema de denuncias!");

        // Crear un expediente
        Expediente expediente = new Expediente();

        // Agregar algunas funcionalidades básicas
        boolean salir = false;
        while (!salir) {
            System.out.println("\nOpciones:");
            System.out.println("1. Crear denuncia");
            System.out.println("2. Listar denuncias");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear una denuncia
                    System.out.println("\nCreando una nueva denuncia:");
                    System.out.print("Ingrese el lugar de la denuncia: ");
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    String lugar = scanner.nextLine();
                    System.out.print("Ingrese los detalles de la denuncia: ");
                    String detalles = scanner.nextLine();

                    Denuncia denuncia = new Denuncia(lugar, detalles);

                    // Agregar la denuncia al expediente
                    expediente.agregarDenuncia(denuncia);
                    System.out.println("Denuncia creada y agregada al expediente.");
                    break;

                case 2:
                    // Listar denuncias en el expediente
                    System.out.println("\nDenuncias en el expediente:");
                    for (Denuncia d : expediente.obtenerDenuncias()) {
                        System.out.println("- Lugar: " + d.getLugar() + ", Detalles: " + d.getDetalles());
                    }
                    break;

                case 3:
                    // Salir del programa
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
