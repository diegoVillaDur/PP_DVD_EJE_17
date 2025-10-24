import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoAsalariado("Ana García", 101, 50000.00));

        empleados.add(new EmpleadoPorHoras("Luis Pérez", 102, 10000.00, 150));

        empleados.add(new EmpleadoAsalariado("Marta Soto", 103, 75000.00));


        // Iterar sobre la lista y mostrar la información, sueldo y prestaciones
        System.out.println("====== REPORTE DE EMPLEADOS TECHSOLUCIONES S.A. ======");
        for (Empleado emp : empleados) {
            // Reutiliza el método concreto mostrarInformacion()
            emp.mostrarInformacion();

            // Llama a los métodos abstractos implementados en cada subclase
            double sueldo = emp.calcularSueldoTotal();
            double prestaciones = emp.calcularPrestaciones();

            System.out.println("SUELDO TOTAL:     $" + String.format("%.2f", sueldo));
            System.out.println("PRESTACIONES:     $" + String.format("%.2f", prestaciones));
        }
        System.out.println("=====================================================");
    }
}