package Ejercicios;

public class Ejercicio7 {
    public static void ejercicio7(String[] args) {
        String signoZodiacal = System.console().readLine("Ingrese su signo zodiacal: ");

        String mesDeNacimiento;
        switch (signoZodiacal.toLowerCase()) {
            case "aries":
                mesDeNacimiento = "marzo-abril";
                break;
            case "tauro":
                mesDeNacimiento = "abril-mayo";
                break;
            case "géminis":
            case "geminis":
                mesDeNacimiento = "mayo-junio";
                break;
            case "cáncer":
            case "cancer":
                mesDeNacimiento = "junio-julio";
                break;
            case "leo":
                mesDeNacimiento = "julio-agosto";
                break;
            case "virgo":
                mesDeNacimiento = "agosto-septiembre";
                break;
            case "libra":
                mesDeNacimiento = "septiembre-octubre";
                break;
            case "escorpio":
                mesDeNacimiento = "octubre-noviembre";
                break;
            case "sagitario":
                mesDeNacimiento = "noviembre-diciembre";
                break;
            case "capricornio":
                mesDeNacimiento = "diciembre-enero";
                break;
            case "acuario":
                mesDeNacimiento = "enero-febrero";
                break;
            case "piscis":
                mesDeNacimiento = "febrero-marzo";
                break;
            default:
                mesDeNacimiento = "desconocido";
                break;
        }

        System.out.println("Su mes de nacimiento aproximado es " + mesDeNacimiento + ".");
    }
}
