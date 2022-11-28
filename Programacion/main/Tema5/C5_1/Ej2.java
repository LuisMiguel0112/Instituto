
/*
*   Mostrar por pantalla los números naturales hasta un valor introducido por teclado.
*
*   @author Luis Miguel García Sevilla 1º DAM.
* */

package Tema5.C5_1;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el número final: ");
    int num = s.nextInt();
    for (int i = 0; i <= num; i++){
      System.out.println(i);
    }
  }
}
