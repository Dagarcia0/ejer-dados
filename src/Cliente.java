public class Cliente  {
    private String nombre;
    private int cedula;
    private int licConducir;

    public Cliente() {

    }

    public Cliente(String nombre, int cedula, int licConducir) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.licConducir = licConducir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getLicConducir() {
        return licConducir;
    }

    public void setLicConducir(int licConducir) {
        this.licConducir = licConducir;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", licConducir=" + licConducir +
                '}';
    }
}