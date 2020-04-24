package Model;

public class Directo {

	private String Titulo;
	private int Espectadores;
	
	
	// Constructor
	
	public Directo(String titulo, int espectadores) {
		super();
		Titulo = titulo;
		Espectadores = espectadores;
	}
	
	// Getters & Setters
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getEspectadores() {
		return Espectadores;
	}
	public void setEspectadores(int espectadores) {
		Espectadores = espectadores;
	}
	
	//Methods

	public void aumentarEspectador() {
		this.setEspectadores(getEspectadores()+1);
	}
	
	public void disminuirEspectador() {
		this.setEspectadores(getEspectadores()-1);
	}

	@Override
	public String toString() {
		return "Directo [Titulo=" + Titulo + ", Espectadores=" + Espectadores + "]";
	}
	
	//toString
	
	
}
