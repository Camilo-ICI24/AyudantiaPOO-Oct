import java.util.List;

public class Ciudad {

	private Region region;
	private Tienda tienda;
	private String nombre;
	private List<Tienda> listaDeTiendas;
	private int codigoPostal;

	public Ciudad(String nombre, String codigoPostal) {
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tienda> getListaDeTiendas() {
		return this.listaDeTiendas;
	}

	/**
	 * @param listaDeTiendas
	 */
	public void setListaDeTiendas(List<Tienda> listaDeTiendas) {
		this.listaDeTiendas = listaDeTiendas;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	/**
	 * @param codigoPostal
	 */
	public void setCodigoPostal(int codigoPostal) {

		this.codigoPostal = codigoPostal;
	}

	public boolean agregarTienda(Tienda tienda1) {
		if (listaDeTiendas.contains(tienda1)) {
			System.out.println("Esta tienda ya existe");
			return false;
		}

		listaDeTiendas.add(tienda1);
		System.out.println("Tienda agregada exitosamente");
		return true;
	}
}
