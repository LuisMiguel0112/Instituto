
/*
 * Ejemplo 2 - Números aleatorios
 * 
 * @author Luis Miguel García Sevilla - 1º DAM
 */

package Tema6.EjemploNumeroAleatorio;

public class Ejemplo2 {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 0 y 15");
    System.out.println("(con decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.println( Math.random()*16 + " ");
    }
  }
}
