package guia_de_ejercicios_1;

import java.io.*;

public class Ejercicio4 {
    public void leerNumeros() throws IOException {
        FileReader fileReader = new FileReader("ruta/al/archivo/números.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public static void ejercicio3D() {
        Ejercicio4 ejerciciosIO = new Ejercicio4();
        try {
            ejerciciosIO.leerNumeros();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
