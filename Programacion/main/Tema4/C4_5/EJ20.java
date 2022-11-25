
/*
*   Comprobar si un número es capicúa. Máx 5 cifras.
*
*   @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema4.C4_5;

import java.util.Scanner;

public class EJ20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //  booleano como filtro.
    boolean capicua = false;
    //  comprobadores.
    int comprobador1;
    int comprobador2;
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
        capicua = true;
      }
      if ((num<100)&&(!capicua)){ //  Dos cifras.
        if ((num/10)==(num%10)){
          capicua = true;
        }
      }
      if ((num<1000)&&(!capicua)){  //  Tres cifras.
        if ((num/100)==(num%10)){
          capicua = true;
        }
      }
      if ((num<10000)&&(!capicua)){ //  Cuatro cifras.
        comprobador1 = (num/10)%10;
        comprobador2 = (num/100)%10;
        if (((num/1000)==(num%10))&&(comprobador1)==(comprobador2)){
          capicua = true;
        }
      }
      if (!capicua){  //  Cinco cifraas.
        comprobador1 = (num/10)%10;
        comprobador2 = (num/1000)%10;
        if (((num/10000)==(num%10))&&(comprobador1)==(comprobador2)){
          capicua = true;
        }
      }
        if (capicua){
          System.out.println("El número "+num+" es capicúa.");
        }else System.out.println("El número "+num+" no es capicúa.");
    }else System.out.println("El número introducido no es válido (máx 5 cifras).");
  }
}
