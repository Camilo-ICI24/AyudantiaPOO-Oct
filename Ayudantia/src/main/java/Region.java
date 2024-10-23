import java.util.*;

public class Region {

	private Collection<Territorio> territorio;
	private Collection<Ciudad> ciudad;
	private String nombreRegion;
	private List<Ciudad> listaCiudades;

    public Region(String zona) {
    }

    public String getNombreRegion() {
		return this.nombreRegion;
	}

	/**
	 * 
	 * @param nombreRegion
	 */
	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public List<Ciudad> getListaCiudades() {
		return this.listaCiudades;
	}

	/**
	 * 
	 * @param listaCiudades
	 */
	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}

	public boolean agregarCiudad(Ciudad ciudad1) {
		for (Ciudad ciudad : listaCiudades) {
			if (ciudad.getNombre().equals(ciudad1.getNombre())) {
				return false;
			}
		}
		listaCiudades.add(ciudad1);
		return true;
	}

	public boolean modificarCiudad(Ciudad ciudadModificada) {
		for (int city = 0; city < listaCiudades.size(); city++) {
			Ciudad ciudad = listaCiudades.get(city);
			if (ciudad.getNombre().equals(ciudadModificada.getNombre())) {
				ciudad.setCodigoPostal(ciudadModificada.getCodigoPostal());
				return true;
			}
		}
		return false;
	}

	public boolean eliminarCiudad(String nombreCiudad) {
		for (int city = 0; city < listaCiudades.size(); city++) {
			Ciudad ciudad = listaCiudades.get(city);
			if (ciudad.getNombre().equals(nombreCiudad)) {
				listaCiudades.remove(city);
				return true;
			}
		}
		return false;
	}
}