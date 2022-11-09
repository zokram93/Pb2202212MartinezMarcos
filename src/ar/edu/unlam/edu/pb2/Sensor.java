package ar.edu.unlam.edu.pb2;

public class Sensor {
	private Integer identificadorNumerico;
	private Boolean estado;
	public Sensor(Integer identificadorNumerico) {
		this.identificadorNumerico = identificadorNumerico;
		this.estado= false;
	}
	public Integer getIdentificadorNumerico() {
		return identificadorNumerico;
	}
	public void setIdentificadorNumerico(Integer identificadorNumerico) {
		this.identificadorNumerico = identificadorNumerico;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public void activarAlarma(){
		this.estado=true;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificadorNumerico == null) ? 0 : identificadorNumerico.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		if (identificadorNumerico == null) {
			if (other.identificadorNumerico != null)
				return false;
		} else if (!identificadorNumerico.equals(other.identificadorNumerico))
			return false;
		return true;
	}
	
}
