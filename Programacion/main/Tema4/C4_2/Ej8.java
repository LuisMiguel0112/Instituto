
/*
 * Calcular la media de tres notas introducidas e informe de que categoría es.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_2;

import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce primera nota: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce segunda nota: ");
    double nota2 = s.nextDouble();
    System.out.print("Introduce tercera nota: ");
    double nota3 = s.nextDouble();
    System.out.println("La media de las tres notas es: "+((nota1+nota2+nota3)/3));
  }
}
