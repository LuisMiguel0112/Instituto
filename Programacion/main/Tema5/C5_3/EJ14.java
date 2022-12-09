
/*
 *   Calcular la potencia.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_3;

import java.util.Scanner;

public class EJ14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Cálculo de una potencia");
    System.out.print("Introduzca la base: ");
    int base = s.nextInt();
    System.out.print("Introduzca el exponente: ");
    int exponente = s.nextInt();
    double potencia = 1;
    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}