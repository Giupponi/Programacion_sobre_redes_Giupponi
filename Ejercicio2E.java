package Ejercicios_parte_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class EjercicioE {
    public static void ejercicioE(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = System.out;

        printStream.println("Ingrese su fecha de nacimiento en formato dd/mm/yyyy:");
        String fechaNacimiento = reader.readLine();
        int dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
        int mes = Integer.parseInt(fechaNacimiento.substring(3, 5));

        String signoZodiacal = "";
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signoZodiacal = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signoZodiacal = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signoZodiacal = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signoZodiacal = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signoZodiacal = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signoZodiacal = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signoZodiacal = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signoZodiacal = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signoZodiacal = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signoZodiacal = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signoZodiacal = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signoZodiacal = "Capricornio";
        }

        printStream.println("Su signo zodiacal es: " + signoZodiacal);
    }
}
