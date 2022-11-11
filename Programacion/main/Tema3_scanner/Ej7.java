
/*
 * Cálculo de una factura a partir de la base imponible.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base imponible: ");
    double base = s.nextDouble();
    double ivaPorcentage = 0.21;
    double iva = (base * ivaPorcentage);
    int precio = (int)(base + iva);
    System.out.println("El precio inicial del producto es: "+base+"€.");
    System.out.println("El IVA es del 21%.");
    System.out.println("Por tanto el precio final es: "+precio+"€.");
  }
}
