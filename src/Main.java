import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    -------------------------------
                    1. REGISTRAR EMPLEADO ASALARIADO
                    2. REGISTRAR EMPLEADO POR COMISIÓN
                    3. MOSTRAR TODOS LOS EMPLEADOS
                    4. SALIR
                    -------------------------------
                    """);
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("REGISTRANDO EMPLEADO ASALARIADO...");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese el salario mensual: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    empleados.add(new EmpleadoAsalariado(nombre, id, salario));
                    System.out.println("Empleado asalariado agregado con éxito.");
                }
                case 2 -> {
                    System.out.println("REGISTRANDO EMPLEADO POR COMISIÓN...");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de ventas realizadas: ");
                    int ventas = scanner.nextInt();
                    System.out.print("Ingrese la comisión por venta: ");
                    double comision = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer

                    empleados.add(new EmpleadoPorComision(nombre, id, ventas, comision));
                    System.out.println("Empleado por comisión agregado con éxito.");
                }
                case 3 -> {
                    System.out.println("LISTA DE EMPLEADOS REGISTRADOS:");
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        for (Empleado e : empleados) {
                            System.out.println(e);
                            System.out.println("Salario: $" + e.calcularPago());
                            System.out.println("------------------------");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                }
                default -> System.out.println("OPCIÓN INVÁLIDA. INTENTE DE NUEVO.");
            }
        }
        scanner.close();
    }
}
