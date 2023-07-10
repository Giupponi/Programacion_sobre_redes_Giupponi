package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio3 {
    public void guardarNumerosPares() throws IOException {
        File archivo = new File("ruta/al/archivo/números.txt");
        FileWriter fileWriter = new FileWriter(archivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i <= 1000; i += 2) {
            bufferedWriter.write(String.valueOf(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void ejercicio3C() {
        Ejercicio3 ejerciciosIO = new Ejercicio3();
        try {
            ejerciciosIO.guardarNumerosPares();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
