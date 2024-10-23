import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Compra compra;
	private String nombreCliente;
	private int numeroCliente;
	private List<Compra> compras;

	public Cliente(String nombreCliente, int numeroCliente) {
		this.nombreCliente = nombreCliente;
		this.numeroCliente = numeroCliente;
		this.compras = new ArrayList<>();
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	/**
	 * 
	 * @param nombreCliente
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroCliente() {
		return this.numeroCliente;
	}

	/**
	 * 
	 * @param numeroCliente
	 */
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	/**
	 * 
	 * @param compras
	 */
	public void setCompras(List<Compra> compras) {

		this.compras = compras;
	}

	public void agregarCompra(Compra compra) {
		compras.add(compra);
	}
}