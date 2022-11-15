
/*
 * Mostrar el dia correspondiente al número introducido.
 *
 * @author Luis Miguel García Sevila - 1º DAM.
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
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miercoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia = "Sabado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "No existe ese día.";
    }
    System.out.println("El dia "+numero+" es "+dia+".");
  }
}
