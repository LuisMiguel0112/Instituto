
/*
 * Control capitulos 1, 2 y 3; Ejercicio 3.
 * Introducir fecha de nacimiento por teclado, y mostrarlo por pantalla.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Control1;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // Llamo a la clase scanner y creo uno nuevo llamado 's'.
    System.out.print("Introduce tu año de nacimiento: ");
    int año = s.nextInt();  // asigna a la variable año el dato introducido por teclado usando el escaner con nombre 's'.
    System.out.print("Introduce tu mes de nacimiento: ");
    String mes = s.next();
    System.out.print("Introduce tu día de nacimiento: ");
    int dia = s.nextInt();
    System.out.println("Mi fecha de nacimiento es: "+dia+" de "+mes+" de "+año+".");
  }
}
