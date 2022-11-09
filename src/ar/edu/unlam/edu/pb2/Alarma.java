package ar.edu.unlam.edu.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Alarma {

	private Integer idAlarma;
	private Integer codigoDeActivacion;
	private Integer codigoDeConfiguracion;
	private String nombre;
	private Set<Usuario>listaUsuarios;
	private Set <Sensor> listaDeSensores;
	private List<ListaDeAccionesRealizadas>listaDeAcciones;
	public Alarma(int i) {
		this.listaUsuarios = new HashSet<>();
		this.listaDeAcciones = new ArrayList<>();
		this.listaDeSensores = new HashSet<>();
	}
	public boolean agregarAdministrador(Usuario nuevoAdministrador) {
		return this.listaUsuarios.add(nuevoAdministrador);
	}
	public boolean agregarSensorAUnaAlarma(Sensor nuevoSensor) throws SensorDuplicado {
		if(!listaDeSensores.contains(nuevoSensor)){
			throw new SensorDuplicado("Sensor duplicado");
			
		}else {
			listaDeSensores.add(nuevoSensor);
			return true;
		}	
	}
	public Integer getIdAlarma() {
		return idAlarma;
	}
	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}
	public Integer getCodigoDeActivacion() {
		return codigoDeActivacion;
	}
	public void setCodigoDeActivacion(Integer codigoDeActivacion) {
		this.codigoDeActivacion = codigoDeActivacion;
	}
	public Integer getCodigoDeConfiguracion() {
		return codigoDeConfiguracion;
	}
	public void setCodigoDeConfiguracion(Integer codigoDeConfiguracion) {
		this.codigoDeConfiguracion = codigoDeConfiguracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(Set<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public Set<Sensor> getListaDeSensores() {
		return listaDeSensores;
	}
	public void setListaDeSensores(Set<Sensor> listaDeSensores) {
		this.listaDeSensores = listaDeSensores;
	}
	public List<ListaDeAccionesRealizadas> getListaDeAcciones() {
		return listaDeAcciones;
	}
	public void setListaDeAcciones(List<ListaDeAccionesRealizadas> listaDeAcciones) {
		this.listaDeAcciones = listaDeAcciones;
	}
	public Boolean activarAlarma() {
		Boolean chequear= false;
		for (Sensor sensor : listaDeSensores) {
			if(sensor.getEstado()){
				chequear = true;
			}
		}
		return chequear;
	}
	
	
}
