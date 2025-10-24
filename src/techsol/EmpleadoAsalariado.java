package techsol;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, int id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSueldoTotal() {
        double bono = salarioBase * 0.10;
        return salarioBase + bono;
    }

    @Override
    public double calcularPrestaciones() {
        double sueldoTotal = calcularSueldoTotal();
        return sueldoTotal * 0.20;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nEmpleado Asalariado: ");
        super.mostrarInformacion();
    }
}
