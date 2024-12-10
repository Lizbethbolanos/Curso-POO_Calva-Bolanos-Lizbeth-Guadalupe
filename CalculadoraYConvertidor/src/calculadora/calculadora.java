package calculadora;

import java.util.Scanner;

public class calculadora {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        // Menú principal
        System.out.println("Seleccione una opción:");
        System.out.println("1. Operaciones matemáticas");
        System.out.println("2. Conversiones de unidades");
        System.out.print("Ingrese su opción: ");
        int opcionMenu = scanner.nextInt();

        // Menú de operaciones matemáticas o conversiones
        if (opcionMenu == 1) {
            // Menú de operaciones matemáticas
            menuOperaciones(scanner);
        } else if (opcionMenu == 2) {
            // Menú de conversiones de unidades
            menuConversiones(scanner);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Menú para operaciones matemáticas
    public void menuOperaciones(Scanner scanner) {
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. División con residuo");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + operaciones.suma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + operaciones.resta(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + operaciones.multiplicacion(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + operaciones.division(num1, num2));
                }
                break;
            case 5:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + operaciones.divisionConResiduo((int) num1, (int) num2));
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Menú para conversiones de unidades
    public void menuConversiones(Scanner scanner) {
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Longitud");
        System.out.println("2. Masa");
        System.out.println("3. Velocidad");
        System.out.print("Ingrese su opción: ");
        int opcionConversion = scanner.nextInt();

        // Dependiendo de la opción elegida, llama a la conversión correspondiente
        switch (opcionConversion) {
            case 1:
                conversorLongitud(scanner);
                break;
            case 2:
                conversorMasa(scanner);
                break;
            case 3:
                conversorVelocidad(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Conversión de Longitud
    public void conversorLongitud(Scanner scanner) {
        System.out.println("Seleccione la unidad de origen para longitud:");
        System.out.println("1. Kilómetros");
        System.out.println("2. Metros");
        System.out.println("3. Centímetros");
        int opcionLongitud = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();

        // Realiza las conversiones según la opción seleccionada
        switch (opcionLongitud) {
            case 1:
                System.out.println("En metros: " + (valor * 1000));
                System.out.println("En centímetros: " + (valor * 100000));
                break;
            case 2:
                System.out.println("En kilómetros: " + (valor / 1000));
                System.out.println("En centímetros: " + (valor * 100));
                break;
            case 3:
                System.out.println("En kilómetros: " + (valor / 100000));
                System.out.println("En metros: " + (valor / 100));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Conversión de Masa
    public void conversorMasa(Scanner scanner) {
        System.out.println("Seleccione la unidad de origen para masa:");
        System.out.println("1. Kilogramos");
        System.out.println("2. Gramos");
        System.out.println("3. Libras");
        int opcionMasa = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();

        // Realiza las conversiones según la opción seleccionada
        switch (opcionMasa) {
            case 1:
                System.out.println("En gramos: " + (valor * 1000));
                System.out.println("En libras: " + (valor * 2.20462));
                break;
            case 2:
                System.out.println("En kilogramos: " + (valor / 1000));
                System.out.println("En libras: " + (valor * 0.00220462));
                break;
            case 3:
                System.out.println("En kilogramos: " + (valor / 2.20462));
                System.out.println("En gramos: " + (valor * 453.592));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Conversión de Velocidad
    public void conversorVelocidad(Scanner scanner) {
        System.out.println("Seleccione la unidad de origen para velocidad:");
        System.out.println("1. Kilómetros por hora");
        System.out.println("2. Metros por segundo");
        System.out.println("3. Millas por hora");
        int opcionVelocidad = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();

        // Realiza las conversiones según la opción seleccionada
        switch (opcionVelocidad) {
            case 1:
                System.out.println("En metros por segundo: " + (valor / 3.6));
                System.out.println("En millas por hora: " + (valor * 0.621371));
                break;
            case 2:
                System.out.println("En kilómetros por hora: " + (valor * 3.6));
                System.out.println("En millas por hora: " + (valor * 2.23694));
                break;
            case 3:
                System.out.println("En kilómetros por hora: " + (valor / 0.621371));
                System.out.println("En metros por segundo: " + (valor * 0.44704));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
