
/*
 *   Mostrar la última cifra de un número entero introducido por teclado.
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_4;

import java.util.Scanner;

public class Ej17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = s.nextInt();
    System.out.println("La última cifra de "+num+" es: "+(num%10));
  }
}
