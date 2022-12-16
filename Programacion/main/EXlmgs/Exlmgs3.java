/*
 * Ejercicio 3 - Examen.
 * 
 * @author Luis Miguel García Sevilla - 1º DAM - Tarde.
 */
import java.util.Scanner;

public class Exlmgs3 {
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
		// Declaración de variables
    int opt = 0;              // Opcion a seleccionar
    double precio = 0;        // Precio de tipo de relleno
    boolean extra1 = false;   // Será true cuando se elija fruta
    boolean extra2 = false;   // Será true cuando se elija escribir
    double total = 0;         // Precio total con extras
    String relleno = "";      // Opcion de relleno
    boolean valida = false;   // Verifica si la opcion es valida
    // Operaciones
    while (!valida){ // Comprobar opción valida
      // Menú
      System.out.println("Elaboración de Roscón de Reyes");
      System.out.println("Elija sabor de relleno:");
      System.out.println("1 - Nata");
      System.out.println("2 - Crema");
      System.out.println("3 - Chocolate");
      System.out.print("Opción (1/2/3): ");
      opt = s.nextInt();
      // Tipo de relleno
      switch (opt){
        case 1:
          precio = 16;
          valida = true;
          relleno = "nata";
          break;
        case 2:
          precio = 18;
          valida = true;
          relleno = "crema";
          break;
        case 3:
          System.out.println("Elige tipo de chocolate:\n1 - Chocolate blanco\n2 - Chocolate negro");
          System.out.print("Tipo (1/2): ");
          opt = s.nextInt();
          while (!valida){ // Comprobar opción valida
            if (opt == 1){
              precio = 14;
              valida = true;
              relleno = "chocolate blanco";
              }
            if (opt == 2){
              precio = 15;
              valida = true;
              relleno = "chocolate negro";
              }else{
                System.out.println("Opción no valida.");
                }
            } // fin while opción valida
          valida = true;
          break;
        default:
          System.out.println("Opción no válida.");
          break;
        } // fin switch
      } // fin while
    // Comprobar si quiere extras
    // Extra 1
    valida = false;
    while (!valida){
      // Menú
      System.out.println("Elige si quiere añadir fruta escarchada:");
      System.out.println("1 - Si");
      System.out.println("2 - No");
      System.out.print("Elige: ");
      opt = s.nextInt();
      switch(opt){
        case 1:
          extra1 = true;
          valida = true;
          break;
        case 2:
          valida = true;
          break;
        default:
          System.out.println("Opción no valida.");
         }
      } // fin while
    // Extra 2
    valida = false;
    while (!valida){
      // Menú
      System.out.println("Elige si quiere añadir nombre personalizado:");
      System.out.println("1 - Si");
      System.out.println("2 - No");
      System.out.print("Elige: ");
      opt = s.nextInt();
      switch(opt){
        case 1:
          extra2 = true;
          valida = true;
          break;
        case 2:
          valida = true;
          break;
        default:
          System.out.println("Opción no valida.");
        } // fin switch
      } // fin while
    // Mostrar por pantalla
    total = precio;
    System.out.println("Su elección de Roscón de Reyes:");
    System.out.println("Precio relleno "+relleno+" = "+precio+" Euros");
    if (extra1){
      System.out.println("Precio extra: añadido fruta escarchada = 2.50 Euros");
      total += 2.50;
      }
    if (extra2){
      System.out.println("Precio extra: con nombre presonalizado = 2.75 Euros");
      total += 2.75;
      }else{
        System.out.println("Precio extra: No hay extras");
        }
      System.out.println("TOTAL precio Roscón de Reyes: "+total+" Euros");
  }
}
