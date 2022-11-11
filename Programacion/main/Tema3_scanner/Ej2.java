
/*
 * Transformación de euros a pesetas.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema3_scanner;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de euros que quiere convertir: ");
        double euros = s.nextDouble();
        double valorPesetas = 166.3860;
        int pesetas = (int)(euros*valorPesetas);
        System.out.println(euros+" euros son "+(pesetas)+" pesetas.");
    }
}
