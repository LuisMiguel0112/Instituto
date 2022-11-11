
/*
 * Calculo de una factura a partir de la base imponible.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3.C3_2;

public class Ej7 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible: ");
    String valor = System.console().readLine();
    double base = Double.parseDouble(valor);
    double ivaPorcentage = 0.21;
    double iva = (base * ivaPorcentage);
    int precio = (int)(base + iva);
    System.out.println("El precio inicial del producto es: "+base+"€");
    System.out.println("El IVA es del 21%");
    System.out.println("Por tanto el precio final es: "+precio+"€");
  }
}
