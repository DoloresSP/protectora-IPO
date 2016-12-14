package dominio;

public class Voluntario {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String nacimiento;
	private String telefono;
	private String correo;
	private String foto;
	private GestorVoluntario g=new GestorVoluntario();
	
	public Voluntario(String dni, String nombre, String apellidos, 
			String nacimiento, String telefono, String direccion, String ciudad, String provincia,
			 String correo, String foto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.nacimiento = nacimiento;
		this.telefono = telefono;
		this.correo = correo;
		this.foto = foto;
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	public void insertarVoluntario(Voluntario v) throws Exception{
		
		g.insertar(v);
	}
	
	public void modificarVoluntario(String dni, Voluntario v) throws Exception{
		g.update(dni, v);
	}
	

}
