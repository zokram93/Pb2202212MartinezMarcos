package ar.edu.unlam.edu.pb2;

import java.util.HashSet;
import java.util.Set;

public class Administrador extends Usuario implements Configuradores{
	private CentralDeAlarma central;
	private Set<Alarma>listaAlarmas;
	
	
	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
		this.listaAlarmas = new HashSet<>();
		
	}

	@Override
	public TipoDeConfiguracion getTipoDeConfiguracion() {
		return TipoDeConfiguracion.CONFIGURACION;
	}

	public boolean agregarAlarmaAUnaCentral(Alarma nuevaAlarma) {
		return listaAlarmas.add(nuevaAlarma);	
	}

	public void agregarUnaCentral(CentralDeAlarma nuevaCentral) {
		this.central=nuevaCentral;
		
	}

}
