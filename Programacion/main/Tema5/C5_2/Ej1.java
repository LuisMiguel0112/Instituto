
/*
*   Mostrar los números múltiplos de 5 de 0 a 100 (for).
*
*   @author Luis Miguel García Sevilla - 1º DAM.
*/

package Tema5.C5_2;

public class Ej1 {
  public static void main(String[] args) {
    for (int i = 0; i<=100; i++){
      if (i%5 == 0){
        System.out.println(i);
      }
    }
  }
}
