
/*
 * Control capitulos 1, 2 y 3; Ejercicio 3.
 * Introducir edad y nombre por teclado, y mostrarlo por pantalla.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Control1;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // Llamo a la clase scanner y creo uno nuevo llamado 's'.
    System.out.print("Introduce tu edad: ");
    int edad = s.nextInt();
    System.out.print("Introduce tu nombre: ");
    String nombre = s.next();
    System.out.println("Mi nombre es: "+nombre+" y tengo "+edad+" años.");
  }
}
