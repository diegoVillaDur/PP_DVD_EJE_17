package techsol;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, int id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSueldoTotal() {
        return this.salarioBase*1.1;
    }

    @Override
    public double calcularSueldoPrestaciones() {
        return this.calcularSueldoTotal()*0.1;
    }
    
}
