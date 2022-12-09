
/*
 *   Leer una lista de diez números y determine cuántos son positivos y negativos.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_3;

import java.util.Scanner;

public class EJ13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca 10 números enteros: ");
    int negativos = 0;
    int positivos = 0;
    for (int i = 0; i < 10; i++) {
      if (s.nextInt() < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
  }
}