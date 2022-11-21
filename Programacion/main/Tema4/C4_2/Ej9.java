
/*
 * Calcular una ecuación de segundo grado de tipo: ax^2 + bx + c = 0.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_2;

import java.util.Scanner;
import java.lang.Math;

public class Ej9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo: ax^2 + bx + c = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = s.nextDouble();
    System.out.print("hora introduzca el valor de b: ");
    double b = s.nextDouble();
    System.out.print("hora introduzca el valor de c: ");
    double c = s.nextDouble();
    double x1;
    double x2;
    double raiz = (Math.pow(b,2)-4*a*c);
    if((a!=0)&&(raiz>=0)){
      x1 = (((-b)+Math.sqrt(raiz))/2*a);
      x2 = (((-b)-Math.sqrt(raiz))/2*a);
      System.out.println("x1 = "+x1);
      System.out.println("x2 = "+x2);
    }else{
      System.out.println("Esa ecuación no tiene solución real.");
    }
  }
}
