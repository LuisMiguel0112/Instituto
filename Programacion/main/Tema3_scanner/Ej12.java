
/*
* Cálculo la nota necesaria en el segundo examen de la asignatura Programación para obtener la media deseada.
*
* @author Luis Miguel García Sevila - 1º DAM.
* */

package Tema3_scanner;

import java.util.Scanner;

public class Ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la nota del pirmmer examen: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce la media que quieres tener: ");
    double media = s.nextDouble();
    double nota2 = ((media-(nota1*0.40))/0.60);
    System.out.println("La nota necesaria en el segundo examen para tener un "+media+" de media es: "+nota2+".");
  }
}
