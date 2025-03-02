import java.util.Random;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner la entrada al usuario..
        Random random =new Random();//nums aleatorios

        boolean continuar = true;
        while (continuar){
            int x = random.nextInt(100)+1; //x es el primer num
            int y = random.nextInt(100)+1; //y es segundo num

            System.out.println("El numero 1: " + x);
            System.out.println("El numero 2: "+ y);

            System.out.println(" Esta Calculadora cuenta con las siguientes "
            + " operaciones logicas ");
            System.out.println("+, -, *, /, ^, %");
            System.out.println("escribe alguno de estos signos que desees usar");
            System.out.println("para iniciar la operacion deseada");
            String operacion = scanner.next();

            //operaciones que estamos ulizando
            double resultado = 0;
            boolean operacion_valida = true;

            switch (operacion) {
                case "+":
                    resultado = x + y;
                    break;
                case "-":
                    resultado = x - y;
                    break;
                case "*":
                    resultado = x * y;
                    break;
                case "/":
                    if (y != 0) {
                        resultado = (double) x / y;
                    }else {
                        System.out.println("Error: division por 0");
                        operacion_valida = false;
                    }
                    break;
                case "^":
                    resultado = Math.pow(x, y);//potencia
                    break;
                case "%":
                    resultado = x % y; //porcentaje
                    break;
                default:
                    System.out.println("Opción inválida.");
                    operacion_valida = false;
            }
            if (operacion_valida){
                System.out.println("Resultado de la operacion es: " + resultado);
            }
            System.out.println("¿deseas hacer otra operacion?" +
                    "¿si o no?");
            String respuesta= scanner.next();
            continuar = respuesta.equalsIgnoreCase("si");//respuesta.equalsIgnoreCase
            //ignora las mayusculas y las minuculas, rediendose solo a la respuesta.
        }
        System.out.println(" espero que tu experiencia alla sido satisfactoria "+
                "gracias por usar calculadora :)");
        scanner.close();
    }
}