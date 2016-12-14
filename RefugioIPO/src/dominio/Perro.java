package dominio;

public class Perro {
	
	private String nombre;
	private String sexo;
	private String raza;
	private String edad;
	private boolean vacunado;
	private boolean chip;
	private boolean enfermedad;
	private boolean sociablePerros;
	private boolean sociableGatos;
	private boolean sociableNiños;
	private String numeroChip;
	private String tipoEnfermedad;
	private String estado;
	private String foto;
	
	private GestorPerro g= new GestorPerro();
	
	public Perro(String nombre, String sexo, String raza, String edad,
			boolean vacunado, boolean chip, boolean enfermedad,
			boolean sociablePerros, boolean sociableGatos,
			boolean sociableNiños, String numeroChip, String tipoEnfermedad,
			String estado, String foto) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.raza = raza;
		this.edad = edad;
		this.vacunado = vacunado;
		this.chip = chip;
		this.enfermedad = enfermedad;
		this.sociablePerros = sociablePerros;
		this.sociableGatos = sociableGatos;
		this.sociableNiños = sociableNiños;
		this.numeroChip = numeroChip;
		this.tipoEnfermedad = tipoEnfermedad;
		this.estado = estado;
		this.foto = foto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	public boolean isChip() {
		return chip;
	}
	public void setChip(boolean chip) {
		this.chip = chip;
	}
	public boolean isEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(boolean enfermedad) {
		this.enfermedad = enfermedad;
	}
	public boolean isSociablePerros() {
		return sociablePerros;
	}
	public void setSociablePerros(boolean sociablePerros) {
		this.sociablePerros = sociablePerros;
	}
	public boolean isSociableGatos() {
		return sociableGatos;
	}
	public void setSociableGatos(boolean sociableGatos) {
		this.sociableGatos = sociableGatos;
	}
	public boolean isSociableNiños() {
		return sociableNiños;
	}
	public void setSociableNiños(boolean sociableNiños) {
		this.sociableNiños = sociableNiños;
	}
	public String getNumeroChip() {
		return numeroChip;
	}
	public void setNumeroChip(String numeroChip) {
		this.numeroChip = numeroChip;
	}
	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}
	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void insertarPerro(Perro p) throws Exception{
		
		g.insertar(p);
	}
	
	public void modificarPerro(String id, Perro p) throws Exception{
		g.update(id, p);
	}
	
}
