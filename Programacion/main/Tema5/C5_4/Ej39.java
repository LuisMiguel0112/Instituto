
/*
 *   Mostrar los números desde el 1 al número introducido junto con su factorial.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_4;

import java.util.Scanner;

public class Ej39 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeroIntroducido;
    System.out.print("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = s.nextInt();
    for (int n = 1; n <= numeroIntroducido; n++) {
      int factorial = n;
      for (int i = 1; i < n; i++) {
        factorial *= i;
      }
      System.out.println(n + "! = " + factorial);
    }
  }
}

