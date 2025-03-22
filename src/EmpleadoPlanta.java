public class EmpleadoPlanta extends Empleado{
    private static final double salarioFijo = 2_100_000;

    public EmpleadoPlanta() {
    }

    public EmpleadoPlanta(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }
    @Override
    public String toString() {
        return "EmpleadoPlanta{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}


