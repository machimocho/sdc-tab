package matrices;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImpresionTest {
	Impresion imp = new Impresion();
	LeerArchivo leerArchivo = new LeerArchivo();
	String file = "/"+(leerArchivo.getClass().getResource("") + "file1.txt").replace("file:/", "");
	
	@Test
	public void matrizConsola() {
		String cadena = imp.ImprimirMatriz(leerArchivo.matriz(file).getMatriz());
		assertEquals("1,1,3", cadena);
	}

}
