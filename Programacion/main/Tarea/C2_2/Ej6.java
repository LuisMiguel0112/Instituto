
/*
* Cálculo del precio con IVA transformando el típo de variable.
*
* @author Luis Miguel García Sevilla - 1º DAM
* */

package Tarea.C2_2;

public class Ej6 {
    public static void main(String[] args) {
        double base = 100;
        double ivaPorcentage = 0.21;
        double iva = (base * ivaPorcentage);
        int precio = (int)(base + iva);
        System.out.println("El precio inicial del producto es: "+base+"€");
        System.out.println("El IVA es del 21%");
        System.out.println("Por tanto el precio final es: "+precio+"€");
    }
}
