import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void testRegistrarCompra() {
        List<Cliente> clientes = new ArrayList<>();
        List<Tienda> tiendas = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();
        List<Compra> compras = new ArrayList<>();

        Cliente cliente1 = new Cliente("Carlos", 7850);
        Tienda tienda1 = new Tienda("Sumatra", "Montevideo 800",
                "8:00 - 21:00", new Ciudad("Temuco", "420000"));
        Producto producto1 = new Producto("Computadora",
                500000, "Gaming", 750);
        Producto producto2 = new Producto("Lavadora",
                725000, "Electrodoméstico", 25);
        productos.add(producto1);
        productos.add(producto2);
        tienda1.agregarProducto(producto1);
        tienda1.agregarProducto(producto2);
        cliente1.agregarCompra(new Compra(cliente1.getNombreCliente(),
                "22-10-2024", 0, new ArrayList<>(),
                "Tarjeta"));

        List<Producto> productosCompra = new ArrayList<>();
        productosCompra.add(producto1);
        productosCompra.add(producto2);
        Compra compra = Principal.registrarCompra(cliente1, tienda1, productosCompra, compras);

        assertNotNull(compra);
        assertEquals(cliente1.getNombreCliente(), compra.getCliente());
        assertEquals(1225000, compra.getTotalAPagar());
    }

    @Test
    void testCalcularTotalAPagar() {
        List<Producto> productosCompra = new ArrayList<>();
        productosCompra.add(new Producto("Computadora", 500000,
                "Gaming", 750));
        productosCompra.add(new Producto("Lavadora", 725000,
                "Electrodoméstico", 25));

        int total = Principal.calcularTotalAPagar(productosCompra);
        assertEquals(1225000, total);
    }
}

