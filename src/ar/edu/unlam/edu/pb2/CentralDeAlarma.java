package ar.edu.unlam.edu.pb2;

import java.util.HashSet;
import java.util.Set;

public class CentralDeAlarma {
	private String nombre;
	private Set<Alarma>listaDeAlarmas;

	public CentralDeAlarma(String nombre) {
		this.nombre=nombre;
		this.listaDeAlarmas= new HashSet<>();
	}

	public boolean agregarAlarma(Alarma nuevaAlarma) {
		return this.listaDeAlarmas.add(nuevaAlarma);
	}

	public boolean agregarUsuarioConfiguradorALaAlarma(Usuario nuevoAdministrador, Alarma nuevaAlarma)  {
		return nuevaAlarma.agregarAdministrador(nuevoAdministrador);
	}

//	private Alarma buscarAlarma(Alarma nuevaAlarma) throws NoSeEncuentraLaAlarma {
//		
//		throw new NoSeEncuentraLaAlarma("AlarmaNoEncontrada");
//	}

}
