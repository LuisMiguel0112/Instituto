
/*
 * Mostrar el dia correspondiente al número introducido.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_2;

import java.util.Scanner;

public class Ejemplo_switch {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para saber que día le corresponde: ");
    int numero = s.nextInt();
    String mes;
    String estacion ="";
    switch (numero){
      case 1:
        mes = "Enero";
        estacion = "Invierno";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 2:
        mes = "Febrero";
        estacion = "Invierno";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 3:
        mes = "Marzo";
        estacion = "Primavera";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 4:
        mes = "Abril";
        estacion = "Primavera";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 5:
        mes = "Mayo";
        estacion = "Primavera";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 6:
        mes = "Junio";
        estacion = "Verano";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 7:
        mes = "Julio";
        estacion = "Verano";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 8:
        mes = "Agosto";
        estacion = "Verano";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 9:
        mes = "Septiembre";
        estacion = "Otoño";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 10:
        mes = "Octubre";
        estacion = "Otoño";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 11:
        mes = "Noviembre";
        estacion = "Otoño";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      case 12:
        mes = "Diciembre";
        estacion = "Invierno";
        System.out.println("El mes "+numero+" es "+mes+" ("+estacion+").");
        break;
      default:
        System.out.println("No existe ese mes.");
    }
  }
}