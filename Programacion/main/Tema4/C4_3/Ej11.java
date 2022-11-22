
/*  Mostrar los segundos que faltan para llegar a la medianoche.
 *
 *  @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_3;

import java.util.Scanner;

public class Ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double sNoche = 86400;  // Segundos de las 00:00.
    System.out.print("Introduce que hora es (formato 00,00): ");
    double hora = s.nextDouble();
    double segundos = (sNoche-(hora*3600));
    System.out.println("Quedan "+segundos+" segundos para la media noche.");
  }
}
