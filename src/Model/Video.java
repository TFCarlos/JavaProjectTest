package Model;

public class Video {

	private int Duracion;
	private String Titulo;
	private String Creador;
	private boolean PublicoOPrivado;
	
	// Constructor
	public Video(int duracion, String titulo, String creador,boolean publicoOPrivado) {
		super();
		Duracion = duracion;
		Titulo = titulo;
		Creador = creador;
		PublicoOPrivado = publicoOPrivado;
	}

	
	// Getters & Setters
	
	public int getDuracion() {
		return Duracion;
	}

	public void setDuracion(int duracion) {
		Duracion = duracion;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getCreador() {
		return Creador;
	}

	public void setCreador(String creador) {
		Creador = creador;
	}
	
	public boolean getPublicoOPrivado() {
		return PublicoOPrivado;
	}

	public void setPublicoOPrivado(boolean publicoOPrivado) {
		PublicoOPrivado = publicoOPrivado;
	}


	// Methods
	
	public void cambiarNombre(String tituloNuevo) {
		setTitulo(tituloNuevo);
	}
	
	public void hacerPublico() {
		setPublicoOPrivado(true);
	}
	
	public void ampliarDuracion(int tiempo) {
		setDuracion(this.getDuracion()+tiempo);
	}
	
	public void reducirDuracion(int tiempo) {
		setDuracion(this.getDuracion()-tiempo);
	}
	
	
	//ToString
	
	@Override
	public String toString() {
		return "Youtube [Duracion: " + Duracion + ", Titulo: " + Titulo + ", Creador: " + Creador + " Publico: " + PublicoOPrivado + " ]";
	}
	
	
	
}
