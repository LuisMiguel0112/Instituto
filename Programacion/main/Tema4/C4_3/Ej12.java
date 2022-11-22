
/*  Examen tipo test.
 *
 *  @author Luis Miguel García Sevilla - 1º DAM.
 * */

package Tema4.C4_3;

import java.util.Scanner;

public class Ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int aciertos = 0;
    int fallos = 0;
    System.out.println("Completa el siguente test de 10 preguntas los fallos restan 0.25; Si no sabes la respuesta introduce cualquier cosa que no sea a,b o c.");
    // Pregunta 1.
    System.out.println("¿Cuál de los siguientes es un lenguaje de programacón?\na) Mysql.\nb) html.\nc) Java.");
    System.out.print("Respuesta (a/b/c): ");
    String respuesta = s.next();
    switch (respuesta){
      case "a","b":
        System.out.println("¡Error! La respuesta correcta es la c)");
        fallos += 1;
        break;
      case "c":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 2.
    System.out.println("¿Qué es un Algoritmo?\na) Lo mismo que un Logaritmo.\nb) Una sucesión de instrucciónes ordenada y finita que resuelven un problema.\nc) Una sucesión de instrucciones escritas en un lenguaje de programación.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "a","c":
        System.out.println("¡Error! La respuesta correcta es la b)");
        fallos += 1;
        break;
      case "b":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 3.
    System.out.println("¿Cuál de los siguientes es un lenguaje de marcas?\na) html.\nb) python.\nc) C++.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "b","c":
        System.out.println("¡Error! La respuesta correcta es la a)");
        fallos += 1;
        break;
      case "a":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 4.
    System.out.println("¿Qué es un IDE?\na) Entorno integrado de desarrollo.\nb) Instruccion de ejemplo desarrollada.\nc) Ambas son correctas.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "b","c":
        System.out.println("¡Error! La respuesta correcta es la a)");
        fallos += 1;
        break;
      case "a":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 5.
    System.out.println("¿Qué es un programa informático?\na) Una emisión de la televisión.\nb) La codificación de un algoritmo en un lenguaje de programación.\nc) Cualquier texto escrito en un lenguaje de programación.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "a","c":
        System.out.println("¡Error! La respuesta correcta es la b)");
        fallos += 1;
        break;
      case "b":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 6.
    System.out.println("¿Cual es el riesgo de un accidente de probabilidad baja y consecuencias leves?\na) Trivial.\nb) Intolerable.\nc) Bajo.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "b","c":
        System.out.println("¡Error! La respuesta correcta es la a)");
        fallos += 1;
        break;
      case "a":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 7.
    System.out.println("Una comparación AND devuelve True cuando las posibilidades son:\na) True y False.\nb) False y False.\nc) True y True.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "a","b":
        System.out.println("¡Error! La respuesta correcta es la c)");
        fallos += 1;
        break;
      case "c":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 8.
    System.out.println("Una comparación OR devuelve True cuando las posibilidades son:\na) True y False.\nb) False y False.\nc) Ambas son correctas.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "b","c":
        System.out.println("¡Error! La respuesta correcta es la a)");
        fallos += 1;
        break;
      case "a":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 9.
    System.out.println("Una comparación AND NOT devuelve True cuando las posibilidades son:\na) True y False.\nb) False y False.\nc) True y True.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "b","c":
        System.out.println("¡Error! La respuesta correcta es la a)");
        fallos += 1;
        break;
      case "a":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    // Pregunta 10.
    System.out.println("Al declarar una variable que contenga un número entero en Java ¿Qué tenemos que añadir delante del nombre?\na) String.\nb) float.\nc) int.");
    System.out.print("Respuesta (a/b/c): ");
    respuesta = s.next();
    switch (respuesta){
      case "a","b":
        System.out.println("¡Error! La respuesta correcta es la c)");
        fallos += 1;
        break;
      case "c":
        System.out.println("¡Correcto!");
        aciertos += 1;
        break;
      default:
        System.out.println("Respuesta no válida.");
        break;
    }
    double nota = ((aciertos-(fallos*0.25)));
    System.out.println("Test terminado has tenido "+aciertos+" aciertos y "+fallos+" fallos, por lo que tu nota es: "+nota+".");
  }
}
