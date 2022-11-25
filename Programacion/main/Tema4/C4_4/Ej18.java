
/*
 *   Mostrar la primera cifra de un número entero introducido por teclado (máx 5 cifras).
 *
 *   @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_4;

import java.util.Scanner;

public class Ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cFinal = 0;  //  Cifra final.
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
        cFinal = num;
      }
      if (num<100){ //  Dos cifras.
        cFinal = num/10;
      }
      if (num<1000){  //  Tres cifras.
        cFinal = num/100;
      }
      if (num<10000){ //  Cuatro cifras.
        cFinal = num/1000;
        }
      if (num<100000){
        cFinal = num/10000;
      }
      System.out.println("La primera cifra de "+num+" es: "+cFinal);
    }else System.out.println("El número introducido no es válido (máx 5 cifras).");
  }
}