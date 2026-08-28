public class Catalogo {
    public static void main(String[] args) {
        //Constantes. 
        final double PRECIO_BASICO = 15000.0;
        final double PRECIO_MEDIO = 35000.0;
        final double PRECIO_PREMIUM = 60000.0;
        final double TASA_IVA = 0.19;
        //Variables.
        double totalBruto = 0.0;
        int totalArticulos = 0;
        int cantidadPremium = 0;
        int opcionMenu = 0;
        System.out.println("Catalogo de productos");
        //ciclo do-while
        do{
            System.out.println("-----MENU DE PRODUCTOS-----");
            System.out.println("1. Producto Basico --$15000");
            System.out.println("2. Producto Medio ---$35000");
            System.out.println("3. Producto Premium -$60000");
            System.out.println("4. ----Finalizar compra----");
            System.out.print("Seleccione una opcion: ");
            //
            if (opcionMenu == 1) {
                totalBruto += PRECIO_BASICO;
                totalArticulos++;
                
                } else if (opcionMenu == 2) {
                totalBruto += PRECIO_MEDIO;
                totalArticulos++;
                
                } else if (opcionMenu == 3) {
                totalBruto += PRECIO_PREMIUM;
                totalArticulos++;
                
                cantidadPremium++; // 
                
                } else if (opcionMenu == 4) {
                } else {}
            } while (opcionMenu != 4);
            }
    }