
/*
 * Ejemplo 4 - Números aleatorios
 *
 * @author Luis Miguel García Sevilla - 1º DAM
 */

package Tema6.EjemploNumeroAleatorio;

public class Ejemplo4 {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 1 y 15 (sin decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.print( (int)(Math.random()*16 + 1) + " ");
    }
  }
}
