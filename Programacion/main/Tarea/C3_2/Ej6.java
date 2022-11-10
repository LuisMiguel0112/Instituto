
/*
 * Calculo del área de un triangulo.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tarea.C3_2;

public class Ej6 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base del triangulo: ");
    String valor = System.console().readLine();
    double base = Double.parseDouble(valor);
    System.out.print("Introduzca la altura del triangulo: ");
    valor = System.console().readLine();
    double altura = Double.parseDouble(valor);
    System.out.println("El area de un triangulo de base "+base+" y altura "+altura+" es: "+((base*altura)/2));
  }
}