public class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

   public EmpleadoAsalariado(){

   }
    public EmpleadoAsalariado(String nombre, int id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo=Asalariado, SalarioMensual=" + salarioMensual;
    }
}
