package dominio;

public class Donacion {
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String ciudad;
	private String provincia;
	private long telefono;
	private String cantidadDonar;
	public Donacion(String nombre, String apellidos, String dni,
			String cantidadDonar) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cantidadDonar = cantidadDonar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCantidadDonar() {
		return cantidadDonar;
	}
	public void setCantidadDonar(String cantidadDonar) {
		this.cantidadDonar = cantidadDonar;
	}
	
	

}
