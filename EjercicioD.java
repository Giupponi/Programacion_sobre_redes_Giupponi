package Ejercicios_parte_2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EjercicioD {
    public static void ejercicioD(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        out.print("Introduce el primer número: ");
        double num1 = Double.parseDouble(reader.readLine());
        
        out.print("Introduce el segundo número: ");
        double num2 = Double.parseDouble(reader.readLine());
        
        double mayor = Math.max(num1, num2);
        double menor = Math.min(num1, num2);
        
        if (mayor % menor == 0) {
            out.printf("%.2f es divisible por %.2f.%n", mayor, menor);
        } else {
            out.printf("%.2f no es divisible por %.2f.%n", mayor, menor);
        }
        
        reader.close();
        out.close();
    }
}
