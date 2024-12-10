package convertidor;

import java.util.Scanner;

public class longitud {
    public void convertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Millas");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();

        if (opcion == 1) {
            System.out.println("Resultado: " + valor / 1000 + " km");
        } else if (opcion == 2) {
            System.out.println("Resultado: " + valor * 0.621371 + " millas");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}