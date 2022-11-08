
/**
 * Lectura de datos desde teclado.
 *
 * @author Luis Miguel García Sevilla - 1º DAM.
 */

package Tarea.C3_1;

public class LeeNumeros {   // Declaración de la clase LeeNumeros.

    public static void main(String[] args) {

        System.out.print("Por favor, introduce un número: ");   // Imprime el texto por pantalla.
        String linea = System.console().readLine(); // Asigna el valor introducido por teclado a la variable linea.
        double primerNumero = Double.parseDouble( linea );   // Convierte el valor de linea en Int y lo asigna a primerNumero.
        System.out.print("introduce otro, por favor: ");    // Imprime en consola el texto.
        linea = System.console().readLine();    // Asigna el valor introducido por teclado a la variable linea.
        double segundoNumero = Double.parseDouble( linea );  // Convierte el valor de linea y lo asigna a segundoNumero.
        double total = (2 * primerNumero) + segundoNumero; // Opera y asigna el valor a la variable total.
        System.out.print("El primer número introducido es " + primerNumero);    // Muestra el valor de primerNumero.
        System.out.println(" y el segundo es " + segundoNumero);    // Muestra el valor de segundoNumero.
        System.out.print("El doble del primer número más el segundo es "+ total);  // Muestra el valor de total.
    }
}

