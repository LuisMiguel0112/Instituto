
/*
 * Ejemplo 1 - Números aleatorios
 *
 * @author Luis Miguel García Sevilla - 1º DAM
 */

package Tema6.EjemploNumeroAleatorio;

public class Ejemplo1 {
  public static void main(String[] args) {
    System.out.println("Quince números aleatorios:\n");
    for (int i = 1; i < 16; i++) {
      System.out.println(Math.random());
    }
  }
}