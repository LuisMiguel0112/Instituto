
/*
 *   Obtener los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_3;

import java.util.Scanner;

public class Ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int primerNumero;
    int segundoNumero;
// pide dos números y se verifica que sean distintos
    do {
      System.out.print("Introduzca un número entero: ");
      primerNumero = s.nextInt();
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      segundoNumero = s.nextInt();
      if(primerNumero == segundoNumero) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
// si el primer número es mayor que el segundo, se intercambian los valores
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
