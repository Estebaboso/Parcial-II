package co.uniquindio.poo;

public class Main {
    public static void main(String[] args) {


        ShopMasterFacade tienda = new ShopMasterFacade();


        // CASO 1: COMPRA EXITOSA CON COMBO ANIDADO

        System.out.println("\n=== CASO 1: COMPRA EXITOSA ===");
        Combo kitLimpieza = new Combo("Kit de Limpieza");
        kitLimpieza.agregar(new ProductoIndividual("Paño de microfibra", 25000));
        kitLimpieza.agregar(new ProductoIndividual("Líquido limpiador", 15000));
        Combo comboGamer = new Combo("Combo Setup Gamer");
        comboGamer.agregar(new ProductoIndividual("Monitor", 800000));
        comboGamer.agregar(new ProductoIndividual("Teclado", 200000));
        comboGamer.agregar(kitLimpieza);
        Compra.ejecutarCompraRapida("cliente_vip", comboGamer, TipoExtra.GARANTIA, TipoExtra.REGALO);


        // CASO 2: RECHAZO POR TOPE DE DINERO

        System.out.println("\n=== CASO 2: RECHAZO POR MONTO ===");
        Producto servidor = new ProductoIndividual("Servidor Empresarial", 6000000);
        Compra.ejecutarCompraRapida("cliente_normal", servidor, TipoExtra.FRAGIL);


        // CASO 3: RECHAZO POR USUARIO BLOQUEADO

        System.out.println("\n=== CASO 3: USUARIO BLOQUEADO ===");
        Producto mouse = new ProductoIndividual("Mouse", 150000);
        Compra.ejecutarCompraRapida("BLOQUEADO", mouse);
    }
}