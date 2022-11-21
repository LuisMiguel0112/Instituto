
/*
 * Calcular una ecuación de segundo grado de tipo: ax + b = 0.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_1;

import java.util.Scanner;

public class Ej5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo: ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = s.nextDouble();
    System.out.print("hora introduzca el valor de b: ");
    double b = s.nextDouble();
    double x;
    if(a!=0){
      x = ((-b)/a);
      System.out.println("x = "+x);
    }else{
      System.out.println("Esa ecuación no tiene solución real.");
    }

  }
}
