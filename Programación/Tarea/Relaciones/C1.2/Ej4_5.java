/*
 * Luis Miguel García Sevilla 1º DAM Tarde.
 * Este programa muestra mi horario de clase.
*/

public class Ej4_5 {
    public static void main(String[] args) {
        System.out.println("\033[30m              ----------------------------------------------------------------------------------------");
        System.out.println("              |\033[37m     Horas     \033[30m|\033[37m    Lunes         Martes       Miercoles      Jueves        Viernes   \033[30m|");
        System.out.println("              ----------------------------------------------------------------------------------------");
        System.out.printf("%15s %15s %3s %15s %20s %16s %20s %13s %1s","|","\033[37m15:15 - 16:15","\033[30m|","\033[94mSist.Inf","\033[93mProgramación","\033[94mSist.Inf","\033[93mProgramación","Programación","\033[30m|\n");
        System.out.printf("%15s %15s %3s %15s %13s %14s %22s %13s %1s","|","\033[37m16:15 - 17:15","\033[30m|","\033[93mProgramación","Programación","\033[95mFOL","\033[93mProgramación","Programación","\033[30m|\n");
        System.out.printf("%15s %15s %3s %15s %16s %16s %20s %13s %9s","|","\033[37m17:15 - 18:15","\033[30m|","\033[93mProgramación","\033[96mL.Marca","\033[95mFOL","\033[92mB.Datos","B.Datos","\033[30m|\n");
        System.out.println("              ----------------------------------------------------------------------------------------");
        System.out.printf("%15s %15s %3s %12s %21s %20s %16s %13s %9s","|","\033[37m18:30 - 19:30","\033[30m|","\033[95mFOL","\033[96mL.Marca","\033[91mE.Desarrollo","\033[92mB.Datos","B.Datos","\033[30m|\n");
        System.out.printf("%15s %15s %3s %14s %19s %20s %16s %18s %9s","|","\033[37m19:30 - 20:30","\033[30m|","\033[92mB.Datos","\033[94mSist.Inf","\033[91mE.Desarrollo","\033[94mSist.Inf","\033[96mL.Marca","\033[30m|\n");
        System.out.printf("%15s %15s %3s %14s %19s %20s %16s %18s %9s","|","\033[37m20:30 - 21:30","\033[30m|","\033[92mB.Datos","\033[94mSist.Inf","\033[91mE.Desarrollo","\033[94mSist.Inf","\033[96mL.Marca","\033[30m|\n");
        System.out.println("\033[30m              ----------------------------------------------------------------------------------------");
    }
}