package Nomina;

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objPorPagars = new PorPagar[6];

        objPorPagars[0] = new Factura("01234", "asiento", 2, 300);
        objPorPagars[1] = new Factura("55464", "martillo", 1, 40);
        objPorPagars[2] = new EmpleadoAsalariado("jose", "campo", "120-333444-56", 1000);
        objPorPagars[3] = new EmpleadoBaseMasComision("emiro", "camargo", "120-111222-34", 10000, .04, 500);
        objPorPagars[4] = new EmpleadoPorComision("camilo", "cespedes", "120-000999-90", 2500, .10);
        objPorPagars[5] = new EmpleadoPorHoras("jaime", "ramirez", "120-777888-80", 25, 70);

        for (PorPagar porPagar : objPorPagars) {
            System.out.printf("%n%s %n%s: $%,.2f%n", porPagar.toString(), "pago vencido", porPagar.getMontoPago());
        }
    }
}
