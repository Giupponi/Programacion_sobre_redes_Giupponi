package Ejercicios_parte_2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;

public class EjercicioB {

    public static void ejercicioB(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        out.println("Ingresa los cuatro números: ");

        double num1 = Double.parseDouble(reader.readLine());
        double num2 = Double.parseDouble(reader.readLine());
        double num3 = Double.parseDouble(reader.readLine());
        double num4 = Double.parseDouble(reader.readLine());

        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }

        out.println("El menor número es: " + menor);
    }
}
