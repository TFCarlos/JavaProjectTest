package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.Video;

public class VideoTest {
	
	@Test
	void test() {
		Video v1= new Video(13, "PerrosGraciosos", "Alfonso", false);
		v1.ampliarDuracion(3);
		v1.hacerPublico();
		
		assertEquals(true, v1.getPublicoOPrivado());
		assertEquals(16, v1.getDuracion());
	}
}

