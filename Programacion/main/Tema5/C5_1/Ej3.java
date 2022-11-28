
/*
*   Calcular y mostrar por pantalla la suma y el producto de los 10 primeros números naturales.
*
*   @author Luis Miguel García Sevilla 1º DAM.
* */

package Tema5.C5_1;

public class Ej3 {
  public static void main(String[] args) {
    int suma = 0;
    int mult = 1;
    for (int i = 1; i <= 10; i++){
      suma = suma + i;
      mult = mult * i;
    }
    System.out.println("La suma de los 10 primeros números naturales es: "+suma);
    System.out.println("La multiplicación de los 10 primeros números naturales es: "+mult);
  }
}
