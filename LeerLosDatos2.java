package flujodeDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LeerLosDatos2 {
    public static void main(String[] args) {
        int[] vectorMemoria = obtenerVectorMemoria(); // Obtener el vector en memoria desde el punto 1
        int[] vectorArchivo = obtenerVectorArchivo(); // Obtener el vector desde el archivo guardado en el punto 1

        // Crear archivos de salida
        PrintWriter resultadosWriter = null;
        PrintWriter errorWriter = null;

        try {
            resultadosWriter = new PrintWriter(new FileWriter("resultados.txt"));
            errorWriter = new PrintWriter(new FileWriter("error.txt"));

            // Calcular los resultados de la división y escribir en el archivo "resultados.txt"
            for (int i = 0; i < 5; i++) {
                try {
                    double resultado = (double) vectorMemoria[i] / 3;
                    resultadosWriter.println(vectorMemoria[i] + " / 3 = " + resultado);
                } catch (ArithmeticException e) {
                    errorWriter.println("Error: División por cero en el dato número " + (i + 1));
                } catch (ArrayIndexOutOfBoundsException e) {
                    errorWriter.println("Error: Falta de número de entrada en el dato número " + (i + 1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar los archivos de salida
            if (resultadosWriter != null) {
                resultadosWriter.close();
            }
            if (errorWriter != null) {
                errorWriter.close();
            }
        }
    }

    // Método para obtener el vector en memoria (simulado)
    public static int[] obtenerVectorMemoria() {
        // Aquí puedes implementar la lógica para obtener el vector en memoria
        // En este ejemplo, se retorna un vector con valores predefinidos
        return new int[]{10, 20, 30, 0, 40};
    }

    // Método para obtener el vector desde el archivo (simulado)
    public static int[] obtenerVectorArchivo() {
        // Aquí puedes implementar la lógica para obtener el vector desde el archivo
        // En este ejemplo, se retorna un vector con valores predefinidos
        return new int[]{5, 0, 15, 25, 35};
    }
}

