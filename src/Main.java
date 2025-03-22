import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Empleado> listaempleados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    -------------------------------
                    -----EMPRESA LUIS GARABITO-----
                    1. TIPO DE EMPLEADO "PLANTA"
                    2. TIPO DE EMPLEADO "HORAS"
                    3. LISTA DE EMPLEADOS DE LA EMPRESA
                    4. SALIR
                    -------------------------------
                    """);
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1->{
                    System.out.println("CREANDO EMPLEADO DE PLANTA...");
                    System.out.println("-------------------------------");
                    System.out.println("ESCRIBE TU NOMBRE");
                    String nombre = teclado.nextLine();
                    System.out.println("ESCRIBE TU EDAD");
                    int edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("TU SALARIO FIJO ES DE: 2.100.000 MENSUAL");

                    listaempleados.add(new EmpleadoPlanta(nombre, edad));
                    System.out.println("EMPLEADO DE PLANTA, CREADO EXITOSAMENTE...");
                    System.out.println("VIENVENIDO A LA EMPRESA LUIS GARABITO");
                }
                case 2->{
                    System.out.println("CREANDO EMPLEADO POR HORAS...");
                    System.out.println("-------------------------------");
                    System.out.println("ESCRIBE TU NOMBRE");
                    String nombre = teclado.nextLine();
                    System.out.println("ESCRIBE TU EDAD");
                    int edad = teclado.nextInt();
                    System.out.println("HORAS TRABAJADAS: ");
                    int horasTrabajadas = teclado.nextInt();
                    teclado.nextLine();
                    double salario = horasTrabajadas * 98_000;
                    System.out.println("POR 1 HORA DE TRABAJO GANAS 98.000");
                    System.out.println("TU SALARIO TOTAL ES: " + salario);


                    listaempleados.add(new EmpleadosHora(nombre, edad, horasTrabajadas));
                    System.out.println("EMPLEADO POR HORAS, CREADO EXITOSAMENTE...");
                    System.out.println("VIENVENIDO A LA EMPRESA LUIS GARABITO");
                }

                case 3 ->{
                    System.out.println("LISTA DE EMPLEADOS:");
                    if (listaempleados.isEmpty()) {
                        System.out.println("NO HAY EMPLEADOS REGISTRADOS.");
                    } else {
                        for (Empleado empleado : listaempleados) {
                            System.out.println(empleado);
                        }
                    }
                }
                case 4->{
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                }
                default -> System.out.println("OPCIÓN INVÁLIDA. INTENTE DE NUEVO.");

            }

        } teclado.close();
    }
}