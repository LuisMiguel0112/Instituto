
/*
 * Calcular la media de tres notas introducidas.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4;

import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String categoria = "";
    System.out.print("Introduce primera nota: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce segunda nota: ");
    double nota2 = s.nextDouble();
    System.out.print("Introduce tercera nota: ");
    double nota3 = s.nextDouble();
    double media = (nota1+nota2+nota3)/3;
    if(media<5){
      categoria = "insufciente";
    }
    if((media>=5)&&(media<6)){
      categoria = "suficiente";
    }
    if((media>=6)&&(media<7)){
      categoria = "bien";
    }
    if((media>=7)&&(media<9)){
      categoria = "notable";
    }
    if(media>9){
      categoria = "sobresaliente";
    }
    System.out.println("La media de las tres notas es: "+media+" ("+categoria+").");
  }
}
