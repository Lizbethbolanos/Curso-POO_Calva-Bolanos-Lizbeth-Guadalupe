package convertidor;

import java.util.Scanner;

public class velocidad {
    public void convertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción de conversión:");
        System.out.println("1. Kilómetros por hora a Millas por hora");
        System.out.println("2. Millas por hora a Kilómetros por hora");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (valor * 0.621371) + " mph");
                break;
            case 2:
                System.out.println("Resultado: " + (valor / 0.621371) + " km/h");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}