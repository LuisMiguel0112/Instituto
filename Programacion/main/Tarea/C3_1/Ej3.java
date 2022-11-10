
/*
 * Transformación de euros a pesetas.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tarea.C3_1;

public class Ej3 {
  public static void main(String[] args) {
    System.out.print("Introduzca la cantidad de pesetas que quiere convertir: ");
    String cantidad = System.console().readLine();
    int pesetas = Integer.parseInt(cantidad);
    double valorEuros = 166.3860;
    double euros = (pesetas/valorEuros);
    System.out.println(cantidad+" pesetas son "+(euros)+" euros.");
  }
}
