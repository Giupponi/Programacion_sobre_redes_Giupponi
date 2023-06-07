package flujodeDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UnAlgoritmo {
    public static void main(String[] args) {
        int[] vector = new int[5]; // Vector de 5 espacios

        // Ingresar datos numéricos desde diferentes orígenes
        ingresarDatos(vector);
        guardarDatosEnMemoriaVolatil(vector);
        guardarDatosEnMemoriaNoVolatil(vector);
    }

    public static void ingresarDatos(int[] vector) {
        // Ingresar datos desde diferentes orígenes
        // Por ejemplo, aquí se ingresa manualmente, pero puedes modificarlo para ingresar desde otros orígenes
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
        vector[3] = 0;
        vector[4] = 0;
    }

    public static void guardarDatosEnMemoriaVolatil(int[] vector) {
        // Mostrar los datos almacenados en memoria volátil (vector)
        System.out.println("Datos en memoria volátil (vector):");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void guardarDatosEnMemoriaNoVolatil(int[] vector) {
        // Guardar los datos en memoria no volátil (archivo de texto)
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"));

            // Guardar los datos en el archivo de texto
            for (int i = 0; i < vector.length; i++) {
                writer.write(String.valueOf(vector[i]));
                writer.newLine();
            }

            writer.close();
            System.out.println("Datos guardados en memoria no volátil (archivo de texto).");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en memoria no volátil.");
            e.printStackTrace();
        }
    }
}
