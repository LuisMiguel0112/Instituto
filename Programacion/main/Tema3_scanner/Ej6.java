
/*
 * Cálculo del área de un triangulo.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base del triangulo: ");
    double base = s.nextDouble();
    System.out.print("Introduzca la altura del triangulo: ");
    double altura = s.nextDouble();
    System.out.println("El area de un triangulo de base "+base+" y altura "+altura+" es: "+((base*altura)/2)+".");
  }
}