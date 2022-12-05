
/*  Mostrar los minutos que faltan para llegar al fin de semana.
 *
 *  @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_5;

import java.util.Scanner;

public class Ej22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un día de la semana (lunes - viernes): ");
    String dia = s.next();
    int nDia = 0;
    switch(dia) {
      case "lunes":
        nDia = 0;
        break;
      case "martes":
        nDia = 1;
        break;
      case "miércoles":
      case "miercoles":
        nDia = 2;
        break;
      case "jueves":
        nDia = 3;
        break;
      case "viernes":
        nDia = 4;
        break;
      default:
        System.out.print("Día incorrecto.");
    }
    System.out.println("Introduce la hora (hora y minutos)");
    System.out.print("Hora: ");
    int h = s.nextInt();  //  Horas.
    System.out.print("Minutos: ");
    int min = s.nextInt();
    int minTotal = 6660;
    int minActual = (nDia * 24 * 60) + (h * 60) + min;
    System.out.print("Faltan " + (minTotal - minActual) + " minutos para llegar al fin de semana.");
  }
}

