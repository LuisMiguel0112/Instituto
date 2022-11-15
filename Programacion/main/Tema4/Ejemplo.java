
/*
 * Ejemplo condicionales; Adivinar un color y lengua oficial de un país.
 *
 * @author Luis Miguel García Sevila - 1º DAM.
 * */

package Tema4;

import java.util.Scanner;

public class Ejemplo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String color = "rojo";  // color que debe adivinar.
    String lengua = "aleman";
    System.out.print("Introduce el color que crees: ");
    String rColor = s.next().toLowerCase(); // color respuesta.
    if(rColor.equals(color)){
      System.out.println("¡Has adivinado el color!");
    } else{
      System.out.println("Has fallado el color.");
    }
    System.out.print("¿Cual es la lengua oficial de Alemania? Respuesta: ");
    String rLengua = s.next().toLowerCase();
    if(rLengua.equals(lengua)){
      System.out.println("¡Has adivinado la lengua oficial!");
    } else{
      System.out.println("Has fallado la lengua oficial.");
    }
  }
}
