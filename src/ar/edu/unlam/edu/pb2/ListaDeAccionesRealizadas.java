package ar.edu.unlam.edu.pb2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ListaDeAccionesRealizadas {
	private Integer identificadorDeAccion;
	private Alarma alarmaQueHizoLaAccion;
	private Usuario listaDeUsuario;
	private LocalDate fechaEnLaQueSeRealiza;
	private TipoDeConfiguracion tipoDeConfiguracion;
	private List<Sensor>listaDeSensores;
	public ListaDeAccionesRealizadas (Integer id){
		this.identificadorDeAccion=id;
		this.listaDeSensores= new LinkedList<>();
	}
	
	public ListaDeAccionesRealizadas(Integer identificadorDeAccion, TipoDeConfiguracion activacion) {
		this.identificadorDeAccion=identificadorDeAccion;
		this.tipoDeConfiguracion =activacion;
		this.listaDeSensores= new LinkedList<>();
	}

	public Integer getIdentificadorDeAccion() {
		return identificadorDeAccion;
	}
	public void setIdentificadorDeAccion(Integer identificadorDeAccion) {
		this.identificadorDeAccion = identificadorDeAccion;
	}
	public Alarma getAlarmaQueHizoLaAccion() {
		return alarmaQueHizoLaAccion;
	}
	public void setAlarmaQueHizoLaAccion(Alarma alarmaQueHizoLaAccion) {
		this.alarmaQueHizoLaAccion = alarmaQueHizoLaAccion;
	}
	public Usuario getListaDeUsuario() {
		return listaDeUsuario;
	}
	public void setListaDeUsuario(Usuario listaDeUsuario) {
		this.listaDeUsuario = listaDeUsuario;
	}
	public LocalDate getFechaEnLaQueSeRealiza() {
		return fechaEnLaQueSeRealiza;
	}
	public void setFechaEnLaQueSeRealiza(LocalDate fechaEnLaQueSeRealiza) {
		this.fechaEnLaQueSeRealiza = fechaEnLaQueSeRealiza;
	}
	public TipoDeConfiguracion getTipoDeConfiguracion() {
		return tipoDeConfiguracion;
	}
	public void setTipoDeConfiguracion(TipoDeConfiguracion tipoDeConfiguracion) {
		this.tipoDeConfiguracion = tipoDeConfiguracion;
	}
	public List<Sensor> getListaDeSensores() {
		return listaDeSensores;
	}
	public void setListaDeSensores(List<Sensor> listaDeSensores) {
		this.listaDeSensores = listaDeSensores;
	}
	
	
	
}
