
/*
 *   Dibujar una piramide con la orientación y el simbolo deseado.
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_4;

import java.util.Scanner;

public class Ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el simbolo con el que quieres dibujar la piramide: ");
    String simbolo = s.next();
    System.out.print("Introduce hacia dónde apuntará el vertice: ");
    String rotacion = s.next().toLowerCase();
    switch (rotacion){
      case "arriba":
        System.out.println("  "+simbolo);
        System.out.println(" "+simbolo+simbolo+simbolo);
        System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo);
        break;
      case "derecha":
        System.out.println(simbolo);
        System.out.println(simbolo+simbolo);
        System.out.println(simbolo+simbolo+simbolo);
        System.out.println(simbolo+simbolo);
        System.out.println(simbolo);
        break;
      case "abajo":
        System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo);
        System.out.println(" "+simbolo+simbolo+simbolo);
        System.out.println("  "+simbolo);
        break;
      case "izquierda":
        System.out.println("  "+simbolo);
        System.out.println(" "+simbolo+simbolo);
        System.out.println(simbolo+simbolo+simbolo);
        System.out.println(" "+simbolo+simbolo);
        System.out.println("  "+simbolo);
        break;
    }
  }
}
