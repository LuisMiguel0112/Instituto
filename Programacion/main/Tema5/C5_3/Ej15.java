
/*
 *   Mostrar por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_3;

import java.util.Scanner;

public class Ej15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número real como base: ");
    double base = s.nextDouble();
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = s.nextInt();
    double potencia;
    int exponente;
    for (int i = 1; i <= exponenteFinal; i++) {
      potencia = 1;
      exponente = i;
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}