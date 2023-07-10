package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EjercicioH {
    public static void ejercicioH(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        try {
            out.print("Ingrese un número natural: ");
            String input = reader.readLine();
            int numero = Integer.parseInt(input);

            boolean esPrimo = verificarPrimo(numero);

            if (esPrimo) {
                out.println(numero + " es un número primo.");
            } else {
                out.println(numero + " no es un número primo.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            out.println("El valor ingresado no es un número natural válido.");
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}