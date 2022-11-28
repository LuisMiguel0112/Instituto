
/*
*   Calcular el valor de A elevado a B sin usar el operador Math.
*
*   @author Luis Miguel García Sevilla 1º DAM.
* */

package Tema5.C5_1;

import java.util.Scanner;

public class Ej5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("introduce la base: ");
    int base = s.nextInt();
    int num = base;
    System.out.print("Introduce e exponente: ");
    int exp = s.nextInt();
    for (int i = 1; i < exp; i++){
      num = num*base;
    }
    System.out.println("El número "+base+" elevado a "+exp+" es: "+num);
  }
}
