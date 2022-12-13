
/*
 *   Pedir un número por teclado y que luego muestre ese número al revés.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_4;

import java.util.Scanner;

public class Ej25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = s.nextInt();
    int numero = numeroIntroducido;
    int volteado = 0;
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
  }
}
