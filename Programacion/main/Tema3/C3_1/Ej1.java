
/*
* Multiplicación de dos números.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema3.C3_1;

public class Ej1 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        String numero = System.console().readLine();
        double num1 = Double.parseDouble( numero );
        System.out.print("Introduce otro número: ");
        numero = System.console().readLine();
        double num2 = Double.parseDouble( numero );
        System.out.println("El resultado de la multiplicación es: "+(num1*num2));
    }
}
