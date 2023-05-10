package Ejercicios;

public class Ejercicio3 {
    public static void ejercicio3(String[] args) {
        double superficie;
        double lado;
        double perimetro;
        
        System.out.print("Ingresa la superficie del cuadrado en metros cuadrados: ");
        superficie = Double.parseDouble(System.console().readLine());
        
        lado = Math.sqrt(superficie); 
        perimetro = lado * 4; 
        
        System.out.println("El perímetro del cuadrado es: " + perimetro + " metros.");
    }
}