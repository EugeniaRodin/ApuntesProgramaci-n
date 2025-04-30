package utilidades;

import java.util.ArrayList;

public class UtilidadesArrayList {
	//Más alto más bajo
	//Cuántos positivos
	//Cuántas repeticiones
	//Comprobar valor creciente
	//La media suma
	
	private ArrayList<Integer> numeros;

	public UtilidadesArrayList(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public static int verMasAlto(ArrayList<Integer> numeros) {
		int masAlto = numeros.get(0);
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > masAlto) {
				masAlto = numeros.get(i);
			}
		}	
		return masAlto;
	}
	
	public static int verMasBajo(ArrayList<Integer> numeros) {
		int masBajo = numeros.get(0);
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) < masBajo) {
				masBajo = numeros.get(i);
			}
		}	
		return masBajo;
	}
	
	public static int verPositivos(ArrayList<Integer> numeros) {
		int contadorPositivos = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > 0) {
				contadorPositivos++;
			}
		}	
		return contadorPositivos;
	}
}
