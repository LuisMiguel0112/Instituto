
/*
* Circuito de paradas de tren, muestra provincias y localidades.
*
* @author Luis Miguel García Sevilla - 1º DAM.
* */

package Tema4.C4_2;

import java.util.Scanner;

public class Circuito {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String localidades = "";
    String provincias = "";
    boolean valida = true;
    System.out.println("\033[90m┌───────────────────────────────────────────────────────────────┐");
    System.out.println("\033[90m│ \033[97mMálaga -> \033[33m1;    \033[97m[Torre del Mar -> \033[33m2;              \033[97mNerja -> \033[33m3\033[97m] \033[90m│");
    System.out.println("\033[90m│ \033[97mGranada -> \033[33m4;   \033[97m[Almuñecar -> \033[33m5;                  \033[97mMotril-> \033[33m6\033[97m] \033[90m│");
    System.out.println("\033[90m│ \033[97mAlmería -> \033[33m7;   \033[97m[El Ejido -> \033[33m8;         \033[97mRoquetas de Mar -> \033[33m9\033[97m] \033[90m│");
    System.out.println("\033[90m│ \033[97mMurcia -> \033[33m10;   \033[97m[Cartagena -> \033[33m11;        \033[97mLos Alcázares -> \033[33m12\033[97m] \033[90m│");
    System.out.println("\033[90m│ \033[97mAlicante -> \033[33m13; \033[97m[Elche -> \033[33m14;                 \033[97mBenidorm -> \033[33m15\033[97m] \033[90m│");
    System.out.println("\033[90m│ \033[97mValencia -> \033[33m16; \033[97m[Sagunto -> \033[33m17;  \033[97mCastellón de la Plana -> \033[33m18\033[97m] \033[90m│");
    System.out.println("\033[90m└───────────────────────────────────────────────────────────────┘");
    System.out.print("\033[97mIntroduce el lugar de comienzo: ");
    int inicio = s.nextInt();
    switch (inicio){
      case 1:
        provincias += "\033[33mMálaga\033[97m, ";
      case 2:
        localidades += "\033[33mTorre del Mar\033[97m, ";
      case 3:
        localidades += "\033[33mNerja\033[97m, ";
      case 4:
        provincias += "\033[33mGranada\033[97m, ";
      case 5:
        localidades += "\033[33mAlmuñecar\033[97m, ";
      case 6:
        localidades += "\033[33mMotril\033[97m, ";
      case 7:
        provincias += "\033[33mAlmería\033[97m, ";
      case 8:
        localidades += "\033[33mEl Ejido\033[97m, ";
      case 9:
        localidades += "\033[33mRoquetas de Mar\033[97m, ";
      case 10:
        provincias += "\033[33mMurcia\033[97m, ";
      case 11:
        localidades += "\033[33mCartagena\033[97m, ";
      case 12:
        localidades += "\033[33mLos Alcázares\033[97m, ";
      case 13:
        provincias += "\033[33mAlicante\033[97m y ";
      case 14:
        localidades += "\033[33mElche\033[97m, ";
      case 15:
        localidades += "\033[33mBenidorm\033[97m, ";
      case 16:
        provincias += "\033[33mValencia\033[97m";
      case 17:
        localidades += "\033[33mSagunto\033[97m y ";
      case 18:
        localidades += "\033[33mCastellón de la Plana\033[97m";
        break;
      default:
        valida = false;
        System.out.println("Opción no valida. Introduzca del 1 al 18.");
    }
    if (valida) {
      System.out.println("-------------------------------------------------\nPasa por las siguentes provincias:\n" + provincias + ".\n Y por las siguentes localidades:\n" + localidades + ".");
    }
  }
}
