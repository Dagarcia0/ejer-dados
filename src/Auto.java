public class Auto extends Vehiculo{
    private int numPuertas;

    public Auto(){
    }

    public Auto(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Auto(String marca, String modelo, int año, double precioDia, boolean disponible, int numPuertas) {
        super(marca, modelo, año, precioDia, disponible);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numPuertas=" + numPuertas +
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
