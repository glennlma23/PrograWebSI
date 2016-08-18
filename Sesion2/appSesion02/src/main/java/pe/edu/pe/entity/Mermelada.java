package pe.edu.pe.entity;

public class Mermelada extends Fruta {
	
	protected int tiempoPreparacion;
	protected String tipoEnvase;
	

	public Mermelada(String color, String sabor, int tiempopreparacion, String tipoenvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempoPreparacion=tiempopreparacion;
		this.tipoEnvase=tipoenvase;
	}


	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}


	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}


	public String getTipoEnvase() {
		return tipoEnvase;
	}


	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	
	
}
