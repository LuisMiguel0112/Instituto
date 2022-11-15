
/*
 * Calcular el salario semanal de un trabajador teniendo en cuenta las horas ordinarias y extras.
 *
 * @author Luis Miguel García Sevila - 1º DAM.
 * */

package Tema4;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horas = s.nextInt();
    int salario;
    if(horas<41){
      salario = (horas*12);
    }else{
      salario = (480+((horas-40)*16));
    }
    System.out.println("El sueldo semanal que le corresponde es de "+salario+" euros");
  }
}
