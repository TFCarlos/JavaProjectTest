package Helper;

import Model.Directo;
import Model.Video;

public class Helper {
	
	public void pruebaVideo() {
	Video vprueba= new Video(10, "video", "prueba", false);
	vprueba.ampliarDuracion(10);
	vprueba.reducirDuracion(2);
	}
	
	public void pruebaDirecto() { 
	Directo dprueba= new Directo("prueba", 100);
	dprueba.aumentarEspectador();
	dprueba.disminuirEspectador();
	}
}
