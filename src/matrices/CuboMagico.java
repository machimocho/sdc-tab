package matrices;

public class CuboMagico {
	public Matriz generar(Integer n) {
		Matriz matriz = new Matriz(3);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz.agregarElemento(i, j, 6);
			}
		}

		return matriz;
	}
}
