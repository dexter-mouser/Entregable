import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        //Constantes
        final double PRECIO_BASICO = 15000.0;
        final double PRECIO_MEDIO = 35000.0;
        final double PRECIO_PREMIUM = 60000.0;
        final double TASA_IVA = 0.19;
        //Variables
        double totalBruto = 0.0;
        int cantidadPremium = 0;
        int opcionMenu = 0;
        double totalDescuento = 0.0;
        double montoDescuento = 0.0;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Catalogo de productos---");
        //Ciclo do-while
        do {
            System.out.println("-----MENU DE PRODUCTOS-----");
            System.out.println("1. Producto Basico --$15000");
            System.out.println("2. Producto Medio ---$35000");
            System.out.println("3. Producto Premium -$60000");
            System.out.println("4. ----Finalizar compra----");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = scanner.nextInt();
            //
            if (opcionMenu == 1) {
                totalBruto += PRECIO_BASICO;
            } //
            else if (opcionMenu == 2) {
                totalBruto += PRECIO_MEDIO;
            } //
            else if (opcionMenu == 3) {
                totalBruto += PRECIO_PREMIUM;
                cantidadPremium++;//
            }
        } while (opcionMenu != 4);
        //
        System.out.println("-----RESUMEN DE COMPRA-----");
            totalDescuento = totalBruto;
            if (totalBruto > 100000.0) {
                montoDescuento = totalBruto * 0.10;
                totalDescuento -= montoDescuento;
            }
            double valorIva = totalDescuento * TASA_IVA;
            double totalAPagar = totalDescuento + valorIva;
            System.out.println("total bruto: $" + totalBruto);
            System.out.println("descuento aplicado: $" + montoDescuento);
            System.out.println("subtotal: $" + totalDescuento);
            System.out.println("IVA: $" + valorIva);
            System.out.println("total a pagar: $" + totalAPagar);
            System.out.println("total Productos Premium: " + cantidadPremium);
    }
}