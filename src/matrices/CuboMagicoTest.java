package matrices;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboMagicoTest {

	@Test
	public void testGenerar() {
		LeerArchivo leerArchivo = new LeerArchivo();
		Impresion impresion = new Impresion();
		String file = (leerArchivo.getClass().getResource("") + "matriz5.txt").replace("file:/", "");

		CuboMagico cuboMagico = new CuboMagico();
		Matriz matrizCubo = cuboMagico.generar(5);
		impresion.ImprimirMatriz(matrizCubo.getMatriz());
		Matriz matriz = leerArchivo.matriz(file);

		for(int i=0; i<matrizCubo.getMatriz().size(); i++){
			assertEquals(matriz.getMatriz().get(i), matrizCubo.getMatriz().get(i));
		}
	}

}
