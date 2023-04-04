package Nomina;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        if( salarioSemanal < 0.0 )
            throw new IllegalArgumentException("El salario debe ser >= 0.0");
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double getMontoPago() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("%nEmpleado asalariado: %s %n%s: $%,.2f", super.toString(), "salario semanal",getSalarioSemanal());
    }

    

    
}
