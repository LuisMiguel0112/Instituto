package Tema4.C4_5;

import java.util.Scanner;

public class Ej25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int alto = s.nextInt();
    System.out.print("Ahora introduzca la anchura: ");
    int ancho = s.nextInt();
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    boolean conEscudo = ((s.next()).toLowerCase()).equals("s");
    String escudo;
    float precio;
    if (conEscudo) {
      escudo = "Con escudo";
      precio = 3.50f;
    } else{
      escudo = "Sin escudo";
      precio = 0;
    }
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %5d cm2: %5.2f €\n", ancho * alto, (float)ancho * alto/100);
    System.out.printf("%s: %5.2f €\n", escudo, precio);
    System.out.printf("Gastos de envío: %5.2f €\n", 3.25);
    System.out.printf("Total: %5.2f €\n", (float)ancho * alto / 100 + precio + 3.25);
  }
}