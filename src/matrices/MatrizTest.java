package matrices;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrizTest {

	@Test
	public void testMatriz() {
		
		LeerArchivo leerArchivo = new LeerArchivo();
		
		String file = (leerArchivo.getClass().getResource("") + "file1.txt").replace("file:/", "");
		assertEquals(new Matriz(), leerArchivo.matriz(file));
	}

}
