public class Empleado {

	private Tienda tienda;
	private String nombreEmpleado;
	private int idEmpleado;
	private String cargo;

    public Empleado(String nombre, int idEmpleado, String cargo) {
		this.nombreEmpleado = nombre;
		this.idEmpleado = idEmpleado;
		this.cargo = cargo;
    }

    public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}

	/**
	 * 
	 * @param nombreEmpleado
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	/**
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCargo() {
		return this.cargo;
	}

	/**
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}