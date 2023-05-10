package Ejercicios;

public class Ejercicio5 {

    public static void ejercicio5(String[] args) {
        
        int tiempoTotalSegundos = 3456789;
        
        int segundosEnUnDia = 86400;
        int segundosEnUnaHora = 3600;
        int segundosEnUnMinuto = 60;
        
        int dias = tiempoTotalSegundos / segundosEnUnDia;
        int horas = (tiempoTotalSegundos % segundosEnUnDia) / segundosEnUnaHora;
        int minutos = ((tiempoTotalSegundos % segundosEnUnDia) % segundosEnUnaHora) / segundosEnUnMinuto;
        int segundos = ((tiempoTotalSegundos % segundosEnUnDia) % segundosEnUnaHora) % segundosEnUnMinuto;
        
        System.out.println(dias + ":" + horas + ":" + minutos + ":" + segundos);
    }
}