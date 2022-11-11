
/*
* Cálculo de salario semanal a traves de las horas.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema3_scanner;

import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número de horas que has trabajado esta semana: ");
    int horas = s.nextInt();
    System.out.println("Esta semana has trabajado "+horas+"h por lo que has ganado "+(horas*12)+"€.");
  }
}
