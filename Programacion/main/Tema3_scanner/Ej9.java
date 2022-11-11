
/*
* Cálculo del volumen de un cono.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema3_scanner;

import java.util.Scanner;
import java.lang.Math;

public class Ej9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el radio de la base del cono: ");
    double radio = s.nextDouble();
    System.out.print("Introduce la altura del cono: ");
    double altura = s.nextDouble();
    System.out.println("El volumen de un cono de radio "+radio+" y altura "+altura+" es: "+(1/3*(Math.PI*(Math.pow(radio,2)))*altura)+".");
  }
}
