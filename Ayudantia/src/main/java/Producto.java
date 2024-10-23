public class Producto {

	private Tienda tienda;
	private Compra compra;
	private String nombreProducto;
	private int precioProducto;
	private String categoria;
	private int cantidadDisponible;

    public Producto(String nombreProducto, int precioProducto, String categoria,
					int cantidadDisponible) {
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.categoria = categoria;
		this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombreProducto() {
		return this.nombreProducto;
	}

	/**
	 * 
	 * @param nombreProducto
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getPrecioProducto() {
		return this.precioProducto;
	}

	/**
	 * 
	 * @param precioProducto
	 */
	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCantidadDisponible() {
		return this.cantidadDisponible;
	}

	/**
	 * 
	 * @param cantidadDisponible
	 */
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

}