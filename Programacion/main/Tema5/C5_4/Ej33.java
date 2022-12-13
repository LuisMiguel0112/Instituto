
/*
 *   Pintar la letra U por pantalla hecha con asteriscos.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_4;

import java.util.Scanner;

public class Ej33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la U: ");
    int altura = s.nextInt();
// Palos verticales de la U
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
// Base de la U
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }
  }
}