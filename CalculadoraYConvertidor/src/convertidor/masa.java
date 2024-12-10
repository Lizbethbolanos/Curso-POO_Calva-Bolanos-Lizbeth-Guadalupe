package convertidor;

import java.util.Scanner;

public class masa {
    public void convertir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción de conversión:");
        System.out.println("1. Kilogramos a Libras");
        System.out.println("2. Libras a Kilogramos");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor: ");
        double valor = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (valor * 2.20462) + " libras");
                break;
            case 2:
                System.out.println("Resultado: " + (valor / 2.20462) + " kilogramos");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
