
/*
 *   Mostrar los números múltiplos de 5 de 0 a 100 (while).
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 */

package Tema5.C5_2;

public class Ej2 {
  public static void main(String[] args) {
    int i = 0;
    while (i<=100){
      if (i%5 == 0){
        System.out.println(i);
      }
      i++;
    }
  }
}
