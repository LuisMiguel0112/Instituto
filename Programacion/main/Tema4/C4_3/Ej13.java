
/*  Ordenar tres números enteros introducidos por teclado.
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_3;

import java.util.Scanner;

public class Ej13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    double num1 = s.nextDouble();
    System.out.print("Introduce el segundo número: ");
    double num2 = s.nextDouble();
    System.out.print("Introduce el tercer número: ");
    double num3 = s.nextDouble();
    if ((num1>num2)&&(num1>num3)){
      if (num2>num3){
        System.out.println("El orden de los numeros es (>): "+num1+", "+num2+", "+num3+".");
      }else System.out.println("El orden de los numeros es (>): "+num1+", "+num3+", "+num2+".");
    }
    if ((num2>num1)&&(num2>num3)){
      if (num1>num3){
        System.out.println("El orden de los numeros es (>): "+num2+", "+num1+", "+num3+".");
      }else System.out.println("El orden de los numeros es (>): "+num2+", "+num3+", "+num1+".");
    }
    if ((num3>num1)&&(num3>num2)){
      if (num1>num2){
        System.out.println("El orden de los numeros es (>): "+num3+", "+num1+", "+num2+".");
      }else System.out.println("El orden de los numeros es (>): "+num3+", "+num2+", "+num1+".");
    }
  }
}
