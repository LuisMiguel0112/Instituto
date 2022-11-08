
/*
 * Transformación de euros a pesetas.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tarea.C3_1;

public class Ej2 {
    public static void main(String[] args) {
        System.out.print("Introduzca la cantidad de euros que quiere convertir: ");
        String cantidad = System.console().readLine();
        double euros = Double.parseDouble(cantidad);
        double valorPesetas = 166.3860;
        int pesetas = (int)(euros*valorPesetas);
        System.out.println(cantidad+" euros son "+(pesetas)+" pesetas.");
    }
}
