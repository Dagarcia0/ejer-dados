import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al juego jugador X");
        System.out.println("¿Adivina el numero en que estoy pensado?");

        int max = 50;
        int min = 1;
        int num;
        int intentos = 3;
        int unnum;

        Random numAle = new Random();
        num = numAle.nextInt(max - min + 1) + min;

        Scanner scanner = new Scanner(System.in);

        while (intentos > 0) {
            System.out.println("Escribe un numero entre 1 y 50");
            unnum = scanner.nextInt();

            if (unnum < num) {
                System.out.println("el numero es mayor");
            } else if (unnum > num) {
                System.out.println("el numero es menor");
            } else {
                System.out.println("el numero es correcto");
                break;//para que termine el juego si llego a acertar el numero
            }
            intentos--;
            if (intentos > 0) {
                System.out.println("te quedan " + intentos + " intentos ");
            } else {
                System.out.println("te quedaste sin intentos, el numero era: " + num);
            }
        }
        scanner.close();
    }
}

