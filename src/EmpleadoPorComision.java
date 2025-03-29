public class EmpleadoPorComision extends Empleado {
    private int ventasRealizadas;
    private double comisionPorVenta;

    public EmpleadoPorComision(){

    }
    public EmpleadoPorComision(String nombre, int id, int ventasRealizadas, double comisionPorVenta) {
        super(nombre, id);
        this.ventasRealizadas = ventasRealizadas;
        this.comisionPorVenta = comisionPorVenta;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getComisionPorVenta() {
        return comisionPorVenta;
    }

    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    // clalulo de salario por la comision____calcularPago()
    @Override
    public double calcularPago() {
        return ventasRealizadas * comisionPorVenta;
    }


    @Override
    public String toString() {
        return super.toString() + ", Tipo=PorComisión, Ventas=" + ventasRealizadas +
                ", ComisiónPorVenta=" + comisionPorVenta;
    }
}
