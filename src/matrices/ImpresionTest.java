package matrices;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImpresionTest {
	Impresion imp = new Impresion();
	Matriz matriz = new Matriz();
	
	@Test
	public void matrizConsola() {
		String cadena = imp.ImprimirMatriz(matriz.getMatriz());
		assertEquals("1,1,3", cadena);
	}

}
