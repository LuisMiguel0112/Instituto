
/*
*   Control de acceso a una caja fuerte..
*
*   @author Luis Miguel García Sevilla - 1º DAM.
*/

package Tema5.C5_2;

import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int intento = 1;
    boolean abierta = false;
    while ((intento<=4)&&(!abierta)){
      System.out.print("\033[97mIntroduce la contraseña (intento: \033[33m"+intento+"\033[97m/4): ");
      int combinacion = s.nextInt();
      if (combinacion == 2714){
        abierta = true;
      }else {
        intento++;
        System.out.println("Contraseña equivocada.");
      }
    }
    if (abierta){
      System.out.println("Caja fuerte desbloqueada.");
    }else System.out.println("Intento 4/4 fallido. Sistema Bloqueado.");
  }
}
