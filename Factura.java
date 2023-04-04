package Nomina;

public class Factura implements PorPagar{
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if( cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser >=0");
        
        if( precioPorArticulo < 0.0 )
            throw new IllegalArgumentException("El precio por articulo debe ser >=0");
        
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if( cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser >=0");
        
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if( precioPorArticulo < 0.0 )
            throw new IllegalArgumentException("El precio por articulo debe ser >=0");
        
        this.precioPorArticulo = precioPorArticulo;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public String toString() {
        
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "factura","numero de pieza", getNumeroPieza(), getDescripcionPieza(),"cantidad",getCantidad(),"precio por articulo",getPrecioPorArticulo());
    }

    @Override
    public double getMontoPago() {
        
        return getCantidad() * getPrecioPorArticulo();
    }

}
