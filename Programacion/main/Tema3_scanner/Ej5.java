
/*
 * Cálculo del área de un rectángulo.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base del rectángulo: ");
    double base = s.nextDouble();
    System.out.print("Introduzca la altura del rectángulo: ");
    double altura = s.nextDouble();
    System.out.println("El area de un rectangulo de base "+base+" y altura "+altura+" es: "+(base*altura)+".");
  }
}
