package techsol;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private final double PAGO_POR_HORA = 100.0;

    public EmpleadoPorHoras(String nombre, int id, double salarioBase, int horasTrabajadas) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldoTotal() {
        double pagoPorHoras = horasTrabajadas * PAGO_POR_HORA;
        return salarioBase + pagoPorHoras;
    }

    @Override
    public double calcularPrestaciones() {
        double sueldoTotal = calcularSueldoTotal();
        return sueldoTotal * 0.10;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nEmpleado por Horas: ");
        super.mostrarInformacion();
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Pago por Hora: $" + String.format("%.2f", PAGO_POR_HORA));
    }
}
