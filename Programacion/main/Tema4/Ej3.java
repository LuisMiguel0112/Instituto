
/*
 * Mostrar el dia correspondiente al número introducido.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4;

import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para saber que día le corresponde: ");
    int numero = s.nextInt();
    String dia;
    switch (numero){
      case 1:
        dia = "Lunes";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      case 2:
        dia = "Martes";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      case 3:
        dia = "Miercoles";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      case 4:
        dia = "Jueves";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      case 5:
        dia = "Viernes";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      case 6:
        dia = "Sabado";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      case 7:
        dia = "Domingo";
        System.out.println("El dia "+numero+" es "+dia+".");
        break;
      default:
        System.out.println("No existe ese día.");
    }
  }
}
