package Nomina;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

    private double salarioBase;

    public  EmpleadoBaseMasComision( String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {

        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        
        if( ventasBrutas < 0.0 ){
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0 ");
        }

        if( tarifaComision <= 0.0 || tarifaComision >=1.0 ){
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        
        if( salarioBase < 0.0 ){
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }

        this.salarioBase =  salarioBase;
    }

    public void setSalarioBase( double salarioBase ) {
        if( salarioBase < 0.0 ){
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // @Override
    // public double ingresos() {
    //     return getSalarioBase() + super.ingresos();
    // }

    @Override
    public String toString() {
        return String.format("%n%s %s%n%s:%.2f", "con sueldo base",super.toString(), "sueldo base", getSalarioBase());
    }
}
