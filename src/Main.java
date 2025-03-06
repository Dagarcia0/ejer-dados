import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //variables...
        int max = 6;
        int min = 1;
        int ptos = 0;
        int vidas = 5;
        int ramnum = 0;
        boolean play = true;
        String continuar;

        //Ramdom y Scanner
        Scanner scanner = new Scanner(System.in); //scanner la entrada al usuario..
        Random random = new Random(); // num aleatorio

        while (play) {
            ramnum = random.nextInt((max - min + 1)) + min;
            System.out.println("Numero al azar es:" + ramnum);

            System.out.println("escribe la letra a para continuar");
            continuar = scanner.next();

            if(continuar.equals("a")) {


                int vuelta = switch (ramnum) {
                    case 1 -> vidas -= 1;
                    case 2, 4 -> ptos += 1;
                    case 3, 5 -> 0;
                    default -> ptos += 3;
                };
                System.out.println("puntos = " + ptos );
                System.out.println("vidas = " + vidas );

                if (vidas == 0) {
                    System.out.println("perdiste");
                    break;
                }
                if (ptos >= 10)
                    System.out.println("ganaste");
                break;

            }
        }
        scanner.close();
    }
}