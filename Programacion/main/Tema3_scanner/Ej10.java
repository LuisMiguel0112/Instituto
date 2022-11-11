
/*
* Conversor de Mb a Kb.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema3_scanner;

import java.util.Scanner;

public class Ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce los Mb que quieres convertir: ");
    int mb = s.nextInt();
    System.out.println(mb+" megabits son "+(mb*1024)+" kilobits.");
  }
}
