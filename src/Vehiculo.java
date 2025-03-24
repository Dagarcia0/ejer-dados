public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precioDia;
    protected boolean disponible;

    // Constructor vacío
    protected Vehiculo() {
    }

    // Constructor corregido
    public Vehiculo(String marca, String modelo, int año, double precioDia, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioDia = precioDia;
        this.disponible = disponible; // Aquí sí usamos el valor recibido
    }

    // Método para alquilar el vehículo
    public void alquilar() {
        this.disponible = false; // El vehículo ya no está disponible
    }

    // Método para devolver el vehículo
    public void devolver() {
        this.disponible = true; // Ahora el vehículo está disponible
    }

    // M
    public double calcularCosto(int dias) {
        double total = dias * precioDia;
        if (dias > 7) {
            total *= 0.9; // Aplica 10% de descuento si es más de 7 días
        }
        return total;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostaraDetalles(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioDia=" + precioDia +
                ", disponible=" + (disponible ? "Sí" : "No") + // Forma compacta de if-else
                '}';
    }
}
