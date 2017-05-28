package matrices;

import java.util.ArrayList;

public class Matriz {
	private ArrayList <ArrayList <Integer>> matriz;

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
}
