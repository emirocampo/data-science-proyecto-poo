package Nomina;

public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;


    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo,
            double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        if( sueldo < 0.0 )
            throw new IllegalArgumentException("EL sueldo por horas debe ser >= 0.0");

        if( ( horas < 0.0 ) || ( horas > 168.0 ) )
            throw new IllegalArgumentException("Las horas trabajadas deben ser > 0.0 y < 168.0");
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if( sueldo < 0.0 )
            throw new IllegalArgumentException("EL sueldo por horas debe ser >= 0.0");
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        if( ( horas < 0.0 ) || ( horas > 168.0 ) )
            throw new IllegalArgumentException("Las horas trabajadas deben ser > 0.0 y < 168.0");
        this.horas = horas;
    }

    // @Override
    // public double ingresos() {
    //     if( getHoras() <= 40)
    //         return getSueldo() * getHoras();
    //     else
    //         return 40 * getSueldo() + (getHoras() - 40 ) * getSueldo() * 1.5; 
    // }

    @Override
    public String toString() {
        return String.format("%nEmpleado por horas: %s%n%s: $%,.2f %n%s: %,.2f", super.toString(), "sueldo por horas",getSueldo(), "horas trabajadas", getHoras());
    }

    @Override
    public double getMontoPago() {
        if( getHoras() <= 40)
            return getSueldo() * getHoras();
        else
            return 40 * getSueldo() + (getHoras() - 40 ) * getSueldo() * 1.5; 
    }
}
