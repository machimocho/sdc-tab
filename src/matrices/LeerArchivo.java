package matrices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerArchivo {
	public Matriz matriz(String file) {
		Matriz matriz = new Matriz();
		ArrayList<ArrayList<Integer>> filas = new ArrayList<ArrayList<Integer>>();
		File archivo = new File(file);
		FileReader fr;
		try {
			fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				ArrayList<Integer> items = new ArrayList<Integer>();
				String numeros[] = line.split(",");
				for (int i = 0; i < numeros.length; i++) {
					items.add(Integer.parseInt(numeros[i]));
				}
				filas.add(items);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		matriz.setMatriz(filas);
		return matriz;
	}
}
