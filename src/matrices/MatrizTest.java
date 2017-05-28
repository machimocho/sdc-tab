package matrices;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrizTest {

	@Test
	public void testMatriz() {

		LeerArchivo leerArchivo = new LeerArchivo();
		assertEquals(new Matriz(), leerArchivo.matriz(this.getClass().getResource("file1.txt").toString()));
	}

}
