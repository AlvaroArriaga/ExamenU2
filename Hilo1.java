import java.util.Scanner;

public class Hilo1 extends Thread {
    Scanner t = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("A que kilometro Quiere Que Llegue El Coche");


        try {
            System.out.println("Ingrese km que quiere");
            int km = t.nextInt();
            for (int i = 0; i < km; i++) {

                Hilo1.sleep((long) 1000);
                System.out.println("El coche va en el kilometro"+ i);
            }


        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

        super.run();
    }
}
