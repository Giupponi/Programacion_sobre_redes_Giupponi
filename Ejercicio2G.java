package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EjercicioG {
    public static void ejercicioG(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        try {
            out.print("Ingrese un número entero N: ");
            String input = reader.readLine();
            int N = Integer.parseInt(input);

            out.println("Tabla de multiplicar de " + N + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = N * i;
                out.println(N + " x " + i + " = " + resultado);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            out.println("El valor ingresado no es un número entero válido.");
        }
    }
}