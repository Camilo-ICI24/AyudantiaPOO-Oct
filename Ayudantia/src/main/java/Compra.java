import java.util.*;

public class Compra {

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	private String cliente;
	private List<Producto> producto;
	private int numeroDeCompra;
	private String fechaDeCompra;
	private int totalAPagar;
	private String metodoPago;
	private List<Producto> pedido;

    public Compra(String cliente, String fechaDeCompra, int totalAPagar,
				  List<Producto> pedido, String metodoPago) {
		int obtenerTotalAPagar = 0;
		this.cliente = cliente;
		this.fechaDeCompra = fechaDeCompra;
		this.totalAPagar = obtenerTotalAPagar;
		this.pedido = pedido;
		this.metodoPago = metodoPago;
    }

    public int getNumeroDeCompra() {
		return this.numeroDeCompra;
	}

	/**
	 * 
	 * @param numeroDeCompra
	 */
	public void setNumeroDeCompra(int numeroDeCompra) {
		this.numeroDeCompra = numeroDeCompra;
	}

	public String getFechaDeCompra() {
		return this.fechaDeCompra;
	}

	/**
	 * 
	 * @param fechaDeCompra
	 */
	public void setFechaDeCompra(String fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public int getTotalAPagar() {
		return this.totalAPagar;
	}

	/**
	 * 
	 * @param totalAPagar
	 */
	public void setTotalAPagar(int totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public String getMetodoPago() {
		return this.metodoPago;
	}

	/**
	 * 
	 * @param metodoPago
	 */
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public List<Producto> getPedido() {
		return this.pedido;
	}

	/**
	 * 
	 * @param pedido
	 */
	public void setPedido(List<Producto> pedido) {
		this.pedido = pedido;
	}

	public int obtenerTotalAPagar() {
		int deuda = 0;
		for (Producto producto : pedido) {
			deuda += producto.getPrecioProducto();
		}
		return deuda;
	}

}