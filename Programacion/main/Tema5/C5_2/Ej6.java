
/*
 *   Mostrar los números del 320 al 160, contando de 20 en 20 hacia atrás (do-while).
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 */

package Tema5.C5_2;

public class Ej6 {
  public static void main(String[] args) {
    int i = 320;
    do {
      System.out.println(i);
      i = i-20;
    }while (i>=160);
  }
}
