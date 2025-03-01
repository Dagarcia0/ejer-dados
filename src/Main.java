import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a Apuesta y Gana!");

        int max = 3;
        int min = 1;
        int num;
        int pesos;
        boolean jugando = true;
        String respuesta;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de dinero que quieres apostar: ");
        pesos = scanner.nextInt();

        while (jugando) {
            Random numAle = new Random();
            num = numAle.nextInt(max - min + 1) + min; // Número aleatorio entre 1 y 3
            System.out.println("Tu número fue: " + num);

            if (num == 1) {
                pesos *= 2;
                System.out.println("Felicidades has duplicado tu dinero.");
                System.out.println("ahora puedes seguir apostando y ganar mas, ¿solo si quieres? ");
            } else if (num == 2) {
                pesos /= 2;
                System.out.println("Más suerte para la próxima, perdiste la mitad de tu dinero.");
                System.out.println("estas un poquito salado, si quieres puedes intentarlo otra vez");
            } else {
                pesos = 0;
                System.out.println("mas salado que un bulto de sal, dedicate mejor a trabar");
                System.out.println("Perdiste todo tu dinero Fin del juego.");
                break;
            }

            System.out.println("Tu saldo actual es: " + pesos + " pesos.");

            if (pesos == 0) { // Si ya no tiene dinero, se acaba el juego
                System.out.println(" a pedir un prestamo al banco si quieres seguir jugando ");
                System.out.println("No tienes dinero para seguir jugando. Fin del juego.");
                break;
            }

            System.out.print("¿Quieres seguir jugando? ¿si o no?: ");
            respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("no")) {
                jugando = false;
                System.out.println("Gracias por jugar con nosotros." +
                        " Tu saldo final es: " + pesos + " pesos.");
            }
        }

        scanner.close();
    }
}
