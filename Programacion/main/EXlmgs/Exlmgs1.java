/*
 * Ejercicio 1 - Examen.
 * 
 * @author Luis Miguel García Sevilla - 1º DAM - Tarde.
 */
import java.util.Scanner;

public class Exlmgs1 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
    // Declaración de variables
    int traslacion = 4;
    int rotacion = 365;
    int vRotacionT = 0;     //vueltas de rotacion totales
    int vTraslacionT = 0;  //vueltas de traslacion totales
    // Operaciones
    System.out.print("Introduce el número de años: ");
    int anos = s.nextInt();
    int vRotacion = anos*rotacion;
    int vTraslacion = anos*traslacion;
    System.out.println("La cantidad de vueltas de rotación dadas en "+anos+" años, es: "+vRotacion);
    System.out.println("La cantidad de vueltas de traslación dadas en "+anos+" años, es: "+vTraslacion);
    // Tabla
    System.out.println(" Años  V.Rotación  V.Traslación");
    System.out.println("================================");
    for(int i = 10; i<=anos; i= i+10){
      vRotacion = (i*rotacion);
      vTraslacion = (i*traslacion);
      System.out.println("  "+i+"     "+vRotacion+"     "+vTraslacion);
      }
  }
}

