package Ejercicios_parte_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EjercicioC {
    public static void ejercicioC(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printer = System.out;

        printer.println("Ingrese un número:");
        String input = reader.readLine();
        int numero = Integer.parseInt(input);

        if (numero % 2 == 0) {
            printer.println(numero + " es un número par");
        } else {
            printer.println(numero + " es un número impar");
        }
    }
}
