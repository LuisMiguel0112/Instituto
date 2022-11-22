
/*  Mostrar el horóscopo a partir del día y el mes de nacimiento.
 *
 *  @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_3;

import java.util.Scanner;

public class EJ10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String horoscopo = "";
    boolean valida = true;
    System.out.print("Introduce tu mes de nacimiento: ");
    String mes = s.next().toLowerCase();
    System.out.print("Introduce tu dia de nacimiento: ");
    int dia = s.nextInt();
    switch (mes) {
      case "enero":
        if (dia < 20) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break;
      case "febrero":
        if (dia < 16) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
      case "marzo":
        if (dia < 11) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;
      case "abril":
        if (dia < 18) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break;
      case "mayo":
        if (dia < 13) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break;
      case "junio":
        if (dia < 21) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        }
        break;
      case "julio":
        if (dia < 20) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        }
        break;
      case "agosto":
        if (dia < 10) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case "septiembre":
        if (dia < 16) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
      case "octubre":
        if (dia < 30) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
      case "noviembre":
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
      case "diciembre":
        if (dia < 17) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      default: valida = false;
        System.out.println("Ese mes no existe");
    }
    if (valida){
      System.out.println("Tu horóscopo es: "+horoscopo+".");
    }
  }
}

