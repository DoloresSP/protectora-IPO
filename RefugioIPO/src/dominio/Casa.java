package dominio;

public class Casa {
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String nacimiento;
	private String telefono;
	private String correo;
	private String profesion;
	private String otrosAnimales;
	private String tipoVivienda;
	private String lugarDormir;
	private String mascota;
	
	private GestorCasa g = new GestorCasa();
	
	public Casa(String dni, String nombre, String apellidos, 
			String nacimiento, String telefono, String direccion, String ciudad, String provincia,
			 String correo,
			String profesion, String otrosAnimales, String tipoVivienda,
			String lugarDormir, String mascota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.nacimiento = nacimiento;
		this.telefono = telefono;
		this.correo = correo;
		this.profesion = profesion;
		this.otrosAnimales = otrosAnimales;
		this.tipoVivienda = tipoVivienda;
		this.lugarDormir = lugarDormir;
		this.mascota = mascota;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getOtrosAnimales() {
		return otrosAnimales;
	}
	public void setOtrosAnimales(String otrosAnimales) {
		this.otrosAnimales = otrosAnimales;
	}
	public String getTipoVivienda() {
		return tipoVivienda;
	}
	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}
	public String getLugarDormir() {
		return lugarDormir;
	}
	public void setLugarDormir(String lugarDormir) {
		this.lugarDormir = lugarDormir;
	}
	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	
	public void insertarCasa(Casa c) throws Exception{
		
		g.insertar(c);
	}
	
	public void modificarCasa(String dni, Casa c) throws Exception{
		g.update(dni, c);
	}
	
}
