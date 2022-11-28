
/*
*    Mostrar la suma de los números pares y la suma de impares de los números comprendidos entre 100 y 200.
*
*    @author Luis Miguel García Sevilla 1º DAM.
* */

package Tema5.C5_1;

public class Ej4 {
  public static void main(String[] args) {
    int par = 0;
    int imp = 0;
    for (int i = 100; i <= 200; i++){
      if (i%2 == 0){
        par = par+i;
      }else imp = imp+i;
    }
    System.out.println("La suma de los números pares entre 100 y 200 es: "+par);
    System.out.println("La suma de los números impares entre 100 y 200 es: "+imp);
  }
}
