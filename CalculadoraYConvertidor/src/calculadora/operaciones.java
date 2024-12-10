package calculadora;

public class operaciones {
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static String divisionConResiduo(int a, int b) {
        return a / b + " con residuo " + a % b;
    }
}