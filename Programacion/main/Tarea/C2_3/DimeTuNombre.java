
/*
* Lectura de dato por teclado.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tarea.C2_3;

public class DimeTuNombre {
	public static void main(String[] args) {
		System.out.print("Por favor, dime cómo te llamas: ");
		String nombre = System.console().readLine();
		System.out.print("Dime tu apellido: ");
		String apellido = System.console().readLine();
		System.out.println("Hola " + nombre + " " + apellido +", ¡encantado de conocerte!");
	}
}
