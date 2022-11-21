
/* Cálculo del tiempo de caida de un objeto a partir de la altura.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema4;

import java.util.Scanner;
import java.lang.Math;

public class Ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double g = 9.81;  // Aceleración de la gravedad en la tierra.
    System.out.print("Introduzca la altura desde donde cae el objeto para calcular el tiempo que tarda: ");
    double h = s.nextDouble();  // Altura desde donde cae el objeto.
    double t = (Math.sqrt((2*h)/g));
    System.out.println("Un objeto que cae desde una altura de "+h+"m es: "+t+"s.");
  }
}
