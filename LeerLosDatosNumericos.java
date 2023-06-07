package flujodeDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LeerLosDatosNumericos {
    public static void main(String[] args) {
        int[] vector = {10, 20, 30, 40, 50}; // Vector de ejemplo

        try {
            BufferedWriter resultadosWriter = new BufferedWriter(new FileWriter("resultados.txt"));
            BufferedWriter errorWriter = new BufferedWriter(new FileWriter("error.txt"));

            for (int i = 0; i < vector.length - 1; i++) {
                int numero1 = vector[i];
                int numero2 = vector[i + 1] - 3;
                double resultado;

                try {
                    resultado = (double) numero1 / numero2;
                    resultadosWriter.write(numero1 + " / " + numero2 + " = " + resultado);
                    resultadosWriter.newLine();
                } catch (ArithmeticException e) {
                    errorWriter.write(numero1 + " / " + numero2 + " = Error: " + e.getMessage());
                    errorWriter.newLine();
                }
            }

            resultadosWriter.close();
            errorWriter.close();
            System.out.println("Archivos de salida generados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al generar los archivos de salida.");
            e.printStackTrace();
        }
    }
}
