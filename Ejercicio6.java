package Ejercicios;

public class Ejercicio6 {
    public static void ejercicio6(String[] args) {
        double precio, descuento, precioFinal;
        double cuotaPlan2, cuotaPlan3, cuotaPlan4;
        
        System.out.print("Ingrese el precio del artículo: ");
        precio = Double.parseDouble(System.console().readLine());
        
        // Plan 1
        descuento = precio * 0.1;
        precioFinal = precio - descuento;
        System.out.println("Plan 1 - Precio final: " + precioFinal);
        
        // Plan 2
        cuotaPlan2 = (precio * 1.1 - precio/2) / 2;
        precioFinal = precio * 1.1;
        System.out.println("Plan 2 - Precio final: " + precioFinal + " - Cuotas: " + precio/2 + " al contado y 2 de " + cuotaPlan2);
        
        // Plan 3
        cuotaPlan3 = (precio * 1.15 - precio/4) / 5;
        precioFinal = precio * 1.15;
        System.out.println("Plan 3 - Precio final: " + precioFinal + " - Cuotas: " + precio/4 + " al contado y 5 de " + cuotaPlan3);
        
        // Plan 4
        cuotaPlan4 = (precio * 1.25 * 0.6) / 4;
        precioFinal = precio * 1.25;
        System.out.println("Plan 4 - Precio final: " + precioFinal + " - Cuotas: 4 de " + cuotaPlan4 + " y 4 de " + cuotaPlan4 * 1.4);
    }
}