package Controller;

import Model.Directo;
import Model.Video;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Video v1= new Video(10, "PerrosGraciosos", "Alfonso", false);
		v1.ampliarDuracion(10);
		v1.reducirDuracion(2);
		
		System.out.println(v1);
	
		Directo d1= new Directo("probando github en directo", 0);
		d1.aumentarEspectador();
		System.out.println(d1);
	}

}
