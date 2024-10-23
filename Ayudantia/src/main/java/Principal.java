import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Region> regiones = new ArrayList<>();
        List<Tienda> tiendas = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();
        List<Compra> compras = new ArrayList<>();

        Region regionNorte = inicializarRegiones(regiones);
        Tienda tienda1 = inicializarTienda(regionNorte, tiendas);
        Empleado empleado1 = inicializarEmpleado(tienda1, empleados);
        Cliente cliente1 = inicializarCliente(clientes);
        inicializarProductos(productos);

        List<Producto> productosCompra = realizarCompra(productos);
        Compra compra1 = registrarCompra(cliente1, tienda1, productosCompra, compras);

        tienda1.actualizarInventario(productosCompra);

        System.out.println("Compras registradas de " + cliente1.getNombreCliente() + ": " + cliente1.getCompras());
        System.out.println("Total a pagar: " + compra1.getTotalAPagar());
    }

    public static Region inicializarRegiones(List<Region> regiones) {
        Region regionNorte = new Region("Norte");
        Ciudad ciudad1 = new Ciudad("Temuco", "420000");
        regionNorte.agregarCiudad(ciudad1);
        regiones.add(regionNorte);
        return regionNorte;
    }

    public static Tienda inicializarTienda(Region regionNorte, List<Tienda> tiendas) {
        Ciudad ciudad1 = regionNorte.getListaCiudades().get(0);
        Tienda tienda1 = new Tienda("Sumatra", "Montevideo 800",
                "8:00 - 21:00", ciudad1);
        tiendas.add(tienda1);
        ciudad1.agregarTienda(tienda1);
        return tienda1;
    }

    public static Empleado inicializarEmpleado(Tienda tienda1, List<Empleado> empleados) {
        Empleado empleado1 = new Empleado("Eleuterio", 24500,
                "Cajero");
        tienda1.agregarEmpleado(empleado1);
        empleados.add(empleado1);
        return empleado1;
    }

    public static Cliente inicializarCliente(List<Cliente> clientes) {
        Cliente cliente1 = new Cliente("Carlos", 7850);
        clientes.add(cliente1);
        return cliente1;
    }

    public static void inicializarProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Computadora",
                500000, "Gaming", 750);
        Producto producto2 = new Producto("Lavadora",
                725000, "Electrodoméstico", 25);
        productos.add(producto1);
        productos.add(producto2);
    }

    public static List<Producto> realizarCompra(List<Producto> productos) {
        List<Producto> productosCompra = new ArrayList<>();
        productosCompra.add(productos.get(0));
        productosCompra.add(productos.get(1));
        return productosCompra;
    }

    public static Compra registrarCompra(Cliente cliente, Tienda tienda,
                                         List<Producto> productosCompra, List<Compra> compras) {
        int totalAPagar = calcularTotalAPagar(productosCompra);
        Compra compra = new Compra(cliente.getNombreCliente(), "22-10-2024",
                totalAPagar, productosCompra, "Tarjeta");
        cliente.agregarCompra(compra);
        compras.add(compra);
        return compra;
    }

    public static int calcularTotalAPagar(List<Producto> productosCompra) {
        int total = 0;
        for (Producto producto : productosCompra) {
            total += producto.getPrecioProducto();
        }
        return total;
    }
}
