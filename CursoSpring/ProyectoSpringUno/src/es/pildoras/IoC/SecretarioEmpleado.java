package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario "+ informeNuevo.getInforme();
	}
	
	private CreacionInformes informeNuevo;

	
	

}
