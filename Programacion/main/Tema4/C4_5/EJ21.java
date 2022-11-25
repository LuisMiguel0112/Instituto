
/*
 *   Calcular la nota de un trimestre de la asignatura Programación.
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_5;

import java.util.Scanner;

public class EJ21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce la nota del segundo examen examen: ");
    double nota2 = s.nextDouble();
    double media = (nota1+nota2)/2;
    if (media<5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String resultado = s.next().toLowerCase();
        if (resultado.equals("apto")) {
          media = 5;
        }
    }
    System.out.println("Tu nota de programación es: "+media+".");
  }
}
