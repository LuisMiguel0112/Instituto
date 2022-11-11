/*
 * Multiplicación de dos números.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */
package Tema3_scanner;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num1 = s.nextDouble();
        System.out.print("Introduce otro número: ");
        double num2 = s.nextDouble();
        System.out.println("El resultado de la multiplicación es: "+(num1*num2)+".");
    }
}
