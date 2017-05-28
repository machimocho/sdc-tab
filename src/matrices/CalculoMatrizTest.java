package matrices;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CalculoMatrizTest {

	@Test
	public void testMultiplicar() {
		ArrayList<ArrayList<Integer>> filas = null;
		ArrayList<Integer> columnas = null;
		
		filas = new ArrayList<ArrayList<Integer>>();
		columnas = new ArrayList<Integer>();
		columnas.add(8);
		columnas.add(4);
		columnas.add(3);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(2);
		columnas.add(5);
		columnas.add(6);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(1);
		columnas.add(2);
		columnas.add(0);
		filas.add(columnas);
		
		Matriz a = new Matriz();
		a.setMatriz(filas);
		
		filas = new ArrayList<ArrayList<Integer>>();
		columnas = new ArrayList<Integer>();
		columnas.add(4);
		columnas.add(3);
		columnas.add(2);
		columnas.add(1);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(5);
		columnas.add(10);
		columnas.add(2);
		columnas.add(0);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(9);
		columnas.add(2);
		columnas.add(2);
		columnas.add(6);
		filas.add(columnas);
		
		Matriz b = new Matriz();
		b.setMatriz(filas);
		
		CalculoMatriz calculo = new CalculoMatriz();
		
		Matriz resultado = calculo.Multiplicar(a, b);
		
		assertEquals(resultado.ObtenerItem(0, 0), new Integer(79));
		assertEquals(resultado.ObtenerItem(1, 1), new Integer(68));
		assertEquals(resultado.ObtenerItem(2, 2), new Integer(6));
	}

	@Test
	public void testEsValidoMultiplicar() {
		ArrayList<ArrayList<Integer>> filas = null;
		ArrayList<Integer> columnas = null;
		
		filas = new ArrayList<ArrayList<Integer>>();
		columnas = new ArrayList<Integer>();
		columnas.add(8);
		columnas.add(4);
		columnas.add(3);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(2);
		columnas.add(5);
		columnas.add(6);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(1);
		columnas.add(2);
		columnas.add(0);
		filas.add(columnas);
		
		Matriz a = new Matriz();
		a.setMatriz(filas);
		
		filas = new ArrayList<ArrayList<Integer>>();
		columnas = new ArrayList<Integer>();
		columnas.add(4);
		columnas.add(3);
		columnas.add(2);
		columnas.add(1);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(5);
		columnas.add(10);
		columnas.add(2);
		columnas.add(0);
		filas.add(columnas);
		
		columnas = new ArrayList<Integer>();
		columnas.add(9);
		columnas.add(2);
		columnas.add(2);
		columnas.add(6);
		filas.add(columnas);
		
		Matriz b = new Matriz();
		b.setMatriz(filas);
		
		CalculoMatriz calculo = new CalculoMatriz();
		boolean resultado = calculo.EsValidoMultiplicar(a, b);
		
		assertTrue(resultado);
	}

}
