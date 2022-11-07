
/*
 * Luis Miguel García Sevilla 1º DAM Tarde.
 * Este programa muestra un dibujo de un monitor coloreado.
*/

public class Ej10 {
    public static void main(String[] args) {
        System.out.printf("%80s","\033[97m██████████████████████████████████████████████████\n");
        System.out.printf("%25s %49s","█","█\n");
        System.out.printf("%65s %29s","█\033[95m public class\033[93m HolaMundo \033[33m{","\033[37m█\n");
        System.out.printf("%105s %9s","█\033[95m     public static void\033[94m main\033[35m(\033[95mString\033[34m[] \033[91margs\033[35m) {","\033[37m█\n");
        System.out.printf("%91s %13s","█        System.out.\033[94mprintln\033[34m(\033[92m'Hola Mundo'\033[34m)\033[94m;","\033[37m█\n");
        System.out.printf("%30s %44s","█    }","█\n");
        System.out.printf("%27s %47s","█ }","█\n");
        System.out.printf("%25s %49s","█","█\n");
        System.out.printf("%72s %1s","█ ----------------------------------------------","█\n");
        System.out.printf("%41s %33s","█    > Hola Mundo","█\n");
        System.out.printf("%25s %49s","█","█\n");
        System.out.printf("%75s","██████████████████████████████████████████████████\n");
        System.out.printf("%54s","████████\n");
        System.out.printf("%58s","████████████████\n");
        System.out.printf("%70s","████████████████████████████████████████\n");
        }
}