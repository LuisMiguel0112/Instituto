
/*
 * Operaciones de dos números introducidos por teclado.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el primer número: ");
    double num1 = s.nextDouble();
    System.out.print("Introduzca el segundo número: ");
    double num2 = s.nextDouble();
    System.out.println("La suma de "+num1+" y "+num2+" es: "+(num1+num2)+".");
    System.out.println("La resta de "+num1+" y "+num2+" es: "+(num1-num2)+".");
    System.out.println("La multiplicación de "+num1+" y "+num2+" es: "+(num1*num2)+".");
    System.out.println("La división de "+num1+" y "+num2+" es: "+(num1/num2)+".");
  }
}
