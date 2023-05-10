package Ejercicios;

import java.io.*;

public class Ejercicio2 {
    public static void ejecicio2(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese el valor del primer ángulo en grados: ");
        String input1 = reader.readLine();
        double angulo1 = Double.parseDouble(input1);

        System.out.print("Ingrese el valor del segundo ángulo en grados: ");
        String input2 = reader.readLine();
        double angulo2 = Double.parseDouble(input2);

        double angulo3 = 180 - angulo1 - angulo2;

        System.out.println("El valor del tercer ángulo en grados es: " + angulo3);
    }
}