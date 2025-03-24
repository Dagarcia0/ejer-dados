import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        SistemAlquiler sistema = new SistemAlquiler();
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    -------------------------------
                    -----EMPRESA EL RAYO MCQUEEN-----
                    1. REGISTRAR AUTO.
                    2. REGISTRAR CAMIONETA.
                    3. REGISTRAR CLIENTE.
                    4. VEHICULOS DISPONIBLES.
                    5. ALQUILAR VEHICULO.
                    6. DEVOLVER VEHICULO.
                    7. SALIR.
                    -------------------------------
                    """);
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Marca: ");
                    String marca = teclado.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.print("Año: ");
                    int año = teclado.nextInt();
                    System.out.print("Precio por día: ");
                    double precio = teclado.nextDouble();
                    System.out.print("Número de puertas: ");
                    int numPuertas = teclado.nextInt();
                    teclado.nextLine();

                    sistema.registrarVehiculo(new Auto(marca, modelo, año, precio, true, numPuertas));
                    System.out.println("Auto registrado.");
                }
                case 2 -> {
                    System.out.print("Marca: ");
                    String marca = teclado.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.print("Año: ");
                    int año = teclado.nextInt();
                    System.out.print("Precio por día: ");
                    double precio = teclado.nextDouble();
                    System.out.print("Capacidad de carga (kg): ");
                    int carga = teclado.nextInt();
                    teclado.nextLine();

                    sistema.registrarVehiculo(new Camioneta(marca, modelo, año, precio, true, carga));
                    System.out.println("Camioneta registrada.");
                }
                case 3 -> {
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Cédula: ");
                    int cedula = teclado.nextInt();
                    System.out.print("Licencia de conducir: ");
                    int licencia = teclado.nextInt();
                    teclado.nextLine();

                    sistema.registrarCliente(new Cliente(nombre, cedula, licencia));
                    System.out.println("Cliente registrado.");
                }
                case 4 -> {
                    sistema.vehiculosDisponibles();
                }
                case 5 -> {
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = teclado.nextLine();
                    System.out.print("Modelo del vehículo a alquilar: ");
                    String modeloVehiculo = teclado.nextLine();
                    System.out.print("Cantidad de días: ");
                    int dias = teclado.nextInt();
                    teclado.nextLine(); //

                    sistema.alquilarVehiculo(nombreCliente, modeloVehiculo, dias);
                }
                case 6 -> {
                    System.out.print("Modelo del vehículo a devolver: ");
                    String modeloVehiculo = teclado.nextLine();
                    sistema.devolverVehiculo(modeloVehiculo);
                }
                case 7 -> {
                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                }
                default -> System.out.println("OPCIÓN INVÁLIDA. INTENTE DE NUEVO.");
            }
        }
        teclado.close();
    }
}

