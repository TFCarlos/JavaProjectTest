package Controller;

import Model.Video;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Video v1= new Video(13, "PerrosGraciosos", "Alfonso", false);
		
		System.out.println(v1);
		
		v1.hacerPublico();
		
		System.out.println(v1);
		
		
	}

}
