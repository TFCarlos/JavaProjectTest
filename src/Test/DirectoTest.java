package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Model.Directo;

public class DirectoTest {

	void test() {
	Directo d1= new Directo("probando github en directo", 0);
	d1.aumentarEspectador();
	
	assertEquals(1, d1.getEspectadores());
	
	d1.disminuirEspectador();
	assertEquals(0, d1.getEspectadores());
	}
}
