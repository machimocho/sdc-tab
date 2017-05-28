package matrices;

public class CuboMagico {
	public Matriz generar(Integer n) {
		Matriz matriz = new Matriz(n);

		int i = 0;
		int j = ((n + 1) / 2) - 1;

		for (int k = 1; k <= (n * n); k++) {
			matriz.agregarElemento(i, j, k);

			if ((k % n) == 0) {
				i++;
			} else {
				if ((i - 1) == -1) {
					i = n - 1;
				} else {
					i -= 1;
				}

				if ((j + 1) >= n) {
					j = 0;
				} else {
					j++;
				}
			}
		}

		return matriz;
	}
}
