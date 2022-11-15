
/*
 * Dar buenos dias/tardes/noches segun la hora introducida.
 *
 * @author Luis Miguel García Sevila - 1º DAM.
 * */

package Tema4;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("¿Qué hora es?: ");
    int hora = s.nextInt();
    if((hora>=6)&&(hora<=12)){
      System.out.println("¡Buenos dias!");
    } else if ((hora>=13)&&(hora<=20)) {
      System.out.println("¡Buenas tardes!");
    } else {
      System.out.println("¡Buenas noches!");
    }
  }
}
