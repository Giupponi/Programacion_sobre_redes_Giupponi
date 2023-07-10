package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio5 {
    public void borrarImpares() throws IOException {
        FileReader fileReader = new FileReader("ruta/al/archivo/números.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("ruta/al/archivo/temp.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            int numero = Integer.parseInt(linea);
            if (numero % 2 == 0) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
        File archivoOriginal = new File("ruta/al/archivo/números.txt");
        archivoOriginal.delete();
        File archivoTemporal = new File("ruta/al/archivo/temp.txt");
        archivoTemporal.renameTo(archivoOriginal);
    }

    public static void ejercicio3E() {
        Ejercicio5 ejerciciosIO = new Ejercicio5();
        try {
            ejerciciosIO.borrarImpares();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
