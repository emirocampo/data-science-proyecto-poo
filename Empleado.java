package Nomina;

public abstract class Empleado implements PorPagar{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // public abstract double ingresos(); 

    @Override
    public String toString() {
        return String.format("%s %s%n numero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());

        // return "Empleado [primerNombre=" + primerNombre + ", apellidoPaterno=" + apellidoPaterno
        //         + ", numeroSeguroSocial=" + numeroSeguroSocial + "]";
    }
}
