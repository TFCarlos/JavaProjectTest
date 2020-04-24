package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.Video;

public class VideoTest {
	
	@Test
	void test() {
		Video v1= new Video(10, "PerrosGraciosos", "Alfonso", false);
		v1.ampliarDuracion(5);
		
		assertEquals(15, v1.getDuracion());
		
		v1.reducirDuracion(10);
		
		assertEquals(5, v1.getDuracion());
	}
}

