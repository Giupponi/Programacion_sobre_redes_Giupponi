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
	            break;
	        	case "0":
                ps.println("¡Hasta pronto!");
                break;
                default:
                	ps.println("opcion inválida");
            }
            
            break;
        case "3":

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
            
            switch (opcion3) {
                
                case "1":
                	Ejercicio3A.ejercicio2A();
                    break;
                    
                case "2":
                	Ejercicio3B.ejercicio2B();
                    break;
                    
                case "3":
                	Ejercicio3C.ejercicio2C();
                    break;
                case "4":
                	Ejercicio3D.ejercicio2D();
                break;
                
                case"5":
                	Ejercicio3E.ejercicio2E();
                	break;
                	
                case"6":
                	Ejercicio3F.ejercicio2F();
                	break;
                	
                case"7":
                	Ejercicio3G.ejercicio2G();
                	break;
                	
                case"8":
					Ejercicio3H.ejercicio2H();
                break;
                
                case "0":
                    ps.println("¡Hasta pronto!");
                    break;
                    
                default:
                    ps.println("Opción inválida");
            }
            break;
        	case "0":
            ps.println("¡Hasta pronto!");
            break;
            default:
            	ps.println("opcion inválida");
        }
        	

        }
        }
    
    }
