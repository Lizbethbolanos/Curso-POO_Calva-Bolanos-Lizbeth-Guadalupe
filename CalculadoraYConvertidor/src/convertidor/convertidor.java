package convertidor;

import java.util.Scanner;

public class convertidor {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Longitud");
        System.out.println("2. Masa");
        System.out.println("3. Velocidad");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                new longitud().convertir();
                break;
            case 2:
                new masa().convertir();
                break;
            case 3:
                new velocidad().convertir();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}