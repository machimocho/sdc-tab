package matrices;

import java.util.ArrayList;

public class Matriz {
	private ArrayList<ArrayList<Integer>> matriz;

	public Matriz() {

	}

	public Matriz(Integer n) {
		matriz = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> fila = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				fila.add(0);
			}

			matriz.add(fila);
		}
	}

	public ArrayList<ArrayList<Integer>> getMatriz() {
		return matriz;
	}

	public void setMatriz(ArrayList<ArrayList<Integer>> matriz) {
		this.matriz = matriz;
	}

	public Integer ObtenerItem(int fila, int columna) {
		ArrayList<Integer> filas = matriz.get(fila);
		Integer valor = filas.get(columna);
		return valor;
	}

	public int GetTotalFilas() {
		return matriz.size();
	}

	public int GetTotalColumnas() {
		return matriz.get(0).size();
	}

	public void agregarFila(ArrayList<Integer> fila) {
		matriz.add(fila);
	}

	public void agregarElemento(int fila, int columna, int elemento) {
		ArrayList<Integer> filas = matriz.get(fila);
		filas.set(columna, elemento);
	}
}
