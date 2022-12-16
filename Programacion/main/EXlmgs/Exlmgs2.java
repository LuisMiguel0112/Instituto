/*
 * Ejercicio 2 - Examen.
 * 
 * @author Luis Miguel García Sevilla - 1º DAM - Tarde.
 */
import java.util.Scanner;

public class Exlmgs2 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    // Declaración de variables
    int largo = 0;  // Contador para saber como de largo es el número introducido
    int aux = 0;    // Variable auxiliar para no cambiar la variable original
    int b = 9;      // Esta variable almacenará un numero compuesto por 9 del tamaño del numero
    // Operaciones
    System.out.print("Introduce un número para saber su complementario: ");
    int num = s.nextInt();
    // Convertir en positivo
    if (num<0){
      num = num*(-1);
    }
    // Calcular longitud del número
    aux = num;
    while(largo<=aux){
      aux = aux/10;
      largo++;
    } // fin while
    // Calcular número complementario
    for(int i = 0; i<largo; i++){
      b = ((b*10)+9);
    } // fin for
    System.out.println("Número: "+num);
    System.out.println("Complementario: "+(b-num));
	}
}

