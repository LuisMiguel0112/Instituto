
/*
*   Calcular cuántos dígitos tiene un número introducido por teclado.
*
*   @author LuisMiguel García Sevilla - 1º DAM.
*/

package Tema5.C5_3;

import java.util.Scanner;

public class EJ9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeroDeDigitos = 1, n, numeroIntroducido;
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = s.nextInt();
    n = numeroIntroducido;
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
  System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  }
}