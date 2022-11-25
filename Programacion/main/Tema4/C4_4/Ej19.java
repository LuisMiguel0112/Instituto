
/*
 *   Mostrar el número de cifras de un número entero introducido por teclado (máx 5 cifras).
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_4;

import java.util.Scanner;

public class Ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cifras = 0;
    System.out.print("Introduce un número de máximo 5 cifras: ");
    int num = s.nextInt();
    //  Conversor de negativo a positivo.
    if (num<0){
      num = num*(-1);
    }
    //  comprobador si es un número de 5 cifras o menor.
    if (num<100000){
      //  Comparaciones para las distintas cifras.
      if (num<10){  //  una cifra.
        cifras = 1;
      }
      if (num<100){ //  Dos cifras.
        cifras = 2;
      }
      if (num<1000){  //  Tres cifras.
        cifras = 3;;
      }
      if (num<10000){ //  Cuatro cifras.
        cifras = 4;;
      }
      if (num<100000){
        cifras = 5;;
      }
      System.out.println("El número de cifras de "+num+" es: "+cifras);
    }else System.out.println("El número introducido no es válido (máx 5 cifras).");
  }
}
