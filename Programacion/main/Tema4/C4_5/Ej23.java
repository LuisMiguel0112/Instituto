
/*
*   calcule el precio final de un producto según su base imponible, el tipo de IVA aplicado y el código promocional.
*
*   @author Luis Miguel García Sevilla - 1º DAM.
*/

package Tema4.C4_5;

import java.util.Scanner;

public class Ej23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base imponible: ");
    double base = s.nextDouble();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipo = s.next();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String promo = s.next();
// IVA y precio antes del descuento.
    int tipoIVA = 0;
    switch(tipo) {
      case "general":
        tipoIVA = 21;
        break;
      case "reducido":
        tipoIVA = 10;
        break;
      case "superreducido":
        tipoIVA = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    double iva = base * tipoIVA / 100;
    double precioSinDescuento = base + iva;
// Descuento
    double descuento = 0;
    switch(promo) {
      case "nopro":
        break;
      case "mitad":
        descuento = precioSinDescuento / 2;
        break;
      case "meno5":
        descuento = 5;
        break;
      case "5porc":
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
// Precio final.
    double total = precioSinDescuento - descuento;
    System.out.println("Base imponible "+ base);
    System.out.println("IVA (%2d%%) "+ tipoIVA + iva);
    System.out.println("Precio con "+ precioSinDescuento);
    System.out.println("Cód. promo. "+ promo + descuento);
    System.out.println("TOTAL "+ total);
  }
}
