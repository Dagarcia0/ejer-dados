import java.util.*;
public class SistemAlquiler {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public SistemAlquiler(){

    }

    //metodo para el registro de vehiculos
    public void registrarVehiculo(Vehiculo v) {
        vehiculos.add(v);
        System.out.println("Vehículo registrado: " + v);
    }

    // metodo para el registro de las camionetas
    public void registrarCliente(Cliente c) {
            clientes.add(c);
        System.out.println("Cliente registrado: " + c);
    }

    public void vehiculosDisponibles(){
        for(Vehiculo v : vehiculos){
            if (v.isDisponible()) {
                v.mostaraDetalles();
            }
        }
    }
    public void alquilarVehiculo(String nombreCliente, String modeloVehiculo, int dias) {
        Cliente cliente = clientes.stream() //stream para que recorrer todad la lista
                .filter(c -> c.getNombre().equalsIgnoreCase(nombreCliente)) // Compara nombres ignorando mayúsculas  y minúsculas.
                .findFirst().orElse(null); // i no encuentra un cliente, retorna null.

        if (cliente == null) {
            System.out.println("Cliente no registrado.");
            return;
        }

        for (Vehiculo v : vehiculos) {
            if (v.isDisponible() && v.modelo.equalsIgnoreCase(modeloVehiculo)) {
                v.alquilar();
                System.out.println("Alquiler exitoso. Costo total: $" + v.calcularCosto(dias));
                return;
            }
        }
        System.out.println("Vehículo no disponible.");
    }

    //metodo para devolver el vehiculo nuevamente...
    public void devolverVehiculo(String modeloVehiculo) {
        for (Vehiculo v : vehiculos) {
            if (!v.isDisponible() && v.modelo.equalsIgnoreCase(modeloVehiculo)) {
                v.devolver();
                System.out.println("Vehículo devuelto correctamente.");
                return;
            }
        }
        System.out.println("No se encontró el vehículo alquilado.");
    }




    public SistemAlquiler(List<Vehiculo> vehiculos, List<Cliente> clientes) {
        this.vehiculos = vehiculos;
        this.clientes = clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "SistemAlquiler{" +
                "vehiculos=" + vehiculos +
                ", clientes=" + clientes +
                '}';
    }
}

