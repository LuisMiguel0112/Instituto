
/*
 * Calculo del área de un rectángulo.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3.C3_2;

public class Ej5 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base del rectángulo: ");
    String valor = System.console().readLine();
    double base = Double.parseDouble(valor);
    System.out.print("Introduzca la altura del rectángulo: ");
    valor = System.console().readLine();
    double altura = Double.parseDouble(valor);
    System.out.println("El area de un rectangulo de base "+base+" y altura "+altura+" es: "+(base*altura));
  }
}
