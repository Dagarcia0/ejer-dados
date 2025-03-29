public abstract class Empleado implements Pagable {
    protected String nombre;
    protected int id;

    public Empleado(){

    }
    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    // metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println(this);
    }
}
