package ar.edu.unlam.edu.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class Testing {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		Usuario nuevoAdministrador = new Administrador(1234,"pepe");
		CentralDeAlarma nuevaCentral = new CentralDeAlarma("nuevaCentral");
		Alarma nuevaAlarma = new Alarma(1);
		((Administrador) nuevoAdministrador).agregarUnaCentral(nuevaCentral);
		Boolean valorEsperado= true;
		Boolean valorObtenido = ((Administrador) nuevoAdministrador).agregarAlarmaAUnaCentral(nuevaAlarma);
		assertEquals(valorEsperado,valorObtenido);
		
	}
	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral2() {
		Usuario nuevoAdministrador = new Administrador(1234,"pepe");
		CentralDeAlarma nuevaCentral = new CentralDeAlarma("nuevaCentral");
		Alarma nuevaAlarma = new Alarma(1);
		nuevaCentral.agregarAlarma(nuevaAlarma);
		
	}
	@Test
	public void crearUsuarioActivador() {
		Usuario nuevoAdministrador = new UsuarioActivador(1234,"pepe");
	}
	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma(){
		Usuario nuevoAdministrador = new Administrador(1234,"pepe");
		CentralDeAlarma nuevaCentral = new CentralDeAlarma("nuevaCentral");
		Alarma nuevaAlarma = new Alarma(1);
		nuevaCentral.agregarAlarma(nuevaAlarma);
		
		Boolean valorEsperado = true;
		Boolean valorObtenido = nuevaCentral.agregarUsuarioConfiguradorALaAlarma(nuevoAdministrador,nuevaAlarma);
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnSensorDuplicadoException() {
		Alarma nuevaAlarma = new Alarma(1);
		Sensor nuevoSensor = new Sensor(12);
		
		try {
			nuevaAlarma.agregarSensorAUnaAlarma(nuevoSensor);
			nuevaAlarma.agregarSensorAUnaAlarma(nuevoSensor);
			nuevaAlarma.agregarSensorAUnaAlarma(nuevoSensor);
		} catch (SensorDuplicado e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	@Test
	public void queNoSePuedaActivarUnaAlarmaSiAlmenosHayUnSensorActivado() throws SensorDuplicado{
		Alarma nuevaAlarma = new Alarma(1);
		Sensor nuevoSensor = new Sensor(12);
		Sensor nuevoSensor2 = new Sensor(13);
		nuevoSensor2.activarAlarma();
		nuevaAlarma.agregarSensorAUnaAlarma(nuevoSensor);
		nuevaAlarma.agregarSensorAUnaAlarma(nuevoSensor2);
		Boolean valorEsperado=false;
		Boolean valorObtenido=nuevaAlarma.activarAlarma();
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void queParaUnaAlarmaDeterminadaSePuedaObtenerUnaColeccionOrdenadaDeAccionDeTipoConfiguracionOrdenadasPorIdDeAccion(){
		Administrador nuevoAdministrador = new Administrador(1234,"pepe");
		Alarma nuevaAlarma = new Alarma(1);
		ListaDeAccionesRealizadas nuevaAccion = new ListaDeAccionesRealizadas(01, TipoDeConfiguracion.ACTIVACION);
		ListaDeAccionesRealizadas nuevaAccion2 = new ListaDeAccionesRealizadas(02, TipoDeConfiguracion.ACTIVACION);
		ListaDeAccionesRealizadas nuevaAccion3 = new ListaDeAccionesRealizadas(03, TipoDeConfiguracion.ACTIVACION);
		nuevaAlarma.agregarAccion(nuevaAccion);
		nuevaAlarma.agregarAccion(nuevaAccion2);
		nuevaAlarma.agregarAccion(nuevaAccion3);
		TreeSet<ListaDeAccionesRealizadas> ListaOrdenada = nuevaAlarma.obtenerListaOrdenadaPorNumroDeAccion();
		for (ListaDeAccionesRealizadas listaDeAccionesRealizadas : ListaOrdenada) {
			System.out.println(listaDeAccionesRealizadas.getIdentificadorDeAccion());
		}
		

	}
	
	

}
