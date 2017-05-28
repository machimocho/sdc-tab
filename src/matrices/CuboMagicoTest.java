package matrices;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboMagicoTest {

	@Test
	public void testGenerar() {
		LeerArchivo leerArchivo = new LeerArchivo();
		Impresion impresion = new Impresion();
		String file = (leerArchivo.getClass().getResource("") + "file1.txt").replace("file:/", "");

		CuboMagico cuboMagico = new CuboMagico();
		
		impresion.ImprimirMatriz(cuboMagico.generar(5).getMatriz());

		assertEquals(leerArchivo.matriz(file), cuboMagico.generar(5));
	}

}
