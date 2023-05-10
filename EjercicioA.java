package Ejercicios_parte_2;

import java.io.*;

public class EjercicioA {

    public static void ejercicioA(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.print("Ingrese el primer apellido: ");
        String apellido1 = br.readLine();
        System.out.print("Ingrese el segundo apellido: ");
        String apellido2 = br.readLine();
        System.out.print("Ingrese el tercer apellido: ");
        String apellido3 = br.readLine();
        String primero = "", segundo = "", tercero = "";

        if (apellido1.compareToIgnoreCase(apellido2) <= 0 && apellido1.compareToIgnoreCase(apellido3) <= 0) {
            primero = apellido1;

            if (apellido2.compareToIgnoreCase(apellido3) <= 0) {
                segundo = apellido2;
                tercero = apellido3;
            } else {
                segundo = apellido3;
                tercero = apellido2;
            }
        } else if (apellido2.compareToIgnoreCase(apellido1) <= 0 && apellido2.compareToIgnoreCase(apellido3) <= 0) {
            primero = apellido2;

            if (apellido1.compareToIgnoreCase(apellido3) <= 0) {
                segundo = apellido1;
                tercero = apellido3;
            } else {
                segundo = apellido3;
                tercero = apellido1;
            }
        } else {
            primero = apellido3;

            if (apellido1.compareToIgnoreCase(apellido2) <= 0) {
                segundo = apellido1;
                tercero = apellido2;
            } else {
                segundo = apellido2;
                tercero = apellido1;
            }
        }

        System.out.println("Los apellidos ordenados alfabéticamente son: " + primero + " " + segundo + " " + tercero);
    }
}
