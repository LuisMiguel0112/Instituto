
/*
*   Mostrar la tabla de multiplicar del número introducido.
*
*   @author Luis Miguel García Sevilla - 1º DAM.
*/

package Tema5.C5_2;

import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int num = s.nextInt();
    System.out.println("La tabla de multiplicar de "+num+" es:");
    for (int i = 0; i<=10; i++){
      int mult = num*i;
      System.out.println(num+" * "+i+" es: "+mult+".");
    }
  }
}
