
/*
* Control capitulos 1, 2 y 3; Ejercicio 1.
* Convertir euros a pesetas.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Control1;

public class Ej1 {
  public static void main(String[] args) {
    double euros = 564.25;
    double vPesetas = 166.386;  // vPesetas coresponde al valor de 1 euro en pesetas.
    int pesetas = (int)(euros*vPesetas);
    System.out.println(euros+" euros son "+pesetas+" pesetas.");
  }
}
