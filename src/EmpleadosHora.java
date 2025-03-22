public class EmpleadosHora extends Empleado {
    private static final double pagoHora = 98_000;
    private int horasTrabajadas;

    public EmpleadosHora(String nombre, int edad, int horasTrabajadas) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        return pagoHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadosHora{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
