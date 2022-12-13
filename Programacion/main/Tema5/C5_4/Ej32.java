
/*
 *   Dado un número entero positivo, mostrar cuáles son y cuánto suman los dígitos pares.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_4;

import java.util.Scanner;

public class Ej32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String pares = "";
    int suma = 0;
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long n = s.nextLong();
    while (n>0){
      if ((n%10)%2 == 0){
        suma+=(n%10);
        pares = (n%10)+pares;
      }
      n=n/10;
    }
    System.out.println("Números pares: "+pares);
    System.out.println("La suma de los pares es: "+suma);
  }
}
