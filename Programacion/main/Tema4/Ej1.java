
/*
 * Programa que da la asignatura de la prmera hora de el dia solicitado.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4;

import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el dia para saber que asignatura hay a primera hora: ");
    String dia = s.next().toLowerCase();
    String asignatura;
    switch (dia){
      case ("lunes"):
        asignatura = "Sistemas Informáticos";
        break;
      case "martes":
        asignatura = "Programación";
        break;
      case "miercoles":
        asignatura = "Sistemas Informáticos";
        break;
      case "jueves":
        asignatura = "Programación";
        break;
      case "viernes":
        asignatura = "Programación";
        break;
      default:
        asignatura = "Este dia no hay clase";
    }
    System.out.println("El "+dia+" a primera hora hay "+asignatura+".");
  }
}
