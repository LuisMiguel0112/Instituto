
/*
 *   Pintar la letra L por pantalla hecha con asteriscos.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_4;

import java.util.Scanner;

public class EJ31 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la L: ");
    int altura = s.nextInt();
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("* ");
    }
  }
}