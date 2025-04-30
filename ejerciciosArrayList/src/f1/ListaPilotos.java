package f1;

import java.util.ArrayList;

public class ListaPilotos {
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	public ListaPilotos(ArrayList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	//1 - Alta piloto
	public void altaPiloto(Piloto piloto) {
		this.pilotos.add(piloto);
	}

	//2 - Poner puntos a las carreras(por Id)
	public void ponerPuntosPiloto(int id) {
		int posicionPiloto;
		Carrera[] carreras = new Carrera[3];
		
		for(int i=0; i<pilotos.size(); i++) {
			if(pilotos.contains(id)==true) {
				posicionPiloto=pilotos.indexOf(i);
				pilotos.get(i).setCarreras(carreras);
				
			}
		}
		
		
	}
	
	//3 - Añadir puntos última carrera
	public void mostrarListaPilotos() {
		
	}
	
	
}
