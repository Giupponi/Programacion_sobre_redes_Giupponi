package guia_de_ejercicios_1;

import java.io.PrintStream;

public class EjercicioD {
    public void convertirFahrenheitACelsius() {
        PrintStream out = System.out;
        out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = Double.parseDouble(System.console().readLine());
        double celsius = (fahrenheit - 32) * 5 / 9;
        out.println("La temperatura en grados Celsius es: " + celsius + " °C");
    }

    public static void ejercicioD() {
        EjercicioD ejerciciosIO = new EjercicioD();
        ejerciciosIO.convertirFahrenheitACelsius();
    }
}
