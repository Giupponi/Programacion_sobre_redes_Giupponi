package guia_de_ejercicios_1;
import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;

public class Menu {

    public static void main(String[] args) throws IOException, ParseException {
        
        Console console = System.console();
        PrintStream ps = System.out;
        
        String opcion = "";
        String preguntas = "";
        String opcion2 = "";
        String opcion3 = "";
        String opcion4 = "";
        
        while(!preguntas.equals("0")) {
        	ps.println("selecciones una opcion:");
        	ps.println("1.guia de preguntas 1");
        	ps.println("2.guia de preguntas 2");
            ps.println("0. Salir");
            

            preguntas = console.readLine();
            switch (preguntas) {
            case "1" :
        while (!opcion.equals("0")) {
            
            ps.println("Seleccione una opción:");
            ps.println("1. Calcular el valor del sueldo bruto");
            ps.println("2. Calcular el valor del tercer ángulo de un triángulo");
            ps.println("3. Calcular el perímetro de un cuadrado");
            ps.println("4. Fahrenheit a grados celcius");
            ps.println("5. segudos a tiempo completo");
            ps.println("6. planes para pagar y sus resultados");
            ps.println("7. signos zodiacales y sus nacimientos");
            ps.println("0. salir");
            

            opcion = console.readLine();
            
            switch (opcion) {
                
                case "1":
                	EjercicioA.EjercicioA();
                    break;
                    
                case "2":
                	Ejercicio1B.ejercicio1B();
                    break;
                    
                case "3":
                	EjercicioC.ejercicioC();
                    break;
                case "4":
                EjercicioD.ejercicioD();
                break;
                
                case"5":
                	EjercicioE.ejercicioE();
                	break;
                	
                case"6":
                	EjercicioF.ejercicioF();
                	break;
                	
                case"7":
                	EjercicioG.ejercicioG();
                	break;
                	
                case "0":
                    ps.println("¡Hasta pronto!");
                    break;
                    
                default:
                    ps.println("Opción inválida");
            }
            
        }
        	break;
            case "2":

	            ps.println("Seleccione una opción:");
	            ps.println("1. Tres apellidos ");
	            ps.println("2. Calcular el valor del tercer ángulo de un triángulo");
	            ps.println("3. Calcular el perímetro de un cuadrado");
	            ps.println("4. Fahrenheit a grados celcius");
	            ps.println("5. segudos a tiempo completo");
	            ps.println("6. planes para pagar y sus resultados");
	            ps.println("7. signos zodiacales y sus nacimientos");
	            ps.println("8. primo o no?");
	            ps.println("0. salir");
	            
            	
            	
	            opcion2 = console.readLine();
	            
	            switch (opcion2) {
	                
	                case "1":
	                	Ejercicio2A.ejercicio2A();
	                    break;
	                    
	                case "2":
	                	Ejercicio2B.ejercicio2B();
	                    break;
	                    
	                case "3":
	                	Ejercicio2C.ejercicio2C();
	                    break;
	                case "4":
	                	Ejercicio2D.ejercicio2D();
	                break;
	                
	                case"5":
	                	Ejercicio2E.ejercicio2E();
	                	break;
	                	
	                case"6":
	                	Ejercicio2F.ejercicio2F();
	                	break;
	                	
	                case"7":
	                	Ejercicio2G.ejercicio2G();
	                	break;
	                	
	                case"8":
						Ejercicio2H.ejercicio2H();
	                break;
	                
	                case "0":
	                    ps.println("¡Hasta pronto!");
	                    break;
	                    
	                default:
	                    ps.println("Opción inválida");
	            }
                	
            }
            

            opcion3 = console.readLine();
            
            switch (opcion3) {
                
                case "1":
                	Ejercicio1.ejercicio3A();
                    break;
                    
                case "2":
                	Ejercicio2.ejercicio3B();
                    break;
                    
                case "3":
                	Ejercicio3.ejercicio3C();
                    break;
                case "4":
                	Ejercicio4.ejercicio3D();
                break;
                
                case"5":
                	Ejercicio5.ejercicio3E();
                	break;
                	
                case"6":
                	Ejercicio6.ejercicio3F();
                	break;
                	
                case"7":
                	Ejercicio3G.ejercicio3G();
                	break;
                
                case "0":
                    ps.println("¡Hasta pronto!");
                    break;
                    
                default:
                    ps.println("Opción inválida");
            }
            
        }
        
        opcion3 = console.readLine();
        
        switch (opcion3) {
            
            case "1":
            	EjercicioA.ejercicio4A();
                break;
                
            case "2":
            	EjercicioBColegio.ejercicio4B();
                break;
                
            case "3":
            	EjercicioC.ejercicio4C();
                break;
            case "4":
            	EjercicioD.ejercicio4D();
            break;
            
            case"5":
            	EjercicioE.ejercicio4E();
            	break;
            	
            case"6":
            	EjercicioF.ejercicio4F();
            	break;
            	
            case"7":
            	EjercicioG.ejercicio4G();
            	break;
            
            case "0":
                ps.println("¡Hasta pronto!");
                break;
                
            default:
                ps.println("Opción inválida");
        }
        
    }
        	

        }
        }
    

