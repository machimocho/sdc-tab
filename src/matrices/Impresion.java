package matrices;

import java.util.ArrayList;

public class Impresion {
	public String ImprimirMatriz(ArrayList<ArrayList<Integer>> matriz){
		String cadena = "";
		for (int i = 0; i <= matriz.size() - 1; i++){
			cadena = "";
			for (int j = 0; j <= matriz.get(i).size() - 1; j++){
				cadena += padding(matriz.get(i).get(j));
			}
			System.out.println(cadena);
		}
		return cadena;
	}
	
	public String padding (int numero){
		String cadena = "";
		String numeroCadena = "" + numero;
		int longitudNumero = numeroCadena.length();
		
		for (int i = longitudNumero; i < 10; i++){
			cadena += " ";
		}
		 
		return cadena + numeroCadena;
	}
}
