
/*
 * Operaciones de dos números introducidos por teclado.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3.C3_2;

public class Ej4 {
  public static void main(String[] args) {
    System.out.print("Introduzca el primer número: ");
    String valor = System.console().readLine();
    double num1 = Double.parseDouble(valor);
    System.out.print("Introduzca el segundo número: ");
    valor = System.console().readLine();
    double num2 = Double.parseDouble(valor);
    System.out.println("La sumo de "+num1+" y "+num2+" es: "+(num1+num2));
    System.out.println("La resta de "+num1+" y "+num2+" es: "+(num1-num2));
    System.out.println("La multiplicación de "+num1+" y "+num2+" es: "+(num1*num2));
    System.out.println("La división de "+num1+" y "+num2+" es: "+(num1/num2));
  }
}
