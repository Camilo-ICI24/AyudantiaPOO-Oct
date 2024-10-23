import java.util.List;

public class Territorio {

	private Region region;
	private String nombre;
	private List<Region> listaDeRegiones;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Region> getListaDeRegiones() {
		return this.listaDeRegiones;
	}

	/**
	 * 
	 * @param listaDeRegiones
	 */
	public void setListaDeRegiones(List<Region> listaDeRegiones) {
		this.listaDeRegiones = listaDeRegiones;
	}

	public boolean agregarRegion(Region region1) {
		for (Region region : listaDeRegiones) {
			if (region.getNombreRegion().equals(region1.getNombreRegion())) {
				return false;
			}
		}
		listaDeRegiones.add(region1);
		return true;
	}

	public boolean modificarRegion(Region nuevaRegion) {
		for (int reg = 0; reg < listaDeRegiones.size(); reg++) {
			Region region = listaDeRegiones.get(reg);
			if (region.getNombreRegion().equals(nuevaRegion.getNombreRegion())) {
				region.setNombreRegion(nuevaRegion.getNombreRegion());
				return true;
			}
		}
		return false;
	}

	public boolean eliminarRegion(String nombreRegion) {
		for (int reg = 0; reg < listaDeRegiones.size(); reg++) {
			Region region = listaDeRegiones.get(reg);
			if (region.getNombreRegion().equals(nombreRegion)) {
				listaDeRegiones.remove(reg);
				return true;
			}
		}
		return false;
	}

}