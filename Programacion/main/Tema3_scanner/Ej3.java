
/*
 * Transformación de pesetas a euros.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de pesetas que quiere convertir: ");
    int pesetas = s.nextInt();
    double valorEuros = 166.3860;
    double euros = (pesetas/valorEuros);
    System.out.println(pesetas+" pesetas son "+(euros)+" euros.");
  }
}
