package utilidades;

import java.util.ArrayList;

public class MainUtilidadesArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros;
		numeros = new ArrayList<Integer>();
		
		if(numeros.size()==0) {
			System.out.println("ESTÁ VACIO. Rellena.");	
		}
		
		for(int i=-5; i<=10; i++) {
			numeros.add(i);
		}
	
		System.out.println(UtilidadesArrayList.verMasAlto(numeros));
		System.out.println(UtilidadesArrayList.verMasBajo(numeros));
		System.out.println(UtilidadesArrayList.verPositivos(numeros));
		
	}

}
