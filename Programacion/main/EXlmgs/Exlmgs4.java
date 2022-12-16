/*
 * Ejercicio 4 - Examen.
 * 
 * @author Luis Miguel García Sevilla - 1º DAM - Tarde.
 */
import java.util.Scanner;

public class Exlmgs4 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    // Declaración de variables
    String sim = "";  // Simbolos que se imprimirán en la consola
    // Operaciones
    System.out.print("Introduce el número de escalones: ");
    int escalones = s.nextInt();
    System.out.print("Introduce la altura de escalones: ");
    int altura = s.nextInt();
    // Convertir en positivo
    if (escalones<0){
      escalones = escalones*(-1);
    }
    if (altura<0){
      altura = altura*(-1);
    }
    // Constructor de escalones
    for(int i = 0; i<escalones; i++){ // 1º for: Cantidad de escalones
      sim = sim+"*";
      for(int n = 0; n<altura; n++){  // 2º for: altura de escalones
        System.out.println(sim);
      } // fin 2º for
    } // fin 1º for
	}
}

