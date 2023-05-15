package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EjercicioF {
    public static void ejercicioF(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;

        try {
            
            out.print("Ingrese el nombre de la primera persona: ");
            String nombre1 = reader.readLine();
            out.print("Ingrese el apellido de la primera persona: ");
            String apellido1 = reader.readLine();

            out.print("Ingrese el nombre de la segunda persona: ");
            String nombre2 = reader.readLine();
            out.print("Ingrese el apellido de la segunda persona: ");
            String apellido2 = reader.readLine();

            int longitudApellido1 = apellido1.length();
            int longitudApellido2 = apellido2.length();

            if (longitudApellido1 > longitudApellido2) {
                out.println("El apellido de la primera persona es más largo.");
            } else if (longitudApellido2 > longitudApellido1) {
                out.println("El apellido de la segunda persona es más largo.");
            } else {
                out.println("Ambos apellidos tienen la misma longitud.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}