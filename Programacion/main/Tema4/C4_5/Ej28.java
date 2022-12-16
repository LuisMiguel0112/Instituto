
/*
 *   Juego piedra, papel y tijera.
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 */

package Tema4.C4_5;

import java.util.Scanner;

public class Ej28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada1 = s.nextLine();
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada2 = s.nextLine();
    if (jugada1.equals(jugada2)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch(jugada1) {
        case "piedra":
          if (jugada2.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (jugada2.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (jugada2.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + ganador);
    }
  }
}