package Nomina;

public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if( ventasBrutas < 0.0 ){
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0 ");
        }
    
        if( tarifaComision <= 0.0 || tarifaComision >=1.0 ){
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void setVentasBrutas( double ventasBrutas) {
        if( ventasBrutas < 0.0 ){
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0 ");
        }
        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setTarifaComision( double tarifaComision) {
        if( tarifaComision <= 0.0 || tarifaComision >=1.0 ){
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }

        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    // @Override
    // public double ingresos() {
    //     return getTarifaComision() * getVentasBrutas();
    // }

    @Override
    public double getMontoPago() {
        return getTarifaComision() * getVentasBrutas();
    }
    
    @Override
    public String toString() {
        return String.format("%n%s: %s%n%s: %,.2f; %s: %,.2f", "Empleado por comision", super.toString(), "ventas brutas", getVentasBrutas(), "tarifa comision", getTarifaComision());
    }
    
}
