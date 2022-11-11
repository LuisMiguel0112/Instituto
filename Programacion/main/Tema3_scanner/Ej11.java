
/*
 * Conversor de Kb a Mb.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce los kb que quieres convertir: ");
    int kb = s.nextInt();
    System.out.println(kb+" kilobits son "+(kb/1024)+" megabits.");
  }
}
