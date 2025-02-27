import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int num;

        Random ale = new Random();

        // Generar número de rondas aleatorio
        num = ale.nextInt((max - min + 1)) + min;
        System.out.println("El número de rondas es: " + num);

        int maxdado1 = 6;
        int mindado1 = 1;
        int numdado1;

        int maxdado2 = 6;
        int mindado2 = 1;
        int numdado2;

        int suma_dado1 = 0, suma_dado2 = 0;

        // Simulación de dado 1
        int nveces1 = 0;
        while (nveces1 < num) {
            numdado1 = ale.nextInt((maxdado1 - mindado1 + 1)) + mindado1;
            suma_dado1 += numdado1;
            System.out.println("N1: " + numdado1);
            nveces1++;
        }

        // Simulación de dado 2
        int nveces2 = 0;
        while (nveces2 < num) {
            numdado2 = ale.nextInt((maxdado2 - mindado2 + 1)) + mindado2;
            suma_dado2 += numdado2;
            System.out.println("N2: " + numdado2);
            nveces2++;
        }

        // los resultados mostrados por las sumas
        System.out.println("La suma de los primeros dados es: " + suma_dado1);
        System.out.println("La suma de los segundos dados es: " + suma_dado2);

        //Ganador
        if (suma_dado1 > suma_dado2) {
            System.out.println("El dado uno ganó.");
        } else if (suma_dado1 < suma_dado2) {
            System.out.println("El dado dos ganó.");
        } else {
            System.out.println("Empate.");
        }
    }
}


