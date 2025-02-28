import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso = 0;

        double estatura = 0;

        double imc = 0.0;

        System.out.println("escribe tu peso: ");

        Scanner scaner = new Scanner(System.in);
        peso = scaner.nextDouble();

        System.out.println("escribe tu estatura: ");
        estatura= scaner.nextDouble();

        imc = peso/(Math.pow(estatura,2));

        if (imc<18.5){
            System.out.println("Tienes bajo peso, come mas hermos@");
        }
        else if(imc<=24.9){
            System.out.println("Te encuentras en un peso normal :)");

        }else if (imc<=26.9){
            System.out.println("Tienes sobrepeso grado I");
        }
        else if (imc<=29.9){
            System.out.println("Tienes sobrepeso grado II");
        }
        else if (imc<=34.9){
            System.out.println("Tienes obecidad de tipo I");
        }
        else if (imc<=39.9){
            System.out.println("Tienes obecidad de tipo II");
        }
        else if (imc<=49.9){
            System.out.println("Tienes obecidad de tipo III (Morbida)");
        }
        else if (imc > 50){
            System.out.println("Tienes obecidad de tipo IV (Extrema)");
        }



    }
}