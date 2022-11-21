
/*
 * Ejemplo de un menú con switch.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 */
package Tema4.C4_2;

import java.util.Scanner;

public class Ejemplo_switch2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println(" ----------------");
    System.out.println(" 1. Rombo");
    System.out.println(" 2. Romboide");
    System.out.println(" 3. Triángulo");
    System.out.print("\n Elija una opción (1-3): ");
    int opcion = s.nextInt();
    double base;
    double altura;
    switch (opcion) {
      case 1:
        System.out.print("\nIntroduzca la diagonal mayor diagonal del rombo en cm: ");
        double diagonal1 = s.nextDouble();
        System.out.print("\nIntroduzca la menor del rombo en cm: ");
        double diagonal2 = s.nextDouble();
        System.out.println("\nEl área del rombo es " + ((diagonal1 * diagonal2) / 2) + " cm2");
        break;
      case 2:
        System.out.print("\nIntroduzca la base del romboide en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del romboide en cm: ");
        altura = s.nextDouble();
        System.out.println("El área del romboide es " + (base * altura) + " cm2");
        break;
      case 3:
        System.out.print("\nIntroduzca la base del triángulo en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del triángulo en cm: ");
        altura = s.nextDouble();
        System.out.println("El área del triángulo es " + ((base * altura) / 2) + " cm2");
        break;
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}