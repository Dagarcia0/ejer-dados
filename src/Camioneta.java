public class Camioneta extends Vehiculo{
    private int capacidad;

    public Camioneta(){

    }

    public Camioneta(String marca, String modelo, int año, double precioDia, boolean disponible, int capacidad) {
        super(marca, modelo, año, precioDia, disponible);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "capacidad=" + capacidad + "KG" + // la capacidad en KG
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioDia=" + precioDia +
                ", disponible=" + (disponible ? "SI" : "NO")+
                '}';
    }

    public void mostaraDetalles() {
        System.out.println(this.toString());
    }
}
