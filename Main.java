import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int op;

        Hilo1 h1 = new Hilo1();



        System.out.println("Quiere Usar Un Hilo?");
        System.out.println("""
                1-Si
                2-No
                """);
        op=t.nextInt();


        switch (op) {
            case 1:
                h1.start();
                break;
                case 2:
                    System.out.println("Oks, no lo pruebes pero que malo");
                    break;
            default:
                System.out.println("Ingrese Opcion De Nuevo");

        }



    }
}