
/*
 *   Pintar una pirámide por pantalla.
 *
 *   @author LuisMiguel García Sevilla - 1º DAM.
 */

package Tema5.C5_3;

import java.util.Scanner;

public class Ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = s.nextInt();
    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    while (planta <= alturaIntroducida) {
// inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
// pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }
      System.out.println();
      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}