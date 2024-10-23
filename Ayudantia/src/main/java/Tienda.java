import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Ciudad> ciudades;
	private List<Empleado> listaDeEmpleados;
	private List<Producto> inventario;
	private String nombreTienda;
	private String direccion;
	private String horarioAtencion;

	public Tienda(String nombreTienda, String direccion, String horarioAtencion,
				  Ciudad ciudad1) {
		this.nombreTienda = nombreTienda;
		this.direccion = direccion;
		this.horarioAtencion = horarioAtencion;
		this.ciudades = new ArrayList<>();
		this.listaDeEmpleados = new ArrayList<>();
		this.inventario = new ArrayList<>();
		if (ciudad1 != null) {
			this.ciudades.add(ciudad1);
		}
	}

	public String getNombreTienda() {
		return this.nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public List<Empleado> getListaDeEmpleados() {
		return this.listaDeEmpleados;
	}

	public void setListaDeEmpleados(List<Empleado> listaDeEmpleados) {
		this.listaDeEmpleados = listaDeEmpleados;
	}

	public List<Producto> getInventario() {
		return this.inventario;
	}

	public void setInventario(List<Producto> inventario) {
		this.inventario = inventario;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public boolean agregarEmpleado(Empleado empleado) {
		if (listaDeEmpleados.contains(empleado)) {
			System.out.println("Empleado ya registrado");
			return false;
		}
		listaDeEmpleados.add(empleado);
		System.out.println("Contratado");
		return true;
	}

	public void actualizarInventario(List<Producto> productosCompra) {
		for (Producto productoCompra : productosCompra) {
			for (Producto productoInventario : inventario) {
				if (productoInventario.getNombreProducto().equals(productoCompra.
						getNombreProducto())) {
					int nuevaCantidad = productoInventario.getCantidadDisponible() -
							productoCompra.getCantidadDisponible();
					productoInventario.setCantidadDisponible(nuevaCantidad);
					System.out.println("Inventario actualizado. Nueva cantidad: "
							+ nuevaCantidad);
					break;
				}
			}
		}
	}

	public void agregarProducto(Producto producto) {
		if (producto != null) {
			inventario.add(producto);
			System.out.println("Producto agregado con éxito: " +
					producto.getNombreProducto());
		} else {
			System.out.println("No es posible agregar este producto");
		}
	}
}
