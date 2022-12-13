
/*
 *   Mostrar el total acumulado, el contador de los números introducidos y la media, cuando el valor supere 10000.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_4;

import java.util.Scanner;

public class EJ23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    do {
      numeroIntroducido = s.nextInt();
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  }
}